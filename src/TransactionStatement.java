import java.time.LocalDateTime;

public class TransactionStatement {
    private Drug drug_code;
    private final LocalDateTime dateTime = LocalDateTime.now();
    private int quantity;
    private String buyer;

    public Drug getDrug_code() {
        return drug_code;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public int getQuantity() {
        return quantity;
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

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void format() {
        getDrug_code().format();
        System.out.println(getBuyer());
        System.out.println(getDateTime());
        System.out.println(getQuantity());
    }

}
