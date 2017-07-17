package com.crow;

public interface FlyBehavior {//定义算法族，分别封装起来，可以互相替换，让算法的变化独立于使用算法的客户
	public void fly();
}
