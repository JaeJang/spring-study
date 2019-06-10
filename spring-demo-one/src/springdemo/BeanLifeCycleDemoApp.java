package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach JaeCoach = context.getBean("myJae", Coach.class);

		System.out.println(theCoach.getDailyWorkout());
		System.out.println(JaeCoach.getDailyWorkout());
		
		context.close();
	}

}
