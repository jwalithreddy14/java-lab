public class Person
{
    Person()
    {
       System.out.println("Introduction:");
    }
    Person(String name) 
    {
        System.out.println("Name:"+name);
        }
    Person(String scname, int rollNo)
    {
        System.out.println("School name:"+scname+","+"Roll no:"+rollNo);
    } 
    public static void main(String args[])
    {
        Person p1 = new Person();
        Person p2 = new Person("John");
        Person p3 = new Person("ABC",12);
    }
}
