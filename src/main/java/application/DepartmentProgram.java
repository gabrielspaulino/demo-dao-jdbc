package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DepartmentProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department findById ===");
        Department department = departmentDao.findById(2);
        System.out.println(department);

        System.out.println("\n=== TEST  2: department findAll ===");
        List<Department> list = departmentDao.findAll();
        list.forEach(System.out::println);

        System.out.println("\n=== TEST 3: department insert ===");
        department = new Department(null, "Tools");
        departmentDao.insert(department);
        System.out.println("Inserted! New id = " + department.getId());

        System.out.println("\n=== TEST 4: department update ===");
        department = departmentDao.findById(5);
        department.setName("Furnitures");
        departmentDao.update(department);
        System.out.println("Update completed");

        System.out.println("\n=== TEST 5: department delete ===");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");
    }
}
