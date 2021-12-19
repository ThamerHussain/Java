package HW_THAMER_HUSSAIN_1_4_7;

public class Q9
{
    public static void main(String[] args) {
        int [][] b = {{1, 2, 3, 4, 5, 6, 7},{1, 2, 3, 4, 5, 6, 7},{1, 2, 3, 4, 5, 6, 7},
                {1, 2, 3, 4, 5, 6, 7},{1, 2, 3, 4, 5, 6, 7},{1, 2, 3, 4, 5, 6, 7}};
        int i, j;

        System.out.print("\nthe array b is:\n\n  {\n");
        for(i=0;i<b.length;i++) {
            if (i < b.length - 1) {
                System.out.print("     {");
                for (j = 0; j < b[i].length; j++)
                    if (j < b[i].length - 1)
                        System.out.print(b[i][j] + ", ");
                    else
                        System.out.print(b[i][j] + "}\n");
            } else {
                System.out.print("     {");
                for (j = 0; j < b[i].length; j++)
                    if (j < b[i].length - 1)
                        System.out.print(b[i][j] + ", ");
                    else
                        System.out.print(b[i][j] + "}\n  }\n");
            }
        }

        int[][] x = new int[6][1];
        for(i=0;i< b.length;i++)
                for (j = 0; j < b[i].length; j++)
                    if(j==0)
                        x[i][j] = b[i][0];


        for(i=0;i< b.length;i++)
            for (j = 0; j < b[i].length; j++)
                if(j==0)
                    b[i][j] = b[i][4];

        for(i=0;i< b.length;i++)
            for (j = 0; j < b[i].length; j++)
                if(j==4)
                    b[i][j] = x[i][0];

        System.out.print("\nthe array b after interchange column 1 with column 5 is:\n\n  {\n");
        for(i=0;i<b.length;i++) {
            if (i < b.length - 1) {
                System.out.print("     {");
                for (j = 0; j < b[i].length; j++)
                    if (j < b[i].length - 1)
                        System.out.print(b[i][j] + ", ");
                    else
                        System.out.print(b[i][j] + "}\n");
            } else {
                System.out.print("     {");
                for (j = 0; j < b[i].length; j++)
                    if (j < b[i].length - 1)
                        System.out.print(b[i][j] + ", ");
                    else
                        System.out.print(b[i][j] + "}\n  }\n");
            }
        }
    }
}
