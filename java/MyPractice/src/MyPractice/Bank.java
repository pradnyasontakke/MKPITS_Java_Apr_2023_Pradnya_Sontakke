package MyPractice;

/**
 *
 */
abstract class Bank {

    /**
     * The below is the algorithm to implemente
     * 1. Iterate through the array starting from the first element
     * 2. Pick every 3rd element
     * 3. Calculate the square of the 3rd element picked and assign it to a variable
     * 4. Move on with the array iteration and pick the next 3rd element from the current position
     * 5. Follow step 2 - 4 and add it to the previous suqare calculated
     */
        //step1: define abstract class

    /**
     *
     * @param abs -
     * @return String
     */
        abstract String checkBalance(String abs);                        //step2:abstract method

    public void showAccount(){                             //step3:concrete method,simple method
            System.out.println("show the account Details");    //step4: define
        }
    }
    abstract class Bank1 extends Bank {                         //step5:inherit abstract class
    //:override abstract method,
        public abstract void checkBalance();                 //step6:method override from 1,public-show yellow so write
    }
