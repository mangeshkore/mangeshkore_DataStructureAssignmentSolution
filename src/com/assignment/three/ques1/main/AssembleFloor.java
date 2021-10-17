package com.assignment.three.ques1.main;

import com.assignment.three.ques1.service.AssembleFloorService;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Solution for Question 1
 */
public class AssembleFloor {

    public static void main(String[] args) {
        AssembleFloorService assembleFloorService = new AssembleFloorService();
        ArrayList<Integer> floorArray=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no of floors in the building");

        int noOfFloors = sc.nextInt();

        for(int i=0;i<noOfFloors;i++){
            System.out.println("Enter the floor size given on day : " + (i+1));
            floorArray.add(sc.nextInt());
        }

        System.out.println("The order of construction is as follows");
        assembleFloorService.assembleFloors(floorArray);
    }
}
