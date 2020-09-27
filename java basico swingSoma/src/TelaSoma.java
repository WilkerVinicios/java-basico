import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaSoma extends JDialog {
    private JPanel contentPane;
    private JButton btnSomar;
    private JTextField textN1;
    private JTextField textN2;
    private JLabel labelSoma;


    public TelaSoma() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnSomar);
        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(textN1.getText());
                int n2 = Integer.parseInt(textN2.getText());
                int s = n1 + n2;
                labelSoma.setText(Integer.toString(s));
            }
        });
    }

    public static void main(String[] args) {
        TelaSoma dialog = new TelaSoma();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
