public class Task3 {

    private String name;
    private int id;

    Task3(String name, int id){
        this.name = name;
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

    Task3(){
        name = "";
        id = 0;
    }

    public String toString1(){
        return this.name + " " + this.id;
    }

    public static void Sort1(Task3[] arr){
        Task3 swp = new Task3();
        for (int i = 1; i < arr.length; i++){
            for (int j = i; (j>0) && (arr[j].getId()<arr[j-1].getId()); j--){
                swp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = swp;
            }
        }
    }

    public static Task3 [] joinArray(Task3 [] arrayA, Task3 [] arrayB) {

        Task3[] arrayC =  new Task3 [arrayA.length + arrayB.length];
        int posA = 0, posB = 0;

        for (int i = 0; i < arrayC.length; i++) {
            if((posA < arrayA.length) && (posB < arrayB.length)){
                if (arrayA[posA].getId() < arrayB[posB].getId()) {
                    arrayC[i] = arrayA[posA];
                    //System.out.println("добавленно "+arrayA[posA].getId()+"\n");
                    posA++;
                }
                else if (arrayA[posA].getId() > arrayB[posB].getId()){
                    arrayC[i] = arrayB[posB];
                    //System.out.println("добавленно "+arrayB[posB].getId()+"\n");
                    posB++;
                }
            }
            else if (posA >= arrayA.length && (posB < arrayB.length)){
                arrayC[i] = arrayB[posB];
                //System.out.println("добавленно else "+arrayB[posB].getId()+"\n");
                posB++;
            }
            else{
                arrayC[i] = arrayA[posA];
                //System.out.println("добавленно else "+arrayB[posA].getId()+"\n");
                posA++;
            }
        }
        return arrayC;
    }
}
