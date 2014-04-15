package org.ws.demoMath;
class Math{
	public int div(int i ,  int j) throws Exception
	{ int temp;
	temp=i/j;
		return temp;
		
	}
	
}
public class MathDemo {

	public static void main(String[] args) {
		Math msdsds= new Math();
		try {
			int result;
			result=msdsds.div(10, 2);
			System.out.print(result);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("被除數不能等於0");
		}

	}

}
