package Homework20;

import java.util.ArrayList;

public abstract class Insurance {
    //6) Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
    // Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute.
        // Create 3 objects of the sub classes and store them in ArrayList.
        // Using for loop/advanced for loop/ iterator access all methods of the class.
        String insuranceName;

        abstract void getQuote();

        abstract void cancelInsurance();

        Insurance(String insuranceName){
            this.insuranceName=insuranceName;
        }

    }
    class Car extends Insurance{
        String carModel;
        @Override
        void getQuote() {
            System.out.println(" Quote for your  "+carModel);
        }

        @Override
        void cancelInsurance() {
            System.out.println("Insurance for your  "+carModel+" could be canceled after 6 month");
        }



        public Car(String insuranceName, String carModel) {
            super(insuranceName);
            this.carModel = carModel;
        }
    }
    class Pet extends Insurance{
        String petType;

        public Pet(String insuranceName, String petType) {
            super(insuranceName);
            this.petType = petType;
        }

        @Override
        void getQuote() {
            System.out.println("You can get insurance at "+insuranceName+" for your "+petType);
        }

        @Override
        void cancelInsurance() {
            System.out.println("You can cancel insurance after 3 month ");
        }
    }
    class Health extends Insurance{
        @Override
        void getQuote() {
            System.out.println("This is a quote for your "+insuranceName);
        }

        @Override
        void cancelInsurance() {
            System.out.println("Your can cancel insurance after a year ");
        }

        public Health(String insuranceName) {
            super(insuranceName);
        }

        public static void main(String[] args) {
            ArrayList<Insurance> insurances=new ArrayList<>();
            insurances.add(new Car("Geico","Range Rover HSE 2022"));
            insurances.add(new Health("Oxford Health Insurance"));
            insurances.add(new Pet("Pets Best","Yorkie dog "));

            for(Insurance i:insurances){
                i.getQuote();
                i.cancelInsurance();
            }
            System.out.println();
            for (int i = 0; i < insurances.size(); i++) {
                insurances.get(i).getQuote();
                insurances.get(i).cancelInsurance();

            }
            System.out.println();

            insurances.forEach(i->i.getQuote());
            insurances.forEach(i-> i.cancelInsurance());

        }
}
