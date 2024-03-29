package injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getWorkout() {
		return "Tennis Coach getWorkout";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}
	
	

}
