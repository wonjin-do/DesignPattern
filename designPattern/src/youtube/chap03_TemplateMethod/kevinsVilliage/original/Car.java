package youtube.chap03_TemplateMethod.kevinsVilliage.original;


public class Car {
	//Callback(����)�� �����޴�  Template
	public void startEngine() {
		//����start
		System.out.println("=== Engine Start! ===");
	}
	
	public void stopEngine() {
		//���� Stop
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
