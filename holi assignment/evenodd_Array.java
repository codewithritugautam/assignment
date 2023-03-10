package Assignment2;

public class evenodd_Array { //class name
	    public static void main(String[] args) {
	    	//declare array
	        int[] arr={1,14,26,36,44,22,88,44};
	        int even=0, odd=0;
	        for (int i=0;i<arr.length;i++) {
	            if(arr[i] == 0 || arr[i] == 1 ) continue;
	            if(arr[i]%2 == 0){
	                even++;
	            }else{
	                odd++;
	            }
	        }
	        System.out.println(" element even: " + even);
	        System.out.println("element odd: " + odd);
	    }}
	