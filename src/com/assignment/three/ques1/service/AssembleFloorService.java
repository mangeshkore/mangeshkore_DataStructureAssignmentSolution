package com.assignment.three.ques1.service;

import java.util.ArrayList;
import java.util.List;

public class AssembleFloorService {
    List<Integer> remainingFloors;
    int currentFloor;
    List<Integer> floorsAtNthDay;

    /**
     * To assemble the floors
     * @param floorSizes list of input of floor sizes.
     */
    public void assembleFloors(List<Integer> floorSizes) {
        int height = floorSizes.size();
        currentFloor = height;
        remainingFloors = new ArrayList<>();

        for (int day = 0; day < height; day++) {
            floorsAtNthDay = new ArrayList<>();
            int size = floorSizes.get(day);

            if (size == currentFloor) {
                floorsAtNthDay.add(size);
                currentFloor = currentFloor - 1;
                checkRemainingList(currentFloor, remainingFloors);
            }
            if (size < currentFloor) {
                remainingFloors.add(size);
            }

            System.out.println();
            System.out.println("Day: " + (day + 1));
            for (int i : floorsAtNthDay) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     * to check the list of remaining floors to be added to the stack on nth day
     * @param currentFloor pointer to the current floor
     * @param remainingList remaining floors
     */
    private void checkRemainingList(int currentFloor, List<Integer> remainingList) {
        for (int remFloor : remainingList) {
            if (remFloor == currentFloor) {
                floorsAtNthDay.add(remFloor);
                this.currentFloor = currentFloor - 1;
                checkRemainingList(this.currentFloor, remainingList);
            }
        }
    }
}
