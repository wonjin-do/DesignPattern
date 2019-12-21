package youtube.chap03_TemplateMethod.kevinsVilliage.refactoring;
//����  ������
public class CarDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���� �����
		Car car = new Car();
		car.startEngine();
		System.out.println();
		
		//�ڵ�������
//		DrivingMode automaticMode = new DrivingMode() {
//			@Override
//			public void setupDrivingMode() {
//				// TODO Auto-generated method stub
//				System.out.println("# �ڵ� ���� ������ �����մϴ�.");
//			}
//		};
//		car.moveCar(automaticMode);
		
		//���������� ����
		car.moveCar(DrivingModeType.CRUISECONTROL);
		car.moveCar(DrivingModeType.AUTOMATIC);

		
		System.out.println();
		car.stopEngine();
	}

}
