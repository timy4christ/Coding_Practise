/*
Given a string, remove the punctuation from the string if the given 
character is a punctuation character, as classified by the current C 
locale. The default C locale classifies these characters as punctuation: 
• ! " # $ % & ' ( ) * + , - . / : ; ? @ [ \ ] ^ _ ` { | } ~
*/

class P2{
	
	public static void main(String[] args){
		
		
		// String str = "%welcome' to @cdacmumbai?<s";
		String str = "Hello!!!, he said ---and went**.";
		
		// using regex
		// System.out.println(str.replaceAll("[^a-zA-Z\\s]",""));
		
		
		String res = "";
		for(int i=0; i<str.length(); i++){			
			
			char ch = str.charAt(i);
			
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch==' ') {
				res += ch;
			}
		}
		
		System.out.println(res);
		
	}
}