package main;

import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;

public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("田添春樹");
		Product card2 = factory.create("山田花子");
		Product card3 = factory.create("鈴木一郎");
		card1.use();
		card2.use();
		card3.use();
	}

}
