package youtube.chap03_TemplateMethod;

import youtube.chap03_TemplateMethod.lib.AbstGameConnectHelper;

public class Main {
	public static void main(String[] args) {
		AbstGameConnectHelper helper = new DefaultGameConnectionHelper();
		
		helper.requestConnection("접속시도");
		
		
	}
}
