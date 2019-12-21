package youtube.chap03_TemplateMethod.lib;

public abstract class AbstGameConnectHelper {
	

	//알고리즘 은닉화("통합접속")
	//1.일정한 프로세스를 가짐(보안>인증>권한>접속)
	//구조(프로세스)의 변경은 없다.
	//2.하위클래스별로 구현의 여지를 남겨놓음
	//알고리즘은 재정의한다.
	protected abstract String doSecurity(String encodedInfo);
	protected abstract boolean authentication(String id, String password);
	protected abstract int authorization(String userName);
	protected abstract String connection(String info);
	
	//템플릿메소드
	//템플릿에 있는 메소드중 유일하게 사용자에게 공개됨.
	//모든 하위클래스가 동일한 기능을 갖음. 
	public String requestConnection(String encodedInfo) {
		String decodedInfo = doSecurity(encodedInfo);
		String id = "aaa";
		String password = "bbb";
		if(!authentication(id, password)) {
			throw new Error("���̵� ��ȣ ����ġ");
		}
		 
		String userName = "userName";
		int i = authorization(userName);
		
		switch (i) {
		case 0:
			throw new Error("�˴ٿ�");
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;

		default:
			break;
		}
		return connection(decodedInfo);
	}
}
