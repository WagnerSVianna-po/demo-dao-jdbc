package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

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
		
		

	}

}
