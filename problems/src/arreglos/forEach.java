/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

/**
 *
 * @author LUIS
 */
public class forEach {
    public static void main(String[] args) {
        String[] nombres = {"guillermo", "lucia", "deigowo", "drake", "pablo", "allison"};
        
        for (int i = 0; i < nombres.length; i++) {  //nombre_arreglo.lenght = te devuelve un numero entero, 
                                                    //que es cuantos elementos hay en el arreglo
            System.out.println(nombres[i]);
        }
        
        System.out.println("");
        
        for (String nombre : nombres) { // mucho mas reducido
            System.out.println("Nombres: "+nombre);
        }
        
    }
}
