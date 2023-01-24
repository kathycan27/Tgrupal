import javax.management.StringValueExp;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class componentes {
    private JPanel panel1;
    private JSpinner spinner;
    private JTextArea vSpinner;
    private JScrollBar scrollBar1;

    public componentes() {
        spinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                vSpinner.setText("el valor del spinner es: "+String.valueOf(vSpinner.toString()));
            }
        });
        spinner.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                SpinnerNumberModel modeloSpinner = new SpinnerNumberModel();
                modeloSpinner.setMaximum(20);
                modeloSpinner.setMinimum(0);
                vSpinner.setModel(modeloSpinner);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame =new JFrame("Calculadora");

        frame.setContentPane(new componentes().panel1);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }
}
