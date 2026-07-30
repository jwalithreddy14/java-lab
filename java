class staticvariable
{
static int num1=100;
static int num2=200;
public void show()
{
System.out.println("from show method");
System.out.println("the val of num1:"+num1);
num1+=num2;
}
public void display()
{
System.out.println("from display method");
System.out.println("the val of num1:"+num1);
System.out.println("the val of num2:"+num2);
System.out.println("the val of num2:"+num2);
System.out.println("the val of num2:"+num2);
System.out.println("the val of num1:"+num1);
}
public static void main(String arg[])
{
static\variable obj1=new staticvariable();
obj1.show();
obj1.display();
}
