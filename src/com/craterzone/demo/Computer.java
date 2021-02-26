package com.craterzone.demo;

public class Computer {

	private String HDD;
	private String RAM;
	private boolean isGraphicEnabled;
	private boolean isBluetoothEnabled;
	
	public String getHDD() {
		return this.HDD;
	}
	
	public String getRAM() {
		return this.RAM;
	}
	
	public boolean isGraphicEnabled() {
		return this.isGraphicEnabled;
	}
	
	public boolean isBluetoothEnabled() {
		return this.isBluetoothEnabled;
	}
	
	
	

	@Override
	public String toString() {
		return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", isGraphicEnabled=" + isGraphicEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}

	private Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
		this.isGraphicEnabled = builder.isGraphicEnabled;
	}
	
	public static class ComputerBuilder{
		private String HDD;
		private String RAM;
		private boolean isGraphicEnabled;
		private boolean isBluetoothEnabled;
		
		public ComputerBuilder(String HDD,String RAM) {
			this.HDD  = HDD;
			this.RAM  = RAM;
		}
		
		public ComputerBuilder setGraphicCardEnabled(boolean b){
			this.isGraphicEnabled = b;
			return this;
		}
		
		public ComputerBuilder setBluetoothEnabled(boolean b) {
			this.isBluetoothEnabled = b;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
	}
}
