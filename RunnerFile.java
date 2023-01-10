package com.xworkz.things;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class RunnerFile {
	public static void main(String[] args) {
		ApplicationContext spring=new AnnotationConfigApplicationContext(SuperConfiguration.class);
		
		String str1=spring.getBean("getString",String.class);
		System.out.println(str1.hashCode());
		
		String str2=spring.getBean("rat",String.class);
		System.out.println(str2.hashCode());
		
		String str3=spring.getBean("bird",String.class);
		System.out.println(str3.hashCode());
		
		String str4=spring.getBean("flower",String.class);
		System.out.println(str4.hashCode());
		
		String str5=spring.getBean("child",String.class);
		System.out.println(str5.hashCode());
		
		System.out.println("========================");
		
		Boolean b1=spring.getBean("cost",Boolean.class);
		System.out.println(b1.hashCode());
		
		Boolean b2=spring.getBean("temp",Boolean.class);
		System.out.println(b2.hashCode());
		
		Boolean b3=spring.getBean("fever",Boolean.class);
		System.out.println(b3.hashCode());
		
		Boolean b4=spring.getBean("percentage",Boolean.class);
		System.out.println(b4.hashCode());
		
		Boolean b5=spring.getBean("radious",Boolean.class);
		System.out.println(b5.hashCode());
		
		System.out.println("========================");
		
		
		Double dou1=spring.getBean("d1",Double.class);
		System.out.println(dou1.hashCode());
		
		Double dou2=spring.getBean("d2",Double.class);
		System.out.println(dou2.hashCode());
		
		Double dou3=spring.getBean("d3",Double.class);
		System.out.println(dou3.hashCode());
		
		Double dou4=spring.getBean("d4",Double.class);
		System.out.println(dou4.hashCode());
		
		Double dou5=spring.getBean("d5",Double.class);
		System.out.println(dou5.hashCode());
		
		System.out.println("========================");
		
		
		StringBuffer s1=spring.getBean("sb1",StringBuffer.class);
		System.out.println(s1.hashCode());
		
		StringBuffer s2=spring.getBean("sb2",StringBuffer.class);
		System.out.println(s2.hashCode());
		
		StringBuffer s3=spring.getBean("sb3",StringBuffer.class);
		System.out.println(s3.hashCode());
		
		StringBuffer s4=spring.getBean("sb4",StringBuffer.class);
		System.out.println(s4.hashCode());
		
		StringBuffer s5=spring.getBean("sb5",StringBuffer.class);
		System.out.println(s5.hashCode());
		
		System.out.println("========================");
		
		
		StringBuilder c1=spring.getBean("sbuilder1",StringBuilder.class);
		System.out.println(c1.hashCode());
		
		StringBuilder c2=spring.getBean("sbuilder2",StringBuilder.class);
		System.out.println(c2.hashCode());
		
		StringBuilder c3=spring.getBean("sbuilder3",StringBuilder.class);
		System.out.println(c3.hashCode());
		
		StringBuilder c4=spring.getBean("sbuilder4",StringBuilder.class);
		System.out.println(c4.hashCode());
		
		StringBuilder c5=spring.getBean("sbuilder5",StringBuilder.class);
		System.out.println(c5.hashCode());
		
		System.out.println("=====Array List======");
		
		ArrayList a1=spring.getBean("arr1",ArrayList.class);
		System.out.println(a1.hashCode());
		
		System.out.println("================MAPING=======");
		
		HashMap map1=spring.getBean("hash",HashMap.class);
		System.out.println(map1.hashCode());
		
		String[] bean=spring.getBeanDefinitionNames();
		System.out.println(Arrays.toString(bean));
	}

}
