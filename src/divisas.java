import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class divisas extends JFrame {
    private JTextField divisa;
    private JTextField divisafinal;
    private JComboBox combo2;
    private JComboBox combo1;
    private JButton convertir;
    private JPanel mainPanel;
    private JButton limpiar;

    public divisas() {

        limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                divisa.setText("");
                divisafinal.setText("");
            }
        });
    }
}