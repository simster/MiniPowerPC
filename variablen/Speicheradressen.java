package variablen;

public class Speicheradressen {
	
	int s500;
	int s502;
	int s504;
	int s506;
	int s508;
	int s510;
	int s512;
	int s514;
	int s516;
	int s518;
	int s520;
	int s522;
	int s524;
	int s526;
	int s528;
	
	private static Speicheradressen instance = null;


	public static void setInstance(Speicheradressen instance) {
		Speicheradressen.instance = instance;
	}
	
	public static Speicheradressen getInstance() {
		if (instance == null){
			instance = new Speicheradressen();
		}
		return instance;
	}
	
	
	public int getS500() {
		return s500;
	}
	public void setS500(int s500) {
		this.s500 = s500;
	}
	public int getS502() {
		return s502;
	}
	public void setS502(int s502) {
		this.s502 = s502;
	}
	public int getS504() {
		return s504;
	}
	public void setS504(int s504) {
		this.s504 = s504;
	}
	public int getS506() {
		return s506;
	}
	public void setS506(int s506) {
		this.s506 = s506;
	}
	public int getS508() {
		return s508;
	}
	public void setS508(int s508) {
		this.s508 = s508;
	}
	public int getS510() {
		return s510;
	}
	public void setS510(int s510) {
		this.s510 = s510;
	}
	public int getS512() {
		return s512;
	}
	public void setS512(int s512) {
		this.s512 = s512;
	}
	public int getS514() {
		return s514;
	}
	public void setS514(int s514) {
		this.s514 = s514;
	}
	public int getS516() {
		return s516;
	}
	public void setS516(int s516) {
		this.s516 = s516;
	}
	public int getS518() {
		return s518;
	}
	public void setS518(int s518) {
		this.s518 = s518;
	}
	public int getS520() {
		return s520;
	}
	public void setS520(int s520) {
		this.s520 = s520;
	}
	public int getS522() {
		return s522;
	}
	public void setS522(int s522) {
		this.s522 = s522;
	}
	public int getS524() {
		return s524;
	}
	public void setS524(int s524) {
		this.s524 = s524;
	}
	public int getS526() {
		return s526;
	}
	public void setS526(int s526) {
		this.s526 = s526;
	}
	public int getS528() {
		return s528;
	}
	public void setS528(int s528) {
		this.s528 = s528;
	}
	
	
	public int getAdr(int adr){
		if(adr==500){
			return s500;
		}
		else if (adr == 502){
			return s502;
		}
		else if (adr == 504){
			return s504;
		}
		else if (adr == 506){
			return s506;
		}
		else if (adr == 508){
			return s508;
		}
		else if (adr == 510){
			return s510;
		}
		else if (adr == 512){
			return s512;
		}
		else if (adr == 514){
			return s514;
		}
		else if (adr == 516){
			return s516;
		}
		else if (adr == 518){
			return s518;
		}
		else if (adr == 520){
			return s520;
		}
		else if (adr == 522){
			return s522;
		}
		else if (adr == 524){
			return s524;
		}
		else if (adr == 526){
			return s526;
		}
		else if (adr == 528){
			return s528;
		}
		
		return 0;
	}

	public void setAdr(int adrNr, int adrInhalt){
		if(adrNr==500){
			s500 = adrInhalt;
		}
		
		else if (adrNr==502){
			s502 = adrInhalt;
		}
		
		else if (adrNr==504){
			s504 = adrInhalt;
		}
		
		else if (adrNr==506){
			s506 = adrInhalt;
		}
		
		else if (adrNr==508){
			s508 = adrInhalt;
		}
		
		
		else if (adrNr==510){
			s510 = adrInhalt;
		}
		
		
		else if (adrNr==512){
			s512 = adrInhalt;
		}
		
		else if (adrNr==514){
			s514 = adrInhalt;
		}
		
		else if (adrNr==516){
			s516 = adrInhalt;
		}
		
		else if (adrNr==518){
			s518 = adrInhalt;
		}
		
		else if (adrNr==520){
			s520 = adrInhalt;
		}
		
		else if (adrNr==522){
			s522 = adrInhalt;
		}
		
		else if (adrNr==524){
			s524 = adrInhalt;
		}
		
		else if (adrNr==526){
			s526 = adrInhalt;
		}
		
		else if (adrNr==528){
			s528 = adrInhalt;
		}
		
		else{
			System.out.println("Fehler - es existieren nur Speicheradressen bis 528");
		}
	}

}
