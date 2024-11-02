import java.util.ArrayList;
import java.util.List;

public class CrediCart {
    private double limit;
    private double balance;
    private List<Shop> shopList;

    public CrediCart(double limit){
        this.limit = limit;
        this.balance = balance;
        this.shopList = shopList = new ArrayList<>();
    }

    public boolean deskShopping(Shop shop){
        if (this.balance > shop.getPrice()){
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
