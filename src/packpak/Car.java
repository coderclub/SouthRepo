package packpak;

public class Car {
//Variables	
public int CarID; //instance variable
public String CarModel;
String CarMake;
public int ColorCode;
String CarMod;
static char CarClass = 'Z'; //static ba class variable

//Constructor 1
public Car () {
	System.out.println("\nThis person dosen't own a car\n"); //nextline character
}
//Constructor 2
public Car (int CarID, String CarModel, String CarMake, int ColorCode, char CarClass) { //local variable
	this.CarID = CarID; this.CarModel=CarModel; this.CarMake=CarMake; this.CarClass=CarClass;
	System.out.println(CarID+"  "+CarModel+"  "+CarMake+"  "+ColorCode+"  "+CarClass+" eto keso keno");
}
//Constructor 3
public Car (String CarModel, String CarMake, int ColorCode) {
	System.out.println(CarModel+"  "+CarMake+"  "+ColorCode+"  No CarID found");
}
//Constructor 4
public Car (String CarModel,int CarID, String CarMake) {
	System.out.println("CarNo: "+CarID+"  "+"CarName: "+CarMake+" , "+CarModel);
}
//Method 1 (Void/No Return)
public void displayCarModel(String CarMo) {
	this.CarModel=CarModel;
	System.out.println("The Model of this car is: "+CarModel);
}
//Method 2 (Return)
public int GenerateSerialNo(int CarId, int ColorCode) {
	int result = CarId + ColorCode;
	return result;
}
//Method 3 (Void/No Return)
public void CarMileage() {
	System.out.println("This is a new car");
}
//Method 4 (Void/No Return)
public void CarMake(String CarMake) {
	TestCar.tyre=2;
	System.out.println("We are the largest car provider in the world: "+CarMake);	
}
public void CarUser (){
	System.out.println("rongila hoile ladies");
}
}
