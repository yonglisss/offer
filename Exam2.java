public class Exam2 {
	private static int [][] arr = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
	
	public static boolean search(int a[][],int width,int high,int num){
		boolean found = false;
		
		if(a != null && width > 0 && high > 0){
			int width2 = width - 1;
			int high2 = 0;
			
			while(width2 >= 0 && high2 < high){
				if(num == a[high2][width2]){
					found = true;
					break;
				}else if(num < a[high2][width2]){
					width2--;
				}else{
					high2++;
				}
			}
		}
		
		return found;
	}
	
	
	public static void main(String [] args){
		boolean b;
		b = search(arr,4,4,3);
		System.out.println(b);
	}
}
