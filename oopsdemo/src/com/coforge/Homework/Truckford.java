package com.coforge.Homework;

public class Truckford implements Truck {
	int no_Axle;
	double Weight;
	


	public Truckford(int no_Axle, double weight) {
		this.no_Axle = no_Axle;
		this.Weight = weight;
	}

	public void Axle() {
		System.out.println("No of Axel="+this.no_Axle);
		
		
	}

	public void weight() {
		System.out.println("weight_of_Truck="+this.Weight);
	
		
	}

}
