package com.codeforyou.springjdbctemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringjdbctemplateApplication {

	@Autowired
	private Repo dao;

	@GetMapping("/getdata")
	public List<Model> getData() {
		return dao.getTestData();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringjdbctemplateApplication.class, args);
	}

}
