package youtube.chap04_FactoryMethod;

import youtube.chap04_FactoryMethod.framework.Item;

public class HpItem implements Item{

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("체력회복!");
	}

}
