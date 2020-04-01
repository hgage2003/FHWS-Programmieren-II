package klausurvorbereitung.various.visitorPattern.creditcards;

import klausurvorbereitung.various.visitorPattern.offers.OfferVisitor;

public class BronzeCard implements CreditCard {

    public String getName() {
	return "Bronze";
    }

    public void accept(OfferVisitor v) {
	v.visitBronzeCard(this);
    }
    
    
}
