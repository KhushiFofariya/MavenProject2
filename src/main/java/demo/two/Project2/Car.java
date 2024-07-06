package demo.two.Project2;

public class Car {
 private Wheel wheelObj;
 

public Car(Wheel wheelObj) {
	
	this.wheelObj = wheelObj;
}

public Wheel getWheelObj() {
	return wheelObj;
}

public void setWheelObj(Wheel wheelObj) {
	this.wheelObj = wheelObj;
}
 public void displayCarInfo()
 {
	 System.out.println("Display Car's Wheel size:"+wheelObj.getWheelsize());
 }
}
