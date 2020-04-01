package klausurvorbereitung.various.visitorPattern.offers;

import klausurvorbereitung.various.visitorPattern.creditcards.BronzeCard;
import klausurvorbereitung.various.visitorPattern.creditcards.GoldCard;
import klausurvorbereitung.various.visitorPattern.creditcards.SilverCard;

public class HotelOfferVisitor implements OfferVisitor {

    public void visitBronzeCard(BronzeCard bronze) {
	System.out.println("Bronze Card checking in Hotelroom");
    }

    public void visitSilverCard(SilverCard silver) {
	System.out.println("Silver Card checking in Hotelroom");
    }
    
    public void visitGoldCard(GoldCard gold) {
	System.out.println("Gold Card checking in Hotelroom");
    }
}
