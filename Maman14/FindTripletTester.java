public class FindTripletTester
{
    public static void main(String args[])
    {
        int[] arr = {0, 0, 0};
        System.out.println(Ex14.findTriplet(arr) == 0);
        int[] arr1 = {10, 10, 10};
        System.out.println(Ex14.findTriplet(arr1) == 1000);
        int[] arr2 = {10, 10, -10};
        System.out.println(Ex14.findTriplet(arr2) == -1000);
        int[] arr3 = {10, -10, 10};
        System.out.println(Ex14.findTriplet(arr3) == -1000);
        int[] arr4 = {-10, 10, 10};
        System.out.println(Ex14.findTriplet(arr4) == -1000);
        int[] arr5 = {-10, -10, 10};
        System.out.println(Ex14.findTriplet(arr5) == 1000);
        int[] arr6 = {-10, -10, -10};
        System.out.println(Ex14.findTriplet(arr6) == -1000);
        //Check 4 num arrays
        int[] arr7 = {0, 0, 0, 0};
        System.out.println(Ex14.findTriplet(arr7) == 0);
        int[] arr8 = {0, 0, 0, 10};
        System.out.println(Ex14.findTriplet(arr8) == 0);
        int[] arr9 = {0, 0, 10, 0};
        System.out.println(Ex14.findTriplet(arr9) == 0);
        int[] arr10 = {0, 10, 0, 0};
        System.out.println(Ex14.findTriplet(arr10) == 0);
        int[] arr11 = {10, 0, 0, 0};
        System.out.println(Ex14.findTriplet(arr11) == 0);        
        int[] arr12 = {10, 0, 10, 0};
        System.out.println(Ex14.findTriplet(arr12) == 0);
        int[] arr13 = {0, 10, 0, 10};
        System.out.println(Ex14.findTriplet(arr13) == 0);
        //more 3 num arrays
        int[] arr14 = {0, 10, 0};
        System.out.println(Ex14.findTriplet(arr14) == 0);
        int[] arr15 = {10, 0, 0};
        System.out.println(Ex14.findTriplet(arr15) == 0);
        int[] arr16 = {0, 0, 10};
        System.out.println(Ex14.findTriplet(arr16) == 0);
        int[] arr17 = {0, 10, 10};
        System.out.println(Ex14.findTriplet(arr17) == 0);
        //more 4 num arrays
        int[] arr18 = {10, -5, -8, -2};
        System.out.println(Ex14.findTriplet(arr18) == 400);
        int[] arr19 = {-10, 5, -8, -2};
        System.out.println(Ex14.findTriplet(arr19) == 400);
        int[] arr20 = {10, -5, 8, -2};
        System.out.println(Ex14.findTriplet(arr20) == 100);
        int[] arr21 = {10, 5, -8, -2};
        System.out.println(Ex14.findTriplet(arr21) == 160);        
        int[] arr22 = {10, -5, 8, -2};
        System.out.println(Ex14.findTriplet(arr22) == 100);
        int[] arr23 = {10, 5, 8, -2};
        System.out.println(Ex14.findTriplet(arr23) == 400);
        int[] arr24 = {10, 5, -8, 2};
        System.out.println(Ex14.findTriplet(arr24) == 100);
        //check all negative arrays
        int[] arr25 = {-10, -5, -8, -2};
        System.out.println(Ex14.findTriplet(arr25) == -80);
        int[] arr26 = {-10, -5, 0, -2};
        System.out.println(Ex14.findTriplet(arr26) == 0);
        int[] arr27 = {-100, -20, -1, -2};
        System.out.println(Ex14.findTriplet(arr27) == -40);
        int[] arr28 = {-3, -3, -3, -3};
        System.out.println(Ex14.findTriplet(arr28) == -27);
        //check 4 or more arrays with all negative
        int[] arr29 = {-10, 2, 9, -2};
        System.out.println(Ex14.findTriplet(arr29) == 180);
        int[] arr30 = {-10, -5, 0, -2, 90};
        System.out.println(Ex14.findTriplet(arr30) == 900);
        int[] arr31 = {-100, -20, -1, -2, -9, -10};
        System.out.println(Ex14.findTriplet(arr31) == -18);
        int[] arr32 = {3, 3, 3, 3, 3, 3};
        System.out.println(Ex14.findTriplet(arr32) == 27);
        int[] arr33 = {-10, 2, 9, -2};
        System.out.println(Ex14.findTriplet(arr33) == 180);
        int[] arr34 = {-10, -5, 0, -2, 90};
        System.out.println(Ex14.findTriplet(arr34) == 4500);
        int[] arr35 = {-100, -20, -1, -2, -9, -10};
        System.out.println(Ex14.findTriplet(arr35) == -18);
        int[] arr36 = {3, 3, 3, 3, 3, 3};
        System.out.println(Ex14.findTriplet(arr36) == 27);
        int[] arr37 = {0, 0, 0, 0, 0, 0};
        System.out.println(Ex14.findTriplet(arr37) == 0);
        int[] arr38 = {0, 6, 0, 7, 0, -9};
        System.out.println(Ex14.findTriplet(arr38) == 0);
        int[] arr39 = {0, 0, 3, 0, -9, -10};
        System.out.println(Ex14.findTriplet(arr39) == 270);
        int[] arr40 = {0, 0, 5, 0, 0, 0};
        System.out.println(Ex14.findTriplet(arr40) == 0);
        int[] arr41 = {0, 30, 0, 10, 0, 20};
        System.out.println(Ex14.findTriplet(arr41) == 6000);
        int[] arr42 = {5, 3, 1, 0, 2, 4};
        System.out.println(Ex14.findTriplet(arr42) == 60);
    }
}
