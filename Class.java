// import java.util.*;

// class Plot {
//     int pno;
//     String pname;
//     double parea;
//     Scanner sc = new Scanner(System.in);

//     void setData() {
//         System.out.println("Enter plot no : ");
//         pno = sc.nextInt();
//         System.out.println("Enter plot holder Name  : ");
//         pname = sc.next();
//         System.out.println("Enter plot area : ");
//         parea = sc.nextDouble();
//     }

//     void getData() {
//         System.out.println("Plot  No is: " + pno);
//         System.out.println("plot Holder  Name is: " + pname);
//         System.out.println("plot Holder  Name is: " + pname);
//     }

//     void total(Plot[] p) {
//         double totalArea = 0;
//         for (Plot ele : p) {
//             totalArea = totalArea + ele.parea;
//         }
//         System.out.println("Total Area = " + totalArea);

//     }

//     void plotDetails(Plot[] p, char c) {

//     }
// }

// class Class {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of Plots:");
//         int n = sc.nextInt();

//         Plot p[] = new Plot[n];
//         for (int i = 0; i < n; i++) {
//             p[i] = new Plot();
//             p[i].setData();
//         }
//         boolean b = true;
//         while (b) {
//             System.out.println("Enter 1 to get total plot area");
//             System.out.println("Enter 2 to get plot holder name by its first character");
//             System.out.println("Enter 3 to Exit");

//             System.out.println("Enter Your choice ");
//             int ch = sc.nextInt();
//             switch (ch) {
//                 case 1:
//                     Plot p1 = new Plot();
//                     p1.total(p);
//                     break;

//                 case 2:
//                     System.out.println("Enter character : ");
//                     char c = sc.next().toLowerCase().charAt(0);
//                     p1.plotDetails(p, c);
//                     break;

//                 case 3:
//                     b = false;
//                     break;
//             }

//         }
//     }
// }

class a {
    a() {
        System.out.println("a no arg");
    }
}

class b extends a {
    b(int x) {
        this();
        System.out.println("b int arg");
    }

    b() {
        System.out.println("b no arg");
    }
}

class c extends b {
    c() {
        System.out.println("c no arg");
    }

    c(int x) {
        super(20);
        System.out.println("c int arg");

    }
}

class main {
    public static void main(String[] args) {
        c s1 = new c();
        c s2 = new c(10);
    }
}
