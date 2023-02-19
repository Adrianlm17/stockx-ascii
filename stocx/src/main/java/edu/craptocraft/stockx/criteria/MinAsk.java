package edu.craptocraft.stockx.criteria;

import java.util.List;
import java.util.Optional;

import edu.craptocraft.stockx.item.Ask;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class MinAsk implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        Optional<Offer> max = sneaker.offers()
                                        .stream()
                                        .filter(o -> o instanceof Ask)
                                        .min(Offer::compareTo);
        return max.isPresent()? List.of(max.get()) : List.of();
    }
    
}
