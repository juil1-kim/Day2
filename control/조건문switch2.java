package org.example.day2.control;

public class 조건문switch2 {
    public static void main(String[] args) {
        // 1.
        int month = 9;
        //계절 판별 (if나 switch)



        switch(month){
            case 12: case 1: case 2:
                System.out.println("겨울");
                break;
            case 3: case 4: case 5:
                System.out.println("봄");
                break;
            case 6: case 7: case 8:
                System.out.println("여름");
                break;
            case 9: case 10: case 11:
                System.out.println("가을");
                break;
        }


    }
}
