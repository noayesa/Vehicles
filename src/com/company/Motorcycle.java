package com.company;

//2 tires with max air pressure of 33 (psi)
//o License type – A, A1, A2, B
//o Engine Volume (int)
public class Motorcycle extends Vehicle{
    private float maxAirPressure = 33;
    private LicenseType licenseType;
    Wheel[] wheels = new Wheel[2];
    private int engineVolume;

    public Motorcycle(String name, String licenseNum, float wheel1Pressure, float wheel2Pressure,
                      String manufacturerName,LicenseType licenseType) {
        super(name, licenseNum);

        Wheel wheel1 = new Wheel();
        wheel1.setMaxAirPressure(this.maxAirPressure);
        wheel1.setManufacturerName(manufacturerName);
        wheel1.setCurrAirPressure(wheel1Pressure);
        wheels[0] = wheel1;


        Wheel wheel2 = new Wheel();
        wheel2.setMaxAirPressure(this.maxAirPressure);
        wheel2.setManufacturerName(manufacturerName);
        wheel2.setCurrAirPressure(wheel2Pressure);
        wheels[1] = wheel2;

        this.licenseType = licenseType;

    }

    public void setEngineVolume(int engineVolume){
        if (engineVolume > 0){
            this.engineVolume = engineVolume;
        }else{
            System.out.println("Please give a valid engine volume. (bigger than 0)");
        }
    }

    public LicenseType getLicenseType(){
        return this.licenseType;
    }

    public int getEngineVolume(){
        return this.engineVolume;
    }

    enum LicenseType {
        A, A1, A2, B
    }




}
