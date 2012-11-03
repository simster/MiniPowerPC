package befehlssatz;

import gui.Prozessor_Gui;
import variablen.Prozessorvariablen;
import variablen.Speicheradressen;

public class Befehlssatz {


	private static Befehlssatz instance = null;


	public static void setInstance(Befehlssatz instance) {
		Befehlssatz.instance = instance;
	}

	public static Befehlssatz getInstance() {
		if (instance == null){
			instance = new Befehlssatz();
		}
		return instance;
	}


	// Lösche das Register «Rxx » (alle Bit auf 0 setzten) und das Carry-Flag
	// (00 bis 11 für: Akku, R-1, R-2 bzw. R-3).

	public void clr(int regNr) {
		Prozessorvariablen.getInstance().setCarryflag(0);
		if(regNr==0){
			Prozessorvariablen.getInstance().setAkku(0);
		}
		else if(regNr==1){
			Prozessorvariablen.getInstance().setReg1(0);
		}
		else if(regNr==2){
			Prozessorvariablen.getInstance().setReg2(0);
		}
		else if(regNr==3){
			Prozessorvariablen.getInstance().setReg3(0);
		}

	}

	// Addition zweier 16-Bit-Zahlen (Zahl im Akku und Zahl im Register «Rxx »;
	// 00 bis 11 für Akku, R-1, R-2 bzw. R-3) im 2er -Komplement; beiÜberlauf
	// wird das Carry-Flag gesetzt (= 1), sonst auf den Wert 0.

	public void add(int nr) {

		int neuAkku = Prozessorvariablen.getInstance().getAkku();
		if (nr == 1) {
			neuAkku = neuAkku + Prozessorvariablen.getInstance().getReg1();
		} else if (nr == 2) {
			neuAkku = neuAkku + Prozessorvariablen.getInstance().getReg2();
		} else if (nr == 3) {
			neuAkku = neuAkku + Prozessorvariablen.getInstance().getReg3();
		}

		if(neuAkku>32767){
			Prozessorvariablen.getInstance().setCarryflag(1);
			neuAkku = neuAkku - 32768;
		} else if (neuAkku < -32768) {
			Prozessorvariablen.getInstance().setCarryflag(1);
			neuAkku = neuAkku + 32768;
		}


		Prozessorvariablen.getInstance().setAkku(neuAkku);
	}

	// Addition der 16-Bit-Zahl im Akku mit der 15-Bit-Zahl als direkten
	// Operanden im 2er -Komplement; bei Überlauf wird das Carry-Flag gesetzt
	// (=1), sonst auf den Wert 0 . Vor der Addition wird die 15-Bit-Zahl des
	// Operanden auf 16 Bit erweitert (mit MSb des MSB auf 1 wenn negativ, sonst
	// auf 0 ).
	// (noch falsch-hier mit Reg1) !!!!!!

	public void addd() {
		int neuAkku = Prozessorvariablen.getInstance().getAkku();
		neuAkku = neuAkku + Prozessorvariablen.getInstance().getReg1();
		Prozessorvariablen.getInstance().setAkku(neuAkku);

	}

	// Der Akku (16-Bit-Zahl im 2er -Komplement) wird um den Wert 1
	// inkrementiert; bei Überlauf wird das Carry-Flag gesetzt (= 1), sonst auf
	// den Wert 0. auf den Wert 0.

	public void inc() {
		int neuAkku = Prozessorvariablen.getInstance().getAkku();
		neuAkku = neuAkku + 1;
		if (neuAkku > 32767) {
			Prozessorvariablen.getInstance().setCarryflag(1);
			neuAkku = neuAkku - 32768;
		}
		Prozessorvariablen.getInstance().setAkku(neuAkku);
	}

	// Der Akku (16-Bit-Zahl im 2er -Komplement) wird um den Wert 1
	// dekrementiert; bei Überlauf wird das Carry-Flag gesetzt (= 1), sonst auf
	// den Wert 0.

	public void dec() {
		int neuAkku = Prozessorvariablen.getInstance().getAkku();
		neuAkku = neuAkku - 1;

		if (neuAkku < -32768) {
			Prozessorvariablen.getInstance().setCarryflag(1);
			neuAkku = neuAkku + 32768;
		}
		Prozessorvariablen.getInstance().setAkku(neuAkku);
	}

	// In das Register mit der Nummer xx (00 bis 11 für Akku, R-1, R-2 bzw. R-3)
	// wird der Inhalt der Speicherzellen Adr und Adr + 1 (1 Wort = 2 Byte)
	// geladen. Mit 10 Bit können 1KiB Speicher adressiert werden.

