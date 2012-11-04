package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import variablen.Befehlsadressen;
import variablen.Prozessorvariablen;
import variablen.Speicheradressen;

public class Prozessor_Gui extends JPanel{

	private static Prozessor_Gui instance = null;

	private static final long serialVersionUID = 1L;
	private JLabel lblZehner = new JLabel("10er-System");
	private JLabel lblBinaer = new JLabel("2er-System");

	private JLabel lblBefehlszaehler;
	private JLabel lblBefehlsRegAdr;
	private JLabel lblAktBefehl;	

	private JLabel lblBefehlszaehlerI;
	private JLabel lblBefehlsRegAdrI;
	private JLabel lblAktBefehlI;


	private JLabel lblAkku;
	private JLabel lblReg1;
	private JLabel lblReg2;
	private JLabel lblReg3;

	private JLabel lblAkkuI;
	private JLabel lblReg1I;
	private JLabel lblReg2I;
	private JLabel lblReg3I;	

	private JLabel lblAkkuIB;
	private JLabel lblReg1IB;
	private JLabel lblReg2IB;
	private JLabel lblReg3IB;	

	private JLabel lblcarryflag;
	private JLabel lblcarryflagI;

	private JLabel lblBefehlVor;
	private JLabel lblBefehlu5 = new JLabel("---");
	private JLabel lblBefehlu4 = new JLabel("---");
	private JLabel lblBefehlu3 = new JLabel("---");
	private JLabel lblBefehlu2 = new JLabel("---");
	private JLabel lblBefehlu1 = new JLabel("---");

	private JLabel lblBefehlNach;

	private JLabel lblBefehln1;
	private JLabel lblBefehln2;
	private JLabel lblBefehln3;
	private JLabel lblBefehln4;
	private JLabel lblBefehln5;
	private JLabel lblBefehln6;
	private JLabel lblBefehln7;
	private JLabel lblBefehln8;
	private JLabel lblBefehln9;
	private JLabel lblBefehln10;


	private JLabel lblSpeicherinhalt;

	private JLabel lblSp1;
	private JLabel lblSp2;
	private JLabel lblSp3;
	private JLabel lblSp4;
	private JLabel lblSp5;
	private JLabel lblSp6;
	private JLabel lblSp7;
	private JLabel lblSp8;
	private JLabel lblSp9;
	private JLabel lblSp10;
	private JLabel lblSp11;
	private JLabel lblSp12;
	private JLabel lblSp13;
	private JLabel lblSp14;
	private JLabel lblSp15;

	private JLabel lblSp1B;
	private JLabel lblSp2B;
	private JLabel lblSp3B;
	private JLabel lblSp4B;
	private JLabel lblSp5B;
	private JLabel lblSp6B;
	private JLabel lblSp7B;
	private JLabel lblSp8B;
	private JLabel lblSp9B;
	private JLabel lblSp10B;
	private JLabel lblSp11B;
	private JLabel lblSp12B;
	private JLabel lblSp13B;
	private JLabel lblSp14B;
	private JLabel lblSp15B;

	private JLabel lblVariableA;
	private JLabel lblVariableB;
	private JTextField txtVariableA;
	private JTextField txtVariableB;



	public static void setInstance(Prozessor_Gui instance) {
		Prozessor_Gui.instance = instance;
	}

	public static Prozessor_Gui getInstance() {
		if (instance == null){
			instance = new Prozessor_Gui();
		}
		return instance;
	}




