
public class app {
    public static void main(String[] args) {
        // System.out.println("Hello World"); // also same as System.out.print("Hello World\n")-- \n at the end inside quotes gives newline
        // Scanner scanner=new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // String name=scanner.nextLine();
        // System.out.println("Your name is "+name);
        // System.out.print("Enter your age: ");
        // Integer age=scanner.nextInt();
        // System.out.println("Your age is "+age);
        // scanner.nextLine();  // After nextInt() if we want to accept a string and when we press enter , that enter is taken as the string , so we need to provide another scanner.nextLine() before accepting the real string
        // System.out.print("Enter your country: ");
        // String country=scanner.nextLine();
        // System.out.println("Your country is "+country);
        // scanner.close();


        //Calculate the area of the rectangle

        // Scanner scannner    =   new Scanner(System.in);
        // System.out.print("Enter the length of the rectangle : ");
        // double length   =  scannner.nextDouble();
        // System.out.print("Enter the bread of the rectangle : ");
        // double breadth   =  scannner.nextDouble();
        // Double area =   length*breadth;
        // System.out.println("The area of rectangle is : "+area+" m^2");
        // scannner.close();

        //Random numbers

        // Random random=new Random();
        // int number1;
        // number1=random.nextInt(1,7); // 1 is incluseive and 7 not. generates number between 1 and 6 // we can also use double to include decimals or boolean to simulate a coin flip
        // System.out.println(number1);

        // System.out.println(Math.PI);
        // System.out.println(Math.E); // Euler's constant

        // double result;
        // result=Math.pow(2,3);
        // result=Math.abs(-3);
        // result=Math.sqrt(10);
        // result=Math.round(3.6);  // rounds the double
        // result=Math.ceil(3.2);  //always round to next number

        // result=Math.floor(3.2); //always round to below number or that is 3.0
        // result=Math.max(3 ,2); //finds maximum of 2 number
        // result=Math.min(3,2); //finds min of 2 numbers
        // System.out.println(result);

        //Hypotenuse of the trianger c= squareroot(a*a+ b*b)

        // Scanner scanner=new Scanner(System.in);
        // double sideA , sideB , result;
        // System.out.print("Enter the length of the triangle side a");
        // sideA=scanner.nextDouble();
        // System.out.print("Enter the length of the triangle side b");
        // sideB=scanner.nextDouble();
        // result=Math.sqrt(Math.pow(sideA, 2)+Math.pow(sideB,2));
        // System.out.println("The result is "+result);

        //Circumference of a circle
        // Scanner scanner=new Scanner(System.in);
        // double radius , circumference;
        // System.out.print("Enter the radius of the circle ");
        // radius=scanner.nextDouble();
        // circumference   =   2*Math.PI*radius;
        // System.out.printf("The circumference is %.1fcm² \n" , circumference);
        // scanner.close();


        //Printf
        // String name = "Suparna";
        // char firstLetter = 'S';
        // int age = 30;
        // double height = 165.3;
        // boolean employed = false;

        // System.out.printf("Your name is %s\n ",name);
        // System.out.printf("Your name starts with %c\n ",firstLetter);
        // System.out.printf("Your age is %d\n", age);
        // System.out.printf("Your height is %f\n", height);
        // System.out.printf("You are employed? %b\n",employed);

        // System.out.printf("%s is %d years old\n", name,age);
        // double a=9.99 , b =100.45 , c=-56.45;

        // System.out.printf("First number is %f\n", a);
        // System.out.printf("Second number is %f\n", b);
        // System.out.printf("Third number is %f\n", c);


        // //Just 2 decimal places
        // System.out.printf("First number is %.2f\n", a);
        // System.out.printf("Second number is %.2f\n", b);
        // System.out.printf("Third number is %.2f\n", c);

        // //Output a plus
        // System.out.printf("First number is %+.2f\n", a);
        // System.out.printf("Second number is %+.2f\n", b);
        // System.out.printf("Third number is %+.2f\n", c); // The negative number will not have plus

        // //Comma separator for grouping
        // double a1=9000.99 , b1 =100000.45 , c1=-56000.45;
        // System.out.printf("First number is %,.2f\n", a1);
        // System.out.printf("Second number is %,.2f\n", b1);
        // System.out.printf("Third number is %,.2f\n", c1); // every thousand will have comma separator

        // // Negative numbers will be enclosed in parenthesis when a single left parenthesis is given
        // System.out.printf("First number is %(.2f\n", a);
        // System.out.printf("Second number is %(.2f\n", b);
        // System.out.printf("Third number is %(.2f\n", c);


        // //space will display minus if negative and a space if positive
        // System.out.printf("First number is % .2f\n", a);
        // System.out.printf("Second number is % .2f\n", b);
        // System.out.printf("Third number is % .2f\n", c);



        int a=10 , b=200,c=30000;

        //0 padding  : fills with  zero to align all number
        System.out.printf("%05d\n", a);
        System.out.printf("%05d\n", b);
        System.out.printf("%05d\n", c);

        //Right padding : all number to the right , spaces to the left to align numbers
        System.out.printf("%5d\n", a);
        System.out.printf("%5d\n", b);
        System.out.printf("%5d\n", c);

        //Left padding : all number to the left , spaces to the right to align numbers
        System.out.printf("%-5d\n", a);
        System.out.printf("%-5d\n", b);
        System.out.printf("%-5d\n", c);


        //char letter =stringName.charAt(2) //returns the character at agiven index
        //int indexOf=stringName.indexOf("a")// rteurns the index of the given character
        //stringName.lastIndex("") if  characters exist more than once , gives the last 

        //toLowerCase // converts to all letters lowercase
        //toUpperCase // converts to all letters uppercase
        //trim() - removes all spaces
        //replace("a","5") // replaces a with 5
        //isEmpty() = checks if empty 
        //contains(" ") // check if space exist in the string
        //equals("string")// check if the string is equsl to string // case sensitive// to ignore case sensitivity use equalsIgnoreCase
        //string.substring(start,end) // return a new string with portion of the string starting from start till end index where start is inclusive and end is exclusive
        //ternary operator : variable = condition? iftrue : iffalse
    }
}

