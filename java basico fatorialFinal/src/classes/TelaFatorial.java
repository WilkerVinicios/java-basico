package classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaFatorial extends JDialog{
    private JPanel contentPane;
    private JSpinner spinner1;
    private JButton btnFatorial;
    private JLabel labelFormula;
    private JLabel labelResultado;

    public TelaFatorial() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnFatorial);
        btnFatorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(spinner1.getValue().toString());
                Fatorial f = new Fatorial();
                f.setValor(n);
                labelFormula.setText(f.getFormula());
                labelResultado.setText(Integer.toString(f.getFatorial()));
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
