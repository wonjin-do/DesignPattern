package youtube.chap04_FactoryMethod.framework;

public abstract class ItemCreater {
	public Item create(){
		
		requestItemsInfo();
		Item item = createItem();
		createItemLog();
		
		return item;
	}
	
	//생성전
	abstract protected void requestItemsInfo();
	
	//생성
	abstract protected Item createItem();
	//생성후
	abstract protected void createItemLog();
	
	
}
