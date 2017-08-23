public class TestTriangle{
	public static void main(String args[]){
		int count = 22;
		for(int i = 1;i<=count;i++){
			for(int k = 0;k<=count-i;k++){
				System.out.print(" ");
			}
			for(int j = 0;j<i;j++){
				System.out.print("# ");
			}
			System.out.println("");
		}
	}
}