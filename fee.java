// Java program to implement a GUI
// application for the student
// management system

import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.*;
// import javafx.print.Printer;
import java.io.*;
import java.io.IOException;

// Creating the fee class
public class fee extends Frame {

	JLabel l1, l2, l3, l4,
		l5, l6, l7, l8,
		l9, l10, l12, l13,
		l14, l11, l15;

	JTextField tf1, tf2, tf3,
		tf4, tf5, tf6,
		tf7, tf8, tf9,
		tf10;

	JTextArea area2, area1;

	JRadioButton rb1, rb2, rb3,
		rb4, rb5, rb6,
		rb7;

	JFileChooser f1;

	// Default constructor to
	// initialize the parameters
	fee()
	{

		l1 = new JLabel("MOHIT'S INN AND DINE");
		l1.setBounds(550, 100, 250, 20);

		l2 = new JLabel(
			"Cutsomer's Name:");
		l2.setBounds(50, 150, 250, 20);

		tf1 = new JTextField();
		tf1.setBounds(250, 150, 250, 20);

		l3 = new JLabel(
			"IN time:");
		l3.setBounds(50, 200, 250, 20);

		tf2 = new JTextField();
		tf2.setBounds(250, 200, 250, 20);

		l4 = new JLabel("OUT time:");
		l4.setBounds(50, 250, 250, 20);

		tf3 = new JTextField();
		tf3.setBounds(250, 250, 250, 20);

		l5 = new JLabel("Email ID:");
		l5.setBounds(50, 300, 250, 20);

		tf4 = new JTextField();
		tf4.setBounds(250, 300, 250, 20);

		l6 = new JLabel("Contact Number (+91):");
		l6.setBounds(50, 350, 250, 20);

		tf5 = new JTextField();
		tf5.setBounds(250, 350, 250, 20);

		l7 = new JLabel("Current Address :");
		l7.setBounds(50, 400, 250, 20);

		area1 = new JTextArea();
		area1.setBounds(250, 400, 250, 90);

		l9 = new JLabel("Gender:");
		l9.setBounds(50, 500, 250, 20);

		JRadioButton r5
			= new JRadioButton(" Male");
		JRadioButton r6
			= new JRadioButton(" Female");

		r5.setBounds(250, 500, 100, 30);
		r6.setBounds(350, 500, 100, 30);

		ButtonGroup bg = new ButtonGroup();
		bg.add(r5);
		bg.add(r6);

		l10 = new JLabel("Nationality:");
		l10.setBounds(50, 550, 250, 20);

		tf6 = new JTextField();
		tf6.setBounds(250, 550, 250, 20);

		l11 = new JLabel(
			"HOT DRINKS");
		l11.setBounds(50, 600, 250, 20);

		String language[]
			= { "TEA", "COFFEE", "CAPPUCHINO","NA" };

		final JComboBox cb1
			= new JComboBox(language);

		cb1.setBounds(250, 600, 90, 20);

		l12 = new JLabel(
			"COLD DRINKS");
		l12.setBounds(50, 650, 250, 20);

		String languagess[]
			= { "COKE", "COCKTAIL", "MOJITTO","NA" };

		l13 = new JLabel(
			"CHECK IN (IF):");
		l13.setBounds(50, 700, 250, 20);

		tf7 = new JTextField();
		tf7.setBounds(250, 700, 250, 20);

		l14 = new JLabel("CHECK OUT (IF):");
		l14.setBounds(50, 750, 250, 20);

		tf8 = new JTextField();
		tf8.setBounds(250, 750, 250, 20);

		ImageIcon i2 = new ImageIcon("2.png");
		JLabel l15
			= new JLabel("", i2, JLabel.CENTER);

		l15.setBounds(900, 50, 600, 200);

		final JComboBox cb2
			= new JComboBox(languagess);

		cb2.setBounds(250, 650, 90, 20);
		l8 = new JLabel(
			"MODE OF BOOKING:");
		l8.setBounds(800, 150, 250, 20);

		rb1 = new JRadioButton("Veg");
		rb1.setBounds(550, 150, 100, 30);

		rb2 = new JRadioButton("Non-veg");
		rb2.setBounds(650, 150, 100, 30);

		ButtonGroup bg1 = new ButtonGroup();

		bg1.add(rb1);
		bg1.add(rb2);

		rb3 = new JRadioButton("DINE ONLY");
		rb3.setBounds(550, 200, 100, 30);

		rb4 = new JRadioButton("DINE AND INN");
		rb4.setBounds(650, 200, 120, 30);

		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(rb3);
		bg2.add(rb4);

		String languages[]
			= { "WEBSITE", "AT HOTEL"
				 };
		final JComboBox cb
			= new JComboBox(languages);
		cb.setBounds(800, 200, 90, 20);

		final JLabel label
			= new JLabel();
		label.setBounds(600, 430, 500, 30);
		JButton b = new JButton("Show");
		b.setBounds(1000, 300, 80, 30);

		final DefaultListModel<String> li1
			= new DefaultListModel<>();

		li1.addElement("Combo(550)");
		li1.addElement("Paneer Thali(550)");
		li1.addElement("Mushroom Thali(550)");
		li1.addElement("Chicken Thali(550)");
		li1.addElement("Mutton Thali(550)");

		final JList<String> list1
			= new JList<>(li1);

		list1.setBounds(600, 300, 125, 125);

		DefaultListModel<String> li2
			= new DefaultListModel<>();

		li2.addElement(
			"SINGLE SHARING");
		li2.addElement(
			"");
		li2.addElement(
			"DOUBLE SHARING");
		li2.addElement(
			"ECONOMY LOUNGE");
		li2.addElement(
			"BUSINESS LOUNGE");

		final JList<String> list2
			= new JList<>(li2);
		list2.setBounds(
			800, 300, 125, 125);

		JButton Receipt
			= new JButton("Generate Receipt");
		Receipt.setBounds(600, 490, 150, 30);
		JButton b2 = new JButton("Reset");
		b2.setBounds(750, 490, 150, 30);
		JButton Print = new JButton("Print");
		Print.setBounds(900, 490, 150, 30);

		area2 = new JTextArea();
		area2.setEditable(false);
		area2.setBounds(600, 540, 450, 240);

		ImageIcon dp = new ImageIcon("a123.jpg");
    
        JLabel display=new JLabel("",dp,JLabel.CENTER);
        display.setBounds(0,0,1920,1080);

		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(l9);
		add(l10);
		add(l11);
		add(l12);
		add(l13);
		add(l14);
		add(tf1);
		add(tf2);
		add(tf3);
		add(tf4);
		add(tf5);
		add(tf6);
		add(tf7);
		add(tf8);
		add(area1);
		add(area2);
		add(l15);
		add(rb1);
		add(rb2);
		add(rb3);
		add(rb4);
		add(r5);
		add(r6);
		add(cb);
		add(cb1);
		add(cb2);
		add(list1);
		add(list2);
		add(b);
		add(label);
		add(Receipt);
		add(b2);
		add(Print);
		add(display);

		b.addActionListener(new ActionListener() {

			// Method to display the data
			// entered in the text fields
			public void actionPerformed(ActionEvent e)
			{
				String data = "";
				if (list1.getSelectedIndex() != -1) {
					data = "You had selected the MODE:"
						+ list1.getSelectedValue();
					label.setText(data);
				}
				if (list2.getSelectedIndex() != -1) {
					data += " and ROOM with the "
							+ "facility of: ";

					for (Object frame :
						list2.getSelectedValues()) {
						data += frame + " ";
					}
				}
				label.setText(data);
			}
		});

		// Reset the text fields
		b2.addActionListener(
			new ActionListener() {
				public void actionPerformed(
					ActionEvent e)
				{
					area2.setText("");
					area1.setText(" ");
					tf1.setText("");
					tf2.setText("");
					tf3.setText("");
					tf4.setText("");
					tf5.setText("");
					tf6.setText(" ");
				}
			});

		// Implementing the Print action
		Print.addActionListener(
			new ActionListener() {
				public void actionPerformed(
					ActionEvent e)
				{
					try {
						area2.print();
					}
					catch (java.awt.print
							.PrinterException a) {
						System.err.format(
							"NoPrinter Found",
							a.getMessage());
					}
				}
			});

		// Generating the receipt
		Receipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{

				area2.setText(
					"--------------------------------"
					+ "-----------FEE RECEIPT----"
					+ "--------------------------"
					+ "--------------------------"
					+ "-------------------\n");

				area2.setText(area2.getText()
							+ "CUSTOMER'S NAME: "
							+ tf1.getText()
							+ "\n");
				area2.setText(area2.getText()
							+ "IN TIME: "
							+ tf2.getText()
							+ "\n");
				area2.setText(area2.getText()
							+ "OUT TIME: "
							+ tf3.getText()
							+ "\n");
				area2.setText(area2.getText()
							+ "Email ID: "
							+ tf4.getText()
							+ "\n");
				area2.setText(area2.getText()
							+ "Contact Number: "
							+ tf5.getText()
							+ "\n");
				area2.setText(area2.getText()
							+ "MODE USED  "
							+ cb.getSelectedItem()
									.toString()
							+ "MODE"
							+ "\n");

				if (rb1.isSelected()) {
					area2.setText(area2.getText()
								+ "CHOICE IS "
								+ "VEG\t "
								+ "\n");
				}
				if (rb2.isSelected()) {
					area2.setText(area2.getText()
								+ "CHOICE IS "
								+ "NON-VEG "
								+ "\n");
				}
				if (rb3.isSelected()) {
					area2.setText(area2.getText()
								+ "The CUSTOMER is "
								+ "DINE ONLY \n");
				}
				if (rb4.isSelected()) {
					area2.setText(area2.getText()
								+ "The CUSTOMERis "
								+ "DINE AND INN\n");
				}
				area2.setText(area2.getText()
							+ "CHOICE: "
							+ list1.getSelectedValue()
									.toString()
							+ "\n");
				area2.setText(area2.getText()
							+ "CHOICE: "
							+ list2.getSelectedValue()
									.toString()
							+ "\n");

				int index2 = list2.getSelectedIndex();
				if (index2 == 0) {
					area2.setText(area2.getText()
								+ "	"
								+ "Total amount to be "
								+ "paid is 1000 \n");
				}

				if (index2 == 1) {
					area2.setText(area2.getText()
								+ "	"
								+ "Total amount to be paid "
								+ "is  1500 \n");
				}

				if (index2 == 2) {
					area2.setText(area2.getText()
								+ "	"
								+ "Total amount to be paid "
								+ "is 1000 \n");
				}

				if (index2 == 3) {
					area2.setText(area2.getText()
								+ "	"
								+ "Total amount to be paid "
								+ "is 2000  \n");
				}

				if (index2 == 4) {
					area2.setText(area2.getText()
								+ "	"
								+ "Total amount to be paid "
								+ "is 1500  \n");
				}

				if (e.getSource() == Receipt) {
					try {
						FileWriter fw
							= new FileWriter(
								"java.txt", true);
						fw.write(area2.getText());
						fw.close();
					}
					catch (Exception ae) {
						System.out.println(ae);
					}
				}

				JOptionPane.showMessageDialog(
					area2, "DATA SAVED SUCCESSFULLY");
			};
		});
      
	

		addWindowListener(
			new WindowAdapter() {
				public void windowClosing(
					WindowEvent we)
				{
					System.exit(0);
				}
			});
		setSize(800, 800);
		setLayout(null);
		setVisible(true);
		setBackground(Color.LIGHT_GRAY);
	}
	public static void main(String[] args)
	{
		new fee();
	}
}