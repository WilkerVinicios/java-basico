package classes;

import javax.swing.*;
import java.awt.event.*;
import java.util.Arrays;

public class TelaVetor extends JDialog {
    private JPanel contentPane;
    private JButton btnAdicionar;
    private JButton btnRemover;
    private JButton btnOrdenar;
    private JSpinner spinnerNumero;
    private JLabel labelSelect;
    private JList listVetor;

    int vetor[] = new int[5];
    DefaultListModel lista = new DefaultListModel();
    int selecionado = 0;

    public TelaVetor() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnAdicionar);
        for (int c = 0; c < vetor.length; c++){
            lista.addElement(vetor[c]);
        }
        listVetor.setModel(lista);

        btnAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vetor[selecionado] = Integer.parseInt(spinnerNumero.getValue().toString());
                lista.removeAllElements();
                for (int c = 0; c < vetor.length; c++){
                    lista.addElement(vetor[c]);
                }
            }
        });
        btnRemover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vetor[selecionado] = 0;
                lista.removeAllElements();
                for (int c = 0; c < vetor.length; c++){
                    lista.addElement(vetor[c]);
                }
            }
        });
        btnOrdenar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Arrays.sort(vetor);
                lista.removeAllElements();
                for (int c = 0; c < vetor.length; c++){
                    lista.addElement(vetor[c]);
                }
            }
        });
        listVetor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selecionado = listVetor.getSelectedIndex();
                labelSelect.setText(String.valueOf(selecionado));
            }
        });

    }

    public static void main(String[] args) {
        TelaVetor dialog = new TelaVetor();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
