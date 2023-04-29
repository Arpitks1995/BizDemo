package HashMap;

import java.util.HashMap;

public class DemoHashMaps {

	public static void main(String[] args) {
		HashMap h1=new HashMap();
        System.out.println(h1.put(101, "Arun"));
        System.out.println(h1.put(102, "Varun"));
        System.out.println(	h1.put(103, "Tharun"));
        System.out.println(h1.put(101, "Mottori")+ " got replaced");
        
        System.out.println(h1);
	}

}
