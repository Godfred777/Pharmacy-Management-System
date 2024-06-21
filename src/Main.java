import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("PharmacyGUI");
        frame.setContentPane(new PharmacyGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}