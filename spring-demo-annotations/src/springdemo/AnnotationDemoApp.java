package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		Coach jaeCoach = context.getBean("jaeCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(jaeCoach.getDailyWorkout());
		
		context.close();
	}

}
