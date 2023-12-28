package lottery;





import java.util.Arrays;

import java.util.Currency;

import java.util.Random;

import java.util.Scanner;



public class Lottery {



    private final int[] winningNumbers = new int[5];

    private int[] customerNumbers;



    public void run() {

        initializeWinningNumbers();

        setCostumerNumbers();

        printWinningAndCustomerNumbersTable();

        checkWinnings();



    }



    private void initializeWinningNumbers() {

        Random random = new Random();



        int i=0;

        while (i < winningNumbers.length) {

            int randomNumber = random.nextInt(50) +1;



            if (!isThisNumberPresentInArray(randomNumber, winningNumbers)) {

                winningNumbers[i] = randomNumber;

                i++;

            }



        }

//        for (int i = 0; i < winningNumbers.length; i++) {

//            winningNumbers[i] = random.nextInt(1, 51);

//        }

    }



    private void setCostumerNumbers() {

        Scanner scanner = new Scanner(System.in);

        int[] customerNumbers = new int[5];

        System.out.println("Insert your lucky number");

        for (int i = 0; i < customerNumbers.length; i++) {

            System.out.print((i + 1) + " number: ");

            customerNumbers[i] = scanner.nextInt();



        }

        this.customerNumbers = customerNumbers;

    }



    private void printWinningAndCustomerNumbersTable() {

        System.out.println("Winning numbers : Customer numbers");

        for (int i = 0; i < customerNumbers.length; i++) {

            System.out.println(winningNumbers[i] + "           " + customerNumbers[i]);

        }

    }



    private void checkWinnings() {

        int count = 0;



        for (int customerNumber : customerNumbers) {

            if (isThisNumberPresentInArray(customerNumber, winningNumbers)) {

                count++;

            }

        }



        if (count >= 3) {

            System.out.println("Congratulation, you won");

        } else {

            System.out.println("Try again");

        }

    }



    private void printWinningAndCustomNumbers() {

        System.out.println("Winning numbers: " + Arrays.toString(winningNumbers));

        System.out.println("Customer numbers: " + Arrays.toString(customerNumbers));



    }



    private boolean isThisNumberPresentInArray(int targetNumber, int[] array) {

        for (int currentNumber : array) {

            if (currentNumber == targetNumber) {

                return true;

            }

        }

        return false;

    }



}