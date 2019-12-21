package youtube.chap02_Adapter;

import youtube.chap02_Adapter.lib.Adapter;
import youtube.chap02_Adapter.lib.AdapterImpl;

public class Main {
	public static void main(String[] args) {
		Adapter adapter = new AdapterImpl();
		System.out.println(adapter.twiceOf(100f));
		System.out.println(adapter.halfOf(80f));
	}
}
