package modulzaro;

public class Meret {
	
	private int szelesseg;
	private int magassag;
	String atmero;
	public Meret(int szelesseg, int magassag, String atmero) {
	
		this.szelesseg = szelesseg;
		this.magassag = magassag;
		this.atmero = atmero;
	}
	public int getSzelesseg() {
		return szelesseg;
	}
	public void setSzelesseg(int szelesseg) {
		this.szelesseg = szelesseg;
	}
	public int getMagassag() {
		return magassag;
	}
	public void setMagassag(int magassag) {
		this.magassag = magassag;
	}
	public String getAtmero() {
		return atmero;
	}
	public void setAtmero(String atmero) {
		this.atmero = atmero;
	}
	

}
