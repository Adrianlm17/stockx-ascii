package edu.carptocraft.stockx_ascii.stockx.item;

public class Sneaker implements Item {

    private final String sneaker;
    private final String name;
    
    public Sneaker(String sneaker, String name) {
        this.sneaker = sneaker;
        this.name = name;
        
    }

    @Override
    public String  toString(){
        return this.name + "\n\t\t" + this.sneaker;
    }

    @Override
    public String getAsk() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getBid() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getSale() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
