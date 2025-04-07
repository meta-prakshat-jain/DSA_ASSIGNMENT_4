package Assignment_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class EmployeeOperations {
	
	public static ArrayList<Employee> sortbyname(ArrayList<Employee> empList){
		Set<Employee> EmpSet =new HashSet<>(empList);
		
		ArrayList<Employee> NoDuplicateEmpList=new ArrayList<>(EmpSet);
		
		NoDuplicateEmpList.sort(new Comparator() {
			public int compare(Object o1, Object o2) {
				String o1Name=((Employee)o1).getName();
				String o2Name=((Employee)o2).getName();
				return o1Name.compareTo(o2Name);
			}
		});
		
		for(Employee e:NoDuplicateEmpList) {
			System.out.println(e.toString());
		}
		
		return NoDuplicateEmpList;
		
	}
	
	public static ArrayList<Employee> sortbyId(ArrayList<Employee> empList){
		Set<Employee> EmpSet =new HashSet<>(empList);

		ArrayList<Employee> NoDuplicateEmpList=new ArrayList<>(EmpSet);
		
		NoDuplicateEmpList.sort(new Comparator() {
			public int compare(Object o1, Object o2) {
				int o1Id=((Employee)o1).getEmpId();
				int o2Id=((Employee)o2).getEmpId();
				return Integer.compare(o1Id, o2Id);
			}
		});
		
		for(Employee e:NoDuplicateEmpList) {
			System.out.println(e.toString());
		}
		return NoDuplicateEmpList;
		
	}
	
	public static void main(String[] args) {
		ArrayList<Employee> empList=new ArrayList<>();
		Employee e1=new Employee(1, "Akash", "Jaipur");
		Employee e2=new Employee(2, "Suresh", "Pune");
		Employee e3=new Employee(3, "Mahesh", "Mumbai");
		Employee e4=new Employee(4, "Ajay", "Jaipur");
		Employee e5=new Employee(5, "Vijay", "Gujrat");
		empList.add(e4);
		empList.add(e1);
		empList.add(e5);
		empList.add(e2);
		empList.add(e3);	
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
//		for(Employee e:empList) {
//			System.out.println(e.toString());
//		}
		sortbyId(empList);
		System.out.println(" ");
		sortbyname(empList);
		
	}

}
