package model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Cafe {
	private String cafeName;
	private String cafeOpen;
	private String cafeNo;

	// constructor
	public Cafe(String cafeName, String cafeOpen, String cafeNo) {
		super();
		this.cafeName = cafeName;
		this.cafeOpen = cafeOpen;
		this.cafeNo = cafeNo;
	}

	// toString
	@Override
	public String toString() {
		return "Cafe [cafeName=" + cafeName + ", cafeOpen=" + cafeOpen + ", cafeNo=" + cafeNo + "]";
	}

	// Getter & Setter
	public String getCafeName() {
		return cafeName;
	}
	public void setCafeName(String cafeName) {
		this.cafeName = cafeName;
	}
	public String getCafeOpen() {
		return cafeOpen;
	}
	public void setCafeOpen(String cafeOpen) {
		this.cafeOpen = cafeOpen;
	}
	public String getCafeNo() {
		return cafeNo;
	}
	public void setCafeNo(String cafeNo) {
		this.cafeNo = cafeNo;
	}

}