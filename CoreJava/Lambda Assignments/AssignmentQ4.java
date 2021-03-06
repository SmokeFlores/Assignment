package Lambda8Assignment;
/*Remove the words that have odd lengths from the list. HINT: Use one of the new methods from JDK 8. Use removeIf() method from Collection interface.

Description:-

Write a program using java 8 features which can remove the odd length words from the list.

Specifications:

public class Assignment4Q4 {
    public ArrayList<String> removeOddLength(ArrayList<String> employeeList){}
    public static void main(String[] args) { }
} */


import java.util.ArrayList;

public class AssignmentQ4
{
	public ArrayList<String> removeOddLength(ArrayList<String> employeeList)
	{
		employeeList.removeIf(e->e.length()%2!=0);
		for(String s:employeeList)
		{
			System.out.println(s);
		}
		return employeeList;
	}
	
	public static void main(String args[])
	{
		ArrayList<String> emp=new ArrayList<String>();
		emp.add("MadhuSimhadri");
		emp.add("Madhu");
		emp.add("Anil");
		emp.add("Sri");
		
		AssignmentQ4 A=new AssignmentQ4();
		A.removeOddLength(emp);
	}
}