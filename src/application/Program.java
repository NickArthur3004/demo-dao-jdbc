package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
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
		
		System.out.println();
		System.out.println("=== Test 4 : seller Insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDAO.insert(newSeller);
		System.out.println("Inserted! new id = " + newSeller.getId());
		
		System.out.println();
		System.out.println("=== Test 5 : seller Update ===");
		seller = sellerDAO.findById(1);
		seller.setName("Marta Waine");
		sellerDAO.update(seller);
		System.out.println("Update Completed");
		
		System.out.println();
		System.out.println("=== Test 6 : seller Delete ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDAO.delereById(id);
		System.out.println("Delete Completed");
	
		sc.close();
	}

}
