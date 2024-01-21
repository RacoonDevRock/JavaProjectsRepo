package poo.CafeElNegrito;

public class Batido extends Cafe {

  Cafe bebida;

  // para manejar el atributo descripcion se desarrolla en el constructor
  public Batido() {
    descripcion = "Cafe Batido";
  }

  // Se retorna solo el precio de la bebida de acuerdo al pedido
  public double costo(int x) {
    // X hace referencia al tamaño del producto

    double precio = bebida.costo(x);

    switch (x) {
      case 1: // Tamño Normal
        precio = precio + 0.89;
        break;
      case 2: // Tamaño Mediano
        precio = precio + 0.99;
        break;
      case 3: // Tamaño Grande
        precio = precio + 1.09;
        break;
    }

    return precio;
  }

}