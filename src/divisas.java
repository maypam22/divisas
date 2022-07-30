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
        setTitle("CONVERSOR");
        setSize(500, 300);
        setContentPane(mainPanel);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        
        convertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double moneda = Double.parseDouble(divisa.getText());
                int div = combo1.getSelectedIndex();
                int div1 = combo2.getSelectedIndex();

        limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                divisa.setText("");
                divisafinal.setText("");
            }
        });
    }
}
