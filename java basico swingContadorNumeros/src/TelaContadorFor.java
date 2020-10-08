import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaContadorFor extends JDialog {
    private JPanel contentPane;
    private JButton btnCalcular;
    private JSlider slider1;
    private JSlider slider2;
    private JSlider slider3;
    private JList listaResult;
    private JLabel labelInicio;
    private JLabel labelFim;
    private JLabel labelPasso;

    public TelaContadorFor() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnCalcular);
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = slider1.getValue();
                int f = slider2.getValue();
                int p = slider3.getValue();

                DefaultListModel lista = new DefaultListModel();

                for (int numero = i;numero <= f;numero  += p){
                    lista.addElement(numero);
                }
                listaResult.setModel(lista);
            }
        });

        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int i = slider1.getValue();
                labelInicio.setText(Integer.toString(i));
            }
        });
        slider2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int f = slider2.getValue();
                labelFim.setText(Integer.toString(f));
            }
        });
        slider3.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int p = slider3.getValue();
                labelPasso.setText(Integer.toString(p));
            }
        });
    }

    public static void main(String[] args) {
        TelaContadorFor dialog = new TelaContadorFor();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
