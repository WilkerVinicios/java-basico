package classes;

import javax.swing.*;

public class TelaDoWhile {
    public static void main(String[] args) {
        int numero = 0;
        int soma = 0;
        int pares = 0;
        int impares = 0;
        int maior = 0;
        float media = 0;
        int qntdade = 0;
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog(null,"<html>Informe um numero: " +
                    "<br><em>(Digite 0 para Resultado.)</em></html>"));
            qntdade += 1;
            soma += numero;
            if(numero%2 == 0){
                pares += 1;
            } else{
                impares += 1;
            }
            if (numero >= 100) maior += 1;

        }while(numero != 0);
        qntdade = qntdade -1;
        pares = pares - 1;
        media = soma/(qntdade);
        JOptionPane.showMessageDialog(null,"<html>Resultado Final  <hr> " +
                "<br>Total de valores: "+ qntdade +"."+
                "<br>Somatório Total: "+ soma +"."+
                "<br>Total de Pares: "+ pares +"."+
                "<br>Total de Ímpares: "+ impares +"."+
                "<br>Acima de 100: "+ maior +"."+
                "<br>Media dos Valores "+ media +".");
    }
}
