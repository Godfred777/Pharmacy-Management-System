public class Drug {
    private String name;
    private int stock;
    private String manufacturer;
    private double price;

    public Drug(String name, int stock, String manufacturer, double price) {
        this.name = name;
        this.stock = stock;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public String getManufactorer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
