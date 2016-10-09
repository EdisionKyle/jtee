package com.loner.pattern.singleton;

//Singleton
/*
 * 在它的核心结构中只包含一个被称为单例类的特殊类。通过单例模式可以保证系统中一个类
 * 只有一个实例而且该实例易于外界访问，从而方便对实例个数的控制并节约系统资源。
 */
public class Singleton {

	private static Singleton singleton;

    private Singleton() {
        
    }
    
    public static Singleton getInstance() {
        if (singleton == null) {
        	singleton = new Singleton();
        }
        return singleton;
    }

}
