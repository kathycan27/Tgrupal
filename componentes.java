import javax.management.StringValueExp;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Calendar;
import java.util.Date;

public class componentes {
    private JPanel panel1;
    private JSpinner spinner;
    private JTextArea vSpinner;
    public componentes() {
        spinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                vSpinner.setText("el valor del spinner es: "+ String.valueOf(spinner.getValue()));
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
