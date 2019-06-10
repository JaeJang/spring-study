package springdemo;

public class JaeCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Jae Get DailyWorkout";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Jae Get DailyFortune";
	}

	// add an init method
	public void doMyStartupStuff() {
		System.out.println("JaeCoach: inside method doMyStartupStuff");
	}
	
	
	//add a destory method
	public void doMyCleanupStuff() {
		System.out.println("JaeCoach: inside method doMyCleanupStuffYoYo");
	}
}
