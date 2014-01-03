class FooCorporation {

	public static void legalWage(double wage) { // Function to verify if worker is being paid a legal wage
		if (wage < 8) {
			System.out.println("Under minimum wage!");
		}
	}

	public static void illegalOvertime(double hoursWorked) {
		if (hoursWorked > 60) {
			System.out.println("Illegal overtime!");
		}
	}

	public static void wageCalculation(double wage, double hoursWorked) {

	}

	public static void finalCalculation(double wage, double hoursWorked) {
		legalWage(wage);
		illegalOvertime(hoursWorked);
	}

	public static void main(String[] args) {
		finalCalculation(7.5, 35);
		finalCalculation(8.20, 47);
		finalCalculation(10.0, 73);
	}
}