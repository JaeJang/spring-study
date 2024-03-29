package springdemo;

public class TrackCoach implements Coach{

	private FortuneService fortuneService;
	
	
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Track " + fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	
	//add a destory method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
	}
}
