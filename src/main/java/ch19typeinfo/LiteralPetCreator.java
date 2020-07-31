package ch19typeinfo;

import static java.util.Arrays.asList;

import ch19typeinfo.pets.Cat;
import ch19typeinfo.pets.Cymric;
import ch19typeinfo.pets.Dog;
import ch19typeinfo.pets.EgyptianMau;
import ch19typeinfo.pets.Hamster;
import ch19typeinfo.pets.Manx;
import ch19typeinfo.pets.Mouse;
import ch19typeinfo.pets.Mutt;
import ch19typeinfo.pets.Pet;
import ch19typeinfo.pets.PetCreator;
import ch19typeinfo.pets.Pug;
import ch19typeinfo.pets.Rat;
import ch19typeinfo.pets.Rodent;
import java.util.Collections;
import java.util.List;

public class LiteralPetCreator extends PetCreator {

  // 使用字面量 就可以不用try catch
  public static final List<Class<? extends Pet>> allTypes =
      Collections.unmodifiableList(
          asList(
              Pet.class,
              Dog.class,
              Cat.class,
              Rodent.class,
              Mutt.class,
              Pug.class,
              EgyptianMau.class,
              Manx.class,
              Cymric.class,
              Rat.class,
              Mouse.class,
              Hamster.class));

  public static final List<Class<? extends Pet>> types =
      allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());

  public List<Class<? extends Pet>> types(){
    return types;
  }

  public static void main(String[] args){
    System.out.println(types);
  }
}
