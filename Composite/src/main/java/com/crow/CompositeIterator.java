package com.crow;

 
import java.util.*;
  
public class CompositeIterator implements Iterator {
	Stack stack = new Stack();
   
	public CompositeIterator(Iterator iterator) {
		stack.push(iterator);
	}
   
	public Object next() {
		if(hasNext()) {
			Iterator iterator = (Iterator) stack.peek();
			MenuComponent menuComponent = (MenuComponent) iterator.next();
			if(menuComponent instanceof Menu) {//如果元素是一个菜单，则有了另一个需要被包含进遍历中的组合，把它也压入栈中
				stack.push(menuComponent.createIterator());
			}
			return menuComponent;
		}
		else {
			return null;
		}
	}
  
	public boolean hasNext() {
		if(stack.isEmpty()) {
			return false;
		}
		else {
			if(((Iterator)stack.peek()).hasNext()) {
				return true;
			}
			else {
				stack.pop();
				return hasNext();
			}
		}
	}
   
	public void remove() {
		throw new UnsupportedOperationException();
	}
}


