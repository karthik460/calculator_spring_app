package com.calculations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
	   private MathService additionService;
	    private MathService subtractionService;
	    private MathService multiplicationService;
	    private MathService divisionService;

	@Autowired
	public Calculator(@Qualifier("subtractionService") MathService subtractionService, 
			@Qualifier("additionService") MathService additionService,
			@Qualifier("divisionService") MathService divisionService,
			@Qualifier("multiplicationService") MathService multiplicationService) {
		super();
		this.subtractionService = subtractionService;
		this.additionService = additionService;
		this.divisionService = divisionService;
		this.multiplicationService = multiplicationService;
	}
	public void compute(String type,int x,int y)
	{
		if(type.equals("add"))
		{
			additionService.operate(x, y);
		}
		else if(type.equals("sub"))
		{
			subtractionService.operate(x, y);
		}
		else if(type.equals("mul"))
		{
			multiplicationService.operate(x, y);
		}
		else if(type.equals("div"))
		{
			divisionService.operate(x, y);
		}
		else
		{
			throw new RuntimeException("wring input");
		}
	}

}
