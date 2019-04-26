package com.home;

public class ElectricAccount {
	
		private double kWh;
		private double rate = 0.7;
		private double bill;
		
		public void addKWh(double kWh) {
			this.kWh += kWh;
			this.bill = this.kWh * this.rate;
			}
		}
