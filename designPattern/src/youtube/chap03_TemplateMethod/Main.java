package youtube.chap03_TemplateMethod;

import youtube.chap03_TemplateMethod.lib.AbstGameConnectHelper;
import youtube.chap03_TemplateMethod.lib.DefaultGameConnectionHelper;

public class Main {
	public static void main(String[] args) {
		AbstGameConnectHelper helper = new DefaultGameConnectionHelper();
		
		helper.requestConnection("���̵� ��ȣ �� ��������");
		
		
	}
}
