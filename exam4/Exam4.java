/**
 * 试题4：替换字符串中的空格
 * 描述：将字符串中的空格替换成%20
 * 思路：1、判断字符串以及字符串初始值 是否合理
 * 		2、判断空格总数；
 * 		3、判断新的长度能否放入全部放入数组中；
 * 		4、从后往前移动，遇到空格替换
 * */

public class Exam4 {

	public static void replaceBlank(String str,char str1[]){//该方法直接在原有字符串上面操作，即，覆盖了原来的字符串
		char str2[] = str.toCharArray();
		
		if(str == null || str1.length < 0){
			return;
		}
		
		int blankNum = 0;
		int newLength;
		
		for(int i = 0; i < str2.length; i++){
			if(str2[i] == ' '){
				blankNum++;
			}
		}
		
		newLength = str2.length + blankNum*2;
		System.out.println(newLength);
		if(newLength > str1.length){
			return;//新的字符串长度超过数组大小，不能够存下
		}
		
		int point1 = str2.length - 1;
		int point2 = newLength-1;
		
		while(point1 >= 0){
			if(str2[point1] != ' '){
				str1[point2] = str2[point1];
				point1--;
				point2--;
			}else{
				point1--;
				str1[point2] = '0';
				str1[--point2] = '2';
				str1[--point2] = '%';
				point2--;
			}
		}
		
		System.out.println(str1);
	}
	
	public static void main(String [] args){
		char[] arr = new char[50];
		String str = "We are happy";
		
		replaceBlank(str, arr);
	}
}
