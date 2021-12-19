package HW_THAMER_HUSSAIN_1_4_7;

public class Q10 {
    public static void main(String[] args) {

        int[][] b = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 0},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 0},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 0},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}};
        int i, j, x[][] = new int[10][10];

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

        for (i = 0; i < x.length; i++){
            for (j = 0; j < x[i].length; j++)
                x[i][j] = b[j][i];
        }
        System.out.print("\nthe transpose array is:\n\n  {\n");
        for(i=0;i<x.length;i++) {
            if (i < x.length - 1) {
                System.out.print("     {");
                for (j = 0; j < x[i].length; j++)
                    if (j < x[i].length - 1)
                        System.out.print(x[i][j] + ", ");
                    else
                        System.out.print(x[i][j] + "}\n");
            } else {
                System.out.print("     {");
                for (j = 0; j < x[i].length; j++)
                    if (j < x[i].length - 1)
                        System.out.print(x[i][j] + ", ");
                    else
                        System.out.print(x[i][j] + "}\n  }\n");
            }
        }

    }

}

