package modulzaro;

public class Adatok {

	String marka;
	String evszak;
	String meret;

	public Adatok(String marka, String evszak, String meret) {

		this.marka = marka;
		this.evszak = evszak;
		this.meret = meret;
	}

	@Override
	public String toString() {
		return "Adatok [marka=" + marka + ", evszak=" + evszak + ", meret=" + meret + "]";
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getEvszak() {
		return evszak;
	}

	public void setEvszak(String evszak) {
		this.evszak = evszak;
	}

	public String getMeret() {
		return meret;
	}

	public void setMeret(String meret) {
		this.meret = meret;
	}

}
