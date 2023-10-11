package progarm;

public class ShortestWordDistance {
	
	public int find(String str,String str1,String str2) {
		int Dist=Integer.MAX_VALUE;
		int pos=0;
		int flag=-1;
		String [] arr=str.split(" ");
		for(int i=0;i<arr.length;i++){
			if(arr[i].equals(str1)) {
				flag=0;
				pos=i;
				break;
			}
			if(arr[i].equals(str2)) {
				flag=1;
				pos=i;
				break;
			}
			
		}
		
		
		for(int i=pos+1;i<arr.length;i++) {
			if(arr[i].equals(str1) && flag==0) {
				flag=0;
				pos=i;
			}
			if(arr[i].equals(str2) && flag==1) {
				flag=1;
				pos=i;
			}
			if(arr[i].equals(str1) && flag==1) {
				flag=0;
				Dist=Math.min(Dist, i-pos-1);
				pos=i;
			}
			if(arr[i].equals(str2) && flag==0) {
				flag=1;
				Dist=Math.min(Dist, i-pos-1);
				pos=i;
			}
		}
		if(Dist==Integer.MAX_VALUE) {
			return -1;
		}
		return Dist;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShortestWordDistance ob =new ShortestWordDistance();
		String str= "the quick the brown quick brown the frog";
		String str1="frog";
		String str2="quick";
		System.out.println(ob.find(str,str1,str2));

	}

}
