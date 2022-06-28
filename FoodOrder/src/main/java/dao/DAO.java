package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import context.DBConnect;
import entity.Account;
import entity.Category;
import entity.Product;

public class DAO {
	Connection conn = null; // kết nối mysql
	PreparedStatement ps = null; // đưa query sang sql
	ResultSet rs = null; // nhận kq trả về

	// Get random product
	public List<Product> getRandomProduct() {
		List<Product> list = new ArrayList<Product>();
		String query = "SELECT *FROM product ORDER BY RAND() LIMIT 3";
		try {
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5),
						rs.getString(6), rs.getInt(7)));
			}

		} catch (Exception e) {
		}

		return list;
	}
// Get all product
	public List<Product> getAllProduct() {
		List<Product> list = new ArrayList<Product>();
		String query = "SELECT * FROM product";
		try {
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery(query);
			while (rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5),
						rs.getString(6), rs.getInt(7)));
			}

		} catch (Exception e) {
		}

		return list;
	}

	//Get all category
	public List<Category> getAllCategory() {
		List<Category> list = new ArrayList<Category>();
		String query = "SELECT * FROM category";
		try {
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery(query);
			while (rs.next()) {
				list.add(new Category(rs.getInt(1), rs.getString(2)));
			}

		} catch (Exception e) {
		}

		return list;
	}
// Lấy sản phẩm mới nhất
	public Product getLast() {
		String query = "SELECT * FROM product ORDER BY ID DESC LIMIT 1";
		try {
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery(query);
			while (rs.next()) {
				return new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5),
						rs.getString(6), rs.getInt(7));
			}
		} catch (Exception e) {
		}
		return null;

	}
// Lấy danh sách sản phẩm theo id
	public List<Product> getProductByCID(String cid) {
		List<Product> list = new ArrayList<Product>();
		String query = "SELECT * FROM product where cID = ?";
		try {
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, cid);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5),
						rs.getString(6), rs.getInt(7)));
			}

		} catch (Exception e) {
		}

		return list;
	}
	// Lấy 1 sản phẩm theo id
	public Product getProductByID(String id) {

		String query = "SELECT * FROM product where ID = ?";
		try {
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				return new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5),
						rs.getString(6), rs.getInt(7));
			}

		} catch (Exception e) {
		}

		return null;
	}

	// Đăng nhập
	public Account login(String user, String pass) {
		String query = "SELECT * from account WHERE username=? AND pass=?";
		try {
			conn = new DBConnect().getConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setString(1, user);
			ps.setString(2, pass);
			rs = ps.executeQuery();
			while (rs.next()) {
				return new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
			}
		} catch (Exception e) {
		}
		return null;
	}
// Chỉnh sửa sản phẩm
	public void editProductById (String id,String name,String image, Double price, String title, String description,
			int cID) {
		 String query = "update product set name=?, image =? ,price=?, title=?, description=?, cID=?, sell_ID =1"
		 		+ " where id= ?";
		 try {
			conn= new DBConnect().getConnection();
			ps= conn.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, image);
			ps.setDouble(3, price);
			ps.setString(4, title);
			ps.setString(5, description);
			ps.setInt(6, cID);
			ps.setString(7, id);
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	 }
	
	// Xóa sản phẩm
	public void deleteProductById(String id) {
		String query = "delete from product where id = ?";
		try {
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, id);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

//Search Product by name
	public List<Product> getProductByName(String txtSearch) {
		List<Product> list = new ArrayList<Product>();
		String query = "SELECT * FROM product WHERE name LIKE ?";
		try {
			conn = new DBConnect().getConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setString(1, "%" + txtSearch + "%");
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5),
						rs.getString(6), rs.getInt(7)));
			}
		} catch (Exception e) {
		}
		return list;
	}
	
	// Get all account 
	public List<Account> getAllAccount(){
		List<Account> listAcc = new ArrayList<Account>();
		String query = "SELECT * FROM account";
		try {
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				listAcc.add(new Account(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5)));
			}

		} catch (Exception e) {
		}
		return listAcc;
	}

	// Add  account
	public void addAccount(String name, String pass) {
		String query =" insert into account value (?, ? , ?, 0,0 )";
		int id = getAllAccount().size() +1;
		try {
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			ps.setString(2,name);
			ps.setString(3,pass);
			ps.executeUpdate();
			rs = ps.executeQuery();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public Account checkAccount(String name) {
		String query ="  select * from account where username =	?";
		try {
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1,name);
			rs = ps.executeQuery();
			while(rs.next()){
				return new Account( rs.getInt(1), rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null ;
	}
	
	// All product
	public void addProduct(String name, String image, double price, String title, String description, int cID ) {
		String query =" insert into product value (?, ?, ? , ?, ?,?,?,0)";
		int id = getAllProduct().size() -1;
		try {
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			ps.setString(2,name);
			ps.setString(3,image);
			ps.setDouble(4, price);
			ps.setString(5,title);
			ps.setString(6,description);
			ps.setInt(7, cID);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	
	public static void main(String[] args) {
		DAO dao = new DAO();
//		Product list = dao.getLast();

//		System.out.println(list);
//	    System.out.println(	dao.login("admin","123"));
//		System.out.println(dao.getProductByID("15"));
//		System.out.println(dao.getProductByCID("15"));
//		System.out.println(dao.getRandomProduct());
//		System.out.println(dao.getAllAccount().size());
//		dao.addProduct("Cơm chiên", "http://trithucviet.net/wp-content/uploads/2019/10/cach-lam-com-chien-duong-chau.png", 
//				35000, "Cơm chiên dương châu", "Cơm chiên dương châu được làm từ những nguyên liệu vô cùng đơn giản và dễ tìm", 2);
//		
	}

}
