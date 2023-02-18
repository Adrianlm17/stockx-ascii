package edu.craptocraft.stockx.item;

public class Ask implements Offer{

    private String size;
    private int ask;

    public Ask(String size, int ask) {
        this.size = size;
        this.ask = ask;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.ask;
    }

    @Override
    public int compareTo(Offer ask) {
        return this.ask;
    }

    @Override
    public String toString() {
        return "\t\t" + this.size() + "\t" + this.value() +"\n"; 
    }
}
