import java.time.LocalDateTime;

public class TransactionStatement {
    private Drug drug_code;
    private final LocalDateTime dateTime = LocalDateTime.now();
    private double price;
    private int quantity;
    private double amount;
    private String buyer;

    public Drug getDrug_code() {
        return drug_code;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getAmount() {
        return amount;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public void setDrug_code(Drug drug_code) {
        this.drug_code = drug_code;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
