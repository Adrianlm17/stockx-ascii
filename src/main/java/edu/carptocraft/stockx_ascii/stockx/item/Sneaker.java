package edu.carptocraft.stockx_ascii.stockx.item;

public class Sneaker {

    private final String sneaker;
    private final String name;
    
    public Sneaker(String sneaker, String name) {
        this.sneaker = sneaker;
        this.name = name;
        
    }

    @Override
    public String  toString(){
        return "\t" + this.name + "\n\t\t" + this.sneaker;
    }
    
}
