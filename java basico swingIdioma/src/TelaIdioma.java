import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class TelaIdioma extends JDialog {
    private JPanel contentPane;
    private JButton btnClick;
    private JLabel textLabel;

    public TelaIdioma() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnClick);

        Locale idioma = Locale.getDefault();

        btnClick.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textLabel.setText("O idioma é "+idioma.getDisplayLanguage().toUpperCase()+".");
            }
        });
    }

    public static void main(String[] args) {
        TelaIdioma dialog = new TelaIdioma();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
