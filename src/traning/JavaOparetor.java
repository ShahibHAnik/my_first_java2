package traning;

public class JavaOparetor {
    public static void main(String[] args) {

        String firstname = "Shahib";
        String lastname = "Anik";
        String fullName = firstname+lastname;
        System.out.println(fullName);

//        int a = 30;
//        int b = 20;
//    int c = a+b;
//        System.out.println(c);
        //= = opearetor
        //a, b= oprands
        // opretor 5 types
        // arithmetic,( Binary/unary)
        // relational,
        // logical,
        // bitwise,(bit manipulation)
        // assignment

        // Binary: +, -, *, /, %
        //unary ++ --
        // ++ [a=a+1]

        int h = 2;
        int k =h++; //h++ that means h+1 , This called post increment
        int i = 11;
        int j = ++i; // this called pre increment
        System.out.println("Post increment =" +k);
        System.out.println("Pre increment=" + j);

        //Relational Oparetor
        // ==, !=( not equal ), >=, <= ,< ,>
        int y = 10;
        int y1= 10;
        System.out.println(y ==y1); // try all this function for practice ==, !=( not equal ), >=, <= ,< ,>
        System.out.println(y <= y1); //when it equal greater or less then it always show true
        int a1 =10;
        int b1= 20;
        int c1 =30;
        System.out.println( a1 > b1 && a1 < c1);
        System.out.println((a1>b1) || (a1<c1));

        // assignmenrt oparetor
        //=,+=, -=, *=,/=
        int aa = 10;
        //aa = aa+10
        aa *= 9;
        System.out.println(aa);


    }





}
