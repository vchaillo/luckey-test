public class luckey {

	public static void main(String[] args) {

		if (args.length == 1) {
			
			try {
				int nb = Integer.parseInt(args[0]);
				if (isPrime(nb)) {
					System.out.println(nb + " is Prime");
				}
				else {
					System.out.println(nb + " is not Prime");
				}
			}
			catch (NumberFormatException e) {
				System.err.println("Please enter a integer only as argument");
			}
		}
		else {
			System.err.println("usage : java isPrime [int]");
		}
	}

	public static boolean isPrime(int nb) {

		int x = 2;
		while (x < nb/2)
		{
			if ((nb % x) > 0) {
				x++;
			}
			else {
				return (false);
			}
		}
		return (true);
	}
}
