package klausurvorbereitung.various.visitorPattern;

import klausurvorbereitung.various.visitorPattern.offers.*;
import klausurvorbereitung.various.visitorPattern.creditcards.*;

public class App {

    public static void main(String[] args) {
	OfferVisitor visitor = new HotelOfferVisitor();
	OfferVisitor visitor2 = new GasOfferVisitor();
	
	CreditCard bronze = new BronzeCard();
	CreditCard silver = new SilverCard();
	CreditCard gold = new GoldCard();
	
	bronze.accept(visitor);
	silver.accept(visitor);
	gold.accept(visitor);
	
	bronze.accept(visitor2);
	silver.accept(visitor2);
	gold.accept(visitor2);
    }
}
