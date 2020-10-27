package com.company;
//12 tires with max air pressure of 26 (psi), Soler fuel, 110 liter fuel tank
//o Contains dangerous materials? (bool)
//o Volume of cargo (float)

public class fuelTruck extends Vehicle implements FuelVehicle {
    private final float maxAmountOfFuel = (float)110;
    Wheel [] wheels = new Wheel[12];
    private final float maxAirPressure = (float)26;
    private final FuelType fuelType = FuelType.Soler;
    private float currAmountOfFuel;
    private boolean containsDangerousMaterial;
    private float volOfCargo;

    public fuelTruck(String name, String licenseNum,
                     float wheel1AP, float wheel2AP, float wheel3AP, float wheel4AP, float wheel5AP, float wheel6AP,
                     float wheel7AP, float wheel8AP, float wheel9AP, float wheel10AP, float wheel11AP, float wheel12AP,
                     String manufacturerName, float volOfCargo, boolean containsDangerousMaterial) {

        super(name, licenseNum);

        for (int wheelIndex = 0; wheelIndex < 12; wheelIndex++){
            wheels[wheelIndex] = new Wheel();
            wheels[wheelIndex].setManufacturerName(manufacturerName);
            wheels[wheelIndex].setMaxAirPressure(this.maxAirPressure);
        }

        wheels[0].setCurrAirPressure(wheel1AP);
        wheels[1].setCurrAirPressure(wheel2AP);
        wheels[2].setCurrAirPressure(wheel3AP);
        wheels[3].setCurrAirPressure(wheel4AP);
        wheels[4].setCurrAirPressure(wheel5AP);
        wheels[5].setCurrAirPressure(wheel6AP);
        wheels[6].setCurrAirPressure(wheel7AP);
        wheels[7].setCurrAirPressure(wheel8AP);
        wheels[8].setCurrAirPressure(wheel9AP);
        wheels[9].setCurrAirPressure(wheel10AP);
        wheels[10].setCurrAirPressure(wheel11AP);
        wheels[11].setCurrAirPressure(wheel12AP);

        this.volOfCargo = volOfCargo;
        this.containsDangerousMaterial = containsDangerousMaterial;

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

    public boolean isContainDangerousMaterial(){
        return this.containsDangerousMaterial;
    }

    public float getVolOfCargo(){
        return this.volOfCargo;
    }





}
