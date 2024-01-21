package poo.Farmacia;

public class Venta{
  private int cat_prod_vent;
  private Producto pro;

  public Venta(int cat_prod_vent, Producto pro){
  this.cat_prod_vent=cat_prod_vent;
  this.pro=pro;
  }

  public int getCat_prod_vent(){
    return cat_prod_vent;
  }

  public void setCat_prod_vent(int cat_prod_vent){
    this.cat_prod_vent=cat_prod_vent;
  }

  public Producto getPro(){
    return pro;
  }

  public void setPro(Producto pro){
    this.pro=pro;
  }

  public double total(Producto pro,int cat_prod_vent, double precio){
    double tot=0;
    tot=cat_prod_vent*precio;
    return tot;
  }

  public int restante(Producto pro, int cant_tot){
    int rest=0;
    rest=cant_tot-cat_prod_vent;
    return rest;
  }

  public String toString(){
    return "\nID: " + pro.getId() + "\nNombre: " + pro.getNom_prod()+ "\nCant. total vendida: "+ getCat_prod_vent() + "\nDinero total: " + total(pro, cat_prod_vent, pro.getPrecio()) + "\nCantidad restante: " + restante(pro, pro.getCant_tot());
  }   

}