package com.company;
//Octane 95 (fuel), 8 liters fuel tank
public class fuelMotorcycle extends Motorcycle implements FuelVehicle {
    int maxAmountOfFuel = 8;
    float currAmountOfFuel;//gotta do with enum
    FuelType fuelType = FuelType.Octane95;

    public fuelMotorcycle(String name, String licenseNum, float wheel1Pressure, float wheel2Pressure,
                          String manufacturerName, float currAmountOfFuel, LicenseType licenseType) {
        super(name, licenseNum, wheel1Pressure, wheel2Pressure, manufacturerName, licenseType);

        this.currAmountOfFuel = currAmountOfFuel;
    }

    public FuelType getFuelType(){return this.fuelType;}

    public float getCurrAmountFuel() {return this.currAmountOfFuel;}

    public float getMaxAmountFuel() {
        return this.maxAmountOfFuel;
    }

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
