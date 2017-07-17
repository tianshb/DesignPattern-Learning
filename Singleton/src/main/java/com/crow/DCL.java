package com.crow;

//
// Danger!  This implementation of Singleton not
// guaranteed to work prior to Java 5
//

public class DCL {
	private volatile static DCL uniqueInstance;
 
	private DCL() {}
 
	public static DCL getInstance() {
		if (uniqueInstance == null) {
			synchronized (DCL.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new DCL();
				}
			}
		}
		return uniqueInstance;
	}
}
