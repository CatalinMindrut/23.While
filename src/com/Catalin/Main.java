package com.Catalin;

public class Main {


    public static void main(String[] args) {
        /** The while loop check the condition at the start before executing the block.
         * With the do while loop, the code block is executed at least once and then the condition
         * is checked.
         * With the continue keyword the loop will bypass the part of the code block that is below the
         * continue keyword and continue with the next iteration.
         * With the break keyword we can exit the loop depending on the condition that we are checking.
         */
        ///////////Challenge
//        int number = 4;
//        int finishNumber = 20;
//
//        while(number <= finishNumber){
//            number++;
//            if(!isEvenNumber(number)){
//                continue;
//            }
//            System.out.println("Even number " + number);
//        }
        /** The loop will start from 5 because the increment is positioned immediately under the
         * first condition.
         * The "continue" keyword will force Java to continue looping instead of executing the rest
         * of the code when an uneven number is found.
         * So in the above example, the loop verifies the while condition and even if the "if"
         * condition is no longer met, the loop will continue instead of breaking out.
         */
        System.out.println("***************");

        int number = 4;
        int finishNumber = 20;
        int total = 0;

        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
            /** The print out was moved up here. If it was left below the if statement,
             * the code would have missed the last even number printout, because the code
             * will break immediately after the total becomes equal to 5 so it will never reach
             * the last print out.
             * The result would be:
             * Even number 6
             * Even number 8
             * Even number 10
             * Even number 12
             * 5 even numbers were found.
             * The last line says that 5 numbers were found but only 4 were printed.
             */
            total++;
            if(total >= 5){
                break;
            }
//            System.out.println("Even number " + number);
        }
        System.out.println(total + " even numbers were found.");
        System.out.println("***************");

        //Second Challenge
        //Modify the while code above
        //Make it also record the total number of even numbers it has found
        //and break once 5 are found
        //and at the end, display the total number of even numbers found.

        ////////////////////////////////
        /** Compared to a "for" loop, the "while" loop has the initialization, condition and incrementation
         * stated on different lines:
         */
        int count = 1; //init
        while (count != 6) { //condition
            System.out.println("Count value is " + count);
            count++; //increment
        }
        /** The above "while" loop is equal to the "for" loop below.
         */
        for (count = 1; count < 6; count++) {
            //init // condition //increment
            System.out.println("Count value is " + count);
        }
        /** The "while" statement can also be written like this:
         */
        count = 1; //required to reset the count to 1 because of the above code
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }
        /** The "do while" statement is guaranteed to run the code at least once.
         */
        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
//            A break can also be included in the "do while" loop:
//            if(count > 100){
//                break;
//            }
        } while (count != 6);

        /////////////////////
        //Continue usage example:
        int value = 0;
        while(value < 15) {
            number++;
            if (value <= 5) {
                System.out.println("Skipping value " + value);
                continue;
            }

            System.out.println("Value = " + value);

            if(value >= 10){
                System.out.println("Breaking at " + value);
                break;
            }
        }
    }

    //Challenge
    //Create a method called isEvenNumber that takes a parameter of type int
    //Its purpose is to determine if the argument passed to the method is an even number or not
    //Return true if an even number is found, otherwise return false.

    public static boolean isEvenNumber(int number){
        if(number % 2 == 0){
//            System.out.println(number + " is an even number.");
            return true;
        }
//        System.out.println(number + " is not an even number.");
        return false;
    }
}
