package com.spaghettininjas.pos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;

import java.io.Console;
import java.util.Arrays;

@SpringBootApplication
@ComponentScan("controllers")
@EnableAutoConfiguration
public class PosApplication {
	@Bean
	ProtobufHttpMessageConverter protobufHttpMessageConverter() {
		return new ProtobufHttpMessageConverter();
	}

	public static void main(String[] args) {
		SpringApplication.run(PosApplication.class, args);
	}
}
