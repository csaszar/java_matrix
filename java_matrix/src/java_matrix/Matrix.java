package java_matrix;

public class Matrix {

	public static void main(String[] args) {
		
		int szamlalo = 0;
		
		String[][] matrixEgy = new String[5][10];
		
		
		// a mátrix feltöltése
		for( int i = 0; i < matrixEgy.length; i++) {
			for( int y = 0; y < matrixEgy[i].length; y++) {
				matrixEgy[i][y] = ""+szamlalo;
				szamlalo++;
			};
		};

		
		// a mátrix megfordítása
		String[] matrixEgyResz = new String[matrixEgy.length];
		for( int i = 0; i < (matrixEgy.length); i++) {
			matrixEgyResz[i] = matrixEgy[i][0];
		};
		
		
		// a mátrix kiíratása
		for(int i = 0; i < matrixEgy.length; i++) {
			for( int y = 0; y < matrixEgy[i].length; y++ ) {
				System.out.print(matrixEgy[i][y] + " " + matrixEgyResz[i] + ";  ");
			}
			System.out.println();
		};

		
	}

}
