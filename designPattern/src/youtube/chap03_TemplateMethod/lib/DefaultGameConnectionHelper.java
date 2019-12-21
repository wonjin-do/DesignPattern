package youtube.chap03_TemplateMethod.lib;

public class DefaultGameConnectionHelper extends AbstGameConnectHelper {

	@Override
	protected String doSecurity(String encodedInfo) {
		// TODO Auto-generated method stub
		System.out.println("디코딩");
		String decodedInfo = encodedInfo;
		return decodedInfo;
	}

	@Override
	protected boolean authentication(String id, String password) {
		// TODO Auto-generated method stub
		System.out.println("아이디/암호 확인과정");
		
		return true;
	}

	@Override
	protected int authorization(String userName) {
		// TODO Auto-generated method stub
		System.out.println("권한확인");
		
		return 1;
	}

	@Override
	protected String connection(String info) {
		// TODO Auto-generated method stub
		System.out.println("마지막 단계 : 접속!");
		return info;
	}

}
