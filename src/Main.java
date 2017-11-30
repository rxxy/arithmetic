import java.io.Console;

public class Main {
	
	
	public static void main(String[] args) throws Exception {
		Console cs = System.console();  
        if (cs == null) {   
            throw new IllegalStateException("canot use console");   
        }   
        System.out.println(cs.readLine());  
        char[] password = cs.readPassword();
        System.out.println(password[0]);
        
        
//		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
//		char[] buf = new char[1024];
//		int len = bufr.read(buf);
//		String str = new String(buf,len);
//		String
//		System.out.println(str);
	}

}
