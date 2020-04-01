package klausurvorbereitung.various.visitorPattern.creditcards;

import klausurvorbereitung.various.visitorPattern.offers.OfferVisitor;

public interface CreditCard {
    String getName();
    void accept(OfferVisitor v);
}
