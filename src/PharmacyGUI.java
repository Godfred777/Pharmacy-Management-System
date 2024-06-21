import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PharmacyGUI {
    private JTextArea Heading;
    private JButton showDrugsButton;
    private JButton removeDrugButton;
    private JButton addDrugButton;
    private JTextArea textArea1;
    public JPanel mainPanel;
    private JButton buyDrugButton;

    public PharmacyGUI() {
        addDrugButton.addActionListener(e -> {
            AddDrugDialog dialog = new AddDrugDialog();
            dialog.pack();
            dialog.setVisible(true);
            JOptionPane.showMessageDialog(null, "A new drug has been added!");
        });
        buyDrugButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Drug bought. Do not overdose");
            }
        });
        removeDrugButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "Drug removed from Pharmacy");
            }
        });
        showDrugsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "These are the list of drugs");
            }
        });
    }
}
