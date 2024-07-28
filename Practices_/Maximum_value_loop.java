package com.Practices_;

public class Maximum_value_loop {

	//MAXIMUM VALUE FIND OUT
	
	public static void main(String[] args) {
		
	
	int [] asi = {1000,52,0,52,};
	int afi = asi[0];
	
	for (int value : asi) {
		if (value > afi) {                   //IF MINIMUM ,USE < LESS THAN .
			afi=value;
		}
	}
		System.out.println("max amount is :"+afi);
		
	}
}
	
	
	
	
	

