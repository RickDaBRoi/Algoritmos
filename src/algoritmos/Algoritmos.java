package algoritmos;

public class Algoritmos {
    
    public static void quadrado(double n) {
        double r = n * n;
        System.out.println("Quadrado: " + r);
    }
    public static double metade(double v) {
        double r = v / 2;
        return r;
    }
    public static void main(String[] args) {
                        
        System.out.println("A raiz é: " + Math.sqrt(25));
        
        quadrado(10);
                
        System.out.println("Metade" + metade(15));        
    }    
}
