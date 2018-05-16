package java_matrix;

public class Matrix_Main {

	public static void main(String[] args) {

		Matrix myMatrix = new Matrix();
		
		myMatrix.MatrixPrint();
		System.out.println(" Fordított kiírás: -----------------------");
		myMatrix.MatrixMirrorPrint();
		
		myMatrix.MatrixMirror();
		System.out.println("1. fordítás után: -----------------------");
		myMatrix.MatrixPrint();
		
		myMatrix.MatrixMirror();
		System.out.println("2. fordítás után: -----------------------");
		myMatrix.MatrixPrint();
		
	}

}
