package com.driver;
class A{
  public String meth(){
    return "Invoking method from class A";
  }
}
class B extend A{
  public String meth(){
    return "Method is overridden in Extendend class B";
  }
}
public class Main {
  public static void main(String args[])
  {
    B obj=new obj B();
    String str=obj.meth();
  }
  
}
