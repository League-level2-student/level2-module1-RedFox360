package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	public static void main(String[] args) {
		new GuestBook().run();
	}

	JFrame f;
	JPanel p;
	JButton addButton, viewButton;
	ArrayList<String> names = new ArrayList<String>();
	public void run() {
		f = new JFrame();
		p = new JPanel();
		addButton = new JButton("Add Name");
		viewButton = new JButton("View Names");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.add(addButton);
		p.add(viewButton);
		f.add(p);
		f.pack();
		viewButton.addActionListener(this);
		addButton.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == addButton) {
			String n = JOptionPane.showInputDialog(f, "Enter in a name to add to the database.");
			names.add(n);
		}
		if(e.getSource() == viewButton) {
			String namesAsString = "";
			for (int i = 0; i < names.size(); i++) {
				namesAsString += "\r\nGuest #" + i + ": " + names.get(i);
			}
			JOptionPane.showMessageDialog(f, namesAsString);
			
		}
	}
}
