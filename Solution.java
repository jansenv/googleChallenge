public class Solution {

	public static void main(String[] args) {
		
	}

    public static String solution(String s) {
	    String BigStringOfBrailleNums = "";

		for (int i = 0; i < s.length(); i++) {
		    
		    String BraileLetter = String.valueOf(s.charAt(i));
		    
		    if (BraileLetter.equals(" ")) {
		        BigStringOfBrailleNums += "000000";
		    } else if (BraileLetter.equals("A")) {
		        BigStringOfBrailleNums += "000001100000";
		    } else if (BraileLetter.equals("B")) {
		        BigStringOfBrailleNums += "000001110000";
		    } else if (BraileLetter.equals("C")) {
		        BigStringOfBrailleNums += "000001100100";
		    } else if (BraileLetter.equals("D")) {
		        BigStringOfBrailleNums += "000001100110";
		    } else if (BraileLetter.equals("E")) {
		        BigStringOfBrailleNums += "000001100010";
		    } else if (BraileLetter.equals("F")) {
		        BigStringOfBrailleNums += "000001110100";
		    } else if (BraileLetter.equals("G")) {
		        BigStringOfBrailleNums += "000001110110";
		    } else if (BraileLetter.equals("H")) {
		        BigStringOfBrailleNums += "000001110010";
		    } else if (BraileLetter.equals("I")) {
		        BigStringOfBrailleNums += "000001010100";
		    } else if (BraileLetter.equals("J")) {
		        BigStringOfBrailleNums += "000001010110";
		    } else if (BraileLetter.equals("K")) {
		        BigStringOfBrailleNums += "000001101000";
		    } else if (BraileLetter.equals("L")) {
		        BigStringOfBrailleNums += "000001111000";
		    } else if (BraileLetter.equals("M")) {
		        BigStringOfBrailleNums += "000001101100";
		    } else if (BraileLetter.equals("N")) {
		        BigStringOfBrailleNums += "000001101110";
		    } else if (BraileLetter.equals("O")) {
		        BigStringOfBrailleNums += "000001101010";
		    } else if (BraileLetter.equals("P")) {
		        BigStringOfBrailleNums += "000001111100";
		    } else if (BraileLetter.equals("Q")) {
		        BigStringOfBrailleNums += "000001111110";
		    } else if (BraileLetter.equals("R")) {
		        BigStringOfBrailleNums += "000001111010";
		    } else if (BraileLetter.equals("S")) {
		        BigStringOfBrailleNums += "000001011100";
		    } else if (BraileLetter.equals("T")) {
		        BigStringOfBrailleNums += "000001011110";
		    } else if (BraileLetter.equals("U")) {
		        BigStringOfBrailleNums += "000001101001";
		    } else if (BraileLetter.equals("V")) {
		        BigStringOfBrailleNums += "000001111001";
		    } else if (BraileLetter.equals("W")) {
		        BigStringOfBrailleNums += "000001010111";
		    } else if (BraileLetter.equals("X")) {
		        BigStringOfBrailleNums += "000001101101";
		    } else if (BraileLetter.equals("Y")) {
		        BigStringOfBrailleNums += "000001101111";
		    } else if (BraileLetter.equals("Z")) {
		        BigStringOfBrailleNums += "000001101011";
		    } else if (BraileLetter.equals("a")) {
		        BigStringOfBrailleNums += "100000";
		    } else if (BraileLetter.equals("b")) {
		        BigStringOfBrailleNums += "110000";
		    } else if (BraileLetter.equals("c")) {
		        BigStringOfBrailleNums += "100100";
		    } else if (BraileLetter.equals("d")) {
		        BigStringOfBrailleNums += "100110";
		    } else if (BraileLetter.equals("e")) {
		        BigStringOfBrailleNums += "100010";
		    } else if (BraileLetter.equals("f")) {
		        BigStringOfBrailleNums += "110100";
		    } else if (BraileLetter.equals("g")) {
		        BigStringOfBrailleNums += "110110";
		    } else if (BraileLetter.equals("h")) {
		        BigStringOfBrailleNums += "110010";
		    } else if (BraileLetter.equals("i")) {
		        BigStringOfBrailleNums += "010100";
		    } else if (BraileLetter.equals("j")) {
		        BigStringOfBrailleNums += "010110";
		    } else if (BraileLetter.equals("k")) {
		        BigStringOfBrailleNums += "101000";
		    } else if (BraileLetter.equals("l")) {
		        BigStringOfBrailleNums += "111000";
		    } else if (BraileLetter.equals("m")) {
		        BigStringOfBrailleNums += "101100";
		    } else if (BraileLetter.equals("n")) {
		        BigStringOfBrailleNums += "101110";
		    } else if (BraileLetter.equals("o")) {
		        BigStringOfBrailleNums += "101010";
		    } else if (BraileLetter.equals("p")) {
		        BigStringOfBrailleNums += "111100";
		    } else if (BraileLetter.equals("q")) {
		        BigStringOfBrailleNums += "111110";
		    } else if (BraileLetter.equals("r")) {
		        BigStringOfBrailleNums += "111010";
		    } else if (BraileLetter.equals("s")) {
		        BigStringOfBrailleNums += "011100";
		    } else if (BraileLetter.equals("t")) {
		        BigStringOfBrailleNums += "011110";
		    } else if (BraileLetter.equals("u")) {
		        BigStringOfBrailleNums += "101001";
		    } else if (BraileLetter.equals("v")) {
		        BigStringOfBrailleNums += "111001";
		    } else if (BraileLetter.equals("w")) {
		        BigStringOfBrailleNums += "010111";
		    } else if (BraileLetter.equals("x")) {
		        BigStringOfBrailleNums += "101101";
		    } else if (BraileLetter.equals("y")) {
		        BigStringOfBrailleNums += "101111";
		    } else if (BraileLetter.equals("z")) {
		        BigStringOfBrailleNums += "101011";
		    }
		}
        
		return BigStringOfBrailleNums;
    }
}