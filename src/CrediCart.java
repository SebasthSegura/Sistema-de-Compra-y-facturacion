import java.util.ArrayList;
import java.util.List;

public class CrediCart {
    public double limit;
    public double balance;
    public List<Shop> shopList;

    public CrediCart(double limit){
        this.limit = limit;
        this.balance = limit;
        this.shopList = new ArrayList<>();
    }

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
