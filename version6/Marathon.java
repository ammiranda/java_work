class Marathon { 

public static void main (String[] arguments){

	 String[] names = {  // Array of runners' names

		"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",

		"Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",

		"Aaron", "Kate"

	}; 

	int[] times = { // Corresponding times for each runner in the marathon

		341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,

		343, 317, 265

	}; 

	int bestTime = 1000;  // Arbitruarily large initial value for bestTime
	String bestRunner = ""; // Initialize bestRunner as empty string

	for (int i = 0; i < names.length; i++) {  // For loop that iterates through the runner array

		if (times[i] < bestTime) {  // Checks if array element time is less than current stored bestTime

			bestTime = times[i];  // Assigns bestTime to take current times array element
			bestRunner = names[i]; // Assigns bestRunner to name of current lowest time runner

		}

		System.out.println(names[i] + ": " + times[i]);  // Outputs runners' names and times
		}
		System.out.println("The fastest runner is " + bestRunner + " at " + bestTime + " minutes.");
	}
}