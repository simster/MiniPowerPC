package befehlssatz;

import variablen.Prozessorvariablen;

public class Befehlssatz {

	// löscht das Register und das CarryFlag
	public void clr() {
		Prozessorvariablen.getInstance().setCarryflag(0);
		Prozessorvariablen.getInstance().setAkku(0);
		Prozessorvariablen.getInstance().setReg1(0);
		Prozessorvariablen.getInstance().setReg2(0);
		Prozessorvariablen.getInstance().setReg3(0);

	}

	public void add(int nr) {

		int neuAkku = Prozessorvariablen.getInstance().getAkku();
		if (nr == 1) {
			neuAkku = neuAkku + Prozessorvariablen.getInstance().getReg1();
		} else if (nr == 2) {
			neuAkku = neuAkku + Prozessorvariablen.getInstance().getReg2();
		} else if (nr == 3) {
			neuAkku = neuAkku + Prozessorvariablen.getInstance().getReg3();
		}

		Prozessorvariablen.getInstance().setAkku(neuAkku);
	}

	// Akku wird mit direktem Operanden addiert und in den Akku
	// geschrieben.(noch falsch-hier mit Reg1)
	public void addd() {
		int neuAkku = Prozessorvariablen.getInstance().getAkku();
		neuAkku = neuAkku + Prozessorvariablen.getInstance().getReg1();
		Prozessorvariablen.getInstance().setAkku(neuAkku);

	}

	public void inc() {
		int neuAkku = Prozessorvariablen.getInstance().getAkku();
		neuAkku = neuAkku + 1;
		if (neuAkku > 32767) {
			Prozessorvariablen.getInstance().setCarryflag(1);
			neuAkku = neuAkku - 1;
		} else if (neuAkku < 32768) {
			Prozessorvariablen.getInstance().setCarryflag(1);
			neuAkku = neuAkku + 1;
		}
		Prozessorvariablen.getInstance().setAkku(neuAkku);
	}

	public void dec() {
		int neuAkku = Prozessorvariablen.getInstance().getAkku();
		neuAkku = neuAkku - 1;

		if (neuAkku < 32768) {
			Prozessorvariablen.getInstance().setCarryflag(1);
			neuAkku = neuAkku - 1;
		}
		Prozessorvariablen.getInstance().setAkku(neuAkku);
	}

	public void lwdd() {

	}

	public void swdd() {

	}

	public void sra() {
		int neuAkku = Prozessorvariablen.getInstance().getAkku();
		neuAkku = neuAkku / 2;
		Prozessorvariablen.getInstance().setAkku(neuAkku);
	}

	public void sla() {
		int neuAkku = Prozessorvariablen.getInstance().getAkku();
		neuAkku = neuAkku * 2;
		Prozessorvariablen.getInstance().setAkku(neuAkku);
	}

	// logisch nach rechts-Carry Flag setzten
	public void srl() {
		int neuAkku = Prozessorvariablen.getInstance().getAkku();
		neuAkku = neuAkku / 2;
		Prozessorvariablen.getInstance().setAkku(neuAkku);

	}

	// logisch nach links-Carry Flag setzten
	public void sll() {
		int neuAkku = Prozessorvariablen.getInstance().getAkku();

		neuAkku = neuAkku * 2;
		if (neuAkku > 32767) {
			Prozessorvariablen.getInstance().setCarryflag(1);
			neuAkku = neuAkku - 32768;
		} else if (neuAkku < 32768) {
			Prozessorvariablen.getInstance().setCarryflag(1);
			neuAkku = neuAkku + 32768;
		}

		Prozessorvariablen.getInstance().setAkku(neuAkku);
	}

	public void and() {

	}

	public void or() {

	}

	public void not() {
		int neuAkku = Prozessorvariablen.getInstance().getAkku();
		neuAkku = (neuAkku + 1) * -1;
		Prozessorvariablen.getInstance().setAkku(neuAkku);

	}

	public void bz() {

	}

	public void bnz() {

	}

	public void bc() {

	}

	public void b() {

	}

	public void bzd() {

	}

	public void bnzd() {

	}

	public void bcd() {

	}

	public void bd() {

	}

	public void end() {
		System.out.println("ENDE");
	}

}
