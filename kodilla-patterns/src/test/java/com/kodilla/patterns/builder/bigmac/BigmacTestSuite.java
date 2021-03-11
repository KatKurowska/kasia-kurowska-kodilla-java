package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.patterns.builder.bigmac.Bun.ROLL;
import static com.kodilla.patterns.builder.bigmac.Ingredient.*;
import static com.kodilla.patterns.builder.bigmac.SAUCE.BARBECUE;

public class BigmacTestSuite {

    @Test
    public void testNewBigMac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bread(ROLL)
                .burgers(2)
                .sauce(BARBECUE)
                .ingredient(ONION)
                .ingredient(MUSHROOMS)
                .ingredient(BACON)
                .ingredient(CHEESE)
                .build();


        System.out.println(bigmac);
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4, howManyIngredients);
    }
}
