package klausurvorbereitung.various.builderPattern;

public class Store {

    public static void main(String[] args) {
	Phone p1 = new Phone.PhoneBuilder("Apple")
		.setOs("IOS")
		.setRam(12)
		.setScreensize(5.5)
		.build();
	
	Phone p2 = new Phone.PhoneBuilder("Samsung")
		.setOs("Android")
		.setRam(8)
		.build();
	
	Phone p3 = new Phone.PhoneBuilder("Huawai")
		.setRam(12)
		.setScreensize(7.0)
		.build();
	
	System.out.println(p1);
	System.out.println(p2);
	System.out.println(p3);
	
    }
}
