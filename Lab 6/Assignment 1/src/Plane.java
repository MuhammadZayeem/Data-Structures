//Muhammad Zayeem
//SP25-BCS-112
public class Plane {
    int PlaneID;
    int FuelLevel;

    public Plane(int fuelLevel,int PlaneID) {
        this.FuelLevel = fuelLevel;
        this.PlaneID=PlaneID;
    }

    public int getFuelLevel() {
        return FuelLevel;
    }

    public String toString(){
        return String.format("ID : [PIA-"+PlaneID+"], Fuel-Level : ["+FuelLevel+"]");
    }
}
