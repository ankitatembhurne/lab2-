package com.ankita.service;

public class TransactionTargetAlgo {
	public void processTransactions(int[] prefixSum, int target) {

        int flag = 0;
        for (int i=0; i<prefixSum.length; i++) { //linear iteration, linear searching
            
            if(prefixSum[i] >= target) {
            	System.out.println("Target achieved after "+(i+1) +" transactions ");
            	flag = 1;
            	break;
            }
        }
		
        if(flag == 0) {
        	System.out.println("Given target is not achieved ");
        }
	}
}