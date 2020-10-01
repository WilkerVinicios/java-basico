import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declarando classe scanner
        Scanner sc = new Scanner(System.in);

        //lendo os numeros digitados pelo usuario e armazenando em uma variavel
        System.out.println("Digite a nota 1: ");
        float nota1 = sc.nextFloat();
        System.out.println("Digite a nota 2: ");
        float nota2 = sc.nextFloat();
        System.out.println("Digite a nota 3: ");
        float nota3 = sc.nextFloat();
        System.out.println("Digite a nota 4: ");
        float nota4 = sc.nextFloat();

        //calculando media final e armazanando em uma variavel
        float mediaFinal = (nota1+nota2+nota3+nota4)/4;

        //mensagens de retoro para alunos
        String aprovado = "O aluno foi APROVADO! Sua média foi "+mediaFinal+".";
        String reprovado = "Infelizmente o aluno foi REPROVADO. Sua média foi "+mediaFinal+".";
        String aprovadoMerito = "Parabens! Aluno Exemplar. APROVADO com honras e média "+mediaFinal+".";

        //criando condicão para retornar resultado na tela se aprovado ou não
        if(mediaFinal >= 6){
            if(mediaFinal >= 9){
                System.out.println(aprovadoMerito);
            }
            System.out.println(aprovado);
        }else{
            System.out.println(reprovado);
        }
    }
}
