import java.util.HashMap;

class Main{

    public static int romanToInt(String s){
	HashMap<Character, Integer> RomanValues = new HashMap<Character, Integer>();
	RomanValues.put('I', 1);
	RomanValues.put('V', 5);
	RomanValues.put('X', 10);
	RomanValues.put('L', 50);
	RomanValues.put('C', 100);
	RomanValues.put('D', 500);
	RomanValues.put('M', 1000);

	int total = 0;
	int prevValue = 0;

	for(int i = s.length() - 1; i >= 0; i--){
	    int value = RomanValues.get(s.charAt(i));

	    if(value < prevValue){
		total = total - value;
	    } else {
		total = total + value;
	    }
	    prevValue = value;
	     
	}

	return total;
		
    }
    
    public static void main(String[] args){
	System.out.println("013 Roman to Integer : III, LVIII, MCMXCIV");
	String s1 = "III";
	String s2 = "LVIII";
	String s3 = "MCMXCIV";
	System.out.println(romanToInt(s1));
	System.out.println(romanToInt(s2));
	System.out.println(romanToInt(s3));
    }
}
