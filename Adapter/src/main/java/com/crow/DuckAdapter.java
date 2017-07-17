package com.crow;
import java.util.Random;

public class DuckAdapter implements Turkey {//让鸭子看起来像火鸡
	Duck duck;
	Random rand;
 
	public DuckAdapter(Duck duck) {
		this.duck = duck;
		rand = new Random();
	}
    
	public void gobble() {
		duck.quack();
	}
  
	public void fly() {
		if (rand.nextInt(5)  == 0) {//鸭子可以长时间地飞行，而火鸡飞行时间较短
		     duck.fly();
		}
	}
}
