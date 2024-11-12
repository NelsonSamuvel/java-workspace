    package practice;


    import java.util.Scanner;

    //Npr tells how many ways to choose and order the items because in npr order matters
    public class NPR {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Total number of items : ");
            int n =sc.nextInt();
            System.out.print("The total items that u want to select : ");
            int r = sc.nextInt();

            if(r > n){
                System.out.println("The no. of items that u want to select must be less than total items");
            }
            else{
                int factN = 1;

                //optimized way we need to calculate number of ways for only
                //selected items not unselected that's why it is (n-r)=> remaining items that are unselected
                for(int i = n;i>n-r;i--){
                    factN *= i;
                }

//                for(int i = n;i>1;i--){
//                    factN *= i;
//                }
//                int rem = n-r;
//                int factRem = 1;
//                for(int i=rem ;i>1;i--){
//                    factRem *=i;
//                }
//
//                int npr = factN / factRem;

                System.out.print("NPR : " + factN);

            }
        }
    }
