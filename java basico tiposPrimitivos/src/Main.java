import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do Aluno:");
        String nome = sc.nextLine();
        System.out.println("Digite a nota do Aluno:");
        float nota = sc.nextFloat();
        System.out.printf("A nota de %s é %.2f. \n",nome,nota);

        //convertendo inteiro em string
        System.out.println("Digite a idade de "+nome+".");
        int idade = sc.nextInt();
        String valorIdade = Integer.toString(idade);
        System.out.println("A idade foi convertida em String usando toString é: "+valorIdade+".");

        //convertendo string em inteiro
        int idadeInteira = Integer.parseInt(valorIdade);
        System.out.println("A idade foi reconvertida para Inteiro usando parseInt é: "+idadeInteira+".");

        //convertendo string em float
        float idadeFloat = Float.parseFloat(valorIdade);
        System.out.printf("A idade foi reconvertida para Float usando parseFloat é: %.2f.",idadeFloat);

    }
}
