package classes;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaTriangulo extends JDialog {
    private JPanel contentPane;
    private JButton btnVerificar;
    private JSlider sliderA;
    private JSlider sliderB;
    private JSlider sliderC;
    private JLabel labelB;
    private JLabel labelA;
    private JLabel labelC;
    private JLabel labelForma;
    private JLabel labelModelo;
    private JPanel panelResposta;

    public TelaTriangulo() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnVerificar);
        //escondendo panel de respostas
        panelResposta.setVisible(false);

        btnVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //capturando valores dos sliders
                int a = sliderA.getValue();
                int b = sliderB.getValue();
                int c = sliderC.getValue();

                //condição para verificar se formam triangulo
                if(a < b+c && b < a+c && c < a+b){
                    labelForma.setText("Formam um Triângulo!");
                    //condição para verificar tipo do triangulo
                    if(a == b && b == c){
                        labelModelo.setText("Triângulo Equilátero");
                    }else if(a != b && b != c && a != c){
                        labelModelo.setText("Triângulo Escaleno");
                    }else {
                        labelModelo.setText("Triângulo Isóceles");
                    }
                }else{
                    labelForma.setText("Não Formam um Triângulo");
                    labelModelo.setText("-----");
                }
                //mostrando panel de respostas
                panelResposta.setVisible(true);
            }
        });
        // pegando valores dos sliders e aplicando aos labels
        sliderA.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                labelA.setText(Integer.toString(sliderA.getValue()));
            }
        });
        sliderB.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                labelB.setText(Integer.toString(sliderB.getValue()));
            }
        });
        sliderC.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                labelC.setText(Integer.toString(sliderC.getValue()));
            }
        });
    }

    public static void main(String[] args) {
        TelaTriangulo dialog = new TelaTriangulo();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
