import java.util.ArrayList;
import java.util.List;

public class CrediCart {
    private double limit;
    private double balance;
    private List<Shop> shopList;

    /*
    esta funcion permite que el valor de la tarjeta de credito
    sea establecido por el usuario y insertado al objeto.
     */
    public CrediCart(double limit){
        this.limit = limit;
        this.balance = limit;
        this.shopList = new ArrayList<>();
    }

    /*
    este metodo dicta que si el balance de cuenta es mayor o
    igual al precio se reste el precio al balance (se haga la compra)
    y se agregue a el array shopList sino retornara un valor falso
     */
    public boolean deskShopping(Shop shop){
        if (this.balance >= shop.getPrice()){
            this.balance -= shop.getPrice();
            this.shopList.add(shop);
            return true;
        }
        return false;
    }

    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public List<Shop> getShopList() {
        return shopList;
    }
}
