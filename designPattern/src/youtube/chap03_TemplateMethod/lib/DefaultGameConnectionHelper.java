package youtube.chap03_TemplateMethod.lib;

public class DefaultGameConnectionHelper extends AbstGameConnectHelper {

	@Override
	protected String doSecurity(String encodedInfo) {
		// TODO Auto-generated method stub
		System.out.println("���ڵ�");
		String decodedInfo = encodedInfo;
		return decodedInfo;
	}

	@Override
	protected boolean authentication(String id, String password) {
		// TODO Auto-generated method stub
		System.out.println("���̵�/��ȣ Ȯ�ΰ���");
		
		return true;
	}

	@Override
	protected int authorization(String userName) {
		// TODO Auto-generated method stub
		System.out.println("����Ȯ��");
		
		return 1;
	}

	@Override
	protected String connection(String info) {
		// TODO Auto-generated method stub
		System.out.println("������ �ܰ� : ����!");
		return info;
	}

}
