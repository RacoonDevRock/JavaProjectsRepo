package poo.upao.Farmacia;

public class Producto implements Comparable {

  private String id;
  private String nom_prod;
  private String contenido;
  private String lab;
  private int cant_tot;
  private double precio;

  public Producto(String id, String nom_prod, String contenido, String lab, int cant_tot, double precio) {
    this.id = id;
    this.nom_prod = nom_prod;
    this.contenido = contenido;
    this.lab = lab;
    this.cant_tot = cant_tot;
    this.precio = precio;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNom_prod() {
    return nom_prod;
  }

  public void setNom_prod(String nom_prod) {
    this.nom_prod = nom_prod;
  }

  public String getContenido() {
    return contenido;
  }

  public void setContenido(String contenido) {
    this.contenido = contenido;
  }

  public String getLab() {
    return lab;
  }

  public void setLab(String lab) {
    this.lab = lab;
  }

  public int getCant_tot() {
    return cant_tot;
  }

  public void setCant_tot(int cant_tot) {
    this.cant_tot = cant_tot;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int compareTo(Object obj) {
    Producto pro = (Producto) obj;
    return this.getNom_prod().compareTo(pro.getNom_prod());
  }

  public String toString() {
    return "\n ID: " + getId() + "\n Nombre: " + getNom_prod() + "\n Cont. neto: " + getContenido() + "\n Laboratorio: "
        + getLab() + "\n Cantidad: " + getCant_tot() + "\n Precio: " + getPrecio();
  }

}
