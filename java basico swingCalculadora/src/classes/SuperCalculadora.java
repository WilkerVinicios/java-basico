package classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SuperCalculadora extends JDialog {
    private JPanel contentPane;
    private JButton btnCalcular;
    private JTextField textNumero;
    private JLabel resultResto;
    private JLabel resultQuadrado;
    private JLabel resultCubo;
    private JLabel resultRaizQ;
    private JLabel resultRaizC;
    private JLabel resultValorAbs;

    public SuperCalculadora() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnCalcular);
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //pegando numero digitado pelo usuario e transformando em inteiro
                int meuNumero = Integer.parseInt(textNumero.getText());

                //calculando o resto
                int resto = meuNumero % 2;
                resultResto.setText(Integer.toString(resto));

                //Elevando ao quadrado e ao cubo
                double quadrado = Math.pow(meuNumero,2);
                resultQuadrado.setText(String.format("%.2f",quadrado));
                double cubo = Math.pow(meuNumero,3);
                resultCubo.setText(String.format("%.2f",cubo));

                //calculando a raiz quadrada e cubica
                float raizQ = (float) Math.sqrt(meuNumero);
                resultRaizQ.setText(String.format("%.2f",raizQ));
                float raizC = (float) Math.cbrt(meuNumero);
                resultRaizC.setText(String.format("%.2f",raizC));

                //calculando o valor absoluto
                int absolut = Math.abs(meuNumero);
                resultValorAbs.setText(Integer.toString(absolut));


            }
        });
    }

    public static void main(String[] args) {
        SuperCalculadora dialog = new SuperCalculadora();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
