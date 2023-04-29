package FinalVSFinallyVSFinalize;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FinallyPurposes {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    File file=new File("C:\\Users\\Arpit\\Desktop\\xyz.txt");
    
    FileReader fr=null;
    try {
    	System.out.println("Inside the Try Block");
	 fr=new FileReader(file);
	} catch (FileNotFoundException e) {
		System.out.println("Inside the Catch Block");
		// TODO Auto-generated catch block
		
	}finally {
		System.out.println("It will always be executed irrespective of Exception");
		if(fr!=null) {
			fr.close();
		}
	
	}
	}

}
