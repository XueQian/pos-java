
import com.thoughtworks.iamcoach.pos.CartItem;
import com.thoughtworks.iamcoach.pos.Item;
import com.thoughtworks.iamcoach.pos.PromotionCalculator;

public class App {
    public static void main(String[] args) {

        PromotionCalculator promotionCalculator = new PromotionCalculator();
        Item item = new Item("ITEM000001","可乐",11,"瓶");
        CartItem cartItem = new CartItem(item,3);
    }
}
