package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import variablen.Prozessorvariablen;

public class Prozessor_Gui extends JPanel{

	private JLabel lblBefehlszaehler;
	private JLabel lblBefehlsRegAdr;
	private JLabel lblAktBefehl;	
	
	private JLabel lblAkku;
	private JLabel lblReg1;
	private JLabel lblReg2;
	private JLabel lblReg3;
	
	private JLabel lblcarryflag;
	

	public Prozessor_Gui(){

		SpringLayout layout = new SpringLayout();
		this.setLayout(layout);

		JButton btnStart = new JButton("Startposition");
		btnStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		
		JButton btnStep = new JButton("Step");
		btnStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		
		
		JButton btnSlow = new JButton("Slow-Modus");
		btnStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		
		
		JButton btnFast = new JButton("Fast-Modus");
		btnStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		
		//Texte für Labels setzen:
		lblBefehlszaehler = new JLabel("Befehlszähler: " + Prozessorvariablen.getInstance().getBefehlszaehler());
		lblAktBefehl = new JLabel("Aktueller Befehl: " + Prozessorvariablen.getInstance().getAktBefehl());
		lblAkku = new JLabel("Akku: " + Prozessorvariablen.getInstance().getAkku());
		lblReg1 = new JLabel("Register 1: " + Prozessorvariablen.getInstance().getReg1());
		lblReg2 = new JLabel("Register 2: " + Prozessorvariablen.getInstance().getReg2());
		lblReg3 = new JLabel("Register 3: " + Prozessorvariablen.getInstance().getReg3());
		
		
		
		//Labels dem Gui hinzufügen:
		this.add(lblBefehlszaehler);
		this.add(lblAktBefehl);
		this.add(lblAkku);
		this.add(lblReg1);
		this.add(lblReg2);
		this.add(lblReg3);
		
		layout.putConstraint(SpringLayout.WEST, lblAkku, 5, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, lblAkku, 20, SpringLayout.NORTH, this);
		
		layout.putConstraint(SpringLayout.WEST, lblReg1, 5, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, lblReg1, 8, SpringLayout.SOUTH, lblAkku);
		
		layout.putConstraint(SpringLayout.WEST, lblReg2, 5, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, lblReg2, 8, SpringLayout.SOUTH, lblReg1);
		
		layout.putConstraint(SpringLayout.WEST, lblReg3, 5, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, lblReg3, 8, SpringLayout.SOUTH, lblReg2);
		
		
		
	

//		private JLabel lblReg2;
//		private JLabel lblReg3;
//		
//		private JLabel lblcarryflag;
		
		

	}
}
