import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class QuizC {
	static int current=0;  // normalde current 0 a esitti. simdi random yaptik.
	static  int counter=0;
	public static void main(String[] args) {
		JFrame f = new JFrame("Math Quiz");
		JLabel ques = new JLabel("Que1: Which one among these is not a primitive datatype?");
		JRadioButton a1 = new JRadioButton("A) int ");
		JRadioButton a2 = new JRadioButton("B) Float ");
		JRadioButton a3 = new JRadioButton("C) boolean ");
		JRadioButton a4 = new JRadioButton("D) char ");
		JButton next = new JButton("Next Question");
		JButton back = new JButton("Previous Question");
		ButtonGroup bg = new ButtonGroup();
		JButton result = new JButton ("Result");
		bg.add(a1); bg.add(a2);bg.add(a3);bg.add(a4);
		
		ques.setBounds(80, 40, 450, 20);
		a1.setBounds(80, 80, 150, 20);
		a2.setBounds(80, 120, 150, 20);
		a3.setBounds(80, 160, 150, 20);
		a4.setBounds(80, 200, 150, 20);
		next.setBounds(175, 240, 120, 30);
		back.setBounds(50, 240, 120, 30);
		result.setBounds(300, 240, 150, 30);

		f.add(result);f.add(next);f.add(a4);f.add(a3);
		f.add(a2); f.add(a1);f.add(ques); f.add(back);
		
		 next.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		
					if (e.getSource()==next) {
						if (control()) {
							counter++;
						}
	        			 System.out.println(counter);
						//Random r = new Random();
						//current=r.nextInt(10);
	        			current++;
						set();
						if(current==10) {
							next.setEnabled(false);
							result.setText("End of the Exam.");
							JOptionPane.showInternalMessageDialog(null, counter + " true answers \n" + (10-counter)+" wrong answers") ;
						}
	        		}else if(current!=0 && e.getSource()==back ) {
	        			current--;
	        			set();
	        		}
	        	}
	        	
	       
	        	
	        	void set() {
	        		if (current==1) {
	        			ques.setText("Que2: Which class is available to all the class automatically?");
	        			a1.setText("A)Swing");
	        			a2.setText("B)Applet");
	        			a3.setText("C)Object");
	        			a4.setText("D)ActionEvent");
	        		}
	        		if (current==2) {
	        			ques.setText("Que3: Which package is directly available to our class without importing it?");
	        			a1.setText("A)swing");
	        			a2.setText("B)applet");
	        			a3.setText("C)net");
	        			a4.setText("D)lang");
	        	  }
	        		if (current==3) {
	        			ques.setText("4) 10%3=?");
	        			a1.setText("A)3");
	        			a2.setText("B)7");
	        			a3.setText("C)5");
	        			a4.setText("D)1");
	        	  }
	        		if (current==4) {
	        			ques.setText("5) 10/(10%3)=?");
	        			a1.setText("A)10");
	        			a2.setText("B)1/3");
	        			a3.setText("C)1");
	        			a4.setText("D)5");
	        	  }
	        		if (current==5) {
	        			ques.setText("6) 2/2/2=?");
	        			a1.setText("A)1");
	        			a2.setText("B)1/2");
	        			a3.setText("C)2");
	        			a4.setText("D)4");
	        	  }
	        		if (current==6) {
	        			ques.setText("7) 3+5-|3-5|=?");
	        			a1.setText("A)3");
	        			a2.setText("B)7");
	        			a3.setText("C)5");
	        			a4.setText("D)6");
	        	  }
	        		if (current==7) {
	        			ques.setText("8) 3+5-|3-5|=?");
	        			a1.setText("A)3");
	        			a2.setText("B)7");
	        			a3.setText("C)5");
	        			a4.setText("D)6");
	        	  }
	        		if (current==8) {
	        			ques.setText("9) 3+5-|3-5|=?");
	        			a1.setText("A)3");
	        			a2.setText("B)7");
	        			a3.setText("C)5");
	        			a4.setText("D)6");
	        	  }
	        		if (current==9) {
	        			ques.setText("10) 3+5-|3-5|=?");
	        			a1.setText("A)3");
	        			a2.setText("B)7");
	        			a3.setText("C)5");
	        			a4.setText("D)6");
	        	  }
	        		bg.clearSelection();
	        	}
		 boolean control () {
			 if (current==0) {return (a1.isSelected());}
			 if (current==1) {return (a1.isSelected());}
			 if (current==2) {return (a1.isSelected());}
			 if (current==3) {return (a1.isSelected());}
			 if (current==4) {return (a1.isSelected());}
			 if (current==5) {return (a1.isSelected());}
			 if (current==6) {return (a1.isSelected());}
			 if (current==7) {return (a1.isSelected());}
			 if (current==8) {return (a1.isSelected());}
			 if (current==9) {return (a1.isSelected());}
			 return false;
			 
		 }
		 });
		 
		 result.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		JOptionPane.showMessageDialog(null, "Dogru Sayisi: " + counter);
	        	}});
		f.setLocation(500, 100);
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
	}

}
