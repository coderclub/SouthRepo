package dhonShompod;

public class TestHouse {
        public static void main(String[]args) {
            //House.HouseNumber=625;

            House house3 = new House();

            House house1 = new House(1300, "shopnomollika", "JAMUNA", 347, "Banglo",'N');
            System.out.println(house1.GenerateSomeNo(1300, 347));


            House house2 = new House (1200, "hasnahena", "boshundhora");
            house2.HouseRent();
            house2.Model();
            house2.BestBuilder("EasternHousing");



            House house4 = new House();
            house4.displayNameOfHouse("rojonighondha");//hkguyg

            House house5 = new House("Apartment", "Helena", "Durst");
            house5.HouseRent();

        }
    }
// Nasir bhai printing sequence ta dhorte partesina. Can you write for me?
//why default constructor is coming twice
//git config --global user.name "username"
//git config --global user.email "email"
