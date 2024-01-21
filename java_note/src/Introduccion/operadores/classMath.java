package Introduccion.operadores;

import java.util.Scanner;

public class classMath {
   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        
//        MATH.SQRT()
        System.out.print("Enter the number: ");
        double number = s.nextDouble();
//        int raiz = (int)Math.sqrt(number);  //  si conoces que todas la variables obtenidas por tu raiz serán valores
                                            //  enteras agregale la conversión a int, de lo contrario, dejala en double          
        double raiz = Math.sqrt(number);
        System.out.println("The square root is: " + raiz);
        

        System.out.println();
        
        
//        MATH.POW()
        System.out.print("Enter the base: ");
        double base = s.nextDouble();
        System.out.print("And enter the exp: ");
        double exp = s.nextDouble();
        double exponencia = Math.pow(base, exp);    // this method defaults to a base and exp for this operation
        System.out.println("The number "+ base +" raised to the "+ exp +" is: "+exponencia);
        

        System.out.println();
        
        
//        MATH.ROUND()
        System.out.print("Enter de number(double): ");
        double newNumber = s.nextDouble();
        long redondeo = Math.round(newNumber);  //  this method requires that the variable stores it is of type long if it 
                                                //  uses a variable of type double
        System.out.println("The round of number(double) is: " + redondeo);
        
        System.out.print("Enter de number(float): ");
        float otherNumber = s.nextFloat();
        int round = Math.round(otherNumber);    //  this method requires that the variable stores it is of type int if it 
                                                //  uses a variable of type float
        System.out.println("The round of number(float) is: " + round);
        

        System.out.println();
        
        
//        MATH.RANDOOM()
        double variable = Math.random();
        System.out.println("The number random is: " + variable);

        s.close();
        
    }
}
