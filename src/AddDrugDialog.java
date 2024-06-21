import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddDrugDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField drugName;
    private JTextField drugStock;
    private JTextField drugMaker;
    private JTextField drugPrice;
    private JPanel addDrugForm;
    private JLabel inputLabel1;
    private JLabel inputLabel2;
    private JLabel inputLabel3;
    private JLabel inputLabel4;
    private Pharmacy pharmacy = new Pharmacy();

    public AddDrugDialog() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(e -> onOK());
        buttonCancel.addActionListener(e -> onCancel());

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        contentPane.registerKeyboardAction(e -> onCancel(),
                KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
                JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        String name = drugName.getText();
        int stock = Integer.parseInt(drugStock.getText());
        String maker = drugMaker.getText();
        double price = Double.parseDouble(drugPrice.getText());

        // Add your code here to handle the drug information (e.g., save to database)
        pharmacy.addDrug(name, stock, maker, price);
        pharmacy.format();

        dispose();
    }

    private void onCancel() {
        dispose();
    }

}
