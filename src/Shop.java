public class Shop {
    private double price;
    private String description;

    public Shop(double price, String description) {
        this.price = price;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "El valor de Compra: " + price +
                "Descripcion: " + description;
    }
}