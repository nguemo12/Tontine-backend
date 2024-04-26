package com.springdockerjenhkins.springdevops;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpringDevopsApplicationTests {
	Logger logger = LoggerFactory.getLogger(SpringDevopsApplication.class);
	@Test
	void contextLoads() {
		logger.info("Calculator Test Started Successfully !!!");
		//given
		int x = 5;
		int y = 7;

		//then
		int expected =  Calculator.add(x,y);

		assertEquals(12,expected);
	}

	@Test
	public void itShouldBeAbleToSubtract(){
		logger.info("Doing some subtraction test !!!");
		int x = 10;
		int y=8;
		int expected = 2;

		assertEquals(expected,Calculator.sub(x,y));
	}
}



class Calculator{
	public static int add(int x,int y){
		var sum = x+y;
		return sum;
	}

	public static int sub(int x,int y){
		var sub = x-y;
		return sub;
	}
}
