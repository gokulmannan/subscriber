package in.finagg.bean;

 
/**
 * Serviceable Vendor List 
 * @author Praveen Kumar
 *
 */
public enum Vendors {
	UGRO("ugro"),
	ugro("ugro"),

	FINAGG("finagg"),
	finagg("finagg"),

	JANA("jana"),
	jana("jana"),
	
	TVSC("tvsc"),
	tvsc("tvsc"),
	
	ABFL("abfl"),
	abfl("abfl"),
	
	HDFC("hdfc"),
	hdfc("hdfc"),
	
	FINVU("finvu"),
	finvu("finvu"),
	
	TATA("tata"),
	tata("tata"),
	
	IRIS("iris"),
	iris("iris"),
	
	CYGNET("cygnet"),
	cygnet("cygnet"),
	
	KARZA("karza"),
	karza("karza"),
	
	gstod("gstod"),
    GSTOD("GSTOD"),
	
	HELPAGE("helpage"),
	helpage("helpage");
	

	public String getVendor() {
		return this.vendor;
	}

	private String vendor;

	Vendors(String vendor) {
		this.vendor = vendor;
	}

}
