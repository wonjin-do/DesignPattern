package templateCallbackPattern.refactoring;

//Callback(전략)을 제공받는  Template
public class Car {
	DrivingMode drivingMode;
	String drivingModeName;
	public void startEngine() {
		//엔진start
		System.out.println("=== Engine Start! ===");
	}
	
	public void stopEngine() {
		//엔진 Stop
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
		//기능A
		drivingMode = () -> drivingModeType.getModeName();//함수형인터페이스 //추상메소드 setupDrivingMode() 구현완료 
		
		//기능A를 적용시켜줄 행동 (불변)
		DrivingModeSetupTemplate template = new DrivingModeSetupTemplate();
		
		//기능을 적용하고 결과값을 저장
		drivingModeName = template.setup(drivingMode);
		
		//Car가 현재 갖게 된 특성을 확인
		System.out.println(drivingModeName + "로 운행중입니다.");
	}
}
