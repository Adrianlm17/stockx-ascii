package edu.craptocraft.stockx.item;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BidTest {
    
    @Test
    public void constructorTest() {
        Bid bid = new Bid("7.4", 234);
        assertEquals(234, bid.value());
        assertEquals("7.4", bid.size());
    }
    
}
