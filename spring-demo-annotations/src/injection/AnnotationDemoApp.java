package injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("injectionApplicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println(theCoach.getWorkout());
		System.out.println(theCoach.getFortune());
		
		Coach theotherCoach = context.getBean("sportsCoach", Coach.class);
		System.out.println(theotherCoach.getWorkout());
		System.out.println(theotherCoach.getFortune());
		
		
		Coach anotherCoach = context.getBean("jaeCoach", Coach.class);
		System.out.println(anotherCoach.getFortune());
		context.close();
	}

}
