import javax.swing.*;

public class componenteMenu {
    private JPanel panel2;
    private JMenuBar principal;
    private JMenu menu;
    private JMenuItem crear;
    private JMenuItem abrir;
    private JMenuItem edit;
    private JMenu confi;
    private JMenuItem color;
    private JMenuItem tamaño;
    private JMenu ver;
    private JMenuItem fuente;
    private JMenuItem cantidad;
    private JLabel texto;

    public static void main (String[]args){
        JFrame frame = new JFrame("Ejemplo de Menus");
        frame.setContentPane(new componenteMenu().panel2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
