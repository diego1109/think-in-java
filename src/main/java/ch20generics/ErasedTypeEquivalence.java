package ch20generics;

import java.util.ArrayList;

class A{};

class B{};
class Generic<T>{};

public class ErasedTypeEquivalence {
  public static void main(String[] args){
    Class c1 = new ArrayList<String>().getClass();
    Class c2 = new ArrayList<Integer>().getClass();

    System.out.println(c1 == c2 );
    System.out.println(c1.getSimpleName());
    System.out.println(c2.getSimpleName());

    Class a = new Generic<A>().getClass();
    Class b = new Generic<B>().getClass();

    System.out.println(a == b);

    System.out.println(a.getSimpleName());
    System.out.println(b.getSimpleName());

  }
}
