public class getMaxSeeds {

	public static void main(String[] args) {
		int[] intArray = parseArgs(args);
		int maxSeeds = getMaxSeeds(intArray);
		System.out.println("maxSeeds = " + maxSeeds);
	}


	private static void printErrors() {
		System.err.println("Usage : java getMaxSeeds [size] [int array]");
		System.err.println("Example : java getMaxSeeds 3 2 5 1 4 6 3 8 2 5");
	}

	private static int[] parseArgs(String[] args) {
		int[] intArray = {42, 42};

		if (args.length == 1) {
			System.out.println(args[0]);
		}
		// if (args.length > 0 && args.length == (args[0] * args[0] + 1)) {
		// 	// On récupere le premier arg
		// 	// 	Sinon -> Usage :
		// 	// On vérifie le nombre total d'args = arg[0] x arg[0] + 1
		// 	// 	Sinon -> Usage :
		// 	// On parse et on crée le tableau d'int a envoyer a la fonction
		// 	// 	System.err.println("Please enter integers only as arguments");
		// 	// 	Sinon -> Usage :
		//
		// 	try {
		// 		int nb = Integer.parseInt(args[0]);
		// 	}
		// 	catch (NumberFormatException e) {
		// 		printErrors();
		// 	}
		// }
		// else {
		// 	printErrors();
		// }
		return (intArray);

	}

	public static int getMaxSeeds(int[] intArray) {

		int max = 0;
		return (max);
	}
}
