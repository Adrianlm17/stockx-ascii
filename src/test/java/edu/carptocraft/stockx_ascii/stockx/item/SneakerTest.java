package edu.carptocraft.stockx_ascii.stockx.item;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class SneakerTest {
    

    @Test
    public void constructorSneakerTest(){
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        assertNotNull(sneaker);

    }

    @Test
    public void toStringTest(){
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        assertEquals("\tJordan 1 Retro High Dark Mocha\n\t\t555088-105", sneaker.toString());
    } 
}
