
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = new int[4][4];
		
		for(int i = 0; i< matrix.length; i++){
			for(int j = 0; j< matrix[0].length; j++){
				
				matrix[i][j] = 0;
			}
		}

		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 5;
		matrix[0][3] = 6;
		matrix[1][0] = 4;
		matrix[1][1] = 4;
		matrix[1][2] = 5;
		matrix[1][3] = 2;
		matrix[2][0] = 7;
		matrix[2][1] = 3;
		matrix[2][2] = 0;
		matrix[2][3] = 2;
		matrix[3][0] = 7;
		matrix[3][1] = 3;
		matrix[3][2] = 3;
		matrix[3][3] = 7;
		
		DynamicProgramming dp = new DynamicProgramming();
		
		//dp.minCostMatrix(matrix);
		dp.minCostVC(matrix);
		
	}

}
