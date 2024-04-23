public class VariableTest{
	public static void main(String[] args){
		//一开始没有乘客
		int count = 0;
		//第一站：上来一位乘客
		count = count + 1;
		//第二站：上来两位乘客，下去一位乘客
		count = count + 2;
		count = count - 1;
		//第三站：上来两位乘客，下去一位乘客
		count = count + 2;
		count = count - 1;
		//第四站：下去一位乘客
		count = count - 1;
		//第五站：上来一位乘客
		count = count + 1;
		//车上一共有几位乘客？
		System.out.println(count);
	}
}