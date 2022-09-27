public class Calculadora {

    private double largura;
    private double comprimento;
    private double altura;

    public Calculadora(){}
    public static void calculadora(double largura){
        double areaQuadrado = largura * largura;
        System.out.println("Área do Quadrado: " + areaQuadrado);
    }
    public static void calculadora(double largura,double comprimento){
        double areaRetangulo = largura*comprimento;
        System.out.println("Área do Retangulo: " + areaRetangulo);
    }
    public static void calculadora(double largura,double comprimento, double altura){
        double areaTrapezio = ((largura + comprimento)*altura)/2;
        System.out.println("Área do Trapezio: " + areaTrapezio);
    }

}
