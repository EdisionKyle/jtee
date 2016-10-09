package com.loner.base;

class A {  
    
    public int i = 100;  
      
    public void p() {  
        System.out.println(this.getClass().getName());  
        System.out.println(this.i);  
    }  
}  
  
class B extends A {  
      
    public int i = 200;   
}  
  
public class TestThis {  
  
    public static void main(String[] args) {  
        B b = new B();  
        b.p();  
    }  
}