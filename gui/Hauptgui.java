package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

public class Hauptgui {

	private JFrame frame;
	private Container contentPane;

	public Hauptgui() {
		createFrame();
		createMenuBar();
	}

	private void createFrame() {
		frame = new JFrame("Turingmaschine");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = frame.getContentPane();
		contentPane.setLayout(new BorderLayout());

		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.addTab("Prozessor", new Prozessor_Gui());
//		tabbedPane.addTab("Programm", new Programm_Gui());

		contentPane.add(tabbedPane, BorderLayout.CENTER);

		frame.setSize(1200, 800);
		frame.setVisible(true);

	}

	private void createMenuBar() {
		JMenuBar bar = new JMenuBar();
		frame.setJMenuBar(bar);

		JMenu dateiMenu = new JMenu("Datei");
		bar.add(dateiMenu);

		JMenuItem oeffnenItem = new JMenuItem("Öffnen");
		dateiMenu.add(oeffnenItem);
		oeffnenItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.out.println("oeffnen-tu");
			}
		});

		JMenuItem beendenItem = new JMenuItem("Beenden");
		dateiMenu.add(beendenItem);
		beendenItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				beenden();
			}

		});

		JMenu hilfeMenu = new JMenu("Hilfe");
		bar.add(hilfeMenu);

		JMenuItem ueberItem = new JMenuItem("Über");
		hilfeMenu.add(ueberItem);
		ueberItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.out.println("Erzähl was über diese GUI");
			}
		});

	}

	protected void beenden() {
		int wertInt = JOptionPane.showConfirmDialog(null, "Wirklich beenden?",
				"Beenden", 2);
		if (wertInt == 0) {
			System.exit(0);
		}

	}
}
