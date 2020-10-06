import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 1;
        int numero;
        int soma = 0;
        String resp;

        while(c <= 10){
            System.out.println("O número do WHILE é "+ c);
            c++;
            if(c == 3) System.out.println("Chegamos a 30%.");
            if(c == 5) System.out.println("Chegamos a 50%.");
            if(c == 8) System.out.println("Chegamos a 80%.");
        }

        for (int i = 10;i >= 1;i--){
            System.out.println("O numero do FOR é "+ i);
            if(i == 3) System.out.println("Chegamos a 30%.");
            if(i == 5) System.out.println("Chegamos a 50%.");
            if(i == 8) System.out.println("Chegamos a 80%.");
        }

        do{
            System.out.print("Digite um Numero: ");
            numero = sc.nextInt();
            soma += numero;
            System.out.print("Quer continuar ? [S/N] ");
            resp = sc.next();
        }while (resp.equalsIgnoreCase("s"));
            System.out.println("A soma dos valores é "+soma+".");

    }
}
