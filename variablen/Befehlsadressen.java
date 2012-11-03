package variablen;





import java.util.HashMap;

import befehlssatz.Befehlssatz;

public class Befehlsadressen {
	
	
	private static Befehlsadressen instance = null;
	
	private int befehlspointer;
	private HashMap<String, String> befehlsliste = new HashMap<String, String>();
	
	
	public static void setInstance(Befehlsadressen instance) {
		Befehlsadressen.instance = instance;
	}
	
	public static Befehlsadressen getInstance() {
		if (instance == null){
			instance = new Befehlsadressen();
		}
		return instance;
	}
	
	
	public int getBefehlspointer(){
		return befehlspointer;
	}
	
	public void setBefehlspointer(int befehlspointer){
		this.befehlspointer = befehlspointer;
	}
	
	
	public String getAktBefehl(int befehlspointer){
		String dummy = "" + befehlspointer;
		return befehlsliste.get(dummy);
		
	}
	
	
	
	public void	nextBefehl(){
		
		if (befehlspointer==100){
			Befehlssatz.getInstance().clr(0);
			befehlspointer = befehlspointer + 2;
		}
		
		if (befehlspointer==102){
			Befehlssatz.getInstance().swdd(0, 508);
			befehlspointer = befehlspointer + 2;
		}
		
		if (befehlspointer==104){
			Befehlssatz.getInstance().lwdd(0, 500);
			befehlspointer = befehlspointer + 2;
		}
		
		else if(befehlspointer==106){
				if(Befehlssatz.getInstance().bzd()==true){
					befehlspointer = befehlspointer + 40;
				}
				else{
					befehlspointer = befehlspointer + 2;
				}
		}
		
		else if(befehlspointer==108){
			Befehlssatz.getInstance().lwdd(0, 502);
			befehlspointer = befehlspointer + 2;
		}
		
		else if(befehlspointer==110){
			if(Befehlssatz.getInstance().bzd()==true){
				befehlspointer = befehlspointer + 36;
			}
			else{
				befehlspointer = befehlspointer + 2;
			}
		}
		
		else if(befehlspointer==112){
			Befehlssatz.getInstance().sll();
			befehlspointer = befehlspointer + 2;
		}
		
		else if(befehlspointer==114){
			if(Befehlssatz.getInstance().bcd()==true){
				befehlspointer = befehlspointer + 15; //todo2: Operand2 ist negativ
			}
			else{
				befehlspointer = befehlspointer + 2;
			}
		}
		
		else if(befehlspointer==116){
			Befehlssatz.getInstance().srl();
			befehlspointer = befehlspointer + 2;
		}
		
		else if(befehlspointer == 118){
			Befehlssatz.getInstance().dec();
			befehlspointer = befehlspointer + 2;
		}
		
		else if(befehlspointer == 120){
			if(Befehlssatz.getInstance().bzd()==true){
				befehlspointer = befehlspointer + 32;
			}
			else{
				befehlspointer = befehlspointer + 2;
			}
		}
		
		else if(befehlspointer==122){
			Befehlssatz.getInstance().swdd(0, 504);
			befehlspointer = befehlspointer + 2;
		}
		
		else if(befehlspointer==124){
			Befehlssatz.getInstance().lwdd(1, 500);
			befehlspointer = befehlspointer + 2;
		}
		
		else if(befehlspointer==126){
			Befehlssatz.getInstance().lwdd(0, 500);
			befehlspointer = befehlspointer + 2;
		}
		
		else if(befehlspointer==128){
			Befehlssatz.getInstance().add(1);
			befehlspointer = befehlspointer + 2;
		}
		
		else if(befehlspointer == 130){
			if(Befehlssatz.getInstance().bcd()==true){
				befehlspointer = befehlspointer + 23;		//todo3: Verzweigung, falls Zahl grösser/kleiner als 32'000irgendwas
			}
			else{
				befehlspointer = befehlspointer + 2;
			}
		}
		
		else if(befehlspointer == 132){
			Befehlssatz.getInstance().swdd(0, 506);
			befehlspointer = befehlspointer + 2;
		}
		
		else if(befehlspointer == 134){
			Befehlssatz.getInstance().lwdd(0, 504);
			befehlspointer = befehlspointer + 2;
		}
		
		else if(befehlspointer == 136){
			Befehlssatz.getInstance().dec();
			befehlspointer = befehlspointer + 2;
		}
		
		else if(befehlspointer == 138){
			if(Befehlssatz.getInstance().bzd()==true){
				befehlspointer = befehlspointer + 16;
			}
			else{
				befehlspointer = befehlspointer + 2;
			}
		}
		
		else if(befehlspointer==140){
			Befehlssatz.getInstance().swdd(0, 504);
			befehlspointer = befehlspointer + 2;
		}
		
		else if(befehlspointer==142){
			Befehlssatz.getInstance().lwdd(0, 506);
			befehlspointer = befehlspointer + 2;
		}
		
		else if(befehlspointer == 144){
			befehlspointer = Befehlssatz.getInstance().bd(128);
		}
		
		else if(befehlspointer == 146){
			Befehlssatz.getInstance().swdd(0, 510);
			befehlspointer = befehlspointer + 2;
		}
		
		else if(befehlspointer == 148){
			Befehlssatz.getInstance().end();
		}
		
		else if(befehlspointer==150){
			Befehlssatz.getInstance().lwdd(0, 500);
			befehlspointer = befehlspointer + 2;
		}
		
		else if(befehlspointer == 152){
			befehlspointer = Befehlssatz.getInstance().bd(146);
			
		}
		
		else if(befehlspointer == 154){
			Befehlssatz.getInstance().lwdd(0, 506);
			befehlspointer = befehlspointer + 2;
			
		}
		
		else if(befehlspointer == 156){
			befehlspointer = Befehlssatz.getInstance().bd(146);
		}
		
		
		
		
		
		
	}
	

