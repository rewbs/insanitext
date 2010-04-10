package org.soal.insanitiser;

import java.util.Random;


public class Insanitiser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this. I've just learned about diacritical marks, and I can't help but make my text look insane, like this.";
		Random r = new Random();
		
		
		
		double[] probabilities = new double[10];
		
		StringBuilder sb = new StringBuilder(s.length());
		for (char c : s.toCharArray()) {
			sb.append(c);
			
			probabilities[0] += 0.01;
			for (int i=0; i<probabilities.length; i++) {
				if (r.nextDouble() < probabilities[i]) {
					char marker = (char) (0x300 + (0xf*i) + r.nextInt(0xf));
					sb.append(marker);
					probabilities[i] += 0.005d;
					probabilities[(i+1)%probabilities.length] += 0.001d;
				}
				 
			}
		}
		
		System.out.println(sb.toString());
		
		

	}

}

