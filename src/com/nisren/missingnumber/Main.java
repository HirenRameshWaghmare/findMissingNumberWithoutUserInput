package com.nisren.missingnumber;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int[] numberArray = {1,2,3,4,5,7,8,9,10};
        main.findMissingNumber(numberArray);

    }

    public void findMissingNumber(int[] numberArray){
        int sumOfGivenNumbers = 0;
        int sumOfAllNumbers = 0;
        for(int i: numberArray){
            sumOfGivenNumbers += i;
        }
        //formula:-     N(N+1)/2
        sumOfAllNumbers = 10*(10+1)/2;
        int missingNumber = sumOfAllNumbers - sumOfGivenNumbers;
        System.out.println("The missing number is: "+missingNumber);
    }
}
