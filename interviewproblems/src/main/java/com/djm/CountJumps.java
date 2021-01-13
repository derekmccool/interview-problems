package com.djm;

public class CountJumps {
    
    public static void main(String[] args) {
        int distance = 5;
        System.out.println(printCount(distance));
    }

    static int printCount(int distance){

        if(distance < 0){
            return 0;
        }

        if(distance == 0){
            return 1;
        }

        return printCount(distance-1) + printCount(distance-2) + printCount(distance-3) + printCount(distance-4) + printCount(distance-5);
    }

}

