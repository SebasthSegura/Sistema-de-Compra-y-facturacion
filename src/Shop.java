public class Shop implements Comparable<Shop> {
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

    /*
    modificamos el toString para modificar como vera java la referencia
    java del objeto en cuestion
     */
    @Override
    public String toString() {
        return "El valor de Compra: " + price +
                "Descripcion: " + description;
    }

    /*
    sobreescribimos para que los valores de tipo double
    sean casteados de manera correcta
     */
    @Override
    public int compareTo(Shop otherShop) {
        return Double.valueOf(this.price).compareTo(Double.valueOf(otherShop.getPrice()));
    }
}
