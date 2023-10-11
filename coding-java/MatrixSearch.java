package progarm;

public class MatrixSearch {
	public boolean find(int[][] matrix,int target ){
        int low=0;
        int high=(matrix.length*matrix[0].length)-1;
        int part=matrix[0].length;
        int mid=0;
        int find=0;
        int actmid=0;
        while(low<=high){
            actmid=(low+high)/2;
            mid=((low+high)/2)%part;
            find=actmid/part;
            if(matrix[find][mid]==target){
                return true;
            }else if(target>matrix[find][mid]){
                low=actmid+1;
            }else{
                high=actmid-1;
            }
        }
        return false;
    }

	public static void main(String[] args) {
		MatrixSearch ob=new MatrixSearch();
		int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		System.out.println(ob.find(arr,34));

	}

}
