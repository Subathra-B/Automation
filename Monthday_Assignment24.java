package conditionalstatements;

public class Monthday_Assignment24 {
	public static void main(String[] args) {
		/*Print 1 to 365 if the number is in between 1 to 31 print january,
		if the number is in between 32 to 59 print February..upto December (365 days)*/
		
		for (int i = 1; i < 366; i++) {
			if (i >= 1 && i <= 31) {
				System.out.println(+i + " January " + " 2023");
			}
			if (i >= 32 && i <= 59) {
				System.out.println(+i + " February " + " 2023");
			}
			if (i >= 60 && i <= 90) {
				System.out.println(+i + " March " + " 2023");

			}

			if (i >= 91 && i <= 120) {
				System.out.println(+i + " April " + " 2023");

			}

			if (i >= 121 && i <= 151) {
				System.out.println(+i + " May " + " 2023");

			}

			if (i >= 152 && i <= 181) {
				System.out.println(+i + " June " + " 2023");

			}
			if (i >= 182 && i <= 212) {
				System.out.println(+i + " July " + " 2023");

			}

			if (i >= 213 && i <= 243) {
				System.out.println(+i + " August " + " 2023");

			}
			if (i >= 244 && i <= 273) {
				System.out.println(+i + " September " + " 2023");

			}

			if (i >= 274 && i <= 304) {
				System.out.println(+i + " October " + " 2023");

			}

			if (i >= 305 && i <= 334) {
				System.out.println(+i + " November " + " 2023");

			}

			if (i >= 335 && i <= 365) {
				System.out.println(+i + " December " + " 2023");

			}
		}
	}
}
