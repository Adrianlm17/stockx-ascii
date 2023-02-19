package edu.craptocraft.stockx.item;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SneakerTest {

    @Test
    public void checkAddOfferBid(){
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        Bid bid = new Bid("24", 344);
        sneaker.add(bid);
        assertEquals(1, sneaker.offers().size());
    }
}
