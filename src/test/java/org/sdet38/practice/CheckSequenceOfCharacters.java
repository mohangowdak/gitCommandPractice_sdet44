package org.sdet38.practice;

public class CheckSequenceOfCharacters {
//
	//input ---> xyzabc
	//output --> x.a
	//input ---> pqrslmnopqxyz
	//output --> p.l.x
	public static void main(String[] args) {
		String input="xyzabc";
		String output = checkWheatherStringInSequenceOfAlphabet(input);
		System.out.println(output);
	}

	private static String checkWheatherStringInSequenceOfAlphabet(String s) {
		int count=0;
		String output = "";
		
		for(int i=0;i<s.length()-1;i++) {
		int ch1=(int)s.charAt(i);
		int ch2=(int)s.charAt(i+1);
		
		if(ch2==(ch1+1)) {
			if(count==0)
			output=output+(char)ch1;
			count++;
		}
		else {
			output=output+".";
				count=0;
		}
		}
		return output;
	}

}
