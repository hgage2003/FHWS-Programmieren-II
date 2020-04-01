package klausurvorbereitung.various.visitorPattern.creditcards;

import klausurvorbereitung.various.visitorPattern.offers.OfferVisitor;

public class SilverCard implements CreditCard {

    public String getName() {
	return "Silver";
    }
    
    public void accept(OfferVisitor v) {
	v.visitSilverCard(this);
    }
}
