package com.employeeWageusingoops;

public class Attendance {

    void Attendance(int Full_time) {
        // To get random number and check the attendance
        double employeeCheck = (Math.floor(Math.random() * 10) % 2);
        if (employeeCheck == Full_time) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }

    public static void main(String[] args) {
        Attendance attendance = new Attendance();
        attendance.Attendance(1);
    }
}

