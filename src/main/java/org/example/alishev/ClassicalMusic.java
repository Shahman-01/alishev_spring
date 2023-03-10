package org.example.alishev;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClassicalMusic implements Music {

	@PostConstruct
	public void doInit() {
		System.out.println("init");
	}

	@PreDestroy
	public void doDestroy() {
		System.out.println("destroy");
	}

	@Override
	public String getSong() {
		return "Classic";
	}
}
