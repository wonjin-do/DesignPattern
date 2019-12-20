package stragyPattern;

import stragyPattern.mode.DrivingMode;

public class Car {
	//제공받은 전략을 사용하는 사용자
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
