
public class Zadanie {

	String nazwa = "";
	int czas = 0;
	String kolor = "";
	//java awt kolor
	
	
	
	public Zadanie() {
		this.nazwa = "zadanie";
		this.czas = 1;
		this.kolor = "red";
	}
	
	public Zadanie(String nazwa, int czas, String kolor) {
		super();
		this.nazwa = nazwa;
		this.czas = czas;
		this.kolor = kolor;
	}
	
	@Override
	public String toString() {
		return "\n" + nazwa + ": " + czas + ": " + kolor;
	}
	public String getNazwa() {
		return nazwa;
	}
	
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public int getCzas() {
		return czas;
	}
	public void setCzas(int czas) {
		this.czas = czas;
	}
	public String getKolor() {
		return kolor;
	}
	public void setKolor(String kolor) {
		this.kolor = kolor;
	}
	
	
}
