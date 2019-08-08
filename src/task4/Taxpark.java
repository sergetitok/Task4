package task4;

public class Taxpark {

    protected TypesOfTaxi type;
    protected int costOfTaxi;
    protected int weightLift;
    protected int numberOfPass;
    protected double costOfRide;

    //Constructor
    public Taxpark(TypesOfTaxi type, int costOfTaxi, int weightLift, int numberOfPass, double costOfRide){
        setType(type);
        setCostOfTaxi(costOfTaxi);
        setWeightLift(weightLift);
        setNumberOfPass(numberOfPass);
        setCostOfRide(costOfRide);
    }


    //Setters
    public void setType(TypesOfTaxi type) {
        this.type = type;
    }

    public void setCostOfTaxi(int costOfTaxi) {
        this.costOfTaxi = costOfTaxi;
    }

    public void setWeightLift(int weightLift) {
        this.weightLift = weightLift;
    }

    public void setNumberOfPass(int numberOfPass) {
        this.numberOfPass = numberOfPass;
    }

    public void setCostOfRide(double costOfRide) {
        this.costOfRide = costOfRide;
    }

    //Getters
    public TypesOfTaxi getType() {
        return type;
    }

    public int getCostOfTaxi() {
        return costOfTaxi;
    }


    public int getWeightLift() {
        return weightLift;
    }

    public int getNumberOfPass() {
        return numberOfPass;
    }

    public double getCostOfRide() {
        return costOfRide;
    }

}

