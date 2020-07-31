package ch19typeinfo;

public class BoundedClassReferences {

  public static void main(String[] args) {
    //  bounded限定为可以指向Number类型对象以及它的子类的类型对象。
    Class<? extends Number> bounded = int.class;
    System.out.println("bounded: "+ bounded);

    bounded = double.class;
    System.out.println("bounded: "+ bounded);

    bounded = Number.class;
    System.out.println("bounded: "+ bounded);
  }
}
