package _01_IntroToArrayLists;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements MouseListener {
	static JButton addname = new JButton();
	static JButton viewname = new JButton();

	ArrayList<String> Guestbook = new ArrayList<String>();
	
	public static void main(String[] args) {
		// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
		// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
		// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
		// all the names added to the list. Format the list as follows:
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		addname.setText("Add Name");
		viewname.setText("View Names");
		panel.add(viewname);
		panel.add(addname);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		GuestBook g = new GuestBook();
		g.guestBook();
		
		// Guest #1: Bob Banders
		
		// Guest #2: Sandy Summers
		// Guest #3: Greg Ganders
		// Guest #4: Donny Doners
	}
	void guestBook (){
	viewname.addMouseListener(this);
	addname.addMouseListener(this);
}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
	
		JButton ButtonPressed = (JButton) e.getSource();
		String a = null;
		// TODO Auto-generated method stub
if (ButtonPressed== addname) {
	
	String g = JOptionPane.showInputDialog("Enter a name");
	System.out.println(g);
Guestbook.add(g);
}
else if (ButtonPressed==viewname) {

	for (int i = 0; i <Guestbook.size(); i++) {
		a=a+"Guest# :"+(i+1)+"Guest# :"+(i+1)+ 
				Guestbook.get(i);
	}
	JOptionPane.showMessageDialog(null, a);}
}		
	
	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}}