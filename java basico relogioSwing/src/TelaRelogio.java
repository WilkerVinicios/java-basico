import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TelaRelogio extends JDialog {
    private JPanel contentPane;
    private JButton cliqueAquiButton;
    private JLabel labelText;

    public TelaRelogio() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(cliqueAquiButton);

        cliqueAquiButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Date relogio = new Date();
                labelText.setText(relogio.toString() );
            }
        });
    }

    public static void main(String[] args) {
        TelaRelogio dialog = new TelaRelogio();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
