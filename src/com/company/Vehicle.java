package com.company;
/*Model Name (String)
 License Number (String)
 Remaining Energy Percentage (Fuel/Battery) (float)
 Wheels, with each wheel containing the following:
o Manufacturer Name (String)
o Current Air Pressure (float)
o Max Air Pressure Recommended by the manufacturer’s (float)
o Inflate Action (A method that receives how much more air to add to a
wheel, and changes the air pressure while not crossing the max limit)
 */

public class Vehicle {
    private String name;
    private String licenseNum;
    public Vehicle(String name, String licenseNum){ //gotta add wheels
        this.name = name;
        this.licenseNum = licenseNum;

    }

    public String getLicenseNum() {return licenseNum;}

    public String getName() {return name;}
}
