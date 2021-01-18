package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDAO sellerDAO = DaoFactory.createSellerDAO();
		
		System.out.println("=== Test 1 : seller findById ===");
		
		Seller seller = sellerDAO.findById(3);
		
		System.out.println(seller);
		System.out.println();
		
		System.out.println("=== Test 2 : seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller>list = sellerDAO.findByDepartment(department);
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("=== Test 3 : seller findByAll ===");
		list = sellerDAO.findAll();
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
	}

}
