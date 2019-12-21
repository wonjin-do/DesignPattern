package youtube.chap01_Stragy.kevinsVilliage;

import youtube.chap01_Stragy.kevinsVilliage.mode.AutomaticMode;
import youtube.chap01_Stragy.kevinsVilliage.mode.CruiseControlMode;
import youtube.chap01_Stragy.kevinsVilliage.mode.DrivingMode;

public class CarDriver {
	//���� �����ϸ� �����ϴ� ��������.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();//���� �����
		car.startEngine();
		System.out.println();
		
		//�ڵ�������
		DrivingMode automaticMode = new AutomaticMode();
		car.moveCar(automaticMode);
		
		
		DrivingMode cruiseControlMode = new CruiseControlMode();
		car.moveCar(cruiseControlMode);
		
		System.out.println();
		car.stopEngine();
		
	}

}
