import java.text.DecimalFormat;
import java.util.Scanner;

import javax.imageio.ImageTypeSpecifier;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		Scanner scanner = new Scanner(System.in);
		int n =scanner.nextInt(); 
			if(n>10) {
				System.out.println("It's a big number");
			} else{
				System.out.println("It's a small number");
			}
		int i =1;
		while (i<=10) {
		System.out.println(i+" Nasir");
		i++;
		
		
		int i;
		int counter = 0;
		for( i =1;i<=10;i++) {
			counter += i;
		}
		System.out.println(counter);
		/*
		int sum=0;
		for(int number=2;number<=100;number+=2)
	    sum+=number;
	   JOptionPane.showMessageDialog(null, "the sum is  " + sum," Sum Even integers from 2 to 100",JOptionPane.INFORMATION_MESSAGE);
	   System.exit(0);*/
			double amount,principal=1000.0,rate=0.5;
			DecimalFormat precisionTwo = new DecimalFormat("0.00");
			JTextArea outputTextArea = new JTextArea(11,20);
			outputTextArea.append("Year\tAmount on deposite\n");
				for(int year =1;year<=10;year++) {
					amount=principal*Math.pow(1.0+rate, year);
					outputTextArea.append(year + "\t" + precisionTwo.format(amount)+"\n");
				}
					JOptionPane.showMessageDialog(null, outputTextArea, "Compund Interest", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
	}

}
