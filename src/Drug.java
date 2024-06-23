import java.sql.*;
import java.util.Properties;

public class Drug {
    private String name;
    private int stock;
    private String manufacturer;
    private double price;
    private final String url = "jdbc:postgresql://localhost:5432/PharmacyManagementSystem";

    public Drug(String name, int stock, String manufacturer, double price) {
        this.name = name;
        this.stock = stock;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String insertIntoDatabase() throws SQLException {
        try (Connection connection = DriverManager.getConnection(url)) {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO Drug (name, stock, manufacturer, price) VALUES (?, ?, ?, ?)");
            statement.setString(1, this.name);
            statement.setInt(2, this.stock);
            statement.setString(3, this.manufacturer);
            statement.setDouble(4, this.price);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                return rs.getString(1);
            }

            rs.close();
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException("Cannot save to database", e);
        }

        return "Done";
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

    public void format() {
        System.out.println(getName());
        System.out.println(getStock());
        System.out.println(getManufactorer());
        System.out.println(getPrice());

    }
}
