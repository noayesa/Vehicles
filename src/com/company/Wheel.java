package com.company;
/*
 Wheels, with each wheel containing the following:
o Manufacturer Name (String)
o Current Air Pressure (float)
o Max Air Pressure Recommended by the manufacturer’s (float)
o Inflate Action (A method that receives how much more air to add to a
wheel, and changes the air pressure while not crossing the max limit)
 */
public class Wheel {
    private String manufacturerName;
    private float currAirPressure;
    private float maxAirPressure;

    public String getManufacturerName() {return manufacturerName;}

    public float getCurrAirPressure() {return currAirPressure;}

    public float getMaxAirPressure() {return maxAirPressure;}

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public void setMaxAirPressure(float maxAirPressure) {
        this.maxAirPressure = maxAirPressure;
    }

    public void setCurrAirPressure(float currAirPressure) {
        if(currAirPressure < this.maxAirPressure) {
            this.currAirPressure = currAirPressure;
        }else{
            System.out.println("Please provide valid Air Pressure.");
        }
    }

    public void inflateAction(float i_amountOfAir){
        if (this.maxAirPressure < this.currAirPressure + i_amountOfAir){
            System.out.println("Cannot add that amount as it exceeds Max Pressure. We filled the air pressure to the max");
            this.currAirPressure = this.maxAirPressure;

        }else{
            this.currAirPressure = this.currAirPressure + i_amountOfAir;
        }

    }
}
