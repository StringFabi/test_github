package exceptions;
 
public class ElectronicDeviceTest {
 
	public static void main(String[] args) {
		ElectronicDevice ed = new ElectronicDevice();
		try {
		ed.setWatt(30);
		System.out.println(ed.getWatt());
		} catch(IllegalWattException e) {
			System.out.println("Watt können nicht negativ sein");
		}
	}
 
}