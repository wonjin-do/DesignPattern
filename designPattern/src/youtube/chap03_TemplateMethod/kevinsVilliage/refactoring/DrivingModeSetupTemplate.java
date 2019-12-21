package youtube.chap03_TemplateMethod.kevinsVilliage.refactoring;

public class DrivingModeSetupTemplate  {
	public String setup(DrivingMode drivingMode) {
		return this.executeTemplate(drivingMode);
	}
	
	
	
	//����� ����ȭ �ؾ���.
	private String executeTemplate(DrivingMode drivingMode) {
		checkTirePressure();
		checkTemperatureInside();
		checkEngineOil(); 
		
		//drivingMode.setupDrivingMode();
		return drivingMode.setupDrivingMode();
	}
	
	private void checkTirePressure() {
		
	}
	
	private void checkEngineOil() {
		
	}
	
	private void checkTemperatureInside() {
		
	}
}
