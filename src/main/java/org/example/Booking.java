package org.example;
import java.text.ParseException;
import java.util.*;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
public class Booking {
    String PassengerName;
    int busNo;
    Date date;
    Booking(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Passenger Name : ");
        PassengerName = scanner.next();
        System.out.print("Enter the Bus Number : ");
        busNo = scanner.nextInt();
        System.out.print("Enter the Date dd-MM-yyyy : ");
        String dateInput = scanner.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public boolean isAvailable(ArrayList<Booking> bookings , ArrayList<Bus> buses ) {
        int capacity = 0;
        for (Bus bus : buses) {
            if (bus.getBusNo() == busNo) {
                    capacity = bus.getCapacity();
            }
        }
        int booked=0;
        for (Booking b : bookings){
            if(b.busNo == busNo && b.date.equals(date)){
                booked++;
            }
        }
        return booked<capacity?true:false;
    }
}
