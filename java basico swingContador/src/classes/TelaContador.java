package classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaContador extends JDialog {
    private JPanel contentPane;
    private JButton btnContar;
    private JLabel labelContagem;
    private JTextField textNum;
    private JLabel labelResult;

    public TelaContador() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnContar);
        btnContar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numCambal = Integer.parseInt(textNum.getText());
                int cambal = 1;
                String contagem = "";
                while(cambal <= numCambal ){
                    contagem += cambal + " ";
                    cambal++;
                }
                labelContagem.setText(contagem);
                labelResult.setText("<html>O Numero de Cambalhotas é "+numCambal+".");
            }
        });
    }

    public static void main(String[] args) {
        TelaContador dialog = new TelaContador();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
