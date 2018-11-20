import java.util.Random;

public class calculoMatrizSecuencial {
	public static void main(String[] args) {
	//declaracion variables
	Integer N = 4;
	Integer i;
	Integer j;
	double sum;
	double [][] matrizA = new double[N][N];
	double [] B = new double[N];
	double [] C = new double[N];
	double [] D = new double[N];
	
	///////////////inicializa el matriz
	Random r = new Random();
	for (i= 0; i<N; ++i) {
		for (j= 0; j<N; ++j) {
		    matrizA[i][j]=r.nextDouble();
		}
		B[i]=r.nextDouble();
	}
	///////////////comienza el calculo
	for (i= 0; i<N; ++i) {
		C[i]=0.0;
		for (j= 0; j<N; ++j) {
		    C[i]=C[i]+matrizA[i][j]*B[j];
		}
	}
	sum = 0.0;
	for (i= 0; i<N; ++i) {
		D[i]=0.0;
		for (j= 0; j<N; ++j) {
		    D[i]=D[i]+matrizA[i][j]*C[j];
		}
		sum = sum+D[i]*C[i];
	}
	//////////////resultado de X
	System.out.println("X es "+sum);
	
	}	
}
