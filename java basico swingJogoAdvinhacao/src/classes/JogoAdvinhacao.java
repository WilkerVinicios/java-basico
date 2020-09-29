package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JogoAdvinhacao extends JDialog {
    private JPanel contentPane;
    private JLabel labelFrase;
    private JButton btnAdv;
    private JTextField labelNumero;

    public JogoAdvinhacao() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnAdv);
        labelFrase.setText("<html>Vou pensar em um valor entre 1 e 5. Tente advinhar.</html>");

        btnAdv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //gerando numeros randomicos entre 1 e 5
                double numRandom = 1 + Math.random() * (6 - 1);
                int numero = (int) numRandom;

                //pegando texto digitado pelo usuario e convertendo para inteiro
                int num = Integer.parseInt(labelNumero.getText());

                //texto que será exibido ao usuario no labelFrase
                String f1 = "<html>Acertou!</html>";
                String f2 = "<html>Errou! Eu pensei no valor "+numero+".</html>";

                //condição ternaria que verifica se numero é igual ou diferente e retorna a string salva
                String result = (numero == num)?f1 : f2;

                //alterando a fonte da variavel f1 e f2
                labelFrase.setFont(new Font("Arial Black",Font.PLAIN,16));

                //enviando a variavel da condição ternaria para apresentar na tela
                labelFrase.setText(result);
            }
        });
    }

    public static void main(String[] args) {
        JogoAdvinhacao dialog = new JogoAdvinhacao();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
