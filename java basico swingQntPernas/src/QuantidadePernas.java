import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuantidadePernas extends JDialog {
    private JPanel contentPane;
    private JButton btnVerificar;
    private JTextField textQuantidade;
    private JLabel labelResult;

    public QuantidadePernas() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnVerificar);
        btnVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int pernas = Integer.parseInt(textQuantidade.getText());
                String tipo;

                switch (pernas){
                    case 1:
                        tipo = "Saci";
                        break;
                    case 2:
                        tipo = "Bipede";
                        break;
                    case 4:
                        tipo = "Quadrúpede";
                        break;
                    case 6,8:
                        tipo = "Aranha";
                        break;
                    default:
                        tipo = "ET";
                        break;
                }

                labelResult.setText(tipo);
            }
        });
    }

    public static void main(String[] args) {
        QuantidadePernas dialog = new QuantidadePernas();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
