import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int numeros[] = {2,3,6,5,4,1,9,0,7};

        for (int i = 0;i < numeros.length; i++){
            System.out.printf(numeros[i]+" ");
        }

        String mes[] = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho",
                "Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        int dias[] = {31,28,31,30,31,30,31,31,30,31,30,31};

        for (int i = 0;i < mes.length;i++){
            System.out.println("O mês de "+mes[i]+",possui "+dias[i]+" dias.");
        }

        double valor[] = {3.12,2.1,4.3,5.4,6.4,1.2,1.6};
        Arrays.sort(valor);
        for (double v : valor){
            System.out.printf(v+" ");
        }

        int vet[] = {7,4,5,2,1,9,8,6,10,3};
        for (int numero: vet) {
            System.out.println(vet+" ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet,1);
        System.out.println("Encontrei o valor na posição "+p);


        int valorNovo[] = new int[20];
        Arrays.fill(valorNovo, 0);
        for(int v: valorNovo){
            System.out.println(v+" ");
        }
    }

}
