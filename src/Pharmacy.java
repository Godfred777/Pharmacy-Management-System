import java.sql.SQLException;
import java.util.ArrayList;

public class Pharmacy {
    private final ArrayList<Drug> store = new ArrayList<>();
    private final Transactions transactions = new Transactions();

    public void addDrug(String name, int stock, String manufacturer, double price) {
        try {
            Drug drug = new Drug(name, stock, manufacturer, price);
            drug.insertIntoDatabase();
            this.store.add(drug);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public void removeDrug(String name) {
        Drug drug = this.searchDrug(name);
        if (drug == null) {
            System.out.println("Drug is not in this pharmacy");
        } else {
            this.store.remove(drug);
        }

    }

    public Drug searchDrug(String name) {
        try {
            Drug d = null;
            for (Drug drug : store) {
                if (drug.getName().equals(name)) {
                    d = drug;
                    break;
                }
            } return d;
        } catch (Exception e) {
            return null;
        }

    }

    public void buyDrug(String name, String buyer, int quantity) {
        Drug drug = this.searchDrug(name);
        if (drug == null || drug.getStock() <= 0) {
            System.out.println("Drug is not found in this pharmacy");
        } else {
            int stock = drug.getStock();
            int newStock = --stock;
            drug.setStock(newStock);

            transactions.addStatement(drug, quantity, buyer);
            transactions.format();
        }


    }

    public void format() {
        for (Drug drug: store) {
            drug.format();
        }
    }
}
