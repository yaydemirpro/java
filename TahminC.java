import java.util.Random;

import javax.swing.JOptionPane;

public class TahminC {

	public static void main(String[] args) {
		
		Random r = new Random();
		int r1 =r.nextInt(20);
		System.out.println(r1);
		int counter = 1;
		
		while (true) {
			String guess = JOptionPane.showInputDialog("Guess a number");
			int t = Integer.parseInt(guess);
			if(t==r1) {
				JOptionPane.showMessageDialog(null, "Congratulations!");
				JOptionPane.showMessageDialog(null, "Congratulations! You found the number in "+counter+ " right(s)");
				break;
			}
			else if (r1<t) {
				JOptionPane.showMessageDialog(null, "Guess a smaller number");
				counter++;
			}
			else {
				JOptionPane.showMessageDialog(null, "Guess a bigger number");
				counter++;
			}
		}

	}

}
