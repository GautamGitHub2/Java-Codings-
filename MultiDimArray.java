package CoreJavaHandsOn;

public class MultiDimArray {
    public static void main(String[] args) {

       /* 
        int a[][]=new int[3][2];

        a[0][0]=100;
        a[0][1]=200;

        a[1][0]=300;
        a[1][1]=400;

        a[2][0]=500;
        a[2][1]=600;

        System.out.println(a[0][0]); */

        int a[][]={{100,200},{300,400},{500,600},{700,800}};
        System.out.println(a[0][0]); 
        System.out.println(a[1][0]); 

        System.out.println("Number of rows:"+a.length);//here length is a variable not a method, method always end with the small brackets.
        System.out.println("Number of columns:"+a[0].length);

        for(int i=0;i<a.length;i++)//outer loop, row length
        {
            for(int j=0;j<a[i].length;j++)//inner loop, column length
            {
                System.out.println(a[i][j]);
                /*
                 First inner loop will be completed, if inner loop is not completed then it will not go for outer loop. if it becomes false/exited then only it will go for outer loop otherwise it will keep running in inner loop.@interface  
                 
                 when it goes to outer loop then and condition satisfies then come to inner loop and 'j' becomes 0 again
                */

            }
        }

        //Enhanced for loop

        System.out.println("Enhanced For Loop");

        for(int r[]:a)// this is single dimentional array assigned to r[] as 'a' that contains 100 & 200
        {
            for(int i:r)
            {
                System.out.println(i);// here it will read 1st row i.e. 100 & 200 then it will go to next row there it will read 300 & 400
            }
        }
/*
1st here 1=0, so it will print 100,200 this will be assigned to 'r' that is single D array
again it will check next and become 2 and it will find 300, 400 and will assign to r
it will continue till the values are not completed.

*/


        
    }
    
}
