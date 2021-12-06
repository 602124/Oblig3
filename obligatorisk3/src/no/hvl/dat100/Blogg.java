package no.hvl.dat100;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.Innlegg;

public class Blogg {

	private Innlegg[] samling;
	private int Antall;

	public Blogg() {
		samling=new Innlegg [20];
		Antall= 0;
	}

	public Blogg(int lengde) {
		samling = new Innlegg[lengde];
		Antall= 0;

	}

	public int getAntall() {
		return Antall;
	}

	public Innlegg[] getSamling() {
		return samling;
	}

	public int finnInnlegg(Innlegg innlegg) {
		
		int funnet =-1;
		for (int i = 0; i < Antall; i++)
			if (samling[i].erLik(innlegg)) {
				funnet= i;
			}
		return funnet;

	}

	public boolean finnes(Innlegg innlegg) {

		return finnInnlegg(innlegg)>=0;

	}

	public boolean ledigPlass() {
		return Antall < samling.length;
	}

	public boolean leggTil(Innlegg innlegg) {
		boolean lagtil = false;
		if (!finnes(innlegg) && ledigPlass()) {
			samling[Antall] = innlegg;
			Antall++;
			lagtil = true;
		}

		return lagtil;

	}

	@Override



	// valgfrie oppgaver nedenfor
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

	}

	public boolean slett(Innlegg innlegg) {

	}

	public int[] search(String keyword) {

	}
	

	
}