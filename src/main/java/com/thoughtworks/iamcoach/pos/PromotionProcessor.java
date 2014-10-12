package com.thoughtworks.iamcoach.pos;

import java.util.ArrayList;
import java.util.List;

public class PromotionProcessor extends FileProcessor{

    public List<Promotion> halfProcess() {
        return this.process("buy_two_get_one_free_promotion.txt");
    }

    public List<Promotion> discountProcess() {
        List<Promotion> promotions = new ArrayList<Promotion>();
        return  promotions;
    }

    private List<Promotion> process(String fileName){

        List<Promotion> promotions = new ArrayList<Promotion>();
        List<String> promotionList = readFile(fileName);

        for(String aPromotionList : promotionList){
            Promotion promotion = new Promotion(aPromotionList);
            promotions.add(promotion);
        }
        return promotions;
    }
}
