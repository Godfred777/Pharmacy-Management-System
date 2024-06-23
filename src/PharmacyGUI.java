import javax.swing.*;

public class PharmacyGUI {
    private JTextArea Heading;
    private JButton showDrugsButton;
    private JButton removeDrugButton;
    private JButton addDrugButton;
    private JTextArea textArea1;
    public JPanel mainPanel;
    private JButton buyDrugButton;
    private Pharmacy pharmacy;

    public PharmacyGUI() {
        addDrugButton.addActionListener(e -> {
            try {
                AddDrugDialog dialog = new AddDrugDialog();
                dialog.pack();
                dialog.setVisible(true);
                JOptionPane.showMessageDialog(null, "A new drug has been added!");
            } catch (RuntimeException exception) {
                JOptionPane.showMessageDialog(null, exception.getMessage());
            }
        });
        buyDrugButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Drug bought. Do not overdose");
        });

        removeDrugButton.addActionListener(e -> {
            String drugName = JOptionPane.showInputDialog("Enter the name of the drug");
            pharmacy.removeDrug(drugName);
            JOptionPane.showMessageDialog(null, "Drug removed from Pharmacy");
        });

        showDrugsButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(textArea1, pharmacy.toString());
        });
    }
}
