package ch12collection;

import static java.util.Arrays.asList;
import static java.util.Arrays.parallelPrefix;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AddingGroups {

  public static void main(String[] args) {
    Collection<Integer> collection = new ArrayList<>(asList(1, 2, 3, 4, 5));
    Integer[] moreInts = {6,7,8,9};

    collection.addAll(asList(moreInts));

    collection.forEach(i->System.out.println(i));

    List<Integer> list = asList(1,2,3,4,5);
//    list.add(1,99);
    list.forEach(i->System.out.println(i));

    List<Integer> list2= new ArrayList<Integer>(){{
      add(1);
      add(2);
    }};
    list2.add(1,99);
    list2.forEach(i->System.out.println(i));
  }
}
