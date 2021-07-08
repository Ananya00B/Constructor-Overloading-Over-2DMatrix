package lab.work;

public class MatrixTwoD {

	private int _m;
	private int _n;
	private int _matrix[][] = new int[20][20];

	
	MatrixTwoD(){
		_m = 3;
		_n = 3;
		int[][] arr = new int[_m][_n]; 
		
		for(int i = 0; i < _m; i++) {
			for(int j = 0; j < _n; j++) {
				if(i == j) {
					arr[i][j] = 1;
				}else {
					arr[i][j] = 0;
				}
				
				_matrix[i][j] = arr[i][j];
			}
		}
	}
	
	public MatrixTwoD(int r, int c) {
		_m = r;
		_n = c;
		int[][] arr = new int[_m][_n]; 
		
		for(int i = 0; i < _m; i++) {
			for(int j = 0; j < _n; j++) {
				arr[i][j] = 0;
				
				_matrix[i][j] = arr[i][j];
			}
		}
	}

	public MatrixTwoD(int r, int c, int value) {
		_m = r;
		_n = c;
		int[][] arr = new int[_m][_n]; 
		
		for(int i = 0; i < _m; i++) {
			for(int j = 0; j < _n; j++) {
				arr[i][j] = value;
				
				_matrix[i][j] = arr[i][j];
			}
		}
	}

	public void get_matrix() {
		for(int i = 0; i < _m; i++) {
			for(int j = 0; j < _n; j++) {
				System.out.print("\t" +_matrix[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

		    //Default Matrix
    MatrixTwoD mat1 = new MatrixTwoD();
		System.out.println("Default Matrix :");
		mat1.get_matrix();
		
        //Matrix with all the elements set as 0
		MatrixTwoD mat2 = new MatrixTwoD(4, 5);
		System.out.printf("\n%dX%d Matrix :\n", 4, 5);
		mat2.get_matrix();

        //Matrix with all the elements set as given number
		MatrixTwoD mat3 = new MatrixTwoD(5, 6, 8);
		System.out.printf("\n%dX%d Matrix with all elements as %d:\n", 5, 6, 8);
		mat3.get_matrix();
	}
}
