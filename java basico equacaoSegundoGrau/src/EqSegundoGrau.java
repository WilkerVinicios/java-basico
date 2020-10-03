import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EqSegundoGrau extends JDialog {
    private JPanel contentPane;
    private JButton btnCalcular;
    private JTextField textA;
    private JTextField textB;
    private JTextField textC;
    private JLabel resultC;
    private JLabel resultA;
    private JLabel resultB;
    private JLabel labelDelta;
    private JLabel labelRaizes;
    private JPanel panelResult;

    public EqSegundoGrau() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnCalcular);
        panelResult.setVisible(false);
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //pegando os numeros e convertendo de String para int
                int a = Integer.parseInt(textA.getText());
                int b = Integer.parseInt(textB.getText());
                int c = Integer.parseInt(textC.getText());

                double d = Math.pow(b, 2) - 4 * a * c;
                labelDelta.setText(String.format("%.1f",d));

                if(d < 0){
                    labelRaizes.setText("Não exíste Raízes Reais");
                }else {
                    labelRaizes.setText("Exitem Raízes Reais");
                }
                panelResult.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        EqSegundoGrau dialog = new EqSegundoGrau();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
