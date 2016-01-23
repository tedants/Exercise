package exer.sol;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter how many integers = ");
        int size = s.nextInt();
        System.out.println();
        int[] numbers = new int[size];
        for(int i = 0; i < size; i++){
            numbers[i] = s.nextInt();
            System.out.print(" ");
        }
        long sum = getSum(numbers);
        
        System.out.println("Sum = " + sum);
    }
    
    private static long getSum(int[] numbers){
        long sum = 0;
        for(int n:numbers){
            sum = sum + n;
        }
        return sum;
    }

}
