
package CafeElNegrito;


public class PruebaCompraCafe {

    public static void main(String[] args) {
        System.out.println("");
        System.out.print("*********BIENVENIDO A CAFETERIA NEGRITO*********");
        System.out.println("");
        
        //Se intancia un objeto de la clase Expreso
        Cafe bebidaA = new Expreso();
        
        System.out.println("\nSu orden es " + bebidaA.getDescripcion());
        //System.out.println("Total = " + bebidaA.costo());
        
        ////////////////////////////////////////////////////////////////
        
        //Se intancia un objeto de la clase Tostado Negro
        Cafe bebidaB = new TostadoNegro(1);
        
        //bebidaB = new MedNormal(bebidaB);//Agrega a la bebida Crema
        bebidaB = new Moca(bebidaB, 1);//Agrega a la bebida Moca
        bebidaB = new Crema(bebidaB, 1);//Agrega a la bebida Crema
        
        //bebidaB = new MedGrande(bebidaB);
        
        System.out.println("\nSu orden es " + bebidaB.getDescripcion());
        //System.out.println("Total = " + bebidaB.costo());
        
        ////////////////////////////////////////////////////////////////
        
        Cafe bebidaC = new Batido();
        
        bebidaC = new MedGrande(bebidaC);
        // bebidaC = new Soya(bebidaC);
        // bebidaC = new Moca(bebidaC);
        // bebidaC = new Moca(bebidaC);
        // bebidaC = new Crema(bebidaC);
        
        System.out.println("\nSu orden es " + bebidaC.getDescripcion());
        // System.out.println("Total = " + bebidaC.costo());

       //Normal: 1 - Mediano: 2 - Grande: 3
        
        ////////////////////////////////////////////////////////////////
        
        Cafe bebidaD = new Descafeinado();
        bebidaD.setSize(Cafe.Size.VENTI);
        bebidaD = new MedMedio(bebidaD);
        // bebidaD = new Leche(bebidaD);
        // bebidaD = new Moca(bebidaD);
        // bebidaD = new Crema(bebidaD);
        // bebidaD = new Soya(bebidaD);
        
        System.out.println("\nSu orden es " + bebidaD.getDescripcion());
        // System.out.println("Total = " + bebidaD.costo());
        
        Cafe bebida = new Expreso();
        
        System.out.println("\nSu orden es " + bebida.getDescripcion());
        // System.out.println("Total = " + bebida.costo());
        
        ////////////////////////////////////////////////////////////////
        
        // Cafe bebidaA = new TostadoNegro();
        
        // bebidaA = new Moca(bebidaA);
        // bebidaA = new Crema(bebidaA);
        
        System.out.println("\nSu orden es " + bebidaA.getDescripcion());
        // System.out.println("Total = " + bebidaA.costo());
        
        ////////////////////////////////////////////////////////////////
        
        // Cafe bebidaB = new Descafeinado();
        
        // bebidaB = new Moca(bebidaB);
        
        System.out.println("\nSu orden es " + bebidaB.getDescripcion());
        // System.out.println("Total = " + bebidaB.costo());
        
        ////////////////////////////////////////////////////////////////
        
        // Cafe bebidaC = new Batido();
        
        // bebidaC = new Leche(bebidaC);
        // bebidaC = new Soya(bebidaC);
        // bebidaC = new Moca(bebidaC);
        // bebidaC = new Leche(bebidaC);
        
        System.out.println("\nSu orden es " + bebidaC.getDescripcion());
        // System.out.println("Total = " + bebidaC.costo());
        
        ////////////////////////////////////////////////////////////////
        
        // Cafe bebidaD = new TostadoNegro();
        
        // bebidaD = new Moca(bebidaD);
        // bebidaD = new Leche(bebidaD);
        // bebidaD = new Moca(bebidaD);
        
        System.out.println("\nSu orden es " + bebidaD.getDescripcion());
        // System.out.println("Total = " + bebidaD.costo());
    }
}
