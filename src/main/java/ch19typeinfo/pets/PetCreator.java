package ch19typeinfo.pets;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public abstract class PetCreator implements Supplier<Pet> {

  private Random random = new Random(47);

  // 该方法可以创建不同类型的Pet子类
  // 注：该方法的返回值是个列表，里面存储的是类型对象引用，而不是对象引用。
  public abstract List<Class<? extends Pet>> types();

  @Override
  public Pet get() {
    int n = random.nextInt(types().size());

    try {
      return types().get(n).newInstance();
    } catch (InstantiationException | IllegalAccessException e) {
      throw new RuntimeException(e);
    }
  }

  // 创建一个randomPet
  public Pet randomPet() {
    int n = random.nextInt(types().size());
    try {
      return types().get(n).newInstance();
    } catch (InstantiationException e) {
      throw new RuntimeException(e);
    } catch (IllegalAccessException e) {
      throw new RuntimeException(e);
    }
  }

  public Pet[] createArray(int size) {
    Pet[] result = new Pet[size];
    IntStream.range(0, size).forEach(i -> result[i] = randomPet());
    return result;
  }
}
