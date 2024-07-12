package org.example;
public class Bus {
    private int BusNo;
    private boolean AC;
    private int Capacity;
    Bus(int no , boolean ac ,int cap){
        this.AC = ac;
        this.BusNo = no;
        this.Capacity = cap;
    }
    public int getCapacity() {
        return Capacity;
    }
    public void setCapacity(int capacity) {
        Capacity = capacity;
    }
    public boolean isAC() {
        return AC;
    }
    public void setAC(boolean AC) {
        this.AC = AC;
    }
    public  int  getBusNo(){
        return BusNo;
    }
    public void displayBusInfo(){
        System.out.println("The Bus Number : " + BusNo  + " Capacity : " + Capacity + " AC : " + AC);
    }
}
