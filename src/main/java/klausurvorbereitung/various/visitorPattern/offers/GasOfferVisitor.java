package klausurvorbereitung.various.visitorPattern.offers;

import klausurvorbereitung.various.visitorPattern.creditcards.BronzeCard;
import klausurvorbereitung.various.visitorPattern.creditcards.GoldCard;
import klausurvorbereitung.various.visitorPattern.creditcards.SilverCard;

public class GasOfferVisitor implements OfferVisitor {

    public void visitBronzeCard(BronzeCard bronze) {
	System.out.println("Bronze Card buying Gas");
    }

    public void visitSilverCard(SilverCard silver) {
	System.out.println("Silver Card buying Gas");
    }
    
    public void visitGoldCard(GoldCard gold) {
	System.out.println("Gold Card buying Gas");
    }

}
