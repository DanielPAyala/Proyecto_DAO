package beans;

public class ProductoDTO {
	private int codigo;
	private String description;
	private double precio;
	private int stock;
	private String nomMarca;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getNomMarca() {
		return nomMarca;
	}
	public void setNomMarca(String nomMarca) {
		this.nomMarca = nomMarca;
	}
}
