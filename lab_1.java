package Employee;

public class Employee

{

String name;
int id; long salary;
Employee(String name,int id,long salary)
{

this.name=name;

this.id=id; this.salary=salary;

}
void display() 
{

System.out.println(&quot;employee name&quot;+name);
System.out.println(&quot;employee id&quot;+id);
System.out.println(&quot;employee salary&quot;+salary); 

}

void increase_salary(int q)

{


double increment=(salary*q)/100;

salary+=increment;

System.out.println(&quot;increased salary is&quot;+salary);

   }


}

package Employe;

public class Main 
{

public static void main(String[] args) 

{

Employee p1=new Employee(&quot;Rohith&quot;,101,48000);

Employee p2=new Employee(&quot;Manish&quot;,213,72000);


System.out.println(&quot;intial employee detail are&quot;);


p1.display();

p2.display(); 

p1.increase_salary(10);

p2.increase_salary(20);


System.out.println(&quot;upgrade employee details are&quot;);


p1.display(); 

p2.display();

}
