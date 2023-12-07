package com.web;




import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.http.ResponseEntity.ofNullable;
import static org.springframework.http.ResponseEntity.ok;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@SpringBootApplication
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}
	@Bean
	public ApplicationRunner applicationRunner(WebServerApplicationContext context){
		return args -> {
			System.out.println("容器的实体类名"+context.getWebServer().getClass().getName());
		};

	}
	@EventListener(WebServerInitializedEvent.class)
	public void onRead(WebServerInitializedEvent event){
		System.out.println("容器的实体类，不需要确认是否为web"+event.getWebServer().getClass().getName());

	}




}
