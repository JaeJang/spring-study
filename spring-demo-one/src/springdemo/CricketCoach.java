package springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket set email");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		System.out.println("Cricket set team");
		this.team = team;
	}



	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
