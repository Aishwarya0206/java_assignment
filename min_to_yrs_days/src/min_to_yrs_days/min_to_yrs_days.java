package min_to_yrs_days;

import java.util.Scanner;


class min_to_yrs_days {
	
	static int min_to_yrs(int min, int mins){
		return(min/mins);
	}

	static int min_to_days(int min, int mins) {
		return(min/60/24)%365; 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minutes;
		int mins_in_yr = 60*24*365;
		System.out.print("Enter the minutes to be converted : ");
		Scanner s = new Scanner(System.in);
		minutes = s.nextInt();
		System.out.println(minutes+" minutes is approximately "+min_to_yrs(minutes,mins_in_yr)+" years and "+min_to_days(minutes,mins_in_yr)+" days");
	}

}
