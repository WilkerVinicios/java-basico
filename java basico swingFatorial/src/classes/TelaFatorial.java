package classes;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TelaFatorial extends JDialog {
    private JPanel contentPane;
    private JSpinner spinnerF;
    private JLabel labelResult;

    public TelaFatorial() {
        setContentPane(contentPane);
        setModal(true);
        spinnerF.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int numero = Integer.parseInt(spinnerF.getValue().toString());
                int fatorial = 1;
                int cont = numero;

                while(cont >= 1) {
                    fatorial *= cont;
                    cont--;
                    if (numero >= 15) {
                        labelResult.setText("<html>Fatorial não Calculado. Desculpe!</html>");
                        break;
                    } else {
                        labelResult.setText(Integer.toString(fatorial));
                    }
                }
            }
        });

    }

    public static void main(String[] args) {
        TelaFatorial dialog = new TelaFatorial();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
