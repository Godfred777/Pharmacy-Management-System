import java.util.ArrayList;

public class Pharmacy {
    private ArrayList<Drug> store = new ArrayList<>();
    private Transactions transactions = new Transactions();

    public int addDrug(String name, int stock, String manufacturer, double price) {
        Drug drug = new Drug(name, stock, manufacturer, price);
        this.store.add(drug);

        return store.indexOf(drug);
    }

    public void removeDrug(int index) {
        this.store.remove(index);
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

    public String buyDrug(String name, String buyer, int quantity) {
        Drug drug = this.searchDrug(name);
        if (drug == null) {
            return "Drug is not found in this pharmacy";
        }
        if (drug.getStock() <= 0) {
            return "Drug is empty";
        }
        int stock = drug.getStock();
        int newStock = stock--;
        drug.setStock(newStock);

        transactions.addStatement(drug, quantity, buyer);
        return transactions.toString();

    }

    public void format() {
        for (Drug drug: store) {
            drug.format();
        }
    }
}
