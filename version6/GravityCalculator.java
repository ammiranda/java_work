class GravityCalculator {
	public static void main(String[] args) {
		double gravity = -9.81; // The acceleration due to Earth's gravity in m/s^2
		double initialVelocity = 0.0;
		double fallingTime = 10.0; // in seconds
		// Both initialPosition and finalPostion are in meters
		double initialPosition = 0.0;
		double finalPostion = 0.5 * gravity * (fallingTime * fallingTime) + initialVelocity * fallingTime + initialPosition;
		System.out.println("The object's position after "  + fallingTime + " seconds is " + finalPostion + "m.");
	}
}