package Introduccion.operadores;

import java.util.Scanner;

public class monthlySalary {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double salaryBase = 1000;
        System.out.println("Salary per month: " + salaryBase);
        double commisionPerCar = 150;
        System.out.println("Commission per car sold: " + commisionPerCar);
        double porcentajePerSold = 0.05;
        System.out.println(porcentajePerSold * 100 + "% of the sale of the car");
        
        
        System.out.print("Nombre del vendedor: ");
        String nombreVendedor = s.nextLine();
        System.out.println("Ingrese la cantidad de carro que he vendido: ");
        int carrosVendidos = s.nextInt();
        System.out.println("Precio de los carros vendidos: $");
        double precio = s.nextDouble();
        
        double monthlySalary = salaryBase + (commisionPerCar * carrosVendidos) + ((porcentajePerSold * precio) * carrosVendidos);
        
        System.out.println("El salario total del vendedor "+ nombreVendedor +" es de: " + monthlySalary);

        s.close();
        
    }
}
