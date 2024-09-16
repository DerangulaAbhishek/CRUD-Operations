package com.example.demo.entity;

/**
 * 
 */
public class Laptop {
	String serialNumber;
	String manufacturer;
	double cost;
	public Laptop(String serialNumber, String manufacturer, double cost) {
		super();
		this.serialNumber = serialNumber;
		this.manufacturer = manufacturer;
		this.cost = cost;
	}
	public Laptop() {
		super();
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Laptop [serialNumber=" + serialNumber + ", manufacturer=" + manufacturer + ", cost=" + cost + "]";
	}
	

}
