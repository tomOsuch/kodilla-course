package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuit {

    @Test
    void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bum("with sesamm")
                .burgers(2)
                .sauce("standard")
                .ingredient("onion")
                .ingredient("lettuce")
                .ingredient("cucumber")
                .ingredient("bacon")
                .build();
        //When
        int homManyIngredients = bigmac.getIngredients().size();
        //Then
        assertNotEquals(null, bigmac);
        assertEquals(4, homManyIngredients);
    }
}
