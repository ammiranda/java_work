class FooCorporation {

	public static void legalWage(double wage) { // Function to verify if worker is being paid a legal wage
		if (wage < 8) {  // Checks if wage is under eight dollars an hour
			System.out.println("ERROR: Under State-Mandated Minimum Wage!"); // Outputs error message
		}
	}

	public static void illegalOvertime(double hoursWorked) {
		if (hoursWorked > 60) { // Checks if weekly hours worked exceeds sixty
			System.out.println("ERROR: Over Sixty Hours Worked");  // Outputs error message
		}
	}

	public static void wageCalculation(double wage, double hoursWorked) {
		double totalPay;  // Declared totalPay outside of if/else to avoid scoping issues
		if (hoursWorked > 40) { // Checks if hoursWorked exceeds forty hours and hence need to calculate overtime
			double hoursOverForty = hoursWorked - 40; // Find total number of hours over forty
			totalPay = 1.5 * wage * hoursOverForty + wage * 40; // Calculate total pay taking into account overtime hours
		}
		else {
			totalPay = wage * hoursWorked; // Compute wages normally
		}
		System.out.println(totalPay);  // Output string of weekly pay of given employee
	}

	public static void finalCalculation(double wage, double hoursWorked) {
		legalWage(wage);
		illegalOvertime(hoursWorked);
		wageCalculation(wage, hoursWorked);
	}

	public static void main(String[] args) {
		finalCalculation(7.5, 35);
		finalCalculation(8.20, 47);
		finalCalculation(10.0, 73);
	}
}