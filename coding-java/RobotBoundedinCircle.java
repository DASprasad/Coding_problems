package progarm;

public class RobotBoundedinCircle {
	public boolean isRobotBounded(String instructions) {
        int x=0;
        int y=0;
        int direction=0;
        for(int i=0;i<instructions.length();i++){
            if(instructions.charAt(i)=='G'){
                if(direction==0){
                    y++;
                }
                else if(direction==1){
                    x++;
                }
                else if(direction==2){
                    y--;
                }
                else{
                    x--;
                }
            }
            else if(instructions.charAt(i)=='L'){
                if(direction==0){
                    direction=3;
                }
                else{
                    direction-=1;
                }
            }
            else{
                if(direction==3){
                    direction=0;
                }
                else {
                direction+=1;
                }
            }
        }
        if(x==0 && y==0){
            return true;
        }
        else if(direction!=0){
            return true;
        }
        else{
            return false;
        }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 RobotBoundedinCircle ob=new  RobotBoundedinCircle();
		 String s="GLLLGLGLRLRLRLGG";
		 System.out.println(ob.isRobotBounded(s));

	}

}
