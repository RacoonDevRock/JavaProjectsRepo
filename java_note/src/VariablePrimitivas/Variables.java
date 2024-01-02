package VariablePrimitivas;

public class Variables {
    public static void main(String[] args) {
        byte bait = 12;
        short corta = 12456;
        int entero = 1245656;
        long largo = 1594268;
        
        System.out.println(bait + " | " + corta + " | " + entero + " | " + largo);
        
        float decimal = 3.45f;  // tamaño 32 (necesario luego del numero 0.0f)
        double doble = 4.35;    // tamaño 64
        
        System.out.println(decimal + " | " + doble);
    }
}
