public class Main {
    public static void main(String[] args) {
        soma(5,12);
        double m = multiplicacao(5,12);
        System.out.println("A multiplicação é "+m+".");

    }
    static void soma(int a, int b){
        int s = a + b;
        System.out.println("A soma é "+s+".");
    }
    static double multiplicacao(int a, int b){
        return a * b;

    }
}
