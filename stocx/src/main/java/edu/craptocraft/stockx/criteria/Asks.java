package edu.craptocraft.stockx.criteria;

import java.util.List;
import java.util.stream.Collectors;

import edu.craptocraft.stockx.item.Ask;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class Asks implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers()
                        .stream()
                        .filter(o -> o instanceof Ask)
                        .sorted()
                        .collect(Collectors.toList());
    }

}
