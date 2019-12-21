package youtube.chap03_TemplateMethod.kevinsVilliage.original;

public class CarDriver {
	//���� �����ϸ� �����ϴ� ��������.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();//���� �����
		car.startEngine();
		System.out.println();
		
		//�ڵ�������
		DrivingMode automaticMode = new DrivingMode() {
			@Override
			public void setupDrivingMode() {
				// TODO Auto-generated method stub
				System.out.println("# �ڵ� ���� ������ �����մϴ�.");
			}
		};
		car.moveCar(automaticMode);
		car.moveCar(new DrivingMode() {
			@Override
			public void setupDrivingMode() {
				// TODO Auto-generated method stub
				System.out.println("# ũ���� ���� ������ �����մϴ�.");
			}
		});
		
		System.out.println();
		car.stopEngine();
	}

}
