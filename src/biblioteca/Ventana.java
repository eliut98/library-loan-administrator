package biblioteca;

import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author gonza
 */
public class Ventana extends JFrame {

    private JTextField searchBox;
    private JButton searchButton;
    private JLabel title;
    private JLabel bookCover;

    public Ventana() {
        super();
        this.config();
        this.initComponents();
    }

    private void config() {
        this.setTitle("Xia");
        this.setSize(400, 800);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initComponents() {
        searchBox = new JTextField();
        searchButton = new JButton();
        title = new JLabel();
        bookCover = new JLabel();

        searchBox.setText("Buscar libro...");
        searchBox.setBounds(50, 50, 150, 25);

        searchButton.setText("Buscar");
        searchButton.setBounds(this.getWidth() - 150, 50, 100, 25);
        searchButton.setBackground(new java.awt.Color(254, 202, 87));
        searchButton.setFont(new java.awt.Font("Calibri", 0, 13));
        searchButton.addActionListener(this::searchButtonActionPerformed);

        title.setText("Mis prestamos:");
        title.setFont(new java.awt.Font("Calibri", 0, 13));
        title.setBounds(50, 100, 100, 25);

        bookCover.setBounds(50, 150, 317, 475);
        bookCover.setIcon(new ImageIcon("D:\\gonza\\Dev\\NetBeansProjects\\JavaApplication1\\oceanic.jpg"));

        this.add(searchBox);
        this.add(searchButton);
        this.add(title);
        this.add(bookCover);

    }

    private void searchButtonActionPerformed(ActionEvent evt) {
        System.out.println("OK");
    }

    public static void main(String[] args) {
        Ventana v = new Ventana();
        v.setVisible(true);
    }

}
