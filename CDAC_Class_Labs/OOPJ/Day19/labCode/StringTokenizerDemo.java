import java.util.StringTokenizer;

class StringTokenizerDemo{
	
	public static void main(String[] args){
		StringTokenizer st = new StringTokenizer("cdac kharghar mumbai"); // by default space is the pattern/ regular expression/delimiter
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		
		st = new StringTokenizer("26-10-2022","-");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
	
}