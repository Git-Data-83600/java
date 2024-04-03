package com.sunbeam.invoice;

public class Invoice {

	private String partno;
	private String partdesc;
	private int qty;
	private double price;

	public Invoice() {
		this.partno = partno;
		this.partdesc = partdesc;
		this.qty = qty;
		this.price = price;
	}

	public Invoice(String partno, String partdesc, int qty, double price) {
		this.partno = partno;
		this.partdesc = partdesc;
		this.qty = qty;
		this.price = price;
	}


	public String getPartno() {
		return partno;
	}

	public void setPartno(String partno) {
		this.partno = partno;
	}

	public String getPartdesc() {
		return partdesc;
	}

	public void setPartdesc(String partdesc) {
		this.partdesc = partdesc;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		if (qty < 0) {
			qty = 0;
		} else
			this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 0) {
			price = 0.0;
		} else
			this.price = price;
	}

	public double calculateInvoice() {
		return price * qty;
	}

}
