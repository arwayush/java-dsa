//        #
//      ##
//    ###
//  ####
//#####
//print the staircase




package hackerrank;

public class Staircase {
    public static void main(String[] args) {
        int n = 5;
////        #
////      ##
////    ###
////  ####
////#####
//        for (int i = 1; i <=n; i++) {
//           //space printing
//            for (int j = 1; j <=n-i; j++) {
//                System.out.print("  ");
//            }
//
//            //printinng the #
//            for (int j = 1; j <=i; j++) {
//                System.out.print("#");
//            }
//            System.out.println();
//        }


        //       #####
        //      #####
        //    #####
        //  #####
        //#####
        //for printing tilted parallalogram use this logic
//        for (int i = 1; i <=n; i++) {
//            //space printing
//            for (int j = 1; j <= n-i; j++) {
//                System.out.print("  ");
//            }
//
//            //printinng the #
//            for (int j = n; j>=1; j--) {
//                System.out.print("#");
//            }
//            System.out.println();
//        }

        //#####
        //####
        //###
        //##
        //#
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=n-i+1; j++) {
//                System.out.print("#");
//            }
//            System.out.println();
//        }


        //*****
        //_****
        //__***
        //___**
        //____*

        for (int i = 0; i <n; i++) {

            //printing the space
            for (int j = 0; j <i; j++) {
                System.out.print("  ");
            }

            //printing the #
            for (int j =  0; j<n-i ; j++) {
                System.out.print("#");
            }
            System.out.println();
        }



    }
}
