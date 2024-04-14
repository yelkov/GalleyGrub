package edu.badpals.GalleyGrub.extras;

import edu.badpals.GalleyGrub.order.Comanda;

import java.util.Optional;

public abstract class Extra {
    static final String CHEESE = "cheese";
    static final String SAUCE = "sauce";
    static final String SIZE_LARGE = "large";
    String extraProduct = "";
    Optional<Extra> nextExtra = Optional.ofNullable(null);

    Extra(){}

    public void setNextExtra(Extra nextExtra) {
        this.nextExtra = Optional.ofNullable(nextExtra);

    }
    public abstract void sumExtras(Comanda order);
}
