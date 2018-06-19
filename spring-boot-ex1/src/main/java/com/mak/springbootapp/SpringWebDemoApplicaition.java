package com.mak.springbootapp;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mak.springbootapp.dto.DisplyaCmdbProperties;

@SpringBootApplication
public class SpringWebDemoApplicaition {
	
	Logger logger = LoggerFactory.getLogger(SpringWebDemoApplicaition.class);
	
	@Autowired
	private DisplyaCmdbProperties cmdbProperties;
	
	public static void main(String[] args) {
		org.springframework.boot.SpringApplication.run(SpringWebDemoApplicaition.class, args);
	}
	
	@PostConstruct
	public void printVals(){
		logger.debug(cmdbProperties.toString());
	}
}
