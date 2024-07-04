import java.util.Arrays;

class Main {

    public static int[] TwoSum (int[] nums, int target) {
	int[] r = new int[2];
	for (int i = 0; i < nums.length-1; i++) {
	    for (int j = i + 1; j < nums.length; j++) {
		if (nums[i] + nums[j] == target) {
		    r[0] = i;
		    r[1] = j;
		    return r;
		}
	    }
	}
	return r;
    }
    
    public static void main (String[] args){
	System.out.println("Two Sum");

	int[] eg1 = {2,7,11,15};
	int tgt1 = 9;
	System.out.println(Arrays.toString(eg1));
	System.out.println(tgt1);
	System.out.println(Arrays.toString(TwoSum(eg1, tgt1)));
	
	int[] eg2 = {3,2,4};
	int tgt2 = 6;
	System.out.println(Arrays.toString(eg2));
	System.out.println(tgt2);
	System.out.println(Arrays.toString(TwoSum(eg2, tgt2)));

	int[] eg3 = {3,3};
	int tgt3 = 6;
	System.out.println(Arrays.toString(eg3));
	System.out.println(tgt3);
	System.out.println(Arrays.toString(TwoSum(eg2, tgt3)));
    }
}
