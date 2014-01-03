class FooCorporation {

	public static void wageCalculation(double wage, double hoursWorked) {

		double totalPay;  // Declared totalPay outside of if/else to avoid scoping issues

		if (wage < 8) {
			System.out.println("ERROR: Under State-Mandated Minimum Wage!");
		}
		else if (hoursWorked > 60) {
			System.out.println("ERROR: Over Sixty Hours Worked");
		}
		else {
			if (hoursWorked > 40) { // Checks if hoursWorked exceeds forty hours and hence need to calculate overtime
				double hoursOverForty = hoursWorked - 40; // Find total number of hours over forty
				totalPay = 1.5 * wage * hoursOverForty + wage * 40; // Calculate total pay taking into account overtime hours
			}
			else {
				totalPay = wage * hoursWorked; // Compute wages normally
			}
			System.out.println(totalPay);  // Output string of weekly pay of given employee
		}
	}

	public static void finalCalculation(double wage, double hoursWorked) {
		wageCalculation(wage, hoursWorked);
	}

	public static void main(String[] args) {
		finalCalculation(7.5, 35);
		finalCalculation(8.20, 47);
		finalCalculation(10.0, 73);
	}
}