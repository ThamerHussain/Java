package HW_THAMER_HUSSAIN_1_4_7;

public class Q1
{
    public static void main(String[] args)
    {
        int i, j;
        int[][] Y = {{1, 2, 3, 4, 5, 6},{7, 8, 9, 10, 11, 12},{13, 14, 15, 16, 17, 18},{19, 20, 21, 22, 23, 24}};

        //to print the array
        System.out.print("\nthe array Y is:\n\n  {\n");
        for(i=0;i<Y.length;i++) {
            if (i < Y.length - 1) {
                System.out.print("     {");
                for (j = 0; j < Y[i].length; j++)
                    if (j < Y[i].length - 1)
                        System.out.print(Y[i][j] + ", ");
                    else
                        System.out.print(Y[i][j] + "}\n");
            } else {
                System.out.print("     {");
                for (j = 0; j < Y[i].length; j++)
                    if (j < Y[i].length - 1)
                        System.out.print(Y[i][j] + ", ");
                    else
                        System.out.print(Y[i][j] + "}\n  }\n");
            }
        }
        int max = Y[0][0];
            for(i=0;i<Y.length;i++)
                for(j=0;j<Y[i].length;j++)
                    if(Y[i][j]>max)
                        max = Y[i][j];
        System.out.print("\nand the max value in it is: "+max+"\n");
    }
}