	public void lwdd(int regNr, int adrNr) {
		if (regNr == 0){
			Prozessorvariablen.getInstance().setAkku(Speicheradressen.getInstance().getAdr(adrNr));
		}
		else if (regNr == 1){
			Prozessorvariablen.getInstance().setReg1(Speicheradressen.getInstance().getAdr(adrNr));
		}
		else if (regNr == 2){
			Prozessorvariablen.getInstance().setReg2(Speicheradressen.getInstance().getAdr(adrNr));
		}
		else {
			Prozessorvariablen.getInstance().setReg3(Speicheradressen.getInstance().getAdr(adrNr));
		}
	}

	// In die über Adr und Adr + 1 adressierten Speicherzellen wird der Inhalt
	// des Registers xx (00 bis 11 für Akku, R-1, R-2 bzw. R-3) geschrieben. Mit
	// 10 Bit können 1KiB Speicher adressiert werden.

	public void swdd(int regNr, int adrNr) {
		if (regNr == 0){
			int adrInhalt = Prozessorvariablen.getInstance().getAkku();
			Speicheradressen.getInstance().setAdr(adrNr, adrInhalt);
		}
		else if (regNr == 1){
			int adrInhalt = Prozessorvariablen.getInstance().getReg1();
			Speicheradressen.getInstance().setAdr(adrNr, adrInhalt);
		}
		else if (regNr == 2){
			int adrInhalt = Prozessorvariablen.getInstance().getReg2();
			Speicheradressen.getInstance().setAdr(adrNr, adrInhalt);
		}
		else {
			int adrInhalt = Prozessorvariablen.getInstance().getReg3();
			Speicheradressen.getInstance().setAdr(adrNr, adrInhalt);
		}

	}

	// Schieben arithmetisch nach rechts: der Inhalt des Akkus wird um eine
	// Stelle nach rechts geschoben; der Inhalt vom LSb des LSB (das rechte Bit
	// des Wortes) wird als Carry-Flag gesetzt. Dabei bleibt das MSb des MSB
	// (Vorzeichenbit) und das 2. Bit des MSB erhalten.

	public void sra() {
		int neuAkku = Prozessorvariablen.getInstance().getAkku();
		neuAkku = neuAkku / 2;
		Prozessorvariablen.getInstance().setAkku(neuAkku);
	}

	// Schieben arithmetisch nach links: der Inhalt des Akkus wird um eine
	// Stelle nach links geschoben; der Inhalt vom 2. Bit des MSB (das 2. Bit
	// des Wortes) wird als Carry-Flag gesetzt. Dabei bleibt das MSb des MSB
	// (Vorzeichenbit) erhalten. In das LSb des LSB (das letzte Bit des Wortes)
	// wird eine 0 geschrieben.

	public void sla() {
		int neuAkku = Prozessorvariablen.getInstance().getAkku();
		neuAkku = neuAkku * 2;
		if (neuAkku > 32767) {
			Prozessorvariablen.getInstance().setCarryflag(1);
			neuAkku = neuAkku - 32768;
		} else if (neuAkku < -32768) {
			Prozessorvariablen.getInstance().setCarryflag(1);
			neuAkku = neuAkku + 32768;
		}
		Prozessorvariablen.getInstance().setAkku(neuAkku);
	}

	// Schieben logisch nach rechts: der Inhalt des Akkus wird um eine Stelle
	// nach rechts geschoben; der Inhalt vom LSb des LSB (das rechte Bit des
	// Wortes) wird als Carry-Flag gesetzt. Das MSb des MSB (das 1. Bit des
	// Wortes) wird auf 0 gesetzt.

	public void srl() {
		int neuAkku = Prozessorvariablen.getInstance().getAkku();
		if(neuAkku < 0){
			neuAkku = neuAkku + 32768;
		}
		neuAkku = neuAkku / 2;
		Prozessorvariablen.getInstance().setAkku(neuAkku);
	}

	// Schieben logisch nach links: der Inhalt des Akkus wird um eine Stelle
	// nach links geschoben; der Inhalt vom LSb des LSB (das rechte Bit des
	// Wortes) wird mit 0 aufgefüllt, das MSb des MSB (das 1. Bit des Wortes)
	// wird als Carry-Flag gesetzt.

	public void sll() {
		int neuAkku = Prozessorvariablen.getInstance().getAkku();
		neuAkku = neuAkku * 2;
		if(neuAkku<0){
			Prozessorvariablen.getInstance().setCarryflag(1);
			neuAkku=neuAkku * -1;
		}
		if (neuAkku > 32767) {
			neuAkku = neuAkku - 32768;
		}
		Prozessorvariablen.getInstance().setAkku(neuAkku);
	}



