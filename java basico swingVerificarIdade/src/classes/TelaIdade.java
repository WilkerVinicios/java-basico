package classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Year;
import java.util.Calendar;

public class TelaIdade extends JDialog {
    private JPanel contentPane;
    private JButton btnCalcular;
    private JTextField textAnoNasc;
    private JLabel labelSituacao;
    private JLabel labelIdade;

    public TelaIdade() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnCalcular);
        //Inicializando Classe Calendar
        Calendar anoAtual = Calendar.getInstance();

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //pegando ano digitado pelo usuario em string e convertendo para inteiro
                int anoNascimento = Integer.parseInt(textAnoNasc.getText());
                //pegando ano atual do sistema e subtraindo ano de nascimento
                int idade = anoAtual.get(Calendar.YEAR) - anoNascimento;

                //convertendo idade para string e mostrando no campo labelIdade
                labelIdade.setText(Integer.toString(idade));

                //condição para saber se usuario é maior ou menor de idade
                String situacao = ((idade >= 16 && idade < 18) || (idade > 70))?"Voto Opcional": "Voto Obrigatório";

                //mostrando situação na tela
                labelSituacao.setText(situacao);


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
