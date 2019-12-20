package templateCallbackPattern.original;

public class CarDriver {
	//전략 생성하며 제공하는 제공자임.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();//전략 사용자
		car.startEngine();
		System.out.println();
		
		//자동모드운전
		DrivingMode automaticMode = new DrivingMode() {
			@Override
			public void setupDrivingMode() {
				// TODO Auto-generated method stub
				System.out.println("# 자동 모드로 운행을 시작합니다.");
			}
		};
		car.moveCar(automaticMode);
		car.moveCar(new DrivingMode() {
			@Override
			public void setupDrivingMode() {
				// TODO Auto-generated method stub
				System.out.println("# 크루즈 모드로 운행을 시작합니다.");
			}
		});
		
		System.out.println();
		car.stopEngine();
	}

}
