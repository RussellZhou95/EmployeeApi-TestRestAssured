package com.example.employeeapi;

import com.example.employeeapi.entity.Employee;
import com.example.employeeapi.entity.StatusResponse;
import com.example.employeeapi.exception.EmployeeNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.print.attribute.standard.Media;
import java.util.stream.Collectors;

@SpringBootTest
class EmployeeApiApplicationTests {

    private static WebClient webClient;

    @Test
    void contextLoads() {
    }

    @BeforeEach
    void setUp(){
        webClient= WebClient.builder().baseUrl("http://localhost:8080/employeeApi").defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE).build();
    }
    @Test
    void testWebClient(){

        Mono<Employee> response=webClient.get().uri("/employees/"+2).header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_XML_VALUE)
                .accept(MediaType.APPLICATION_JSON).retrieve()
                .bodyToMono(Employee.class);
        System.out.println(response.block());

    }

    @Test
    void testWebClient2(){

        Flux<Employee> response=webClient.get().uri("/employees/").header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_XML_VALUE)
                .accept(MediaType.APPLICATION_JSON).retrieve().bodyToFlux(Employee.class);
        System.out.println(response.collect(Collectors.toList()).block());

    }


}
