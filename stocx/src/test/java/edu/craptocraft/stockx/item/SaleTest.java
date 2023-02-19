package edu.craptocraft.stockx.item;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SaleTest {
    
    @Test
    public void constructorTest() {
        Sale sale = new Sale("6", 356);
        assertEquals(356, sale.value());
        assertEquals("6", sale.size());
    }
}
