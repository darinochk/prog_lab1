import static java.lang.Math.*;

class Lab1 {
	public static void main(String [] args) {
		long[] a = new long[16];
		float[] x = new float[16];
		double[][] a1 = new double[16][16];
		long b = 18;


		for(int i = 0; i<16; i++) {
			a[i] = b;
			b--;
		}

		for(int i = 0; i<16; i++){
			x[i] = (float)((-14) + Math.random()*17);
 		}

 		for (int i = 0; i<16; i++){
 			for (int j = 0; j<16; j++) {
 				switch ((int)a[i]){
 					case 8 :
 						a1[i][j] = asin(sin(cos(asin((x[j]-5)/17))));
 						break;
 					case 5:
 					case 6:
 					case 7:
 					case 12:
 					case 13:
 					case 14:
 					case 17:
 					case 18:
 						a1[i][j] = cos(exp(asin(((x[j]-5)/17))));
 						break;
 					default:
 						a1[i][j] = atan(cos(tan(3/(tan(x[j])))));
 						break; 					
 				}
 			}
 		}
 		for (int i = 0; i<16; i++){
 			for (int j = 0; j<16; j++) {
 				System.out.printf("%.2f", a1[i][j]);
 				System.out.print(" ");
 			}

 			System.out.println("");
 		}
	}
}
