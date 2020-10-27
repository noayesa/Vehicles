package com.company;
//o Fuel type – Soler, Octane 95, Octane 96, Octane 98
//o Current amount of fuel in liters (float)
//o Max amount of fuel in liters (float)
//o Refueling operation - (A method that receives how much more fuel to
//add, and changes the amount of fuel, if the fuel type is correct, and
//the fuel tank is less than full)
interface FuelVehicle {
    float getCurrAmountFuel();
    float getMaxAmountFuel();
    void refuelVehicle(float i_amount, FuelType i_fuelType);


    enum FuelType {
        Octane95,
        Octane96,
        Octane98,
        Soler
    }
}
