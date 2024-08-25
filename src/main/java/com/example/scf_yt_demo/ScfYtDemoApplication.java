package com.example.scf_yt_demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.FunctionCatalog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class ScfYtDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScfYtDemoApplication.class, args);
	}

	@Bean
	public Function<String, String> upperCase() {
		return value -> value.toUpperCase();
	}

	@Bean
	public Function<String, Integer> getLength() {
		return value -> value.length();
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext applicationContext) {
		return args -> {
			FunctionCatalog functionCatalog = applicationContext.getBean(FunctionCatalog.class);

			Function<String, String> upperCaseFunction = functionCatalog.lookup("upperCase");
			System.out.println("UpperCase function: " +upperCaseFunction.apply("swapneel"));

			Function<String, Integer> getLengthFunction = functionCatalog.lookup("getLength");
			System.out.println("GetLength function: " +getLengthFunction.apply("swapneel"));

			Function<String, String> concatFunction = functionCatalog.lookup("concatFunction");
			System.out.println("ConcatFunction function: " +concatFunction.apply("swapneel"));


		};
	}

}
