package DSA;

import java.util.Scanner;
import java.util.Stack;

public class infix_pre
{
static int precedence(char c) {
if(c=='+' || c=='-')
return 1;
else if(c=='*' || c=='/')
return 2;
else if(c=='^')
return 3;
else
return 0;
}
static StringBuilder convert(String in)
{
String pre="";//op 
Stack<Character> s=new Stack<>();//stack 
for(int i =in.length()-1 ; i>=0; i--)
{
	char c = in.charAt(i);
if(c==')')
s.push(c);
else if (c=='(')
{
while(s.peek()!=')')
pre+=s.pop();

s.pop();//remove '(' 
}
else if (c=='+' || c=='-' || c=='*' || c=='/')
{
while(!s.empty() && precedence(s.peek())>=precedence(c))
{
pre+=s.pop();//if lower pop it out 
}
s.push(c);//push new 
}
else//operand 
	{
pre+=c;
}
}//infix over 
while(!s.empty())
pre+=s.pop();
return new StringBuilder(pre).reverse();
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter In-fix Expression:");
String infix=sc.next();
StringBuilder prefix=infix_pre.convert(infix);
System.out.println("Postfix is:"+prefix);
}
}
