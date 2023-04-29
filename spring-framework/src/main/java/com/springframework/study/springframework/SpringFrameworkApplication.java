package com.springframework.study.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext =
				SpringApplication.run(SpringFrameworkApplication.class, args);

		// What are the beans?
		// What are the dependencies of a bean?
		//	Where to search for beans?
		SortNumber sortNumber =
				applicationContext.getBean(SortNumber.class);

		//using the class
		int numbers[] = {1,3,4,5};
		int idx = sortNumber.binarySearch( numbers, 90);
		System.out.println("idx: ${}");
		System.out.println(idx);
	}

}
