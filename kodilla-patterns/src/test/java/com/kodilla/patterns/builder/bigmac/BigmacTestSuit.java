package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuit {

    @Test
    void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("with sesamm")
                .burgersCount(2)
                .sauce(SauceType.STANDARD)
                .ingredient(IngredientsType.ONION)
                .ingredient(IngredientsType.LETTUCE)
                .ingredient(IngredientsType.CUCUMBER)
                .ingredient(IngredientsType.BACON)
                .build();
        //When
        int homManyIngredients = bigmac.getIngredients().size();
        //Then
        assertNotEquals(null, bigmac);
        assertEquals("with sesamm", bigmac.getBun());
        assertEquals(2, bigmac.getBurgersCount());
        assertEquals(SauceType.STANDARD, bigmac.getSauce());
        assertTrue(bigmac.getIngredients().contains(IngredientsType.ONION));
        assertTrue(bigmac.getIngredients().contains(IngredientsType.LETTUCE));
        assertTrue(bigmac.getIngredients().contains(IngredientsType.CUCUMBER));
        assertTrue(bigmac.getIngredients().contains(IngredientsType.BACON));
        assertEquals(4, homManyIngredients);
    }
}
