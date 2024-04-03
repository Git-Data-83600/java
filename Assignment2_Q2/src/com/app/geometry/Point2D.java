package com.app.geometry;

public class Point2D {
	private double Xaxis;
	private double Yaxis;

	public Point2D() {
		Xaxis = 0.0;
		Yaxis = 0.0;
	}

	public Point2D(double Xaxis, double Yaxis) {
		this.Xaxis = Xaxis;
		this.Yaxis = Yaxis;
	}

	public String getDetails() {
		String result;
		result = "(" + Xaxis + "," + Yaxis + ")";
		return result;
	}

	public boolean isEqual(Point2D p2) {
		if (this.Xaxis == p2.Xaxis && this.Yaxis == p2.Yaxis)
			return true;
		else 
			return false;
	}
	
	public void calculateDistance(Point2D p2)
	{
		double distance=Math.sqrt(Math.pow((p2.Xaxis-this.Xaxis),2)+Math.pow((p2.Yaxis-this.Yaxis), 2));
		 System.out.println("distance between points : "+"("+this.Xaxis+","+this.Yaxis+")"+"  and "+"("+p2.Xaxis+","+p2.Yaxis+")"+" = "+distance);
	}
}






