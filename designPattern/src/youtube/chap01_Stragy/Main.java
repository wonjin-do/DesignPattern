package youtube.chap01_Stragy;

import youtube.chap01_Stragy.lib.Knife;

public class Main {
	public static void main(String[] args) {
		GameChracter character = new GameChracter();
		character.attack();
		
		character.setWeapon(new Knife());
		character.attack();
	} 
	
}
