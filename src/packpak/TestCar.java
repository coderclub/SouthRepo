package packpak;

public class TestCar  {
static int tyre;
	public static void main(String[]args) {
		//TestCar nasir = new TestCar();
		TestCar.tyre=2;
		Car.CarClass='B';
		//Car.CarMod='x';
		//Car.tyre=2;
		//TestCar.CarClass='C';
		//git config --global user.name "username"
		//git config --global user.email "email"

		Car AhmedCar = new Car("Camry", 206,"Toyota") ;				//Constructor 4

		Car Tofael = new Car(483, "Camry", "Toyota", 45, 'A'); //CONSTRUCTOR 2
        Tofael.CarMileage();
        Tofael.CarUser();

		Car FahimCar = new Car();//Constructor 1
		//FahimCar.CarClass='b';
		//FahimCar.CarMod="Mercedesh";
		Car FarzadCar = new Car("4 Series", "BMW", 50);					//Constructor 3
		FarzadCar.displayCarModel("BMW");								//Method 1
		
		Car ShamsCar = new Car(404, "Prius", "Toyota", 56, 'B' );		//Constructor 2
		//System.out.println(ShamsCar.GenerateSerialNo(404, 56));			//Method 2
		//ShamsCar.CarMileage();											//Method 3
		ShamsCar.CarMake("Toyota");//Method 4
		ShamsCar.displayCarModel("Toyota");
	}
}
