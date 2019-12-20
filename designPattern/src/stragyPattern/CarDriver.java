package stragyPattern;

import stragyPattern.mode.AutomaticMode;
import stragyPattern.mode.CruiseControlMode;
import stragyPattern.mode.DrivingMode;

public class CarDriver {
	//전략 생성하며 제공하는 제공자임.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();//전략 사용자
		car.startEngine();
		System.out.println();
		
		//자동모드운전
		DrivingMode automaticMode = new AutomaticMode();
		car.moveCar(automaticMode);
		
		
		DrivingMode cruiseControlMode = new CruiseControlMode();
		car.moveCar(cruiseControlMode);
		
		System.out.println();
		car.stopEngine();
		
	}

}
