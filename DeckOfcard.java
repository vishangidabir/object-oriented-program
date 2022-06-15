package com.bridgelabz.oops;

public class DeckOfcard {
	public static void main(String[] args) {
		
		 String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[][] array = new String[4][13];

        //Intialize the deck
        int n = suits.length * ranks.length;
        String[] deck = new String[n];
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = ranks[i] + suits[j];
            }
        }

        //Shuffle the deck
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        //Print shuffle deck for 4 player each of 9 cards
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                array[i][j] = (deck[i + j * 4]);

            }
        }

        for (int i = 0; i < array.length; i++) {

            System.out.println(" Player: " + (i + 1));
            for (int j = 0; j < 9; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

    }

}

