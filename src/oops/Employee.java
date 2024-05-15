package oops;

public class Employee {
   int EmpId;
   String Ename;
   String Ejob;
   int Esal;
   
   Employee(String Ename,int EmpId,String Ejob,int Esal)
   {
	   this.Ename=Ename;
	   this.EmpId=EmpId;
	   this.Ejob=Ejob;
	   this.Esal=Esal;
   }
   
   void Display() {
	   System.out.println(Ename);
	   System.out.println(EmpId);
	   System.out.println(Ejob);
	   System.out.println(Esal);
	   
  }
   void show() {
	   System.out.println("Next Employee Data");
   }
	public static void main(String[] args) {
		Employee Emp1=new Employee("Ramya",1,"Tester", 50000);
		Emp1.Display();
		Emp1.show();
		
		Employee Emp2=new Employee("priya",1,"developer", 90000);
		Emp2.Display();
		Emp2.show();
		
		Employee Emp3=new Employee("siddu",1,"Test engineer", 70000);
		Emp3.Display();
		Emp3.show();
		
		Employee Emp4=new Employee("kavya",1,"Team lead ", 60000);
		Emp4.Display();
		Emp4.show();
		
		Employee Emp5=new Employee("Rahul",1,"BA", 300000);
		Emp5.Display();
		Emp5.show();

	}

}
