package com.javastudy;

public class JavaStudy011 {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.SOUTH;
        Direction d3 = Direction.WEST;
        Direction d4 = Direction.NORTH;

        System.out.println(d1); // EAST
        System.out.println(d2); // SOUTH
        System.out.println(d3); // WEST
        System.out.println(d4); // NORTH
        
        switch (d1) {
            case EAST:
                System.out.println("Direction is EAST");
                break;
                
            case SOUTH:
                System.out.println("Direction is SOUTH");
                break;
                
            case WEST:
                System.out.println("Direction is WEST");
                break;
                
            case NORTH:
                System.out.println("Direction is NORTH");
                break;
        }
    }
}
