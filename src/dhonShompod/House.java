package dhonShompod;

public class House { //this is the class
        //Variables	5-10
        public int Area; //instance variable
        public String NameOfTheHouse;
        String Builder; //we can also write without public, also no 9
        public static int HouseNumber; //static or class variable
        String Model;
        public char Direction;

        //Constructor 1

        public House () { //default constructor
            System.out.println("\nHomeless manusher dukkho beshi\n"); //next line character by \n  \n
        }
        //Constructor 2

        public House (int Area, String NameOfHouse, String Builder, int HouseNumber, String Model, char Direction) { //local variable
            House.HouseNumber=625;
            System.out.println("That is my whole address : "+Area+"  "+NameOfHouse+"  "+Builder+"  "+HouseNumber+"  "+Model+"  "+Direction);
        }
        //Constructor 3
        public House (int Area, String NameOfHouse, String Builder) {
            System.out.println("His partial address: "+Area+"  "+NameOfHouse+"  "+Builder);
        }
        //Constructor 4
        public House (String Model, String NameOfHouse, String Builder) {
            System.out.println("His partial address: "+Model+"  "+NameOfHouse+"  "+Builder);
        }
        //Method 1 (Void method - Not Returning anything)
        public void displayNameOfHouse(String NameOfHouse) {
            System.out.println("The Name of the house is: "+NameOfHouse);
        }
        //Method 2 (Return METHOD, NON VOID METHOD, RETURNING SOMETHING)
        public int GenerateSomeNo(int Area, int HouseNumber) {
            int result = Area + HouseNumber;
            return result;
        }
        //Method 3 (like method 1 but nothing in bracket)
        public void HouseRent() {
            System.out.println("Very Expensive");
        }
        //Method 4 (like method 1)
        public void BestBuilder(String Builder) {
            System.out.println("The well known builder in the world is : "+Builder);
        }
        //Method 3 (like method 1)
        public void Model (){
            System.out.println("They are like Banglu and look very beautiful");
        }
    }


