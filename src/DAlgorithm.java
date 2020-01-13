import java.util.Random;

public class DAlgorithm {

    private int lineNum;        // the number of lines
    private char[] Vexs;       //  vertexes sets
    private int[][] Matrix;    // the matrix
    private static final int IntMax = 1000000;   // the max value of the int

    public DAlgorithm(char[] vexs, int[][] matrix) {

        int vertexLen = vexs.length;

        Vexs = new char[vertexLen];
        for (int i = 0; i < Vexs.length; i++)
            Vexs[i] = vexs[i];

        Matrix = new int[vertexLen][vertexLen];
        for (int i = 0; i < vertexLen; i++)
            for (int j = 0; j < vertexLen; j++)
                Matrix[i][j] = matrix[i][j];

        // counting the line
        lineNum = 0;
        for (int i = 0; i < vertexLen; i++)
            for (int j = i+1; j < vertexLen; j++)
                if (Matrix[i][j]!= IntMax)
                    lineNum++;
    }


    public void print() {
        System.out.printf("Matrix Graph:\n");
        for (int i = 0; i < Vexs.length; i++) {
            for (int j = 0; j < Vexs.length; j++)
                System.out.printf("%10d ", Matrix[i][j]);
            System.out.printf("\n");
        }

    }

    public void random() {
        for (int i = 0; i < Vexs.length; i++) {
            for (int j = 0; j < Vexs.length; j++)
            {
                Random rn = new Random();
                int answer = rn.nextInt(9) + 1;
                if(Matrix[i][j]!=1000000)
                    Matrix[i][j]=answer;
                System.out.printf("%10d ", Matrix[i][j]);
            }
        System.out.printf("\n");
        }

    }

    /*
     * The shortest path is the distance between vertex[vs] to any other vertexes
     *
     * Parameter：
     *       vs -- start vertex
     *     prev -- all the vertexes from Vertex[vs] to Vertex[i](all other vertexes)
     *     dist -- the distance between Vertex[vs] to Vertex[i]
     */



    public static void main(String[] args) {
        char[] vexs = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N'};
        int matrix[][] = {
                /**
                 * A= Senior Lot
                 * B= SecurityGate
                 * C= Rock
                 * D= EntCenter
                 * E= DiningHall
                 * F= Science
                 * G= Boys
                 * H= Chapel
                 * I= Alumni
                 * J= Girls
                 * K= VA
                 * L= UsClasses
                 * M= TeacherLot
                 * N= Admission
                 */
                        /*A*//*B*//*C*//*D*//*E*//*F*//*G*//*H*//*I*//*J*//*K*//*L*//*M*//*N*/
                /*A*/ {   0,   1, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax,   2},
                /*B*/ {   1,   0,   1, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax,   3,   1},
                /*C*/ {IntMax,   1,   0,   2,   3, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax},
                /*D*/ {IntMax, IntMax,   2,   0,   2, IntMax, IntMax,   5, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax},
                /*E*/ {IntMax, IntMax,   3,   2,   0,   1, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax},
                /*F*/ {IntMax, IntMax, IntMax, IntMax,   1,   0,   1, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax},
                /*G*/ {IntMax, IntMax, IntMax, IntMax, IntMax,   1,   0,   1, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax},
                /*H*/ {IntMax, IntMax, IntMax,   5, IntMax, IntMax,   1,   0,   2, IntMax, IntMax, IntMax, IntMax, IntMax},
                /*I*/ {IntMax, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax,   2,   0,   3, IntMax, IntMax, IntMax,   4},
                /*J*/ {IntMax, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax,   3,   0,   1, IntMax,  2, IntMax},
                /*K*/ {IntMax, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax,   1,   0,   1, IntMax, IntMax},
                /*L*/ {IntMax, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax,   1,   0,   1,   1},
                /*M*/ {IntMax,   3, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax,   2, IntMax,   1,   0, IntMax},
                /*N*/ {   2,   1, IntMax, IntMax, IntMax, IntMax, IntMax, IntMax,   4, IntMax, IntMax,   1, IntMax,   0},
        };
        DAlgorithm pG;
        pG = new DAlgorithm(vexs, matrix);
        pG.print();
        System.out.printf("\n");
        pG.random();

    }
}
