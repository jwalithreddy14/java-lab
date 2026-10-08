class Animal
{
String name;
void show()
{
System.out.println(&quot;Animal Name is&quot;+name);
}
}
class Dog extends Animal
{
void bark()
{
System.out.println(&quot;Mother Dog Barking...&quot;);
}
}
class BabyDog extends Dog

{
void weep()
{
System.out.println(&quot;Baby Dog weeping&quot;);
}
}
class TestInheritance2
{
public static void main(String args[])
{
BabyDog d=new BabyDog();
d.name=&quot;
MotherDog&quo-
d.show();
d.bark();
d.weep();
}
}
