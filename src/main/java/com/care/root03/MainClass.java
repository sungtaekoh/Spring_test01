package com.care.root03;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String path = "classpath:applicationST.xml";
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		STBean stBean = ctx.getBean(STBean.class);
		
		stBean.namePrint();
		stBean.agePrint();
	}
}
