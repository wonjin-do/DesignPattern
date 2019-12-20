package templateCallbackPattern.refactoring;

//Callback(����)�� �����޴�  Template
public class Car {
	DrivingMode drivingMode;
	String drivingModeName;
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
		//���A
		drivingMode = () -> drivingModeType.getModeName();//�Լ����������̽� //�߻�޼ҵ� setupDrivingMode() �����Ϸ� 
		
		//���A�� ��������� �ൿ (�Һ�)
		DrivingModeSetupTemplate template = new DrivingModeSetupTemplate();
		
		//����� �����ϰ� ������� ����
		drivingModeName = template.setup(drivingMode);
		
		//Car�� ���� ���� �� Ư���� Ȯ��
		System.out.println(drivingModeName + "�� �������Դϴ�.");
	}
}
