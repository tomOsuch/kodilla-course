package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuit {

    @Test
    void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bun.WITH_SESAME)
                .burgersCount(2)
                .sauce(Sauce.STANDARD)
                .ingredient(Ingredients.ONION)
                .ingredient(Ingredients.LETTUCE)
                .ingredient(Ingredients.CUCUMBER)
                .ingredient(Ingredients.BACON)
                .build();
        //When
        int homManyIngredients = bigmac.getIngredients().size();
        //Then
        assertNotNull(bigmac);
        assertEquals(Bun.WITH_SESAME, bigmac.getBun());
        assertEquals(2, bigmac.getBurgersCount());
        assertEquals(Sauce.STANDARD, bigmac.getSauce());
        assertTrue(bigmac.getIngredients().contains(Ingredients.ONION));
        assertTrue(bigmac.getIngredients().contains(Ingredients.LETTUCE));
        assertTrue(bigmac.getIngredients().contains(Ingredients.CUCUMBER));
        assertTrue(bigmac.getIngredients().contains(Ingredients.BACON));
        assertEquals(4, homManyIngredients);
    }
}
