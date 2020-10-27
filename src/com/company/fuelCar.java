package com.company;
// Octane 96 fuel, 55 liter fuel tank

public class fuelCar extends Car implements FuelVehicle {
    private int maxAmountOfFuel = 55;
    private float currAmountOfFuel;
    private FuelType fuelType = FuelType.Octane96;

    public fuelCar(String name, String licenseNum, float wheel1Pressure, float wheel2Pressure,
                   float wheel3Pressure, float wheel4Pressure, String manufacturerName,
                   Color color, Door numDoors) {

        super(name, licenseNum, wheel1Pressure, wheel2Pressure, wheel3Pressure,
                wheel4Pressure, manufacturerName, color, numDoors);


    }

    public void setCurrAmountOfFuel(float currFuel){
        if(currFuel > 0 && currFuel <= this.maxAmountOfFuel){
            this.currAmountOfFuel = currFuel;
        }else{
            System.out.println("Please provide a valid input for the current amount of fuel.");
        }
    }

    public FuelType getFuelType(){return this.fuelType;}

    public float getCurrAmountFuel() {return this.currAmountOfFuel;}

    public float getMaxAmountFuel() {return this.maxAmountOfFuel;}

    public void refuelVehicle(float i_amount, FuelType i_fuelType){
        if(i_amount > 0){
            if(this.maxAmountOfFuel >= i_amount + this.currAmountOfFuel && i_fuelType == this.fuelType){
                this.currAmountOfFuel = i_amount + this.currAmountOfFuel;
                System.out.println("We have filled your tank. You have " + this.currAmountOfFuel + " liters");

            }else if(i_fuelType != this.fuelType){
                System.out.println("Please choose "+ this.fuelType);
            }else{
                this.currAmountOfFuel = this.maxAmountOfFuel;
                System.out.println("We filled your tank to the maximum amount.");
            }
        }else{
            System.out.println("Please provide a valid amount. (bigger than 0)");
        }
    }


}
