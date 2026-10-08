class Employee
{
int id;
String name;
Employee(int id,String name)
{
id = id;
name = name;
}
void show()
{
System.out.println(id+" "+name);
}
}
class ThisDemo1
{
public static void main(String args[])
{
Employee e1 = new Employee(111,"Harry"); e1.show();
}
}