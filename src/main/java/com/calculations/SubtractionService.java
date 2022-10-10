package com.calculations;

import org.springframework.stereotype.Component;

@Component
public class SubtractionService implements MathService{

	public void operate(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println(x-y);
	}

}
