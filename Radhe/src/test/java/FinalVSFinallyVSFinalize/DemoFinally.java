package FinalVSFinallyVSFinalize;

public class DemoFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10,b=2;
		try {
			System.out.println("Inside the Try Block");
			int c=a/b;
			
		}catch(Exception e) {
			System.out.println("Exception got handled. inside the catch block");
		}finally {
			System.out.println("Allways be executed irrespective of the exception");
		}

	}

}
