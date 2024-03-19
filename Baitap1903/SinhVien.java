package Baitap1903;

public class SinhVien {
	String maSV;
	String HoTen;
	String GioiTinh;
	double DiemPyThon;
	double DiemJava;
	double DiemTB;
	String ketQua;
	
	public SinhVien(String maSV, String HoTen, String GioiTinh, double DiemPyThon, double DiemJava) {
		this.maSV=maSV;
		this.HoTen=HoTen;
		this.GioiTinh=GioiTinh;
		this.DiemPyThon=DiemPyThon;
		this.DiemJava=DiemJava;
		this.DiemTB=(DiemJava*2 + DiemPyThon)/3;
		 this.ketQua = (DiemTB >= 5) ? "Dau" : ((DiemTB < 5 && GioiTinh.equals("Nam")) ? "Truot" : "Dau");
	}
	
	@Override
	 public String toString() {
	        return String.format("Ma sinh vien: %s - Ho va ten: %s - Gioi tinh: %s - Python: %.2f - Java: %.2f - Điem TB: %.2f - Ket qua: %s",
	                                maSV, HoTen, GioiTinh, DiemPyThon, DiemJava, DiemTB, ketQua);
	    }
}

