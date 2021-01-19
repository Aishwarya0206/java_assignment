package array;
// Main file
class add_of_two_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,3,4},{2,4,3},{3,4,5}};
		int b[][] = {{1,3,4},{2,4,3},{1,2,4}};
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(a[i][j]+b[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("All the Best!");
	}

}
