package ch20generics;

import java.util.HashMap;

class HasF{
  public void f(){
    System.out.println("HasF.f()");
  }
}

class Manipulator<T extends HasF>{
  private T obj;

  public Manipulator(T x) {
    this.obj = x;
  }

  //  这个地方编译不通过
  public void manipulate(){
    obj.f();
  }
}

public class Manipulation {
  public static void main(String[] args){
    HasF hasF = new HasF();
    Manipulator<HasF> manipulator = new Manipulator<>(hasF);
    manipulator.manipulate();
  }
}
