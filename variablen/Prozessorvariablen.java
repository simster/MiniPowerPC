package variablen;

public class Prozessorvariablen {
	
	
	int akku;
	int reg1;
	int reg2;
	int reg3;
	
	int carryflag;
	int befehlszaehler;
	String aktBefehl = "---";
	
	private static Prozessorvariablen instance = null;
	
	
	public int getAkku() {
		return akku;
	}
	public void setAkku(int akku) {
		this.akku = akku;
	}
	public int getReg1() {
		return reg1;
	}
	public void setReg1(int reg1) {
		this.reg1 = reg1;
	}
	public int getReg2() {
		return reg2;
	}
	public void setReg2(int reg2) {
		this.reg2 = reg2;
	}
	public int getReg3() {
		return reg3;
	}
	public void setReg3(int reg3) {
		this.reg3 = reg3;
	}
	public int getCarryflag() {
		return carryflag;
	}
	public void setCarryflag(int carryflag) {
		this.carryflag = carryflag;
	}
	public int getBefehlszaehler() {
		return befehlszaehler;
	}
	public void setBefehlszaehler(int befehlszaehler) {
		this.befehlszaehler = befehlszaehler;
	}
	public static void setInstance(Prozessorvariablen instance) {
		Prozessorvariablen.instance = instance;
	}
	public static Prozessorvariablen getInstance() {
		if (instance == null){
			instance = new Prozessorvariablen();
		}
		return instance;
	}
	public String getAktBefehl() {
		return aktBefehl;
	}
	public void setAktBefehl(String aktBefehl) {
		this.aktBefehl = aktBefehl;
	}
	

}
