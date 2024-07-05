class Main {

    public static boolean isPalindrome(int x){

	if(x < 0){
	    return false;
	}

	int aux = x;
	int digit = 0;
	int reversed = 0;

	while(aux != 0){
	    digit = aux % 10;
	    aux = aux / 10;
	    reversed = reversed* 10 + digit;
	}

	if(x - reversed == 0){
	    return true;
	}

	return false;
    }
    
    public static void main(String[] args){

	System.out.println("009 Is Palindrome : 121, -121, 10");
	System.out.println(isPalindrome(121));
	System.out.println(isPalindrome(-121));
	System.out.println(isPalindrome(10));
	
    }
}
