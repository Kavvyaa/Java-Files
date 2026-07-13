import java.util.ArrayList;
public class arrayList {

   public static void swap(ArrayList<Integer>list, int idx1, int idx2){
      int temp = list.get(idx1);
      // idx1 = list.get(idx2);
      // idx2 = list.get(temp);
      list.set(idx1, list.get(idx2));
      list.set(idx2, temp);
   }

   // BRUTEFORCE APPROACH
   public static int storeWaterBrute(ArrayList<Integer> height){
      int totalwater =0;
      for (int i = 0; i < height.size(); i++) {
         for (int j = i+1; j < height.size(); j++) {
            int ht = Math.min(height.get(i), height.get(j));
            int width = j-i;
            int currWater = ht*width;
            totalwater = Math.max(totalwater, currWater);
         }
      }
      return totalwater;
   }

   //2-POINTER APPROACH
   public static int storeWater(ArrayList<Integer> height){
      int maxWater=0;
      int lp=0;
      int rp=height.size()-1;
      while (lp<rp) {
         int ht = Math.min(height.get(rp), height.get(lp));
         int width = rp-lp;
         int currWater = ht*width;
         maxWater = Math.max(maxWater, currWater);
         if (lp<rp) {
            lp++;
         }
         else if(lp>rp){
            rp--;
         }
      }
      return maxWater;
   }

   public static void pairArray(ArrayList<Integer> height){
      for (int i = 0; i < height.size(); i++) {
         for (int j = i+1; j < height.size(); j++) {
            System.out.print("["+height.get(i)+","+height.get(j)+"]");
         }
         System.out.println();
      }
   }

   //BRUTEFORCE APPROACH
   public static boolean pairSum1(ArrayList <Integer> list, int target){
      for (int i = 0; i < list.size(); i++) {
         for (int j = i+1; j < list.size(); j++) {
            if (list.get(i)+list.get(j)==target) {
               System.out.println(list.get(i)+","+list.get(j));
               return true;
            }
         }
      }
      return false;
   }

   public static boolean pairSumPointer1(ArrayList<Integer>list, int target){
      int lp=0;
      int rp=list.size()-1;
      while (lp<rp) {
         if (list.get(lp)+list.get(rp)==target) {
            System.out.println(list.get(lp)+","+list.get(rp));
            return true;
         }
         else if(list.get(lp)+list.get(rp)>target){
            rp--;
         }
         else if(list.get(lp)+list.get(rp)<target){
            lp++;
         }
      }
      return false;
   }

   public static boolean pairSum2(ArrayList<Integer>list, int target){
      int bp=-1;
      int n = list.size();
      for (int i = 0; i < list.size(); i++) {
         if (list.get(i)>list.get(i+1)) {
            bp=i;
            break;
         }
      }
         int lp=bp+1;
         int rp=bp;
         while (lp!=rp) {
            if (list.get(lp)+list.get(rp)==target) {
               return true;
            }
            if (list.get(lp)+list.get(rp)>target) {
               rp=(n+rp-1)%n;
            }
            else if (list.get(lp)+list.get(rp)<target) {
               lp=(lp+1)%n;
            }
      }
      return false;
   }
   public static void main(String[] args) {
      // ArrayList <ArrayList<Integer>> mainlist = new ArrayList<>();
      ArrayList <Integer> list1 = new ArrayList<>();
      // ArrayList <Integer> list2 = new ArrayList<>();
      // ArrayList <Integer> list3 = new ArrayList<>();
      for (int i = 1; i <= 5; i++) {
         list1.add(i*1);
         // list2.add(i*2);
         // list3.add(i*3);
      }
      // mainlist.add(list1);
      // mainlist.add(list2);
      // mainlist.add(list3);
      // System.out.println(mainlist);
      // for (int i = 0; i < mainlist.size(); i++) {
      //    ArrayList <Integer> currlist = mainlist.get(i);
      //    for (int j = 0; j < currlist.size(); j++) {
      //       System.out.print(currlist.get(j)+ " ");
      //    }
      //    System.out.println();
      // }
      // int max = Integer.MIN_VALUE;
      // for (int i = 0; i <list1.size() ; i++) {
      //    if (max<list1.get(i)) {
      //       max = list1.get(i);
      //    }
      // }
      // System.out.println("max element: "+max);
      ArrayList <Integer> list = new ArrayList<>();
      list.add(11);
      list.add(15);
      list.add(6);
      list.add(8);
      list.add(9);
      list.add(10);
      int target=15;
      // System.out.println(pairSum(list, target));
      // pairArray(height);
      System.out.println(pairSum2(list, target));
   }
}