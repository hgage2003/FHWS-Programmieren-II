package klausurvorbereitung.various.visitorPattern.offers;

import klausurvorbereitung.various.visitorPattern.creditcards.BronzeCard;
import klausurvorbereitung.various.visitorPattern.creditcards.SilverCard;
import klausurvorbereitung.various.visitorPattern.creditcards.GoldCard;

public interface OfferVisitor {

    void visitBronzeCard(BronzeCard bronze);
    void visitSilverCard(SilverCard silver);
    void visitGoldCard(GoldCard gold);
    
}
