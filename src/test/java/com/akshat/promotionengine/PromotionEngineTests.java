package com.akshat.promotionengine;

import com.akshat.promotionengine.engine.PromotionEngine;
import com.akshat.promotionengine.model.CartItem;
import com.akshat.promotionengine.model.SKU;
import com.akshat.promotionengine.promotion.ComboPromotion;
import com.akshat.promotionengine.promotion.FixedPricePromotion;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PromotionEngineTests {

    @Test
    void scenarioC() {
        SKU a = new SKU('A', 50);
        SKU b = new SKU('B', 30);
        SKU c = new SKU('C', 20);
        SKU d = new SKU('D', 15);

        List<CartItem> cart = Arrays.asList(
                new CartItem(a, 3),
                new CartItem(b, 5),
                new CartItem(c, 1),
                new CartItem(d, 1)
        );

        PromotionEngine engine = new PromotionEngine(List.of(
                new FixedPricePromotion('A', 3, 130),
                new FixedPricePromotion('B', 2, 45),
                new ComboPromotion('C', 'D', 30)
        ));

        int total = engine.calculateTotal(cart);
        assertEquals(280, total);
    }
}
