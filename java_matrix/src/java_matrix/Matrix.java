package java_matrix;

public class Matrix {
	
	int[][] matrixEgy = new int[5][4];
		
		
// a mátrix feltöltése 1-től folyamatosan
public Matrix() {	
	int szamlalo = 1;
	for( int i = 0; i < this.matrixEgy.length; i++) {
		for( int y = 0; y < this.matrixEgy[i].length; y++) {
			this.matrixEgy[i][y] = szamlalo;
			szamlalo++;
		};
	};
}


// a mátrix feltöltése a megadott értékkel
public Matrix( int konstans) {	
	for( int i = 0; i < this.matrixEgy.length; i++) {
		for( int y = 0; y < this.matrixEgy[i].length; y++) {
			this.matrixEgy[i][y] = konstans;
		};
	};
}

// a mátrix feltöltése az adott kezdő értéktől adott lépéssel
public Matrix(int startValue, int delta) {	
	int szamlalo = 0;
	for( int i = 0; i < this.matrixEgy.length; i++) {
		for( int y = 0; y < this.matrixEgy[i].length; y++) {
			this.matrixEgy[i][y] = startValue + szamlalo;
			szamlalo = szamlalo + delta;
		};
	};
}


// a mátrix kiíratása
public void MatrixPrint() {
	for(int[] i : this.matrixEgy) {
		for( int y : i) {
			System.out.printf("%4d", y);
		};
		System.out.println("");
	};
}
		
// a mátrix fordított kiírása
public void MatrixMirrorPrint() {
		for(int i = this.matrixEgy.length-1; i >= 0; i--) {
			for(int y = this.matrixEgy[i].length-1; y >= 0; y--) {
				System.out.printf("%4d",this.matrixEgy[i][y]);
			};
			System.out.println();;
		};
}

// visszaadja a mátrix elemeinek számát
public int dbSzam() {
	return this.matrixEgy.length * this.matrixEgy[0].length;
}

// megfordítja a mátrix elemeinek sorrendjét
public void MatrixMirror() {
	int[] snake = new int[this.dbSzam()];
	int szamlalo = 0;
	for(int i =0; i < this.matrixEgy.length; i++) {
		for(int y = 0; y < this.matrixEgy[i].length; y++) {
			snake[szamlalo] = this.matrixEgy[i][y];
			szamlalo++;
		}
	}

	szamlalo = this.dbSzam() - 1;
	for(int i = 0; i < this.matrixEgy.length; i++) {
		for(int y = 0; y < this.matrixEgy[i].length; y++) {
			this.matrixEgy[i][y] = snake[szamlalo];
			szamlalo--;
		}
	}
	
	
}

}	
