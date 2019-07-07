package amazon;

public class CalculateGCD { 
    public static int findGCD(int num1, int num2) 
    { 
        if (num1 == 0) 
            return num2; 
        return findGCD(num2 % num1, num1); 
    } 
  
    public static int generalizedGCD(int num, int[] arr)
    {
    	 int result = arr[0]; 
         for (int i = 1; i < num; i++) 
             result = findGCD(result,arr[i]); 
   
         return result; 
    }
    public static void main(String[] args) 
    { 
        int arr[] = { 4, 4, 6, 12,8, 10 }; 
        int n = arr.length; 
        System.out.println(generalizedGCD(n,arr)); 
    } 
} 