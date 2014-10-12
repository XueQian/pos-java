
import com.thoughtworks.iamcoach.pos.Promotion;
import com.thoughtworks.iamcoach.pos.PromotionProcessor;

public class App {
    public static void main(String[] args) {

        PromotionProcessor promotionProcessor = new PromotionProcessor();
//        promotionProcessor.halfProcess();
       System.out.print(promotionProcessor.halfProcess().get(0).getBarcode());
    }
}
