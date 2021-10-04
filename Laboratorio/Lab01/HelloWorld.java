package Laboratorio.Lab01;

// importing java libraries useful for current 
import java.io.FileInputStream;
import java.util.Arrays;

// Dichiarazione classe Java
public class HelloWorld {

	public static void main (String[] args) {
		// String s = "pippo";
		// String t = s;
		// System.out.println(s + ", " + t);

		//(System.out).println("Salve, mondo!");

		int[] v = {1, 2, 3};
		int[] x = v;
		// String[] nomi;

		int[][] M = {{1, 2}, {3, 4, 5}};
		System.out.println(Arrays.toString(M[0]));
		System.out.println(Arrays.toString(M[1]));

		// int[] v = M[0];

		// System.out.println(Arrays.toString(v));


		// System.out.println(
		//   Arrays.toString(v)
		// );
		//
		// System.out.println(
		//   Arrays.toString(v)
		// );
	}


}
