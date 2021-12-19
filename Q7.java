package HW_THAMER_HUSSAIN_1_4_7;

public class Q7
{
    public static void main(String[] args)
    {
        //(5*7)
        int [][] a = {{1, 1, 1, 1, 1, 1, 1},{2, 2, 2, 2, 2, 2, 2},
                {3, 3, 3, 3, 3, 3, 3},{4, 4, 4, 4, 4, 4, 4},{5, 5, 5, 5, 5, 5, 5}};
        //(7*3)
        int [][] b = {{1, 1, 1},{2, 2, 2},{3, 3, 3},{4, 4, 4},
                {5, 5, 5},{6, 6, 6},{7, 7, 7}};

        int [][] c = new int [5][3];
        int i, j, k;

        for(i=0;i< c.length;i++)
            for(j=0;j<c[i].length;j++)
                for(k=0;k< b.length;k++)
                    c[i][j] = a[i][k] * b[k][j];

        //to print the array
        System.out.print("\nthe array a is:\n\n  {\n");
        for(i=0;i<a.length;i++)
        {
            if (i < a.length - 1)
            {
                System.out.print("     {");
                for (j = 0; j < a[i].length; j++)
                    if (j < a[i].length - 1)
                        System.out.print(a[i][j] + ", ");
                    else
                        System.out.print(a[i][j] + "}\n");
            }
            else
            {
                System.out.print("     {");
                for (j = 0; j < a[i].length; j++)
                    if (j < a[i].length - 1)
                        System.out.print(a[i][j] + ", ");
                    else
                        System.out.print(a[i][j] + "}\n  }\n");
            }

        }
        //to print the array
        System.out.print("\nthe array b is:\n\n  {\n");
        for(i=0;i<b.length;i++)
        {
            if (i < b.length - 1)
            {
                System.out.print("     {");
                for (j = 0; j < b[i].length; j++)
                    if (j < b[i].length - 1)
                        System.out.print(b[i][j] + ", ");
                    else
                        System.out.print(b[i][j] + "}\n");
            }
            else
            {
                System.out.print("     {");
                for (j = 0; j < b[i].length; j++)
                    if (j < b[i].length - 1)
                        System.out.print(b[i][j] + ", ");
                    else
                        System.out.print(b[i][j] + "}\n  }\n");
            }

        }
        //to print the array
        System.out.print("\nThe resultant array of their multiplication is:\n\n  {\n");
        for(i=0;i<c.length;i++)
        {
            if (i < c.length - 1)
            {
                System.out.print("     {");
                for (j = 0; j < c[i].length; j++)
                    if (j < c[i].length - 1)
                        System.out.print(c[i][j] + ", ");
                    else
                        System.out.print(c[i][j] + "}\n");
            }
            else
            {
                System.out.print("     {");
                for (j = 0; j < c[i].length; j++)
                    if (j < c[i].length - 1)
                        System.out.print(c[i][j] + ", ");
                    else
                        System.out.print(c[i][j] + "}\n  }\n");
            }

        }
    }
}
