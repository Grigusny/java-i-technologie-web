package zadanko;

public class Ulamek {
	private int licznik;
	private int mianownik;

	public Ulamek(int licznik, int mianownik) {
		this.licznik=licznik;
		this.mianownik=mianownik;
	}
	
	public void wyswietl() {
		System.out.println(licznik+ "/" +mianownik);
	}
}
