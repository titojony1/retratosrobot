package RetratoRobot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RetratoRobo {

	
	public static void main (String [] args) throws IllegalArgumentException, Throwable {
		String opcion1_pelo = "WWWWWWWWW";
		String op1 = new String(opcion1_pelo);
		System.out.println(op1);
		
		String opcion1_ojos = "| o   o |";
		String op1o = new String(opcion1_ojos);
		System.out.println(op1o);
		
		String opcion1_orejas = "@   J   @";
		String op1or = new String(opcion1_orejas);
		System.out.println(op1or);
		
		String opcion1_boca = "|  ===  |";
		String op1b = new String(opcion1_boca);
		System.out.println(op1b);
		
		String opcion1_barbilla = " ______/";
		String op1ba = new String(opcion1_barbilla);
		System.out.println(op1ba);
		
		
		String opcion2pelo = "\\\\\\//////";
		String op2 = new String(opcion2pelo);
		System.out.println(op2);

		String opcion2_ojos = "|-(· ·)-|";
		String op2o = new String(opcion2_ojos);
		System.out.println(op2o);
		
		String opcion2_orejas = "{   \"   }";
		String op2or = new String(opcion2_orejas);
		System.out.println(op2or);
		
		String opcion2_boca = "|   -   |";
		String op2b = new String(opcion2_boca);
		System.out.println(op2b);
		
		String opcion2_barbilla = " \\,,,,,,,/";
		String op2ba = new String(opcion2_barbilla);
		System.out.println(op2ba);
		
		
		String opcion3 = "\"|||||||\"";
		String op3 = new String(opcion3);
		System.out.println(op3);
		
		String opcion4 = "|||||||||";
		String op4 = new String(opcion4);
		System.out.println(op4);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Escojes la opcion 1? ");
		int op12 = Integer.parseInt(in.readLine());
		System.out.println (opcion1_pelo);
		System.out.println (opcion1_ojos);
		System.out.println (opcion1_orejas);
		System.out.println (opcion1_boca);
		System.out.println (opcion1_barbilla);
		
		System.out.print("Escojes la opcion 2? ");
		int op13 = Integer.parseInt(in.readLine());
		System.out.println (opcion2pelo);
		System.out.println (opcion2_ojos);
		System.out.println (opcion2_orejas);
		System.out.println (opcion2_boca);
		System.out.println (opcion2_barbilla);




		}
		
		
	}
