package com.testproject.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class SpringbootFirstAppApplication {

	private static LinkedHashMap<String, Integer> vote = new LinkedHashMap<>();

	static void vote(String contestant){
		vote.merge(contestant, 1, Integer::sum);
	}

	public static LinkedHashMap getVotes() { return vote; }
	public static void main(String[] args) {


		vote("TV 1");
		vote("TV 1");
		vote("TV 1");
		vote("TV 2");
		System.out.println(getVotes());

		SpringApplication.run(SpringbootFirstAppApplication.class, args);
	}

}
