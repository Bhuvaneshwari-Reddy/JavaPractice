
// public class Sample{

//     public static void main(String[] args){
//         System.out.println("Hello world");
//         String name="Bhuvana";
//         System.out.println(name);
//         int myAge=24;
//         System.out.println(myAge);
//         System.out.println("My name is "+name+ " and my age is "+myAge);
//     }
    
// }
// public class  Sample{
//     public static void main(String[] args){

//         int myint=10;
//         double mydouble=myint;
//         System.out.println(myint);
//          System.out.println(mydouble);
        

//     }
// }

// public class Sample{
//     public static void main (String[] args){
//         double mydouble=12.12d;
//         int myint=(int)mydouble;
//         String firstname="Bhuvana";
//         String lastName="reddy";
//         System.out.println(mydouble);
//         System.out.println(myint);
//         System.out.println(firstname.concat(lastName));
//         System.out.println(Math.min(20,10));
//         System.out.println(Math.max(20,10));
//         System.out.println(Math.abs(-65));
//         System.out.println(Math.sqrt(9));
//         System.out.println((int)(Math.random()*100));
//     }
// }

public class Sample{
    public static void main(String[] args){
         int x=20,y=64;
        System.out.println(x>y);
        int myage=24;
        int votingAge=18;
        if(myage>=votingAge){
            System.out.println("Eligible for voting");

        }else if(myage<votingAge){
            System.out.println("Not eligible for voting");
        }else{
            System.out.println("Invalid");
        }
//method 1
int daynum=4;
switch(daynum){
       case 1:
        System.out.println("Monday");
        break;
       case 2 :
        System.out.println("Tuesday");
        break;
        case 3:
        System.out.println("Wednesday");
        break;
        case 4:
        System.out.println("Thursday");
        break;
        case 5:
        System.out.println("Friday");
        break;
        case 6:
        System.out.println("Saturday");
        break;
        case 7:
        System.out.println("Sunday");
        break;
        default:
         System.out.println("Invalid");
}
//method 2
    int day=5;
    String dayname=switch(day){
        case 1 ->"Monday";
        case 2 -> "Tuesday";
        case 3 -> "Wednesday";
        case 4 ->"Thursday";
        case 5 -> "Friday";
        case 6 -> "Saturday";
        case 7 ->"Sunday";
        default -> "Invalid day";
    };
    System.out.println(dayname);
    
//Loops
int i=0;
while(i<5){
    System.out.println(i);
    i++;
}
int j=0;
do{
    System.out.println(j);
    j++;
}while(j<4);

for(int m=0;m<=10;m++){
    System.out.println(m);
}
 String[] capitals={"Bangalore","Delhi","Hyderabad","Chennai"};
for(String q:capitals){
    System.out.println(q);
}

//arrays
String[] cars={"Volvo","hyndai","Bmw","Maruthi"};
System.out.println(cars[0]);
cars[0]="Suzuki";
System.out.println(cars[0]);
System.out.println(cars.length);
for(int k=0;k<cars.length;k++){
    System.out.println(cars[k]);
}
//using for loop
int numbers[]={20,30,40,26,45,68};
float avg,sum=0;
for(int age=0;age<numbers.length;age++){
    sum=sum+numbers[age];
}
 avg=sum / numbers.length;
System.out.println(avg);

//using for-each loop
int numbers1[]={20,30,40,26,45,68};
float avg1,sum1=0;
for(int num:numbers1){
    sum1=sum+num;
}
 avg1=sum1 / numbers1.length;
System.out.println(avg1);


//multidim array
// int[][]myNums={{1,2,3,4},{5,6,7}};
// for(int l=0;l<myNums.length;l++){
//     for(int m=0;m<myNums[l].length;m++){
//         System.out.println(myNums[l][m]);
//     }
// }

//using foreach loop
int[][]myNums={{1,2,3,4},{5,6,7}};
for(int[]row:myNums){
    for(int n:row){
        System.out.println(n);
    }
}
    }
    
}
