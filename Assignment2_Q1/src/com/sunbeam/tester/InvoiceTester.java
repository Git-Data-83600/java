package com.sunbeam.tester;
import com.sunbeam.invoice.Invoice;

public class InvoiceTester {

	public static void main(String[] args) {
		Invoice i=new Invoice("001","keyboard",5,500);
		System.out.println("part no: "+i.getPartno());
		System.out.println("part description: "+i.getPartdesc());
		System.out.println("qty: "+i.getQty());
		System.out.println("price: "+i.getPrice());
		System.out.println("calculate invoice: "+i.calculateInvoice());

	}

}
