package dao;

import interfaces.ProductoDAO;

public class MySqlDAOFactory extends DAOFactory {

	@Override
	public ProductoDAO getProductoDAO() {
		// TODO Auto-generated method stub
		return new MySqlProductoDAO();
	}

}
