public class Test{


     static void switchMethod1(int daynum){

        switch (daynum){
            case 1:
                System.out.println("sunday");
                break;
                case 2:
                    System.out.println("monday");
                    break;
                    default:
                        System.out.println("invalid");
        }
    }

    static void switchMethod2(int daynum){
    String day=switch(daynum){
        case 1 ->"Sunday";
        case 2 ->"Monday";
        case 3 ->"Tuesday";
        default ->"invalid";

    };
    System.out.println(day);
    }

 static  void patternDesign1(int num){

            for(int i=1;i<=num;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
         }

         static void patternDesign2(int num){

            for(int i=1;i<=num;i--){
                
            }
         }
 
    public static void main(String [] args){

        switchMethod1(2);
        switchMethod2(3);
        patternDesign1(5);

    }
}