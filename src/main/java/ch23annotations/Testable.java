package ch23annotations;

import atunit.Test;

public class Testable {

  public void execute(){
    System.out.println("Executing..");
  }

  @Test
  void testExecute(){
    execute();
  }

  public static void main(String[] args){
    System.out.println("-- finish --");
  }
}
