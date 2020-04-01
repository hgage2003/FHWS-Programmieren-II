package klausurvorbereitung.various.builderPattern;

public class Phone {

    private String os;
    private final int ram;
    private final String manufacturer;
    private final double screensize;
    
    private Phone(String os, int ram, String manufacturer, double screensize) {
	this.os = os;
	this.ram = ram;
	this.manufacturer = manufacturer;
	this.screensize = screensize;
    }

    public static class PhoneBuilder {//Builder Class
	    
	    private String os;
	    private int ram;
	    private String manufacturer;
	    private double screensize;
	    
	    public PhoneBuilder(String manufacturer) { //Must set Manufacturer
		this.manufacturer = manufacturer;
	    }

	    public PhoneBuilder setOs(String os) {
	        this.os = os;
	        return this;
	    }

	    public PhoneBuilder setRam(int ram) {
	        this.ram = ram;
	        return this;
	    }

	    public PhoneBuilder setScreensize(double screensize) {
	        this.screensize = screensize;
	        return this;
	    }
	    
	    public Phone build() {
		return new Phone(os,ram,manufacturer,screensize);
	    }
    }//End Builder
    
    //Getters
    public String getOs() {
        return os;
    }

    public int getRam() {
        return ram;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getScreensize() {
        return screensize;
    }
    //End Getters
    
    @Override
    public String toString() {
	return "Phone [os=" + os + ", ram=" + ram + ", manufacturer=" + manufacturer + ", screensize=" + screensize
		+ "]";
    }
}
