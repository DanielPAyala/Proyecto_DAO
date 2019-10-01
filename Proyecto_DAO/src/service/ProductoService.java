package service;

import java.util.List;

import beans.ProductoDTO;
import dao.DAOFactory;
import interfaces.ProductoDAO;
import utils.Constantes;

public class ProductoService {
	
	DAOFactory fabrica = DAOFactory.getDAOFactory(Constantes.ORIGEN_DATOS);
	
	ProductoDAO objPro = fabrica.getProductoDAO();
	
	public List<ProductoDTO> listarProductos(){
		return objPro.listarProducto();
	}
}