package task4.typesoftaxi;

import java.util.Objects;

public class Minivan extends Taxpark {
    protected int costOfTaxi;
    protected int numberOfPass;
    protected double costOfRide;

    public Minivan ( int costOfTaxi, int numberOfPass, double costOfRide){

        this.costOfTaxi= costOfTaxi;
        this.numberOfPass = numberOfPass;
        this.costOfRide = costOfRide;
    }


    public int getCostOfTaxi() {
        return costOfTaxi;
    }

    public int getNumberOfPass() {
        return numberOfPass;
    }

    public double getCostOfRide() {
        return costOfRide;
    }



    public void setCostOfTaxi(int costOfTaxi) {
        this.costOfTaxi = costOfTaxi;
    }

    public void setNumberOfPass(int numberOfPass) {
        this.numberOfPass = numberOfPass;
    }

    public void setCostOfRide(double costOfRide) {
        this.costOfRide = costOfRide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Minivan minivan = (Minivan) o;
        return costOfTaxi == minivan.costOfTaxi &&
                numberOfPass == minivan.numberOfPass &&
                Double.compare(minivan.costOfRide, costOfRide) == 0;
    }

    @Override
    public int hashCode() {
        return costOfTaxi*10+numberOfPass+100+ (int) costOfRide*1000;
    }

    @Override
    public String toString() {
        return "Minivan{" +
                "costOfTaxi=" + costOfTaxi +
                ", numberOfPass=" + numberOfPass +
                ", costOfRide=" + costOfRide +
                '}';
    }
}
