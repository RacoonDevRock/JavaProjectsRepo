package poo.TeatroBoleteria;

public class Cliente {

  private int tiempoArribo;
  private int tiempoPartida;

  public Cliente(int tiempoArribo, int tiempoPartida) {
    this.tiempoArribo = tiempoArribo;
    this.tiempoPartida = tiempoPartida;
  }

  public int getTiempoArribo() {
    return tiempoArribo;
  }

  public void setTiempoArribo(int tiempoArribo) {
    this.tiempoArribo = tiempoArribo;
  }

  public int getTiempoPartida() {
    return tiempoPartida;
  }

  public void setTiempoPartida(int tiempoPartida) {
    this.tiempoPartida = tiempoPartida;
  }

  public int getTiempoTotal() {
    int TT = 0;
    TT = TT + tiempoArribo + tiempoPartida;
    return TT;// falta hacer algo
  }

}