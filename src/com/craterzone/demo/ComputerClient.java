package com.craterzone.demo;

import com.craterzone.demo.Computer;


public class ComputerClient {

	public static void main(String[] args) {
		Computer comp =new Computer.ComputerBuilder("512 GB", "8 GB")
				           .setBluetoothEnabled(true)
				           .setGraphicCardEnabled(false).build();
		System.out.println(comp);
	}
}