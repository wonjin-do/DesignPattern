package youtube.chap04_FactoryMethod;

import java.util.Date;

import youtube.chap04_FactoryMethod.framework.Item;
import youtube.chap04_FactoryMethod.framework.ItemCreater;

public class HpItemCreator extends ItemCreater{

	@Override
	protected void requestItemsInfo() {
		// TODO Auto-generated method stub
		System.out.println("DB에서 물약 정보 가져오기");
	}

	@Override
	protected Item createItem() {
		// TODO Auto-generated method stub
		return new HpItem();
	}

	@Override
	protected void createItemLog() {
		// TODO Auto-generated method stub
		System.out.println("회복물약을 생성함 " + new Date());
	}
	
}
