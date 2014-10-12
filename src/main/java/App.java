
import com.thoughtworks.iamcoach.pos.PromotionProcessor;

public class App {
    public static void main(String[] args) {

        PromotionProcessor promotionProcessor = new PromotionProcessor();
//        promotionProcessor.discountProcess();
      System.out.print(promotionProcessor.discountProcess().get(0).getDiscount());
    }
}
