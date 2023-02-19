package edu.craptocraft.stockx.item;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item {

    private String style;
    private String name;
    private int sale;
    private int ask;
    private int bid;
    private List<Offer> offers = new ArrayList<Offer>();


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
        return this.sale;
    }
    
    @Override
    public int getAsk() {
        return this.ask;
    }

    @Override
    public int getBid() {
        return this.bid;
    }

    @Override
    public void add(Offer offer) {
        this.offers.add(offer);
    }

    @Override
    public List<Offer> offers() {
        return this.offers;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public void setAsk(int ask) {
        this.ask = ask;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }
}
