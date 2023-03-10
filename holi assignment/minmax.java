package Assignment2;

public class minmax { //main class
	    public static void main(String[] args) {
	        int[] arr = {1,3,5,6,8}; //create matrix
	        int max = Integer.MIN_VALUE;
	        int min = Integer.MAX_VALUE;
	        for (int i=1;i<arr.length;i++) {
	            if (arr[i]>arr[i-1])max=arr[i];
	            if(arr[i]<arr[i-1])min=arr[i];
	        }
	        System.out.println("maximum:"+ max);
	        System.out.println("minimum:"+ min);
	    }
	}

