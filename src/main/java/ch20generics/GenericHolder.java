package ch20generics;

class Automobile {}


public class GenericHolder<T> {

  public GenericHolder() {
  }

  private T a;
  public void setA(T a){
    this.a = a;
  }

  public T getA(){
    return this.a;
  }


  public static void main(String[] args){
    GenericHolder<Automobile> h3 = new GenericHolder<>();
    h3.setA(new Automobile());

    Automobile a = h3.getA();

    System.out.println("-- finish --");
  }
}
