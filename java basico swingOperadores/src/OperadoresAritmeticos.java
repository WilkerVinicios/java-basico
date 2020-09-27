import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperadoresAritmeticos extends JDialog {
    private JPanel contentPane;
    private JButton btnCalcular;
    private JTextField textNumerador;
    private JTextField textDenominador;
    private JLabel resultDivisao;
    private JLabel resultResto;
    private JLabel resultRaiz1;
    private JLabel resultRaiz2;
    private JLabel resultArredonCima;
    private JLabel resultArredonBaixo;
    private JLabel resultArredonArit;

    public OperadoresAritmeticos() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //pegando valor de numerador e denominador digitados pelo usuario e convertendo em string
                int numerador = Integer.parseInt(textNumerador.getText());
                int denominador = Integer.parseInt(textDenominador.getText());

                //fazendo calculo de divisão e setando resultado na tela
                float resultadoDivisao = numerador / denominador;
                resultDivisao.setText(Float.toString(resultadoDivisao));

                //fazendo calculo de resto e setando resultado na tela
                float resultadoResto = numerador % denominador;
                resultResto.setText(Float.toString(resultadoResto));

                //calculando a raiz do Numerador e Denominador
                float raiz1 = (float) Math.sqrt(numerador);
                float raiz2 = (float) Math.sqrt(denominador);
                resultRaiz1.setText(Float.toString(raiz1));
                resultRaiz2.setText(Float.toString(raiz2));

                //arredondamento para baixo, para cima e aritmetico
                int arredondamentoCima = (int) Math.ceil(raiz1);
                int arredondamentoBaixo = (int) Math.floor(raiz1);
                int arredondamentoArit = Math.round(raiz1);
                resultArredonCima.setText(Integer.toString(arredondamentoCima));
                resultArredonBaixo.setText(Integer.toString(arredondamentoBaixo));
                resultArredonArit.setText(String.valueOf(arredondamentoArit));
            }
        });
    }

    public static void main(String[] args) {
        OperadoresAritmeticos dialog = new OperadoresAritmeticos();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
