package ch20generics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class GenericVarargs {

  public static <T> List<T> makeList(T... args) {
    List<T> result = new ArrayList<>();
    Stream.of(args).forEach(e -> result.add(e));
    return result;
  }

  public static void main(String[] args){
    List<String> ls  = makeList("A");
    System.out.println(ls);

    ls = makeList("A","B","C");
    System.out.println(ls);

    ls  = makeList("ABCDEFFHIJKLMNOPQRSTUVWXYZ".split(""));
    System.out.println(ls);
  }
}
