package cybersoft.javabackend.java14.crm.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import cybersoft.javabackend.java14.crm.db.MySQLConnection;
import cybersoft.javabackend.java14.crm.entity.User;

public class UserRepository {
	Connection connection = null;
	List<User> users = new LinkedList<User>();

	public List<User> getProducts() {
		users.clear();
		try {
			/*
			 * Gui query kieu String chinh la cau ma lenh trong SQL
			 */
			Connection connection = MySQLConnection.getConnection();
			String query = "select ID, Name, Description, Price, Stock from product";

			PreparedStatement statement = connection.prepareStatement(query);
			/* Gui xong */
			
			
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				/*
				 * su dung rs.next() con tro chuot se di chuyen theo tung hang
				 * va khi ko con hang nao o cuoi cung nua se tra ve false;
				 */
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getNString("Name"));

				users.add(user);

			}
		} catch (SQLException e) {
			System.out.println("Khong the ket noi den du lieu");
			e.printStackTrace();
		} finally {
			if (connection != null)
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

		return users;

	}

	public int addProduct(Product product) {
		try {
			/*
			 * gui cau lenh insert toi SQL
			 */
			Connection connection = MySQLConnection.getConnection();
			String query = "insert into product(ID, Name, Description, Price, Stock) values(?, ?, ?, ?, ?)";

			PreparedStatement statement = connection.prepareStatement(query);
			/*
			 * gui cac du lieu kieu string toi SQL
			 */
			statement.setString(1, product.getId());
			statement.setString(2, product.getName());
			statement.setString(3, product.getDescription());
			statement.setFloat(4, product.getPrice());
			statement.setInt(5, product.getStock());

			return statement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Khong the ket noi den du lieu add product");
			e.printStackTrace();
		}

		return 0;
	}

	public int removeProduct(String id) {
		try {
			Connection connection = MySQLConnection.getConnection();
			String query = "delete from product where id=?";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, id);

			return statement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Khong the ket noi den du lieu remove product");
			e.printStackTrace();
		}

		return 0;
	}
}
