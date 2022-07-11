package com.ankita.driver;
import java.util.Arrays;
import java.util.Scanner;
import com.ankita.service.*;
public class Driver {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		MergeSort mergeSort = new MergeSort();
		NotesCount notesCount = new NotesCount();
		System.out.println("Enter the total no of denominations");
		int totalNoOfDenominations = scanner.nextInt();
		
		int[] notes = new int[totalNoOfDenominations];
		
		System.out.println("Enter currency Denominations value");
		for(int i=0; i<totalNoOfDenominations; i++) {
			notes[i] = scanner.nextInt();
		}
	
		System.out.println("Enter the amount you want to pay");
		int amount = scanner.nextInt();
	
		mergeSort.sort(notes, 0, notes.length-1);
	
		System.out.println(Arrays.toString(notes));
		notesCount.notesCountImplementation(notes,  amount);
		
		scanner.close();
	}
}