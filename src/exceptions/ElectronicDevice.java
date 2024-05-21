package exceptions;
 
public class ElectronicDevice {
	private String name;
	private int watt;
	public ElectronicDevice() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWatt() {
		return watt;
	}
	public void setWatt(int watt) {
		if(watt <= 0) {
			throw new IllegalWattException();
		} else {
			this.watt = watt;
		}		
	}
}