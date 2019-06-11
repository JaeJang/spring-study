package injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SportsCoach implements Coach {

	private FortuneService fortuneService;
	
	@Override
	public String getWorkout() {
		return "Sports Workout";
	}

	@Override
	public String getFortune() {
		return "SPORTS " + fortuneService.getFortune();
	}
	
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

}
