package application;

import java.util.Date;

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
	}

}
