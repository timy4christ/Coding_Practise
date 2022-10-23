class First
{
 int a = 5;
 First(int x)
 {
 this.a = x;
 }
 void print(int a)
 {
 System.out.println(a);
 }
}
class Second
{
 First f = new First(10);
 void print(int a)
 {
 f.print(a);
 }
}
class FirstSecond
{
 public static void main(String args[])
 {
 Second s = new Second();
 s.print(15);
 }
}