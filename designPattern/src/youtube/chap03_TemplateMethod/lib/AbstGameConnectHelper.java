package youtube.chap03_TemplateMethod.lib;

public abstract class AbstGameConnectHelper {
	
	//�˰��� ����ȭ("��������")
	//1.������ ���μ����� ����(����>����>����>����)
	//����(���μ���)�� ������ ����.
	//2.����Ŭ�������� ������ ������ ���ܳ���
	//�˰����� �������Ѵ�.
	protected abstract String doSecurity(String encodedInfo);
	protected abstract boolean authentication(String id, String password);
	protected abstract int authorization(String userName);
	protected abstract String connection(String info);
	
	//���ø��޼ҵ�
	//���ø��� �ִ� �޼ҵ��� �����ϰ� ����ڿ��� ������.
	//��� ����Ŭ������ ������ ����� ����. 
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
