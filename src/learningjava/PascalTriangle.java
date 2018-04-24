package learningjava;

public class PascalTriangle {

		public static void triangle(int row) {
			int r, num;
			for (int i = 0; i <= row; i++) {
				num = 1;
				r = i + 1;
				for(int j=1;j<=row-i;j++)
				{
					System.out.print(" ");	
				}
				for (int col = 0; col <= i; col++) {
					if (col > 0) {
						num = num * (r - col) / col;    
					}
					System.out.print(num + " ");
				}
				System.out.println();
			}
		}

		public static void main(String[] args) {
			triangle(5);
		}
	}

