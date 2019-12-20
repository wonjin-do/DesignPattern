package templateCallbackPattern.refactoring;


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
	

//	public void moveCar(DrivingMode drivingMode) {
//		checkTirePressure();
//		checkTemperatureInside();
//		checkEngineOil(); 
//		
//		drivingMode.setupDrivingMode();
//	}
	
	public void moveCar(final DrivingModeType drivingModeType) {
		DrivingMode drivingMode = () -> drivingModeType.getModeName();
		DrivingModeSetupTemplate template = new DrivingModeSetupTemplate();
		String drivingModeName = template.setup(drivingMode);
		System.out.println(drivingModeName + "�� �������Դϴ�.");
	}

	
	private void checkTirePressure() {
		
	}
	
	private void checkEngineOil() {
		
	}
	
	private void checkTemperatureInside() {
		
	}
}
