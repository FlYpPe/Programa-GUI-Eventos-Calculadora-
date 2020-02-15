import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


class Calculadora extends JFrame implements ActionListener{
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	public Calculadora() {
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Actividad");
		setSize(335, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JButton jb1 = new JButton("===");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.VERTICAL;
		gbl.setConstraints(jb1, gbc);
		add(jb1);
		
		JLabel lb1 = new JLabel("  ");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.VERTICAL;
		gbl.setConstraints(lb1, gbc);
		add(lb1);
		
		JLabel lb2 = new JLabel("Estandar");
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(lb2, gbc);
		add(lb2);
		
		JLabel lb3 = new JLabel("0");
		gbc.gridx = 4;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.VERTICAL;
		gbl.setConstraints(lb3, gbc);
		add(lb3);
		
		JButton jb2 = new JButton("MC");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb2, gbc);
		add(jb2);
		

		
		
		JButton jb4 = new JButton("MR");
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbl.setConstraints(jb4, gbc);
		add(jb4);
		
		JButton jb5 = new JButton("M+");
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbl.setConstraints(jb5, gbc);
		add(jb5);
		JButton jb6 = new JButton("M-");
		gbc.gridx = 3;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbl.setConstraints(jb6, gbc);
		add(jb6);
		JButton jb7 = new JButton("MS");
		gbc.gridx = 4;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb7, gbc);
		add(jb7);
		JButton jb8 = new JButton("M-");
		gbc.gridx = 5;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb8, gbc);
		add(jb8);
		
		JButton jb3 = new JButton("%");
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbl.setConstraints(jb3, gbc);
		add(jb3);
		JButton jb9 = new JButton("sqrt");
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb9, gbc);
		add(jb9);
		JButton jb10 = new JButton("x^2");
		gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb10, gbc);
		add(jb10);
		JButton jb11 = new JButton("1/x");
		gbc.gridx = 3;
		gbc.gridy = 3;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb11, gbc);
		add(jb11);
		
		
		JButton jb12 = new JButton("CE");
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb12, gbc);
		add(jb12);
		JButton jb13 = new JButton("C");
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb13, gbc);
		add(jb13);
		JButton jb14 = new JButton("DEL");
		gbc.gridx = 2;
		gbc.gridy = 4;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb14, gbc);
		add(jb14);
		JButton jb15 = new JButton("/");
		gbc.gridx = 3;
		gbc.gridy = 4;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb15, gbc);
		add(jb15);
		
		
		JButton jb16 = new JButton("7");
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb16, gbc);
		add(jb16);
		JButton jb17 = new JButton("8");
		gbc.gridx = 1;
		gbc.gridy = 5;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb17, gbc);
		add(jb17);
		JButton jb18 = new JButton("9");
		gbc.gridx = 2;
		gbc.gridy = 5;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb18, gbc);
		add(jb18);
		JButton jb19 = new JButton("*");
		gbc.gridx = 3;
		gbc.gridy = 5;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb19, gbc);
		add(jb19);
		
		
		JButton jb20 = new JButton("4");
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb20, gbc);
		add(jb20);
		JButton jb21 = new JButton("5");
		gbc.gridx = 1;
		gbc.gridy = 6;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb21, gbc);
		add(jb21);
		JButton jb22 = new JButton("6");
		gbc.gridx = 2;
		gbc.gridy = 6;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb22, gbc);
		add(jb22);
		JButton jb23 = new JButton("-");
		gbc.gridx = 3;
		gbc.gridy = 6;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb23, gbc);
		add(jb23);
		
		JButton jb24 = new JButton("1");
		gbc.gridx = 0;
		gbc.gridy = 7;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb24, gbc);
		add(jb24);
		JButton jb25 = new JButton("2");
		gbc.gridx = 1;
		gbc.gridy = 7;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb25, gbc);
		add(jb25);
		JButton jb26 = new JButton("3");
		gbc.gridx = 2;
		gbc.gridy = 7;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb26, gbc);
		add(jb26);
		JButton jb27 = new JButton("+");
		gbc.gridx = 3;
		gbc.gridy = 7;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb27, gbc);
		add(jb27);
		
		JButton jb28 = new JButton("+-");
		gbc.gridx = 0;
		gbc.gridy = 8;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb28, gbc);
		add(jb28);
		JButton jb29 = new JButton("0");
		gbc.gridx = 1;
		gbc.gridy = 8;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb29, gbc);
		add(jb29);
		JButton jb30 = new JButton(".");
		gbc.gridx = 2;
		gbc.gridy = 8;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb30, gbc);
		add(jb30);
		JButton jb31 = new JButton("=");
		gbc.gridx = 3;
		gbc.gridy = 8;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(jb31, gbc);
		add(jb31);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

public class PruebaCalculadora {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Calculadora();
			}
		});

	}

}
