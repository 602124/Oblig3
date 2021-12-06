package no.hvl.dat100;

import java.io.PrintWriter;

import no.hvl.dat100.jplab11.oppgave3.Blogg;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		try {
			PrintWriter skriver = new PrintWriter(mappe + filnavn);
			
			skriver.println(samling.toString());
			
			skriver.close();
			
			}catch(Exception e) {
			
				return false;
		}
			return true;
		}
}
