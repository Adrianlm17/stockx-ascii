package edu.craptocraft.stockx.item;

public class Sneaker implements Item {

    private String style;
    private String name;
    private int sale;
    private int ask;
    private int bid;


    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " \n\t\t" + style;
    }

    @Override
    public int getSale() {
        return sale;
    }
    
    @Override
    public int getAsk() {
        return ask;
    }

    @Override
    public int getBid() {
        return bid;
    }

}
