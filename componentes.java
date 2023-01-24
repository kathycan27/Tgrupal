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
    private void inicio(){
        //Obtenemos una fecha de inicio, será la fecha actual del sistema
        Date inicio = calendar.getTime();
        //Indicamos año hasta -100 del actual
        calendar.add(Calendar.YEAR, -100);
        //Guardamos la configuración en un DATE
        Date fechaAnterior = calendar.getTime();
        //Indicamos año hasta +200 del actual
        calendar.add(Calendar.YEAR, 200);
        //Guardamos la configuración en un DATE
        Date fechaPosterior = calendar.getTime();
        //Usamos el contructor de abajo para crear un modelo para el Spinner
        //SpinnerDateModel(Date value, Comparable start, Comparable end, int calendarField)
        //Utilizamos los datos que creamos más arriba
        //Para fecha utilizamos Calendar.YEAR y para hora Calendar.HOUR, el resto puede ser igual
        SpinnerModel fechaModel = new SpinnerDateModel(inicio, fechaAnterior, fechaPosterior, Calendar.YEAR);
        SpinnerModel horaModel = new SpinnerDateModel(inicio, fechaAnterior, fechaPosterior, Calendar.HOUR);
        //Indicamos el model para cada Spinner además del formato de fecha y hora según corresponda.
        JSpinner fecha = new JSpinner();
        fecha.setModel(fechaModel);
        fecha.setEditor(new JSpinner.DateEditor(fecha, "dd/MM/yyyy"));
        JSpinner hora = new JSpinner();
        hora.setModel(horaModel);
        hora.setEditor(new JSpinner.DateEditor(hora, "HH:mm:ss"));
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
