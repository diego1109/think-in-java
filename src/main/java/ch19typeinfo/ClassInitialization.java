package ch19typeinfo;

import java.util.Random;

class Initable {
  final int finalInt = 10;
  static int staticInt = 11;
  static final int STATIC_FINAL = 47;
  static final int STATIC_FINAL2 = ClassInitialization.rand.nextInt(1000);
  static {
    System.out.println("Initializing Initable");
    staticInt = 100;
  }

  public Initable(){
    System.out.println("Initable constructor processing");
  }
}


class Initable2 {
  static int staticNonFinal = 147;
  static {
    System.out.println("Initializing Initable2");
  }

  public Initable2(){
    System.out.println("Initable2 constructor processing");
  }
}


class Initable3 {
  final int finalInt = 3;
  final int finalInt4 = 4;
  static int staticNonFinal = 74;
  static {
    System.out.println("Initializing Initable3");
  }

  public Initable3(){
    System.out.println("Initable3 constructor processing");
  }
}

public class ClassInitialization {
  public static Random rand = new Random(47);

  public static void main(String[] args) throws Exception {

    // 采用这种方式获取类型信息 不会执行类的初始化。
    Class initable = Initable.class;
    System.out.println("After creating Initable ref");

    System.out.println("staticInt: "+ Initable.staticInt);

    /**
     * 操作类的static final变量 而且该变量的值是"编译器常量" 时，
     * 访问该变量不需要执行初始化。
     */
    System.out.println(Initable.STATIC_FINAL);
    /**
     * 操作类的static final变量 但该变量的值是不是"编译器常量" 时，
     * 访问该变量需要执行初始化，会调用static代码块。
     */
    System.out.println(Initable.STATIC_FINAL2);

    //在访问 static变量时，先要进行链接（为这个字段分配存储空间）和初始化（初始化该存储空间）。
    System.out.println(Initable2.staticNonFinal);

//    Class initable3 = Class.forName("ch19classinfomation.Initable3");
//    System.out.println("After creating Initable3 ref");
//    System.out.println(Initable3.staticNonFinal);

    Initable3 initable3 = new Initable3();
    System.out.println(initable3.finalInt);

    System.out.println("-- finish --");

  }
}

