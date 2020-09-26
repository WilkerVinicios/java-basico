import javax.swing.*;
import java.awt.event.*;

public class SwingBasico extends JDialog {
    private JPanel contentPane;
    private JButton button1;
    private JLabel label1;

    public SwingBasico() {
        setContentPane(contentPane);
        setModal(true);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label1.setText("Ola Mundo!");
            }
        });
    }

    public static void main(String[] args) {
        SwingBasico dialog = new SwingBasico();
        dialog.pack();
        dialog.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
