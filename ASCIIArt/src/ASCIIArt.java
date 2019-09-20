public class ASCIIArt {

	public static void main(String[] args) {
		star();
		smallStar();
		System.out.print("*");
		smallStar();
		horizontalEars();
		verticalEars();
		verticalEars();
		face();
		body();
		legs();
		legs();
		feet();
	}

	public static void star() {
		System.out.println(" *   *    *   /\\   *   *");
		System.out.println("   *    *   <    >   *");
		System.out.println(" *   *   *   \\/\\/  *    *");
	}

	public static void smallStar() {
		System.out.println("  *   *    *    *    *  ");
	}

	public static void horizontalEars() {
		System.out.print("  +--+");
		System.out.print(" ");
		System.out.print("+--+\n");
	}

	public static void verticalEars() {
		System.out.print("  |  |");
		System.out.print(" ");
		System.out.print("|  |\n");
	}

	public static void face() {
		System.out.println(" _|  |_|  |_       ________________________");
		System.out.println("|           |     <\"wow look at the stars!\"> ");
		System.out.println("|   > - <   |    / ------------------------");
		System.out.println("| \"   ~   \" |   /");
		System.out.println("|  _     _  |");
		System.out.println("|_| |_ _| |_|");
	}

	public static void body() {
		System.out.println("  |_|   |_| ");
		System.out.println("    |_____|O");
	}

	public static void legs() {
		System.out.println("      |  |");
	}

	public static void feet() {
		System.out.print("     _| _|");
	}
}
