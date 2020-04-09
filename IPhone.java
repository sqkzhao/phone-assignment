package com.kayz.phone;

public class IPhone extends Phone implements Ringable {
	// constructor
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	@Override	// override notation
	public String ring() {
		String str = String.format("Iphone %s says %s", getVersionNumber(), getRingTone());
		return str;
	}
	@Override
	public String unlock() {
		return "Unlocking via facial recongnition";
	}
	@Override
	public void displayInfo() {
		System.out.println(String.format("Iphone %s from %s", getVersionNumber(), getCarrier()));
	}
}
