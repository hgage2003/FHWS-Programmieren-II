package klausurvorbereitung.various.visitorPattern.creditcards;

import klausurvorbereitung.various.visitorPattern.offers.OfferVisitor;

public class GoldCard implements CreditCard {

    public String getName() {
	return "Gold";
    }
    
    public void accept(OfferVisitor v) {
	v.visitGoldCard(this);
    }
}
