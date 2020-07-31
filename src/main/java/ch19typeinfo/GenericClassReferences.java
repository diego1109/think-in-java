package ch19typeinfo;

public class GenericClassReferences {

  public static void main(String[] args) {
    Class intClass = int.class;
    // 限定 genericIntClass 引用是 Integer类型对象的引用（好绕口的描述）
    // 换句话说：genericIntClass 只能指向Integer类型对象。
    Class<Integer> genericIntClass = int.class;
    System.out.println("is equal? : " + intClass.equals(genericIntClass));

    // 这个地方会编译不通过，原因是：genericIntClass被限制为Integer类型对象的引用，
    // 所以不能赋值成 double.class 类型对象引用。
    // 换句话说：genericIntClass 不能指向double类型对象。
//    genericIntClass = double.class;
    System.out.println("-- finish -- ");
  }
}
