package task4.typesoftaxi;

import task4.TypesOfTaxi;

import java.util.Objects;

public class FreightTaxi extends Taxpark {

    protected int costOfTaxi;
    protected double costOfRide;
    protected int weightLift;



    public FreightTaxi( int costOfTaxi, int weightLift, int numberOfPass, double costOfRide){

    this.costOfTaxi= costOfTaxi;
    this.weightLift = weightLift;
    this.costOfRide = costOfRide;
    }


    public int getCostOfTaxi() {
        return costOfTaxi;
    }



    public int getWeightLift() {
        return weightLift;
    }

    public double getCostOfRide() {
        return costOfRide;
    }



    public void setCostOfTaxi(int costOfTaxi) {
        this.costOfTaxi = costOfTaxi;
    }

    public void setCostOfRide(double costOfRide) {
        this.costOfRide = costOfRide;
    }

    public void setWeightLift(int weightLift) {
        this.weightLift = weightLift;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FreightTaxi that = (FreightTaxi) o;
        return costOfTaxi == that.costOfTaxi &&
                Double.compare(that.costOfRide, costOfRide) == 0 &&
                weightLift == that.weightLift;
    }

    @Override
    public int hashCode() {
        return costOfTaxi*10+weightLift+100+ (int) costOfRide*1000;
    }

    @Override
    public String toString() {
        return "FreightTaxi{" +
                "costOfTaxi=" + costOfTaxi +
                ", costOfRide=" + costOfRide +
                ", weightLift=" + weightLift +
                '}';
    }
}
