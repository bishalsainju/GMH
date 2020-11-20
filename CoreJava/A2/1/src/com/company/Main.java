package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] aa = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	    int[] bb = aa;

	    for (int i=0; i<10; i++) {
            System.out.print(aa[i] + " ");
        }
        System.out.println();

	    aa[2] = 19;
        for (int i=0; i<10; i++) {
            System.out.print(bb[i] + " ");
        }
        System.out.println();

    }
}

// The third element in the bb array also changes, this is because array basically points to the location of the first
// element int he array, and when we assign bb to aa, we basically assign the address of the first element of aa, and
// therefore if we try to print the elements of bb then we basically get the third element of aa.