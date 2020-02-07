class OpeningClosingLockers {
	public static void main(String[] args) {
		boolean[] lockers = getLockers(101);

		for (int i = 1; i < lockers.length; i++) {
			for (int j = i; j < lockers.length; j += i) {
					lockers[j] = !lockers[j];
			}
		}

		for (int i = 1; i < lockers.length; i++) {
			if (lockers[i]) {
				System.out.println("locker " + i + " is open");
			}
		}
	}

	public static boolean[] getLockers(int n) {
			return new boolean[n];
	}
}