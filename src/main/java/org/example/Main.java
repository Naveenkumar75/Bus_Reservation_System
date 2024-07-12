package org.example;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();
        buses.add(new Bus(1,true,3));
        buses.add(new Bus(2,false,45));
        buses.add(new Bus(3,true,40));
        int userOpt = 1 ;
        for(Bus b:buses){
            b.displayBusInfo();
        }
        while (userOpt == 1){
            System.out.print("Enter the 1 to book and 2 to exit : ");
            Scanner scanner = new Scanner(System.in);
            userOpt = scanner.nextInt();
            if(userOpt == 1){
                Booking booking =new Booking();
                if(booking.isAvailable(bookings,buses)){
                    bookings.add(booking);
                    System.out.println("Your booking is confirmed !!!");
                }
                else {
                    System.out.println("Sorry , bus is full , try another bus or date !");
                }
            }
        }
    }
}