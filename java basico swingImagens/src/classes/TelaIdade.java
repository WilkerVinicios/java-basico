package classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class TelaIdade extends JDialog {
    private JPanel contentPane;
    private JButton btnCalcular;
    private JLabel labelIdade;
    private JTextField textAno;
    private JLabel labelAno;

    public TelaIdade() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnCalcular);

        //usando calendar e pegando ano Atual.
        Calendar anotAtual = Calendar.getInstance();
        labelAno.setText(String.valueOf(anotAtual.get(Calendar.YEAR)));

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //transformando texto em inteiro
                int ano = Integer.parseInt(textAno.getText());
                //pegando anoAtual em inteiro e diminuindo de ano digitado por usuario
                int idade = anotAtual.get(Calendar.YEAR) - ano;
                //mostrar idade do usuario na tela.
                labelIdade.setText(Integer.toString(idade));
            }
        });
    }

    public static void main(String[] args) {
        TelaIdade dialog = new TelaIdade();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
