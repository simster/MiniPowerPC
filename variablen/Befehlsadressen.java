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
			Befehlssatz.getInstance().lwdd(0, 502);
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
				befehlspointer = befehlspointer + 28;
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

		else if(befehlspointer == 158){
			Befehlssatz.getInstance().swdd(0, 506);
			befehlspointer = befehlspointer + 2;
		}

		else if(befehlspointer == 160){
			Befehlssatz.getInstance().clr(0);
			befehlspointer = befehlspointer + 2;
		}

		else if(befehlspointer == 162){
			Befehlssatz.getInstance().lwdd(0, 506);
			befehlspointer = befehlspointer + 2;
		}

		else if(befehlspointer == 164){
			Befehlssatz.getInstance().sll();
			befehlspointer = befehlspointer + 2;
		}

		else if(befehlspointer == 166){
			if(Befehlssatz.getInstance().bcd()==true){
				befehlspointer = befehlspointer + 10;
			}
			else{
				befehlspointer = befehlspointer + 2;
			}
		}

		else if(befehlspointer == 168){
			Befehlssatz.getInstance().lwdd(0, 508);
			befehlspointer = befehlspointer + 2;
		}

		else if(befehlspointer == 170){
			Befehlssatz.getInstance().inc();
			befehlspointer = befehlspointer + 2;
		}

		else if(befehlspointer == 172){
			Befehlssatz.getInstance().swdd(0, 508);
			befehlspointer = befehlspointer + 2;
		}

		else if(befehlspointer == 174){
			befehlspointer = Befehlssatz.getInstance().bd(134);
		}

		else if(befehlspointer == 176){
			Befehlssatz.getInstance().lwdd(0, 508);
			befehlspointer = befehlspointer + 2;
		}

		else if(befehlspointer == 178){
			Befehlssatz.getInstance().dec();
			befehlspointer = befehlspointer + 2;
		}

		else if(befehlspointer == 180){
			Befehlssatz.getInstance().swdd(0, 508);
			befehlspointer = befehlspointer + 2;
		}

		else if(befehlspointer == 182){
			befehlspointer = Befehlssatz.getInstance().bd(134);
		}

		else if(befehlspointer == 184){
			Befehlssatz.getInstance().lwdd(0, 500);
			befehlspointer = befehlspointer + 2;

		}

		else if(befehlspointer == 186){
			Befehlssatz.getInstance().sll();
			befehlspointer = befehlspointer + 2;

		}

		else if(befehlspointer == 188){
			if(Befehlssatz.getInstance().bcd()==true){
				befehlspointer = befehlspointer + 15; //todo1: Operand1 ist ebenfalls negativ
			}
			else{
				befehlspointer = befehlspointer + 2;
			}
		}

		else if(befehlspointer == 190){
			Befehlssatz.getInstance().lwdd(0, 500);
			befehlspointer = befehlspointer + 2;
		}

		else if(befehlspointer == 192){
			Befehlssatz.getInstance().dec();
			befehlspointer = befehlspointer + 2;
		}

		else if(befehlspointer == 194){
			if(Befehlssatz.getInstance().bzd()==true){
				befehlspointer = befehlspointer + 10;
			}
			else{
				befehlspointer = befehlspointer + 2;
			}
		}

		else if(befehlspointer == 196){
			Befehlssatz.getInstance().swdd(0, 504);
			befehlspointer = befehlspointer + 2;
		}

		else if(befehlspointer == 198){
			Befehlssatz.getInstance().lwdd(1, 502);
			befehlspointer = befehlspointer + 2;
		}

		else if(befehlspointer == 200){
			Befehlssatz.getInstance().lwdd(0, 502);
			befehlspointer = befehlspointer + 2;
		}

		else if(befehlspointer == 202){
			befehlspointer = Befehlssatz.getInstance().bd(128);
		}

		else if(befehlspointer == 204){
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
		befehlsliste.put("114", "114: BCD #184");			//Wenn Carry-Flag gesetzt ist, zu Befehl "todo2" springen
		befehlsliste.put("116", "116: LWDD 0, #502");		//Operand 2 nochmals neu laden
		befehlsliste.put("118", "118: DEC");				//Zähler um 1 verkleinern (da der 2. Operand beim ersten mal addieren gleich verdoppelt wird)
		befehlsliste.put("120", "120: BZD, #150");			//Wenn Operand 2 (Zähler) =1 war, Operand 1 als Resultat ausgeben
		befehlsliste.put("122", "122: SWDD 0, #504");		//Operand 2 als Zähler in Adresse 504 abspeichern
		befehlsliste.put("124", "124: LWDD 1, #500");		//Operand 1 in Register 1 laden
		befehlsliste.put("126", "126: LWDD 0; #500");		//Operand 1 in Akku laden
		befehlsliste.put("128", "128: ADD 1");				//Akku und Reg1 addieren
		befehlsliste.put("130", "130: BCD #158");			//Prüfen, ob Zahl im Akku nicht grösser/kleiner wurde als 2^7
		befehlsliste.put("132", "132: SWDD 0, #506");		//Akku in Adresse 506 speichern
		befehlsliste.put("134", "134: LWDD 0; #504");		//Zähler in Akku laden
		befehlsliste.put("136", "136: DEC");				//Zähler im Akku um 1 verkleinern
		befehlsliste.put("138", "138: BZD, #154");			//Wenn der Zähler 0 ist, zum Programmende springen
		befehlsliste.put("140", "140: SWDD 0, #504");		//Operand 2 wieder als Zähler in Adresse 504 abspeichern
		befehlsliste.put("142", "142: LWDD 0; #506");		//Zwischenresultat aus Adresse 506 wieder in den Akku laden
		befehlsliste.put("144", "144: BD #128");			//Bedingter Sprung: Befehlspointer auf Befehl 128 setzen
		befehlsliste.put("146", "146: SWDD 0, #510");		//Akku in Speicheradresse 510 speichern
		befehlsliste.put("148", "148: END");				//Berechnung beendet
		befehlsliste.put("150", "150: LWDD 0; #500");		//Operand 1 wieder in den Akku laden
		befehlsliste.put("152", "152: BD #146");			//Bedingter Sprung: Befehlspointer auf Befehl 146 setzen
		befehlsliste.put("154", "154: LWDD 0, #506");		//Zwischenresultat aus Adresse 506 wieder in den Akku laden
		befehlsliste.put("156", "156: BD #146");			//Bedingter Sprung: Befehlspointer auf Befehl 146 setzen
		befehlsliste.put("158", "158: SWDD 0, #506");		//Wenn Zahl grösser/kleiner als 2^7, den Rest wieder in Resultatespeicher schreiben
		befehlsliste.put("160", "160: CLR 0");				//Akku und Carry-Flag zurücksetzen
		befehlsliste.put("162", "162: LWDD 0; #506");		//Zwischenresultat wieder in den Akku laden
		befehlsliste.put("164", "164: SLL");				//Akku logisch nach links schieben um zu prüfen, ob die Zahl negativ ist
		befehlsliste.put("166", "166: BCD #176");			//Wenn der 2. Operand negativ ist, dann mache bei Adr xy weiter
		befehlsliste.put("168", "168: LWDD 0, #508");		//den "grossen Teil" der Zahl in den Akku laden
		befehlsliste.put("170", "170: INC");				//den Akku um eins erhöhen
		befehlsliste.put("172", "172: SWDD 0, #508");		//Den Übertrag in Adresse 508 speichern
		befehlsliste.put("174", "174: BD #134");			//Berechnung fortsetzen, indem Zähler geladen wird
		befehlsliste.put("176", "176: LWDD 0, #508");		//den "grossen Teil" der negativen Zahl in den Akku laden
		befehlsliste.put("178", "178: DEC");				//den "grossen Teil" der negativen Zahl um eins verkleinern
		befehlsliste.put("180", "180: SWDD 0, #508");		//Den Übertrag in Adresse 508 abspeichern
		befehlsliste.put("182", "182: BD #134");			//Berechnung fortsetzen, indem der Zähler geladen wird
		befehlsliste.put("184", "184: LWDD 0, #500");		//Falls 2. Operand negativ ist, den 1. Operanden laden und prüfen
		befehlsliste.put("186", "186: SLL");				//Logisch nach links verschieben - prüfen, ob 1. Operand negativ ist
		befehlsliste.put("188", "188: BCD #todo1");		//todo1: wenn auch 2. Operand negativ ist, zu Adr. xy springen
		befehlsliste.put("190", "190: LWDD 0, #500");		//Operand 1 nochmals neu laden (ergibt Zähler)
		befehlsliste.put("192", "192: DEC");				//Zähler um 1 verkleinern
		befehlsliste.put("194", "194: BZD #204");			//Wenn der 1. Operand 1 war, 2. Operanden als Resultat ausgeben
		befehlsliste.put("196", "196: SWDD 0, #504");		//Zähler in Adresse 504 abspeichern
		befehlsliste.put("198", "198: LWDD 1, #502");		//2. Operanden ins Register 1 laden
		befehlsliste.put("200", "200: LWDD 0, #502");		//2. Operanden in Akku laden
		befehlsliste.put("202", "202: BCD #128");			//Zu Adresse ... springen, um die Multiplikation auszuführen
		befehlsliste.put("204", "204: LWDD 0, #502");		//Operand 2 als Resultat ausgeben
		befehlsliste.put("206", "206: BD #146");
		befehlsliste.put("208", "208: ");
		befehlsliste.put("210", "210: ");
		befehlsliste.put("", "");
	}

	public String getBefehlsliste(String key){
		return befehlsliste.get(key);
	}

}
