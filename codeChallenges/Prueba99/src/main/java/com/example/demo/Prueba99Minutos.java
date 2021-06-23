package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/b-trees")
public class Prueba99Minutos {

	@PostMapping("/height")
	public String height(@RequestBody String toTree) {
		System.out.println(toTree);
		List<String> cadena = Arrays.asList(toTree);			
		cadena.stream().forEach(System.out::println);

		return toTree;
	}

}
