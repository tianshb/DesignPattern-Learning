package com.crow;

public class TurkeyAdapter implements Duck {//让火鸡看起来像鸭子
	Turkey turkey;
 
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
    
	public void quack() {
		turkey.gobble();
	}
  
	public void fly() {
		for(int i=0; i < 5; i++) {//鸭子可以长时间地飞行，而火鸡飞行时间较短
			turkey.fly();
		}
	}
}
