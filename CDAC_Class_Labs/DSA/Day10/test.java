import java.util.*;

class Balanced_Parenthesis_Checker
{

    static boolean isMatching(char a,char b)
    {
        return (a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']');
    }
   static boolean isBalanced(String str)
   {
       Stack<Character> s=new Stack<>();
	   for(int i=0;i<str.length();i++)
	   {
	       if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[')
		   s.push(str.charAt(i));
		   else
		   {
		       if(s.isEmpty()==true)
			   return false;
			   else if(!isMatching(s.peek(),str.charAt(i)))
			   return false;
			   else
			   s.pop();
		   }
	   }
	   
	   
	   
	   return (s.isEmpty());
   }

    public static void main(String[] args)
	{
	    String str="({[]})";
		if(isBalanced(str))
		System.out.println("Balanced ");
		else
		System.out.println("Not Balanced ");
	}
}