	public Prozessor_Gui(){

		SpringLayout layout = new SpringLayout();
		this.setLayout(layout);

		JButton btnStart = new JButton("Startposition");
		btnStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setStartposition();
				refresh();

			}
		});


		JButton btnStep = new JButton("Step");
		btnStep.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				nextStep();
				refresh();
			}
		});


		JButton btnSlow = new JButton("Slow-Modus");
		btnSlow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	
				slowRun();
			}
		});


		JButton btnFast = new JButton("Fast-Modus");
		btnFast.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fastRun();
				refresh();
			}
		});


		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bereinigen();
			}
		});


		//Texte für Labels setzen:
		lblBefehlszaehler = new JLabel("Befehlszähler:");
		lblBefehlszaehlerI = new JLabel("" + Prozessorvariablen.getInstance().getBefehlszaehler());
		lblBefehlsRegAdr = new JLabel("RegAdr. des akt. Befehls:");
		lblBefehlsRegAdrI = new JLabel("todo");
		lblAktBefehl = new JLabel("Aktueller Befehl:");
		lblAktBefehlI = new JLabel("" + Prozessorvariablen.getInstance().getAktBefehl());
		lblAkku = new JLabel("Akku:");
		lblAkkuI = new JLabel("" + Prozessorvariablen.getInstance().getAkku());
		lblAkkuIB = new JLabel("0000 0000 0000 0000");
		lblReg1 = new JLabel("Register 1:");
		lblReg1I = new JLabel("" + Prozessorvariablen.getInstance().getReg1());
		lblReg1IB = new JLabel("todo");
		lblReg2 = new JLabel("Register 2:");
		lblReg2I = new JLabel("" + Prozessorvariablen.getInstance().getReg2());
		lblReg2IB = new JLabel("todo");
		lblReg3 = new JLabel("Register 3:");
		lblReg3I = new JLabel("" + Prozessorvariablen.getInstance().getReg3());
		lblReg3IB = new JLabel("todo");
		lblcarryflag = new JLabel("Carry-Bit:");
		lblcarryflagI = new JLabel("" + Prozessorvariablen.getInstance().getCarryflag());
		lblBefehlVor = new JLabel("Befehle vorher:");
		lblBefehlNach = new JLabel("Befehle nachher:");
		lblBefehln1 = new JLabel("---");
		lblBefehln2 = new JLabel("---");
		lblBefehln3 = new JLabel("---");
		lblBefehln4 = new JLabel("---");
		lblBefehln5 = new JLabel("---");
		lblBefehln6 = new JLabel("---");
		lblBefehln7 = new JLabel("---");
		lblBefehln8 = new JLabel("---");
		lblBefehln9 = new JLabel("---");
		lblBefehln10 = new JLabel("---");
		lblSpeicherinhalt = new JLabel("Speicherinhalt:");
		lblSp1 = new JLabel("500 + 501: " + Speicheradressen.getInstance().getS500());
		lblSp2 = new JLabel("502 + 503: " + Speicheradressen.getInstance().getS502());
		lblSp3 = new JLabel("504 + 505: " + Speicheradressen.getInstance().getS504());
		lblSp4 = new JLabel("506 + 507: " + Speicheradressen.getInstance().getS506());
		lblSp5 = new JLabel("508 + 509: " + Speicheradressen.getInstance().getS508());
		lblSp6 = new JLabel("510 + 511: " + Speicheradressen.getInstance().getS510());
		lblSp7 = new JLabel("512 + 513: " + Speicheradressen.getInstance().getS512());
		lblSp8 = new JLabel("514 + 515: " + Speicheradressen.getInstance().getS514());
		lblSp9 = new JLabel("516 + 517: " + Speicheradressen.getInstance().getS516());
		lblSp10 = new JLabel("518 + 519: " + Speicheradressen.getInstance().getS518());
		lblSp11 = new JLabel("520 + 521: " + Speicheradressen.getInstance().getS520());
		lblSp12 = new JLabel("522 + 523: " + Speicheradressen.getInstance().getS522());
		lblSp13 = new JLabel("524 + 525: " + Speicheradressen.getInstance().getS524());
		lblSp14 = new JLabel("526 + 527: " + Speicheradressen.getInstance().getS526());
		lblSp15 = new JLabel("528 + 529: " + Speicheradressen.getInstance().getS528());
		lblSp1B = new JLabel("00000000 00000000");
		lblSp2B = new JLabel("todo");
		lblSp3B = new JLabel("todo");
		lblSp4B = new JLabel("todo");
		lblSp5B = new JLabel("todo");
		lblSp6B = new JLabel("todo");
		lblSp7B = new JLabel("todo");
		lblSp8B = new JLabel("todo");
		lblSp9B = new JLabel("todo");
		lblSp10B = new JLabel("todo");
		lblSp11B = new JLabel("todo");
		lblSp12B = new JLabel("todo");
		lblSp13B = new JLabel("todo");
		lblSp14B = new JLabel("todo");
		lblSp15B = new JLabel("todo");

		lblVariableA = new JLabel("Variable a: ");
		lblVariableB = new JLabel("Variable b: ");
		txtVariableA = new JTextField(5);
		txtVariableA.setHorizontalAlignment(JTextField.RIGHT);
		txtVariableB = new JTextField(5);
		txtVariableB.setHorizontalAlignment(JTextField.RIGHT);

		lblVariableA.setLabelFor(txtVariableA);
		lblVariableB.setLabelFor(txtVariableB);



		//label.setFont(label.getFont().deriveFont(Font.BOLD));

		//Labels dem GUI hinzufügen:
		this.add(lblZehner);
		this.add(lblBinaer);
		this.add(lblBefehlszaehler);
		this.add(lblBefehlszaehlerI);
		this.add(lblBefehlsRegAdr);
		this.add(lblBefehlsRegAdrI);
		this.add(lblAktBefehl);
		this.add(lblAktBefehlI);
		this.add(lblAkku);
		this.add(lblAkkuI);
		this.add(lblAkkuIB);
		this.add(lblReg1);
		this.add(lblReg1I);
		this.add(lblReg1IB);
		this.add(lblReg2);
		this.add(lblReg2I);
		this.add(lblReg2IB);
		this.add(lblReg3);
		this.add(lblReg3I);
		this.add(lblReg3IB);
		this.add(lblcarryflag);
		this.add(lblcarryflagI);
		this.add(lblBefehlVor);
		this.add(lblBefehlu5);
		this.add(lblBefehlu4);
		this.add(lblBefehlu3);
		this.add(lblBefehlu2);
		this.add(lblBefehlu1);
		this.add(lblBefehlNach);
		this.add(lblBefehln1);
		this.add(lblBefehln2);
		this.add(lblBefehln3);
		this.add(lblBefehln4);
		this.add(lblBefehln5);
		this.add(lblBefehln6);
		this.add(lblBefehln7);
		this.add(lblBefehln8);
		this.add(lblBefehln9);
		this.add(lblBefehln10);
		this.add(lblSpeicherinhalt);
		this.add(lblSp1);
		this.add(lblSp2);
		this.add(lblSp3);
		this.add(lblSp4);
		this.add(lblSp5);
		this.add(lblSp6);
		this.add(lblSp7);
		this.add(lblSp8);
		this.add(lblSp9);
		this.add(lblSp10);
		this.add(lblSp11);
		this.add(lblSp12);
		this.add(lblSp13);
		this.add(lblSp14);
		this.add(lblSp15);
		this.add(lblSp1B);
		this.add(lblSp2B);
		this.add(lblSp3B);
		this.add(lblSp4B);
		this.add(lblSp5B);
		this.add(lblSp6B);
		this.add(lblSp7B);
		this.add(lblSp8B);
		this.add(lblSp9B);
		this.add(lblSp10B);
		this.add(lblSp11B);
		this.add(lblSp12B);
		this.add(lblSp13B);
		this.add(lblSp14B);
		this.add(lblSp15B);
		this.add(lblVariableA);
		this.add(lblVariableB);
		this.add(txtVariableA);
		this.add(txtVariableB);
		this.add(btnStart);
		this.add(btnStep);
		this.add(btnSlow);
		this.add(btnFast);
		this.add(btnClear);



		//Labels im GUI platzieren

		layout.putConstraint(SpringLayout.WEST, lblVariableA, 5, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, lblVariableA, 10, SpringLayout.NORTH, this);

		layout.putConstraint(SpringLayout.WEST, btnStart, 200, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, btnStart, 6, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, btnStep, 350, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, btnStep, 6, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, btnSlow, 450, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, btnSlow, 6, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, btnFast, 600, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, btnFast, 6, SpringLayout.NORTH, this);

		layout.putConstraint(SpringLayout.WEST, txtVariableA, 5, SpringLayout.EAST, lblVariableA);
		layout.putConstraint(SpringLayout.NORTH, txtVariableA, 8, SpringLayout.NORTH, this);

		layout.putConstraint(SpringLayout.WEST, lblVariableB, 5, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, lblVariableB, 12, SpringLayout.SOUTH, lblVariableA);

		layout.putConstraint(SpringLayout.WEST, txtVariableB, 5, SpringLayout.EAST, lblVariableA);
		layout.putConstraint(SpringLayout.NORTH, txtVariableB, 10, SpringLayout.SOUTH, lblVariableA);


		layout.putConstraint(SpringLayout.WEST, lblZehner, 5, SpringLayout.EAST, lblReg1);
		layout.putConstraint(SpringLayout.NORTH, lblZehner, 120, SpringLayout.NORTH, this);

		layout.putConstraint(SpringLayout.WEST, lblBinaer, 90, SpringLayout.EAST, lblReg1);
		layout.putConstraint(SpringLayout.NORTH, lblBinaer, 120, SpringLayout.NORTH, this);

		layout.putConstraint(SpringLayout.WEST, lblBefehlszaehler, 360, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, lblBefehlszaehler, 6, SpringLayout.SOUTH, lblZehner);
		layout.putConstraint(SpringLayout.WEST, lblBefehlszaehlerI, 7, SpringLayout.EAST, lblBefehlsRegAdr);
		layout.putConstraint(SpringLayout.NORTH, lblBefehlszaehlerI, 6, SpringLayout.SOUTH, lblZehner);

		layout.putConstraint(SpringLayout.WEST, lblBefehlsRegAdr, 360, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, lblBefehlsRegAdr, 8, SpringLayout.SOUTH, lblBefehlszaehler);
		layout.putConstraint(SpringLayout.WEST, lblBefehlsRegAdrI, 7, SpringLayout.EAST, lblBefehlsRegAdr);
		layout.putConstraint(SpringLayout.NORTH, lblBefehlsRegAdrI, 8, SpringLayout.SOUTH, lblBefehlszaehler);

		layout.putConstraint(SpringLayout.WEST, lblAkku, 5, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, lblAkku, 6, SpringLayout.SOUTH, lblZehner);
		layout.putConstraint(SpringLayout.WEST, lblAkkuI, 6, SpringLayout.EAST, lblReg1);
		layout.putConstraint(SpringLayout.NORTH, lblAkkuI, 6, SpringLayout.SOUTH, lblZehner);
		layout.putConstraint(SpringLayout.WEST, lblAkkuIB, 90, SpringLayout.EAST, lblReg1);
		layout.putConstraint(SpringLayout.NORTH, lblAkkuIB, 6, SpringLayout.SOUTH, lblZehner);

		layout.putConstraint(SpringLayout.WEST, lblReg1, 5, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, lblReg1, 6, SpringLayout.SOUTH, lblAkku);
		layout.putConstraint(SpringLayout.WEST, lblReg1I, 5, SpringLayout.EAST, lblReg1);
		layout.putConstraint(SpringLayout.NORTH, lblReg1I, 6, SpringLayout.SOUTH, lblAkku);
		layout.putConstraint(SpringLayout.WEST, lblReg1IB, 90, SpringLayout.EAST, lblReg1);
		layout.putConstraint(SpringLayout.NORTH, lblReg1IB, 6, SpringLayout.SOUTH, lblAkku);

		layout.putConstraint(SpringLayout.WEST, lblReg2, 5, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, lblReg2, 6, SpringLayout.SOUTH, lblReg1);
		layout.putConstraint(SpringLayout.WEST, lblReg2I, 5, SpringLayout.EAST, lblReg1);
		layout.putConstraint(SpringLayout.NORTH, lblReg2I, 6, SpringLayout.SOUTH, lblReg1);
		layout.putConstraint(SpringLayout.WEST, lblReg2IB, 90, SpringLayout.EAST, lblReg1);
		layout.putConstraint(SpringLayout.NORTH, lblReg2IB, 6, SpringLayout.SOUTH, lblReg1);

		layout.putConstraint(SpringLayout.WEST, lblReg3, 5, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, lblReg3, 6, SpringLayout.SOUTH, lblReg2);
		layout.putConstraint(SpringLayout.WEST, lblReg3I, 5, SpringLayout.EAST, lblReg1);
		layout.putConstraint(SpringLayout.NORTH, lblReg3I, 6, SpringLayout.SOUTH, lblReg2);
		layout.putConstraint(SpringLayout.WEST, lblReg3IB, 90, SpringLayout.EAST, lblReg1);
		layout.putConstraint(SpringLayout.NORTH, lblReg3IB, 6, SpringLayout.SOUTH, lblReg2);

		layout.putConstraint(SpringLayout.WEST, lblcarryflag, 5, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, lblcarryflag, 16, SpringLayout.SOUTH, lblReg3);
		layout.putConstraint(SpringLayout.WEST, lblcarryflagI, 5, SpringLayout.EAST, lblReg1);
		layout.putConstraint(SpringLayout.NORTH, lblcarryflagI, 16, SpringLayout.SOUTH, lblReg3);

		//ganze Befehlsliste mit den dazugehörigen Labels
		layout.putConstraint(SpringLayout.WEST, lblBefehlVor, 5, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, lblBefehlVor, 32, SpringLayout.SOUTH, lblcarryflag);

		layout.putConstraint(SpringLayout.WEST, lblBefehlu5, 7, SpringLayout.EAST, lblAktBefehl);
		layout.putConstraint(SpringLayout.NORTH, lblBefehlu5, 32, SpringLayout.SOUTH, lblcarryflag);
		layout.putConstraint(SpringLayout.WEST, lblBefehlu4, 7, SpringLayout.EAST, lblAktBefehl);
		layout.putConstraint(SpringLayout.NORTH, lblBefehlu4, 5, SpringLayout.SOUTH, lblBefehlu5);
		layout.putConstraint(SpringLayout.WEST, lblBefehlu3, 7, SpringLayout.EAST, lblAktBefehl);
		layout.putConstraint(SpringLayout.NORTH, lblBefehlu3, 5, SpringLayout.SOUTH, lblBefehlu4);
		layout.putConstraint(SpringLayout.WEST, lblBefehlu2, 7, SpringLayout.EAST, lblAktBefehl);
		layout.putConstraint(SpringLayout.NORTH, lblBefehlu2, 5, SpringLayout.SOUTH, lblBefehlu3);
		layout.putConstraint(SpringLayout.WEST, lblBefehlu1, 7, SpringLayout.EAST, lblAktBefehl);
		layout.putConstraint(SpringLayout.NORTH, lblBefehlu1, 5, SpringLayout.SOUTH, lblBefehlu2);

		layout.putConstraint(SpringLayout.WEST, lblAktBefehl, 7, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, lblAktBefehl, 5, SpringLayout.SOUTH, lblBefehlu1);
		layout.putConstraint(SpringLayout.WEST, lblAktBefehlI, 7, SpringLayout.EAST, lblAktBefehl);
		layout.putConstraint(SpringLayout.NORTH, lblAktBefehlI, 5, SpringLayout.SOUTH, lblBefehlu1);

		layout.putConstraint(SpringLayout.WEST, lblBefehlNach, 5, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, lblBefehlNach, 5, SpringLayout.SOUTH, lblAktBefehl);

		layout.putConstraint(SpringLayout.WEST, lblBefehln1, 7, SpringLayout.EAST, lblAktBefehl);
		layout.putConstraint(SpringLayout.NORTH, lblBefehln1, 5, SpringLayout.SOUTH, lblAktBefehl);
		layout.putConstraint(SpringLayout.WEST, lblBefehln2, 7, SpringLayout.EAST, lblAktBefehl);
		layout.putConstraint(SpringLayout.NORTH, lblBefehln2, 5, SpringLayout.SOUTH, lblBefehln1);
		layout.putConstraint(SpringLayout.WEST, lblBefehln3, 7, SpringLayout.EAST, lblAktBefehl);
		layout.putConstraint(SpringLayout.NORTH, lblBefehln3, 5, SpringLayout.SOUTH, lblBefehln2);
		layout.putConstraint(SpringLayout.WEST, lblBefehln4, 7, SpringLayout.EAST, lblAktBefehl);
		layout.putConstraint(SpringLayout.NORTH, lblBefehln4, 5, SpringLayout.SOUTH, lblBefehln3);
		layout.putConstraint(SpringLayout.WEST, lblBefehln5, 7, SpringLayout.EAST, lblAktBefehl);
		layout.putConstraint(SpringLayout.NORTH, lblBefehln5, 5, SpringLayout.SOUTH, lblBefehln4);
		layout.putConstraint(SpringLayout.WEST, lblBefehln6, 7, SpringLayout.EAST, lblAktBefehl);
		layout.putConstraint(SpringLayout.NORTH, lblBefehln6, 5, SpringLayout.SOUTH, lblBefehln5);
		layout.putConstraint(SpringLayout.WEST, lblBefehln7, 7, SpringLayout.EAST, lblAktBefehl);
		layout.putConstraint(SpringLayout.NORTH, lblBefehln7, 5, SpringLayout.SOUTH, lblBefehln6);
		layout.putConstraint(SpringLayout.WEST, lblBefehln8, 7, SpringLayout.EAST, lblAktBefehl);
		layout.putConstraint(SpringLayout.NORTH, lblBefehln8, 5, SpringLayout.SOUTH, lblBefehln7);
		layout.putConstraint(SpringLayout.WEST, lblBefehln9, 7, SpringLayout.EAST, lblAktBefehl);
		layout.putConstraint(SpringLayout.NORTH, lblBefehln9, 5, SpringLayout.SOUTH, lblBefehln8);
		layout.putConstraint(SpringLayout.WEST, lblBefehln10, 7, SpringLayout.EAST, lblAktBefehl);
		layout.putConstraint(SpringLayout.NORTH, lblBefehln10, 5, SpringLayout.SOUTH, lblBefehln9);


		layout.putConstraint(SpringLayout.WEST, lblSpeicherinhalt, 360, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, lblSpeicherinhalt, 32, SpringLayout.SOUTH, lblcarryflag);
		layout.putConstraint(SpringLayout.WEST, lblSp1, 7, SpringLayout.EAST, lblSpeicherinhalt);
		layout.putConstraint(SpringLayout.NORTH, lblSp1, 32, SpringLayout.SOUTH, lblcarryflag);
		layout.putConstraint(SpringLayout.WEST, lblSp1B, 150, SpringLayout.EAST, lblSpeicherinhalt);
		layout.putConstraint(SpringLayout.NORTH, lblSp1B, 32, SpringLayout.SOUTH, lblcarryflag);
		layout.putConstraint(SpringLayout.WEST, lblSp2, 7, SpringLayout.EAST, lblSpeicherinhalt);
		layout.putConstraint(SpringLayout.NORTH, lblSp2, 5, SpringLayout.SOUTH, lblSp1);
		layout.putConstraint(SpringLayout.WEST, lblSp2B, 150, SpringLayout.EAST, lblSpeicherinhalt);
		layout.putConstraint(SpringLayout.NORTH, lblSp2B, 5, SpringLayout.SOUTH, lblSp1);
		layout.putConstraint(SpringLayout.WEST, lblSp3, 7, SpringLayout.EAST, lblSpeicherinhalt);
		layout.putConstraint(SpringLayout.NORTH, lblSp3, 5, SpringLayout.SOUTH, lblSp2);
		layout.putConstraint(SpringLayout.WEST, lblSp3B, 150, SpringLayout.EAST, lblSpeicherinhalt);
		layout.putConstraint(SpringLayout.NORTH, lblSp3B, 5, SpringLayout.SOUTH, lblSp2);
		layout.putConstraint(SpringLayout.WEST, lblSp4, 7, SpringLayout.EAST, lblSpeicherinhalt);
		layout.putConstraint(SpringLayout.NORTH, lblSp4, 5, SpringLayout.SOUTH, lblSp3);
		layout.putConstraint(SpringLayout.WEST, lblSp4B, 150, SpringLayout.EAST, lblSpeicherinhalt);
		layout.putConstraint(SpringLayout.NORTH, lblSp4B, 5, SpringLayout.SOUTH, lblSp3);
		layout.putConstraint(SpringLayout.WEST, lblSp5, 7, SpringLayout.EAST, lblSpeicherinhalt);
		layout.putConstraint(SpringLayout.NORTH, lblSp5, 5, SpringLayout.SOUTH, lblSp4);
		layout.putConstraint(SpringLayout.WEST, lblSp5B, 150, SpringLayout.EAST, lblSpeicherinhalt);
		layout.putConstraint(SpringLayout.NORTH, lblSp5B, 5, SpringLayout.SOUTH, lblSp4);
		layout.putConstraint(SpringLayout.WEST, lblSp6, 7, SpringLayout.EAST, lblSpeicherinhalt);
		layout.putConstraint(SpringLayout.NORTH, lblSp6, 5, SpringLayout.SOUTH, lblSp5);
		layout.putConstraint(SpringLayout.WEST, lblSp6B, 150, SpringLayout.EAST, lblSpeicherinhalt);
		layout.putConstraint(SpringLayout.NORTH, lblSp6B, 5, SpringLayout.SOUTH, lblSp5);
		layout.putConstraint(SpringLayout.WEST, lblSp7, 7, SpringLayout.EAST, lblSpeicherinhalt);
		layout.putConstraint(SpringLayout.NORTH, lblSp7, 5, SpringLayout.SOUTH, lblSp6);
		layout.putConstraint(SpringLayout.WEST, lblSp7B, 150, SpringLayout.EAST, lblSpeicherinhalt);
		layout.putConstraint(SpringLayout.NORTH, lblSp7B, 5, SpringLayout.SOUTH, lblSp6);
		layout.putConstraint(SpringLayout.WEST, lblSp8, 7, SpringLayout.EAST, lblSpeicherinhalt);
		layout.putConstraint(SpringLayout.NORTH, lblSp8, 5, SpringLayout.SOUTH, lblSp7);
		layout.putConstraint(SpringLayout.WEST, lblSp8B, 150, SpringLayout.EAST, lblSpeicherinhalt);
		layout.putConstraint(SpringLayout.NORTH, lblSp8B, 5, SpringLayout.SOUTH, lblSp7);
		layout.putConstraint(SpringLayout.WEST, lblSp9, 7, SpringLayout.EAST, lblSpeicherinhalt);
		layout.putConstraint(SpringLayout.NORTH, lblSp9, 5, SpringLayout.SOUTH, lblSp8);
		layout.putConstraint(SpringLayout.WEST, lblSp9B, 150, SpringLayout.EAST, lblSpeicherinhalt);
		layout.putConstraint(SpringLayout.NORTH, lblSp9B, 5, SpringLayout.SOUTH, lblSp8);
		layout.putConstraint(SpringLayout.WEST, lblSp10, 7, SpringLayout.EAST, lblSpeicherinhalt);
		layout.putConstraint(SpringLayout.NORTH, lblSp10, 5, SpringLayout.SOUTH, lblSp9);
		layout.putConstraint(SpringLayout.WEST, lblSp10B, 150, SpringLayout.EAST, lblSpeicherinhalt);
		layout.putConstraint(SpringLayout.NORTH, lblSp10B, 5, SpringLayout.SOUTH, lblSp9);
		layout.putConstraint(SpringLayout.WEST, lblSp11, 7, SpringLayout.EAST, lblSpeicherinhalt);
		layout.putConstraint(SpringLayout.NORTH, lblSp11, 5, SpringLayout.SOUTH, lblSp10);
		layout.putConstraint(SpringLayout.WEST, lblSp11B, 150, SpringLayout.EAST, lblSpeicherinhalt);
		layout.putConstraint(SpringLayout.NORTH, lblSp11B, 5, SpringLayout.SOUTH, lblSp10);
		layout.putConstraint(SpringLayout.WEST, lblSp12, 7, SpringLayout.EAST, lblSpeicherinhalt);
		layout.putConstraint(SpringLayout.NORTH, lblSp12, 5, SpringLayout.SOUTH, lblSp11);
		layout.putConstraint(SpringLayout.WEST, lblSp12B, 150, SpringLayout.EAST, lblSpeicherinhalt);
		layout.putConstraint(SpringLayout.NORTH, lblSp12B, 5, SpringLayout.SOUTH, lblSp11);
		layout.putConstraint(SpringLayout.WEST, lblSp13, 7, SpringLayout.EAST, lblSpeicherinhalt);
		layout.putConstraint(SpringLayout.NORTH, lblSp13, 5, SpringLayout.SOUTH, lblSp12);
		layout.putConstraint(SpringLayout.WEST, lblSp13B, 150, SpringLayout.EAST, lblSpeicherinhalt);
		layout.putConstraint(SpringLayout.NORTH, lblSp13B, 5, SpringLayout.SOUTH, lblSp12);
		layout.putConstraint(SpringLayout.WEST, lblSp14, 7, SpringLayout.EAST, lblSpeicherinhalt);
		layout.putConstraint(SpringLayout.NORTH, lblSp14, 5, SpringLayout.SOUTH, lblSp13);
		layout.putConstraint(SpringLayout.WEST, lblSp14B, 150, SpringLayout.EAST, lblSpeicherinhalt);
		layout.putConstraint(SpringLayout.NORTH, lblSp14B, 5, SpringLayout.SOUTH, lblSp13);
		layout.putConstraint(SpringLayout.WEST, lblSp15, 7, SpringLayout.EAST, lblSpeicherinhalt);
		layout.putConstraint(SpringLayout.NORTH, lblSp15, 5, SpringLayout.SOUTH, lblSp14);
		layout.putConstraint(SpringLayout.WEST, lblSp15B, 150, SpringLayout.EAST, lblSpeicherinhalt);
		layout.putConstraint(SpringLayout.NORTH, lblSp15B, 5, SpringLayout.SOUTH, lblSp14);

		layout.putConstraint(SpringLayout.EAST, btnClear, -5, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.SOUTH, btnClear, -5, SpringLayout.SOUTH, this);

	}

	public void setStartposition(){
		Speicheradressen.getInstance().setS500(Integer.parseInt(txtVariableA.getText()));
		Speicheradressen.getInstance().setS502(Integer.parseInt(txtVariableB.getText()));
		Prozessorvariablen.getInstance().setBefehlszaehler(0);
		Befehlsadressen.getInstance().programmListe();
		Befehlsadressen.getInstance().setBefehlspointer(100);
	}

	public void refresh() {
		//Befehlshistory nachführen
		lblBefehlu5.setText(lblBefehlu4.getText());
		lblBefehlu4.setText(lblBefehlu3.getText());
		lblBefehlu3.setText(lblBefehlu2.getText());
		lblBefehlu2.setText(lblBefehlu1.getText());
		lblBefehlu1.setText(lblAktBefehlI.getText());

		int pointer = Befehlsadressen.getInstance().getBefehlspointer();
		lblBefehln1.setText(Befehlsadressen.getInstance().getBefehlsliste("" + (pointer + 2)));
		lblBefehln2.setText(Befehlsadressen.getInstance().getBefehlsliste("" + (pointer + 4)));
		lblBefehln3.setText(Befehlsadressen.getInstance().getBefehlsliste("" + (pointer + 6)));
		lblBefehln4.setText(Befehlsadressen.getInstance().getBefehlsliste("" + (pointer + 8)));
		lblBefehln5.setText(Befehlsadressen.getInstance().getBefehlsliste("" + (pointer + 10)));
		lblBefehln6.setText(Befehlsadressen.getInstance().getBefehlsliste("" + (pointer + 12)));
		lblBefehln7.setText(Befehlsadressen.getInstance().getBefehlsliste("" + (pointer + 14)));
		lblBefehln8.setText(Befehlsadressen.getInstance().getBefehlsliste("" + (pointer + 16)));
		lblBefehln9.setText(Befehlsadressen.getInstance().getBefehlsliste("" + (pointer + 18)));
		lblBefehln10.setText(Befehlsadressen.getInstance().getBefehlsliste("" + (pointer + 20)));

		//Labels neu anzeigen:
		lblBefehlszaehlerI.setText("" + Prozessorvariablen.getInstance().getBefehlszaehler());
		lblBefehlsRegAdrI.setText("" + Befehlsadressen.getInstance().getBefehlspointer());
		lblAktBefehlI.setText(Befehlsadressen.getInstance().getAktBefehl(Befehlsadressen.getInstance().getBefehlspointer()));
		lblAkkuI.setText("" + Prozessorvariablen.getInstance().getAkku());
		lblReg1I.setText("" + Prozessorvariablen.getInstance().getReg1());
		lblReg2I.setText("" + Prozessorvariablen.getInstance().getReg2());
		lblReg3I.setText("" + Prozessorvariablen.getInstance().getReg3());
		lblcarryflagI.setText("" + Prozessorvariablen.getInstance().getCarryflag());

		lblSp1.setText("500 + 501: " + Speicheradressen.getInstance().getS500());
		lblSp2.setText("502 + 503: " + Speicheradressen.getInstance().getS502());
		lblSp3.setText("504 + 505: " + Speicheradressen.getInstance().getS504());
		lblSp4.setText("506 + 507: " + Speicheradressen.getInstance().getS506());
		lblSp5.setText("508 + 509: " + Speicheradressen.getInstance().getS508());
		lblSp6.setText("510 + 511: " + Speicheradressen.getInstance().getS510());
		lblSp7.setText("512 + 513: " + Speicheradressen.getInstance().getS512());
		lblSp8.setText("514 + 515: " + Speicheradressen.getInstance().getS514());
		lblSp9.setText("516 + 517: " + Speicheradressen.getInstance().getS516());
		lblSp10.setText("518 + 519: " + Speicheradressen.getInstance().getS518());
		lblSp11.setText("520 + 521: " + Speicheradressen.getInstance().getS520());
		lblSp12.setText("522 + 523: " + Speicheradressen.getInstance().getS522());
		lblSp13.setText("524 + 525: " + Speicheradressen.getInstance().getS524());
		lblSp14.setText("526 + 527: " + Speicheradressen.getInstance().getS526());
		lblSp15.setText("528 + 529: " + Speicheradressen.getInstance().getS528());

		lblSp1B.setText(dezimalToBinary(Speicheradressen.getInstance().getS500()));
		lblSp2B.setText(dezimalToBinary(Speicheradressen.getInstance().getS502()));
		lblSp3B.setText("" + dezimalToBinary(Speicheradressen.getInstance().getS504()));
		lblSp4B.setText("" + Integer.toBinaryString(Speicheradressen.getInstance().getS506()));
		lblSp5B.setText("" + Integer.toBinaryString(Speicheradressen.getInstance().getS508()));
		lblSp6B.setText("" + Integer.toBinaryString(Speicheradressen.getInstance().getS510()));
		lblSp7B.setText("" + Integer.toBinaryString(Speicheradressen.getInstance().getS512()));
		lblSp8B.setText("" + Integer.toBinaryString(Speicheradressen.getInstance().getS514()));
		lblSp9B.setText("" + Integer.toBinaryString(Speicheradressen.getInstance().getS516()));
		lblSp10B.setText("" + Integer.toBinaryString(Speicheradressen.getInstance().getS518()));
		lblSp11B.setText("" + Integer.toBinaryString(Speicheradressen.getInstance().getS520()));
		lblSp12B.setText("" + Integer.toBinaryString(Speicheradressen.getInstance().getS522()));
		lblSp13B.setText("" + Integer.toBinaryString(Speicheradressen.getInstance().getS524()));
		lblSp14B.setText("" + Integer.toBinaryString(Speicheradressen.getInstance().getS526()));
		lblSp15B.setText("" + Integer.toBinaryString(Speicheradressen.getInstance().getS528()));






	}



	public void nextStep(){
		Befehlsadressen.getInstance().nextBefehl();
		Prozessorvariablen.getInstance().setBefehlszaehler(Prozessorvariablen.getInstance().getBefehlszaehler()+1);

	}


	public void popUpEnd(String ergebnis){

		JDialog programmEnde = new JDialog();
		FlowLayout layout = new FlowLayout();
		programmEnde.setLayout(layout);
		programmEnde.setTitle("Ende des Programms");
		programmEnde.setModal(true);
		JLabel text = new JLabel("Die Berechnung ist abgeschlossen!");
		JLabel zaehler = new JLabel("Anzahl Befehlsschritte: " + (Prozessorvariablen.getInstance().getBefehlszaehler()+1));
		JLabel resultat = new JLabel(ergebnis);
		programmEnde.add(text);
		programmEnde.add(resultat);
		programmEnde.add(zaehler);
		programmEnde.setBounds(400, 350, 280, 150);
		programmEnde.setVisible(true);
	}

	public void fastRun(){
		while(Befehlsadressen.getInstance().getBefehlspointer()!=148){
			nextStep();
		}
		nextStep();
	}



	public void slowRun(){
		while(Befehlsadressen.getInstance().getBefehlspointer()!=148){
			nextStep();
			refresh();	
		}
		pause();
	}


	public void pause() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("oops");
		}
	}

	public void bereinigen(){
		Prozessorvariablen.getInstance().setAkku(0);
		Prozessorvariablen.getInstance().setReg1(0);
		Prozessorvariablen.getInstance().setReg2(0);
		Prozessorvariablen.getInstance().setReg3(0);
		Prozessorvariablen.getInstance().setCarryflag(0);

		Speicheradressen.getInstance().setS500(0);
		Speicheradressen.getInstance().setS502(0);
		Speicheradressen.getInstance().setS504(0);
		Speicheradressen.getInstance().setS506(0);
		Speicheradressen.getInstance().setS508(0);
		Speicheradressen.getInstance().setS510(0);
		Speicheradressen.getInstance().setS512(0);
		Speicheradressen.getInstance().setS514(0);
		Speicheradressen.getInstance().setS516(0);
		Speicheradressen.getInstance().setS518(0);
		Speicheradressen.getInstance().setS520(0);
		Speicheradressen.getInstance().setS522(0);
		Speicheradressen.getInstance().setS524(0);
		Speicheradressen.getInstance().setS526(0);
		Speicheradressen.getInstance().setS528(0);

		txtVariableA.setText("");
		txtVariableB.setText("");

		lblBefehlu5.setText("---");
		lblBefehlu4.setText("---");
		lblBefehlu3.setText("---");
		lblBefehlu2.setText("---");
		lblBefehlu1.setText("---");

		lblBefehln1.setText("---");
		lblBefehln2.setText("---");
		lblBefehln3.setText("---");
		lblBefehln4.setText("---");
		lblBefehln5.setText("---");
		lblBefehln6.setText("---");
		lblBefehln7.setText("---");
		lblBefehln8.setText("---");
		lblBefehln9.setText("---");
		lblBefehln10.setText("---");

		//Labels neu anzeigen:
		lblBefehlszaehlerI.setText("0");
		lblBefehlsRegAdrI.setText("0");
		lblAktBefehlI.setText("---");
		lblAkkuI.setText("" + Prozessorvariablen.getInstance().getAkku());
		lblReg1I.setText("" + Prozessorvariablen.getInstance().getReg1());
		lblReg2I.setText("" + Prozessorvariablen.getInstance().getReg2());
		lblReg3I.setText("" + Prozessorvariablen.getInstance().getReg3());
		lblcarryflagI.setText("" + Prozessorvariablen.getInstance().getCarryflag());

		lblSp1.setText("500 + 501: " + Speicheradressen.getInstance().getS500());
		lblSp2.setText("502 + 503: " + Speicheradressen.getInstance().getS502());
		lblSp3.setText("504 + 505: " + Speicheradressen.getInstance().getS504());
		lblSp4.setText("506 + 507: " + Speicheradressen.getInstance().getS506());
		lblSp5.setText("508 + 509: " + Speicheradressen.getInstance().getS508());
		lblSp6.setText("510 + 511: " + Speicheradressen.getInstance().getS510());
		lblSp7.setText("512 + 513: " + Speicheradressen.getInstance().getS512());
		lblSp8.setText("514 + 515: " + Speicheradressen.getInstance().getS514());
		lblSp9.setText("516 + 517: " + Speicheradressen.getInstance().getS516());
		lblSp10.setText("518 + 519: " + Speicheradressen.getInstance().getS518());
		lblSp11.setText("520 + 521: " + Speicheradressen.getInstance().getS520());
		lblSp12.setText("522 + 523: " + Speicheradressen.getInstance().getS522());
		lblSp13.setText("524 + 525: " + Speicheradressen.getInstance().getS524());
		lblSp14.setText("526 + 527: " + Speicheradressen.getInstance().getS526());
		lblSp15.setText("528 + 529: " + Speicheradressen.getInstance().getS528());
	}


	public String dezimalToBinary(int a) {
		String binZahl="";

		if(a>=0){
			int z = 0;
			int[] bin = new int[16];
			for(int i = 0; i<16; i++){
				bin[i]= 0;
			}
			while (a > 0) {

				int b = a % 2;
				a = a / 2;
				bin[z] = b;
				z = z + 1;
			}
			for (int i = bin.length-1 ; i >= 0; i--) {

				binZahl=binZahl+bin[i];
			}
		}

		return binZahl;
	}
}
