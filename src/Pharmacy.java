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

    public String buyDrug(Drug drug) {
        if (!this.store.contains(drug)) {
            return "Drug is not found in this pharmacy";
        }
        if (drug.getStock() <= 0) {
            return "Drug is empty";
        }
        int stock = drug.getStock();
        int newStock = stock--;
        drug.setStock(newStock);

        return transactions.toString();

    }
}
