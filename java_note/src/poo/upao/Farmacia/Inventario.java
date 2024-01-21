package poo.Farmacia;

import java.util.*;

public class Inventario implements Comparable{
    
    private HashSet<Producto>hst;
    private HashSet<Venta>tsh;

    public Inventario(){
      hst= new HashSet<Producto>();
      tsh = new HashSet<Venta>();
    }
 
    public String agregarPro(Producto pro) {        
      hst.add(pro);    //Se agrega a la coleccion
      return pro.getId(); //Devuelve el id del producto
    }

    public int agregarVent(Venta v) {
      tsh.add(v);    //Se agrega a la coleccion
      return v.getCat_prod_vent(); //Devuelve el id del producto
    }
    
    public void eliminarPro(Producto pro) {   
      hst.remove(pro); //Elimina por el Obj producto
    }        
    
    public String listarPro() {
        String cad="";
        //Recorre la coleccion
        for (Producto p: hst){
            cad= cad + p.toString() + "\n";
        }
        return cad; 
    }

    public String listarVent() {
        String cad="";
        //Recorre la coleccion
        for (Venta v: tsh){
            cad= cad + v.toString() + "\n";
        }
        return cad; 
    }

    public int compareTo(Object obj){
    Producto pro=(Producto) obj;
    return pro.getNom_prod().compareTo(pro.getNom_prod());
    }    

}