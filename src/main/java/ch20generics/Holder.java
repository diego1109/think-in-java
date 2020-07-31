package ch20generics;

import java.util.Objects;

public class Holder<T> {

  private T value;

  public Holder(T value) {
    this.value = value;
  }

  public Holder() {}

  public void setValue(T value) {
    this.value = value;
  }

  public T getValue() {
    return this.value;
  }

  @Override
  public boolean equals(Object o) {
    return o instanceof Holder && Objects.equals(value, ((Holder) o).value);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(value);
  }

  public static void main(String[] args){
    Holder<Apple> appleHolder = new Holder<>(new Apple());
    Apple d = appleHolder.getValue();
    appleHolder.setValue(d);


  }

}
