import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ParImpar extends JDialog {
    private JPanel contentPane;
    private JButton btnVerificar;
    private JTextField textoDigitado;
    private JLabel labelResult;

    public ParImpar() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnVerificar);
        btnVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //pegando texto digitado e covertendo para float e armazenando em variavel
                float numeroDigitado = Float.parseFloat(textoDigitado.getText());

                //mensagens que serão exibidas na tela
                String f1 = "O numero "+textoDigitado.getText()+" é PAR.";
                String f2 = "O numero "+textoDigitado.getText()+" é ÍMPAR.";

                //condição para verificar se numero é impar ou par
                if((numeroDigitado % 2) == 0){
                    labelResult.setText(f1);
                }else{
                    labelResult.setText(f2);
                }
            }
        });
    }

    public static void main(String[] args) {
        ParImpar dialog = new ParImpar();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
