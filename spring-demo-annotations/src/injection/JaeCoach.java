package injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JaeCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	@Override
	public String getWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "JaeCoach " + fortuneService.getFortune();
	}

}
