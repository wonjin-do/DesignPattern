package templateCallbackPattern.original;


public class Car {
	//Callback(전략)을 제공받는  Template
	public void startEngine() {
		//엔진start
		System.out.println("=== Engine Start! ===");
	}
	
	public void stopEngine() {
		//엔진 Stop
		System.out.println("=== Engine Stop! ===");
	}
	

	public void moveCar(DrivingMode drivingMode) {
		checkTirePressure();
		checkTemperatureInside();
		checkEngineOil(); 
		
		drivingMode.setupDrivingMode();
	}
	
	private void checkTirePressure() {
		
	}
	
	private void checkEngineOil() {
		
	}
	
	private void checkTemperatureInside() {
		
	}
}
