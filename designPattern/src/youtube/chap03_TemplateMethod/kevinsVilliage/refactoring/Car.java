package youtube.chap03_TemplateMethod.kevinsVilliage.refactoring;

//���� ����� 
public class Car {
	//�߻�ȭ�� ��� //�Լ����������̽�
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
		//������ ��� //�߻�޼ҵ� setupDrivingMode() �����Ϸ� 
		drivingMode	= () -> drivingModeType.getModeName(); 
		
		//������ ����� ��������� �ൿ (�Һ�)
		DrivingModeSetupTemplate template = new DrivingModeSetupTemplate();
		
		//���ø��� ������ ��� ����, ����  ������� ����
		drivingModeName = template.setup(drivingMode);
		
		//Car�� ���� ���� �� Ư���� Ȯ��
		System.out.println(drivingModeName + "�� �������Դϴ�.");
	}
}
