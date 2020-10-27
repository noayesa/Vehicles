package com.company;
//o Remaining time of engine operation in hours (float)
//o Max time of engine operation in hours (float)
//o Recharge operation - (A method that receives how many more hours
//to add, and charges the battery, while not crossing the max limit)
interface ElectricVehicle {
    float getRemainingBatter();
    float getMaxBattery();
    void rechargingVehicle(float i_amount);
}
