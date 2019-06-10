package springdemo;

import org.springframework.stereotype.Component;

@Component
public class JaeCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Jae Coach get DailyWorkout";
	}

}
