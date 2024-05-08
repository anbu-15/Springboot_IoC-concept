package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Theater {
	@Autowired
	public Viewer vv;
	
	public void entertainment() {
		vv.payWatch();
		System.out.println("Joker");
	}

	
}
