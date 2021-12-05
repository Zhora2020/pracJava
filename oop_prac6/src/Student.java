//import java.util.concurrent.SynchronousQueue;

public class Student {

    public int iDNumber[];

    public Student(){
        iDNumber = new int[8];
        iDNumber[0] = 90;
        iDNumber[1] = 27;
        iDNumber[2] = 450;
        iDNumber[3] = 39;
        iDNumber[4] = 1;
        iDNumber[5] = 71;
        iDNumber[6] = 6;
        iDNumber[7] = 15;
    }

    public void insertSort(){
        int swp;
        for (int i = 1; i < iDNumber.length; i++){
            for (int j = i; (j>0) && (iDNumber[j]<iDNumber[j-1]); j--){
                swp = iDNumber[j-1];
                iDNumber[j-1] = iDNumber[j];
                iDNumber[j] = swp;
            }
        }
    }

    public void printIdArr(){
        for (int i = 0; i<iDNumber.length; i++){
            System.out.println(iDNumber[i]);
        }
        System.out.println("\n");
    }
}
