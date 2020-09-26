import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;

public class TelaResolucao extends JDialog {
    private JPanel contentPane;
    private JButton btnClick;
    private JLabel textLabel;


    public TelaResolucao() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnClick);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dm = tk.getScreenSize();

        btnClick.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                textLabel.setText(+dm.width+" x "+dm.height);
            }
        });
    }

    public static void main(String[] args) {
        TelaResolucao dialog = new TelaResolucao();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
