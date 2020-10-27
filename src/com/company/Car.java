package com.company;
//4 tires with max air pressure of 31 (psi)
//o Color – Red, Blue, Black, Gray
//o Number of doors – 2, 3, 4, or 5
public class Car extends Vehicle{
    private float maxAirPressure = 31;
    Wheel [] wheels = new Wheel[4];

    public Car(String name, String licenseNum, float wheel1Pressure, float wheel2Pressure,
               float wheel3Pressure, float wheel4Pressure, String manufacturerName, Color color, Door numDoors) {
        super(name, licenseNum);

        Wheel wheel1 = new Wheel();
        wheels[0] = wheel1;

        Wheel wheel2 = new Wheel();
        wheels[1] = wheel2;

        Wheel wheel3 = new Wheel();
        wheels[2] = wheel3;

        Wheel wheel4 = new Wheel();
        wheels[3] = wheel4;

        for (Wheel wheel:wheels) {
            wheel.setManufacturerName(manufacturerName);
            wheel.setMaxAirPressure(this.maxAirPressure);
        }

        wheel1.setCurrAirPressure(wheel1Pressure);
        wheel2.setCurrAirPressure(wheel2Pressure);
        wheel3.setCurrAirPressure(wheel3Pressure);
        wheel4.setCurrAirPressure(wheel4Pressure);


    }

    enum Color{
        RED,
        BLUE,
        BLACK,
        GRAY
    };

    enum Door{
        two(2), three(3), four(4), five(5);
        private int value;

        private Door(int value) {
            this.value = value;
        };
    };
}
