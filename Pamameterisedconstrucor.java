class Test
{
int a, b;
Test(int n1, int n2)
{
a=n1; b=n2;
System.out.println("Value of a = "+a);
System.out.println("Value of b = "+b);
}
}
class TestDemo
{
public static void main(String args[])
{
Test t1=new Test(10, 20);
}
}