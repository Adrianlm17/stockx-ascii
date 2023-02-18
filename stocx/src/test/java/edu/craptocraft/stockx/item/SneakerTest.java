package edu.craptocraft.stockx.item;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;

public class SneakerTest {
    
    Item sneaker = null;

    @Before
    public void checkNewItem(){
        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        assertNotNull(sneaker);
    }
}
