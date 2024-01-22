package poo.upao.introduction;

public class Circulo {  // clase -> circulo, representa un conjunto de entidades con propiedades enc comun
// la clase define la estructura y comportamiento de un objeto, a esto se le llama INSTANCIA DE CLASE
// EJEMPLOS DE INSTANCIA DE CLASE -> Clase variableReferencia = new ConstructorDeLaClase();

    // CICLO DE VIDA DE LOS OBJETOS
    // DECLARACION <-> CREACION
    // Clase variableReferencia = new ConstructorDeLaClase();


    // Definicion de atributos y metodos - atirbutos de instancia que determinan el estodo de un objeto, ya que pueden poseer valores distintos

    // sintaxis tipoDato nombVariable;
    double radio;   // atributo radio de la clase circulo


    // Constructor - metodo llamado en la creacion del objeto, recibe parametros que asigna valores a los atributos de clase
    public Circulo() {
    }

    public Circulo(double r) {
        radio = r;
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    // Metodos pertencientes a la clase - operaciones o funciones que se aplican a los objetos, retornan valores y reciben parametros

    // EJEMPLO METODO
    // tipoRetorno nombMetodo([Lista parametros]) {
    //     // contenido del metodo
    //     [return valorRetorno(del tipoRetorno)];
    // }

    // Metodo con parametros y retorno
    double calcularArea() {
        return 3.1415*radio*radio;
    }
    double calcularPerimetro() {
        return 2*3.1415*radio;
    }
    
}
