
import com.thoughtworks.iamcoach.pos.CartProcessor;
import com.thoughtworks.iamcoach.pos.PromotionProcessor;

public class App {
    public static void main(String[] args) {

        CartProcessor i = new CartProcessor();
        i.process();
//        promotionProcessor.discountProcess();
//      System.out.print(i.process().size());
        System.out.print(i.process().get(0).getItem().getName());

        System.out.print(i.process().get(1).getItem().getName());

        System.out.print(i.process().get(2).getItem().getName());


    }
}
