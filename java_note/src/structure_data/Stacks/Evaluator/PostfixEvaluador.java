package structure_data.Stacks.Evaluator;

import java.util.StringTokenizer;

public class PostfixEvaluador {

    private char SUMA = '+';
    private char RESTA = '-';
    private char MULTIPLICA = '*';
    private char DIVIDE = '/';
    private ArrayStack<Integer> stack;

    public PostfixEvaluador() {
      stack = new ArrayStack<Integer>();
    }
    
    public int evaluar(String expr){
      int op1, op2, resultado = 0;
      String token;
      StringTokenizer tokenizer = new StringTokenizer (expr);

      while(tokenizer.hasMoreTokens()){
        token = tokenizer.nextToken();
        if(isOperador(token)){
          op2 = (stack.pop()).intValue();
          op1 = (stack.pop()).intValue();
          resultado = evalSimpleOp (token.charAt(0), op1, op2);
          stack.push(new Integer(resultado));
        }
        else{
          stack.push(new Integer(Integer.parseInt(token)));
        }
      }
      return resultado;   
    }
  
    private boolean isOperador(String token){
        return (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/"));
    }
    
    private int evalSimpleOp(char operation, int op1, int op2){
        int resultado = 0;
        switch (operation){
          case SUMA:
            resultado = op1 + op2;
            System.out.println(op1 + " + " + op2  +" = "  + resultado);
            break;
            
          case RESTA:
            resultado = op1 - op2;
            System.out.println(op1 + " - " + op2 +" = " + resultado);
            break; 
            
          case MULTIPLICA:
            resultado = op1 * op2;
            System.out.println(op1 + " * " + op2 +" = " + resultado);
            break; 

          case DIVIDE:
            resultado = op1 / op2;
            System.out.println(op1 + " / " + op2 +" = " + resultado);
            break;
        }
      return resultado;
    }
    
}
