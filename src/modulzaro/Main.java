package modulzaro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * Segítség:  GYÁRTÓ;TÍPUS;szélesség/magasság/átmérő
 * 
 * 1.	Feladat olvas be objektumba majd írasd ki a lista tartalmát!
 * 2.	Írásd ki hány elem van a listában.
 * 3.	Számold meg hány Nyári , Téli és 4 évszakos abroncs van a listában.
 * 4.	Konzolról olvasd be valamelyik abroncs gyártó nevét, majd írasd ki hozzá tartozó adatokat. 
 * 5.	NEHEZEBB  Nézd meg melyik a legnagyobb gumiabroncs átmérő!
 * 6.	NEHEZEBB  Keresd meg a legkisebb szélességet!
 * 7.	NEHEZEBB  Keresd meg a legngyobb és legkisebb magasságot!
 * 
 **/

public class Main {
	
	public static void feladat7(List<Adatok> a) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (Adatok ab : a) {
			String magassag = ab.getMeret().split("/")[1];
			int magassagSzam = Integer.parseInt(magassag);
			if (min > magassagSzam) {
				min = magassagSzam;
			}
			if (max < magassagSzam) {
				max = magassagSzam;
			}
		}
		System.out.println("Legkisebb magasság: " + min);
		System.out.println("Legnagyobb magasság: " + max);
	}

	
	public static void feladat6(List<Adatok> a) {
		int min = Integer.MAX_VALUE;

		for (Adatok ab : a) {
			String szelesseg = ab.getMeret().split("/")[0];
			int szelessegMeret = Integer.parseInt(szelesseg);
			if (min > szelessegMeret) {
				min = szelessegMeret;
			}
		}
		System.out.println("Legkisebb szélesség: " + min);
	}

	public static void feladat5(List<Adatok> a) {
		int max = Integer.MIN_VALUE;

		for (Adatok ab : a) {
			String atmero = ab.getMeret().split("/")[2];
			int atmeroSzam = Integer.parseInt(atmero.replace("R", ""));
			if (max < atmeroSzam) {
				max = atmeroSzam;
			}
		}
		System.out.println("Legnagyobb átmérő: R" + max);
	}

	public static void feladat4(List<Adatok> a) {
		Scanner beolvas = new Scanner(System.in);
		System.out.print("Kérek egy márkát: ");
		String marka = beolvas.next();
		for (Adatok ab : a) {
			if (ab.getMarka().equals(marka)) {
				System.out.println(ab.getMarka() + " " + ab.getMeret());
			}
		}
		beolvas.close();
	}

	public static void feladat3(List<Adatok> a) {
		int ny = 0, t = 0, ev4 = 0;
//		for (Abroncsok ab : a) {
//			switch (ab.getTipus()) {
//			case "Nyári":
//				ny++;
//				break;
//			case "Téli":
//				t++;
//				break;
//			case "4évszakos":
//				ev4++;
//				break;
//			}
//		}

		for (Adatok ab : a) {
			if (ab.getMarka().equals("Nyári")) {
				ny++;
			}
			if (ab.getMarka().equals("Téli")) {
				t++;
			}
			if (ab.getMarka().equals("4évszakos")) {
				ev4++;
			}
		}
		System.out.println(ny + " " + t + " " + ev4);
	}

	public static void feladat2(List<Adatok> a) {
		System.out.println("Második feladat: " + a.size());
	}

	public static List<Adatok> abroncsokLista() {
		List<Adatok> abroncsokLista = new ArrayList<>();
		try {
			List<String> beolvas = Files.readAllLines(Paths.get("gumi.txt"));
			for (String sor : beolvas.subList(1, beolvas.size())) {
				String[] split = sor.split(";");

				Adatok o = new Adatok(split[0], split[1], split[2]);

				abroncsokLista.add(o);
			}
		} catch (IOException e) {
			System.err.println("Hiba a beolvasásnál!");
		}
		return abroncsokLista;
	}

	public static void main(String[] args) {
		List<Adatok> a = abroncsokLista();
		feladat2(a);
		feladat3(a);
		feladat4(a);
		feladat5(a);
		feladat6(a);
		feladat7(a);
		
	}

}
