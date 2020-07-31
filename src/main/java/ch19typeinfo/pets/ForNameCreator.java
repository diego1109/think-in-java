package ch19typeinfo.pets;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {

  private static List<Class<? extends Pet>> types = new ArrayList<>();

  // 需要随机生成的类名
  private static String[] typeNames = {
    "ch19typeinfo.pets.Mutt",
    "ch19typeinfo.pets.Pug",
    "ch19typeinfo.pets.EgyptianMau",
    "ch19typeinfo.pets.Manx",
    "ch19typeinfo.pets.Cymric",
    "ch19typeinfo.pets.Rat",
    "ch19typeinfo.pets.Mouse",
    "ch19typeinfo.pets.Hamster"
  };

  /**
   * Class.forName(name): 根据全限定名称获取类型对象，返回给类型对象引用。
   */
  @SuppressWarnings("unchecked")
  private static void loader() {
    try {
      for (String name : typeNames) {
        types.add((Class<? extends Pet>) Class.forName(name));
      }
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }

  static {
    loader();
  }

  @Override
  public List<Class<? extends Pet>> types() {
    return types;
  }
}
