package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n=== TEST 1: department Insert ===");
		Department dep = new Department(null, "Food");
		depDao.insert(dep);
		System.out.println("Insert! New department id = " + dep.getId());
		
		System.out.println("\n=== TEST 2: department Update ===");
		Department department = new Department();
		department = depDao.findById(1);
		department.setName("Note");
		depDao.update(department);
		System.out.println("Update! completed");
		
		System.out.println("\n=== TEST 3: department findById ===");
		department = depDao.findById(1);
		System.out.println(department);
		
		System.out.println("\n=== TEST 4: department delete ===");
		System.out.print("Informe o id a ser deletado: ");
		int id = sc.nextInt();
		depDao.deleteById(id);
		System.out.println("Delete completed!");
		
		System.out.println("\n=== TEST 5: department findAll ===");
		List<Department> list = depDao.findAll();
		list.forEach(System.out::println);
		
		
		
		sc.close();
	}

}
