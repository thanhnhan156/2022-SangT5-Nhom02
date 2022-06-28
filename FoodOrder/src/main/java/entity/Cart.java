package entity;

public class Cart {
	private int idCart;
	private int idKhachHang;
	private int idSanPham;
	private String image;
	private String tenSanPham;
	private double gia;
	private int soLuong;

	public Cart() {

	}

	public Cart(int idCart, int idKhachHang, int idSanPham, String image, String tenSanPham, double gia, int soLuong) {

		this.idCart = idCart;
		this.idKhachHang = idKhachHang;
		this.idSanPham = idSanPham;
		this.image = image;
		this.tenSanPham = tenSanPham;
		this.gia = gia;
		this.soLuong = soLuong;
	}

	public int getIdCart() {
		return idCart;
	}

	public void setIdCart(int idCart) {
		this.idCart = idCart;
	}

	public int getIdKhachHang() {
		return idKhachHang;
	}

	public void setIdKhachHang(int idKhachHang) {
		this.idKhachHang = idKhachHang;
	}

	public int getIdSanPham() {
		return idSanPham;
	}

	public void setIdSanPham(int idSanPham) {
		this.idSanPham = idSanPham;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	@Override
	public String toString() {
		return "Cart [idCart=" + idCart + ", idKhachHang=" + idKhachHang + ", idSanPham=" + idSanPham + ", image="
				+ image + ", tenSanPham=" + tenSanPham + ", gia=" + gia + ", soLuong=" + soLuong + "]";
	}

}
