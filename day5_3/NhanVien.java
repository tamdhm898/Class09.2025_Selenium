package day5_3;

public class NhanVien {
	private String ten;
	private int tuoi;
	private String phongBan;
	private double luong;

	public NhanVien(String ten, int tuoi, String phongBan, double luong) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.phongBan = phongBan;
		this.luong = luong;
	}

	@Override
	public String toString() {
		return "Tên: " + ten + ", Tuổi: " + tuoi + ", Phòng ban: " + phongBan + ", Lương: " + luong;
	}

	public String getPhongBan() {
		return phongBan;
	}
}
