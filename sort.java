class sort {
    public static void bubbleSort(int num[]){
        int t=0;
        int swap = 0;
        for (int i = 0; i < num.length-1; i++) {       // counts number of terns
            for (int j = i+1; j < num.length; j++) {
                if (num[i] > num[j]) {
                     t = num[j];
                     num[j]= num[i];
                     num[i]= t;
                }
                swap ++ ;
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+ " ");
        }
        System.out.println(swap);
    }

    public static void selectionSort(int num[]){
        for (int i = 0; i < num.length-1; i++) {
            int minimum = i;
            for (int j = i+1; j < num.length; j++) {
                if (num[minimum] > num[j]) {     // if j is smaller than min , then it will become min
                    minimum = j;
                }
            }
            int t = num[minimum];
            num[minimum] = num[i];
            num[i] = t;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int num[] = {6, 1, 2, 3, 4, 5};
        selectionSort(num);
    }
}