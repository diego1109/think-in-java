package ch19typeinfo;

public class WildcardClassReferences {

  public static void main (String[] args){

    // 定义一个可以指向任何类型对象的引用：intClass。
    Class<?> intClass = int.class;
    System.out.println("intClass: "+ intClass);

    // 即使指向double类型对象，也不会报错。
    intClass = double.class;
    System.out.println("intClass: "+ intClass);
    System.out.println("-- finish --");
  }
}
