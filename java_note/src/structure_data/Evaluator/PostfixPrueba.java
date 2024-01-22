package structure_data.Evaluator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PostfixPrueba {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String args[]) throws IOException {
    String rpta;
    String expr;
    do {
      System.out.println("Ingresa una expresion postfix valida: ");
      expr = br.readLine();

      System.out.println("Evaluar otra expresion [S/N]? ");
      rpta = br.readLine();
    } while (rpta == "Si");
  }
}
