package com.coforge.Homework;

public class Allegheny_TollBooth implements TollBooth {
int TotalTruck;
int weight;
int no_of_Axel;
static int i;

	public Allegheny_TollBooth(int totalTruck, int weight, int no_of_Axel) {
	this.TotalTruck = totalTruck;
	this.weight = weight;
	this.no_of_Axel = no_of_Axel;
}

	@Override
	public int Total_no_Truck() {
		i=i+1;
		return(i);
	
		
	}

	@Override
	public int Receipt_Collect() {
		int Tol_due = 5*this.no_of_Axel+20*this.weight;
	return(Tol_due);
		
		
	}
	

}
