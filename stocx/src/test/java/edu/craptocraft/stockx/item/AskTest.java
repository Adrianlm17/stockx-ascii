package edu.craptocraft.stockx.item;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AskTest {
    
    @Test
    public void constructorTest() {
        Ask ask = new Ask("7.4", 234);
        assertEquals(234, ask.value());
        assertEquals("7.4", ask.size());
    }
    
}
