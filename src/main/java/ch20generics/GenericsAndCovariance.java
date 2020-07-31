package ch20generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsAndCovariance {

  public static void main(String[] args){

    List<Apple> apples = new ArrayList<>();
    List<Orange> oranges = new ArrayList<>();


    List<? super Apple> fruits = new ArrayList<>();
    fruits.add(new Apple());
    fruits.add(new Jonathan());

  }
}