	// Akku und Register xx (00 bis 11 für Akku, R-1, R-2 bzw R-3) werden
	// bitweise logisch mit AND verknüpft

	public void and() {

	}

	// Akku und Register xx (00 bis 11 für Akku, R-1, R-2 bzw R-3) werden
	// bitweise logisch mit ODER verknüpft.

	public void or() {

	}

	// Alle Bit im Akku werden bitweise negiert.

	public void not() {
		int neuAkku = Prozessorvariablen.getInstance().getAkku();
		neuAkku = (neuAkku + 1) * -1;
		Prozessorvariablen.getInstance().setAkku(neuAkku);

	}

	// Wenn der Akku 0 ist, verzweige an die durch das Register xx (01 bis 11
	// für R-1, R-2 bzw. R-3) angegebene Speicheradresse; sonst wird
	// der folgende Befehl normal fortgeführt.

	public void bz() {
		int neuAkku = Prozessorvariablen.getInstance().getAkku();
		if (neuAkku == 0) {

		}
	}

	// Wenn der Akku ≠ 0 ist, verzweige an die durch das Register xx (01 bis 11
	// für R-1, R-2 bzw. R-3) angegebene Speicheradresse; sonst wird der
	// folgende Befehl normal fortgeführt.

	public void bnz() {
		int neuAkku = Prozessorvariablen.getInstance().getAkku();
		if (neuAkku != 0) {

		}
	}

	// Wenn das Carry-Flag gesetzt ist (= 1), verzweige an die durch das
	// Register xx (01 bis 11 für R-1, R-2 bzw. R-3) angegebene Speicheradresse,
	// sonst wird der folgende Befehl normal fortgeführt.

	public void bc() {
		int carryFlag = Prozessorvariablen.getInstance().getCarryflag();
		if (carryFlag == 1) {

		}
	}

	// Verzweige an die durch das Register xx (01 bis 11 für R-1, R-2 bzw. R-3)
	// angegebene Speicheradresse.
	public void b(int nr) {
		if (nr == 1) {
			int neuReg1 = Prozessorvariablen.getInstance().getReg1();
		} else if (nr == 2) {
			int neuReg2 = Prozessorvariablen.getInstance().getReg2();
		} else if (nr == 3) {
			int neuReg3 = Prozessorvariablen.getInstance().getReg3();
		}
	}

	// Wenn der Akku 0 ist, verzweige an die durch den Operanden angegebene
	// Speicheradresse; sonst wird das Programm mit dem folgenden Befehl
	// fortgesetzt. Mit 10 Bit können 1KiB Speicher adressiert werden.

	public boolean bzd() {
		int neuAkku = Prozessorvariablen.getInstance().getAkku();
		if (neuAkku == 0) {
			return true;
		}
		return false;
	}

	// Wenn der Akku ≠ 0 ist, verzweige an die durch den Operanden angegebene
	// Speicheradresse; sonst wird das Programm mit dem folgenden Befehl
	// forgesetzt. Mit 10 Bit können 1KiB Speicher adressiert werden.

	public void bnzd() {
		int neuAkku = Prozessorvariablen.getInstance().getAkku();
		if (neuAkku != 0) {

		}
	}

	// Wenn das Carry-Flag gesetzt ist, verzweige an die durch den Operanden
	// angegebene Speicheradresse; sonst wird das Programm mit dem folgenden
	// Befehl forgesetzt. Mit 10 Bit können 1KiB Speicher adressiert werden.

	public boolean bcd() {
		if (Prozessorvariablen.getInstance().getCarryflag() == 1) {
			return true;
		}
		else {
			return false;
		}
	}

	// Verzweige an die durch den Operanden angegebene Speicheradresse. Mit 10
	// Bit können 1KiB Speicher adressiert werden.

	public int bd(int pointer) {
		return pointer;
	}

	public void end() {
		String ergebnis;
		if(Speicheradressen.getInstance().getS508()==0){
        	ergebnis = "Das Resultat lautet: "+Speicheradressen.getInstance().getS510();
        }
		else {
			int ergebnisGross = (Speicheradressen.getInstance().getS508() * 32768) + Speicheradressen.getInstance().getS510();
			ergebnis = "Das Reslutat lautet: "+ ergebnisGross;
		}
		System.out.println("ENDE");
		Prozessor_Gui.getInstance().popUpEnd(ergebnis);
	}

}
