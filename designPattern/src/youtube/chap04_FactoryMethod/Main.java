package youtube.chap04_FactoryMethod;

import youtube.chap04_FactoryMethod.framework.Item;
import youtube.chap04_FactoryMethod.framework.ItemCreater;

public class Main {
	public static void main(String[] args) {
		ItemCreater creator;
		Item item;
		
		creator = new HpItemCreator();
		item = creator.create();
		item.use();
		
		creator = new MpItemCreator();
		item = creator.create();
		item.use();

	}
}