	public void programmListe(){
		
		befehlsliste.put("100", "100: CLR 0");				//Akku und Carry-Flag auf 0 setzen
		befehlsliste.put("102", "102: SWDD 0, #508");		//In die Speicheradresse 508 eine 0 schreiben (damit das Resultat sicher nicht verfälscht wird, falls dieses kleiner als 2^7 bleibt)
		befehlsliste.put("104", "104: LWDD 0, #500"); 		//Operand 1 in Akku laden
		befehlsliste.put("106", "106: BZD, #146");			//Wenn Operand1 null ist, zum Programmende springen
		befehlsliste.put("108", "108: LWDD 0, #502");		//Operand 2 in Akku laden
		befehlsliste.put("110", "110: BZD, #146");			//Wenn Operand2 null ist, zum Programmende springen
		befehlsliste.put("112", "112: SLL");				//Operand 2 logisch nach links verschieben
		befehlsliste.put("114", "114: BCD #todo2");			//Wenn Carry-Flag gesetzt ist, zu Befehl "todo2" springen
		befehlsliste.put("116", "116: SRL");				//Operand 2 logisch nach rechts verschieben
		befehlsliste.put("118", "118: DEC");				//Zähler um 1 verkleinern (da der 2. Operand beim ersten mal addieren gleich verdoppelt wird)
		befehlsliste.put("120", "120: BZD, #150");			//Wenn Operand 2 (Zähler) =1 war, Operand 1 als Resultat ausgeben
		befehlsliste.put("122", "122: SWDD 0, #504");		//Operand 2 als Zähler in Adresse 504 abspeichern
		befehlsliste.put("124", "124: LWDD 1, #500");		//Operand 1 in Register 1 laden
		befehlsliste.put("126", "126: LWDD 0; #500");		//Operand 2 in Akku laden
		befehlsliste.put("128", "128: ADD 1");				//Akku und Reg1 addieren
		befehlsliste.put("130", "130: BCD #todo3");		//Prüfen, ob Zahl im Akku nicht grösser/kleiner wurde als 2^7
		befehlsliste.put("132", "132: SWDD 0, #506");		//Akku in Adresse 506 speichern
		befehlsliste.put("134", "134: LWDD 0; #504");		//Zähler in Akku laden
		befehlsliste.put("136", "136: DEC");				//Zähler im Akku um 1 verkleinern
		befehlsliste.put("138", "138: BZD, #154");		//Wenn der Zähler 0 ist, zum Programmende springen
		befehlsliste.put("140", "140: SWDD 0, #504");		//Operand 2 wieder als Zähler in Adresse 504 abspeichern
		befehlsliste.put("142", "142: LWDD 0; #506");		//Zwischenresultat aus Adresse 506 wieder in den Akku laden
		befehlsliste.put("144", "144: BD #128");			//Bedingter Sprung: Befehlspointer auf Befehl 128 setzen
		befehlsliste.put("146", "146: SWDD 0, #510");		//Akku in Speicheradresse 510 speichern
		befehlsliste.put("148", "148: END");				//Berechnung beendet: Resultat = 0
		befehlsliste.put("150", "150: LWDD 0; #500");		//Operand 1 wieder in den Akku laden
		befehlsliste.put("152", "152: BD #146");			//Bedingter Sprung: Befehlspointer auf Befehl 146 setzen
		befehlsliste.put("154", "154: LWDD 0, #506");		//Zwischenresultat aus Adresse 506 wieder in den Akku laden
		befehlsliste.put("156", "156: BD #146");			//Bedingter Sprung: Befehlspointer auf Befehl 146 setzen
		befehlsliste.put("158", "");
		befehlsliste.put("160", "");
		befehlsliste.put("162", "");
		befehlsliste.put("164", "");
		befehlsliste.put("166", "");
		befehlsliste.put("168", "");
		befehlsliste.put("170", "");
		befehlsliste.put("172", "");
		befehlsliste.put("174", "");
		befehlsliste.put("176", "");
		befehlsliste.put("178", "");
		befehlsliste.put("180", "");
		befehlsliste.put("182", "");
		befehlsliste.put("184", "");
		befehlsliste.put("186", "");
		befehlsliste.put("188", "");
		befehlsliste.put("190", "");
		befehlsliste.put("192", "");
		befehlsliste.put("194", "");
		befehlsliste.put("196", "");
		befehlsliste.put("198", "");
		befehlsliste.put("200", "");
		befehlsliste.put("", "");
	}
	
	public String getBefehlsliste(String key){
		return befehlsliste.get(key);
	}
	
}
