package HW_THAMER_HUSSAIN_1_4_7;

public class Q8
{
    public static void main(String[] args) {
        int [][] b = {{1, 1, 1, 1, 1, 1, 1}, {2, 2, 2, 2, 2, 2, 2},{3, 3, 3, 3, 3, 3, 3},
                {4, 4, 4, 4, 4, 4, 4},{5, 5, 5, 5, 5, 5, 5},{6, 6, 6, 6, 6, 6, 6}};
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

        int[] x = b[1];
        b[1] = b[3];
        b[3] = x;

        System.out.print("\nthe array b after interchange row 2 with row 4 is:\n\n  {\n");
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
