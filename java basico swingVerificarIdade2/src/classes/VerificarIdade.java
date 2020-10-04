package classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class VerificarIdade extends JDialog {
    private JPanel contentPane;
    private JButton btnVerificar;
    private JTextField textAno;
    private JLabel labelResult;
    private JLabel labelIdade;

    public VerificarIdade() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnVerificar);
        Calendar anoAtual = Calendar.getInstance();


        btnVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //pegando ano digitado em texto e convetendo para inteiro
                int ano = Integer.parseInt(textAno.getText());
                //calculando idade do usuario;
                int idade = anoAtual.get(Calendar.YEAR) - ano;

                //condição encadeada para verificar se voto é obrigatorio ou opcional ou não vota
                if(idade < 16){
                    labelResult.setText("Não Vota!");
                }else if((idade >= 16 && idade < 18) || (idade > 70)){
                        labelResult.setText("Voto Opcional");
                }else{
                        labelResult.setText("Voto Obrigatório");
                }

                labelIdade.setText(Integer.toString(idade));
            }
        });
    }

    public static void main(String[] args) {
        VerificarIdade dialog = new VerificarIdade();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
