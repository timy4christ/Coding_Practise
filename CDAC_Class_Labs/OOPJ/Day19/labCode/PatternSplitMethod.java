import java.util.regex.Pattern;
import java.util.regex.Matcher;

class PatternSplitMethod{
	
	public static void main(String[] args){
					
		Pattern p = Pattern.compile("\\s");// except space everything is token
		String[] m = p.split("cdac kharghar mumbai");
		for(String s : m){
			System.out.println(s);
		}
		
		System.out.println();
		
		Pattern p2 = Pattern.compile("a"); //except a everything is token
		String[] m2 = p2.split("cdac kharghar mumbai");
		for(String s : m2){
			System.out.println(s);
		}
		
		System.out.println();
		
		Pattern p3 = Pattern.compile("."); // except any character rest is token
		String[] m3 = p3.split("www.cdacinfo.com");
		for(String s : m3){ // it doesnt get into the loop
			System.out.println("Output for \".\" as regex : " + s); // no output, because all character is ignored
		}
		
		System.out.println();
		
		Pattern p4 = Pattern.compile("\\."); // except .(dot) rest is token
		String[] m4 = p4.split("www.cdacinfo.com");
		for(String s : m4){
			System.out.println(s);
		}
		

	}
}