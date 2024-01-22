package structure_data.Evaluator;

import java.util.*;

public class StringTokenizerDemo {

  public static void main(String[] args) {
    StringTokenizer str = new StringTokenizer("*ITI*");

    System.out.println("El numero de tokens es: "+ str. countTokens());

    System.out.println("Tienen tokens el str ?:"+str.hasMoreTokens());

    while (str. hasMoreTokens()) {
          System.out.println("Siguiente token: "+ str.nextToken());
    }
  }
}
