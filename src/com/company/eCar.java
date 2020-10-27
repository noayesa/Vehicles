package com.company;
//Max battery life – 1.8 hours
//battery remaining - float
public class eCar extends Car implements  ElectricVehicle{
    float maxBattery = (float)1.8;
    float currBattery;

    public eCar(String name, String licenseNum, float wheel1Pressure, float wheel2Pressure,
                float wheel3Pressure, float wheel4Pressure, String manufacturerName,
                Color color, Door numDoors) {
        super(name, licenseNum, wheel1Pressure, wheel2Pressure, wheel3Pressure,
                wheel4Pressure, manufacturerName, color, numDoors);

    }
    public void setRemainingBattery(float currBattery){
        if(currBattery > 0 && currBattery <= this.maxBattery){
            this.currBattery = currBattery;
        }
        System.out.println("Please provide a valid input for the remaining battery.");
    }

    public float getRemainingBatter(){return this.currBattery;}

    public float getMaxBattery() {return this.maxBattery;}

    public void rechargingVehicle(float i_amount){
        if(i_amount > 0){
            if(this.maxBattery > this.currBattery + i_amount){
                this.currBattery = this.currBattery + i_amount;
                System.out.println("We have charged your car. You have " + this.currBattery + "battery left.");
            }else{
                this.currBattery = this.maxBattery;
                System.out.println("We have fully charged your car.");
            }

        }else{
            System.out.println("Please provide a valid amount. (bigger than 0)");
        }
    }
}
