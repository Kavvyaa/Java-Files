class array {
   array() {
   }

   public static int LinearSearch(int[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         if (var0[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   public static int BinarySearch(int[] var0, int var1) {
      int var2 = 0;
      int var3 = var0.length - 1;

      while(var2 <= var3) {
         int var4 = (var2 + var3) / 2;
         if (var1 == var0[var4]) {
            return var4;
         }

         if (var0[var4] < var1) {
            var2 = var4 + 1;
         } else {
            var3 = var4 - 1;
         }
      }

      return -1;
   }

   public static void reverseArray(int[] var0) {
      int var1 = 0;

      for(int var2 = var0.length - 1; var1 <= var2; --var2) {
         int var3 = var0[var1];
         var0[var1] = var0[var2];
         var0[var2] = var3;
         ++var1;
      }

   }

   public static void pairInArray(int[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         for(int var2 = var1 + 1; var2 < var0.length; ++var2) {
            System.out.print("(" + var0[var1] + "," + var0[var2] + ")");
         }

         System.out.println();
      }

   }

   public static void SubArray(int[] var0) {
      boolean var1 = false;
      int var2 = Integer.MIN_VALUE;

      for(int var3 = 0; var3 < var0.length; ++var3) {
         for(int var4 = var3; var4 < var0.length; ++var4) {
            int var6 = 0;

            for(int var5 = var3; var5 <= var4; ++var5) {
               var6 += var0[var5];
            }

            System.out.println("current sum is " + var6);
            if (var6 > var2) {
               var2 = var6;
            }
         }
      }

      System.out.println();
      System.out.println("maximum sum : " + var2);
   }

   public static void SubArray1(int[] var0) {
      boolean var1 = false;
      int var2 = Integer.MIN_VALUE;
      int[] var3 = new int[var0.length];
      var3[0] = var0[0];

      int var4;
      for(var4 = 1; var4 < var3.length; ++var4) {
         var3[var4] = var3[var4 - 1] + var0[var4];
      }

      for(var4 = 0; var4 < var0.length; ++var4) {
         for(int var5 = var4; var5 < var0.length; ++var5) {
            int var6 = var4 == 0 ? var3[var5] : var3[var5] - var3[var4 - 1];
            System.out.println(var6);
            if (var6 > var2) {
               var2 = var6;
            }
         }
      }

      System.out.println("maximum sum :" + var2);
   }

   public static void SubArray3(int[] var0) {
      int var1 = 0;
      int var2 = Integer.MIN_VALUE;

      for(int var3 = 0; var3 < var0.length; ++var3) {
         var1 += var0[var3];
         if (var1 < 0) {
            var1 = 0;
         }

         if (var1 > var2) {
            var2 = var1;
         }
      }

      System.out.println(var2);
   }

   public static int trappedRainwater(int[] var0) {
      int var1 = var0.length;
      int[] var2 = new int[var1];
      var2[0] = var0[0];

      for(int var3 = 1; var3 < var1; ++var3) {
         var2[var3] = Math.max(var0[var3], var2[var3 - 1]);
      }

      int[] var7 = new int[var1];
      var7[var1 - 1] = var0[var1 - 1];

      int var4;
      for(var4 = var1 - 2; var4 >= 0; --var4) {
         var7[var4] = Math.max(var0[var4], var7[var4 + 1]);
      }

      var4 = 0;

      for(int var6 = 0; var6 < var0.length; ++var6) {
         int var5 = Math.min(var2[var6], var7[var6]);
         var4 += var5 - var0[var6];
      }

      return var4;
   }

   public static int stocks(int[] var0) {
      int var1 = Integer.MAX_VALUE;
      int var2 = 0;

      for(int var3 = 0; var3 < var0.length; ++var3) {
         if (var1 < var0[var3]) {
            int var4 = var0[var3] - var1;
            var2 = Math.max(var2, var4);
         } else {
            var1 = var0[var3];
         }
      }

      return var2;
   }

   public static boolean samearray(int[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         for(int var2 = var1 + 1; var2 < var0.length; ++var2) {
            if (var0[var1] == var0[var2]) {
               return true;
            }
         }
      }

      return false;
   }

   public static void bubblesort(int[] var0) {
      boolean var1 = false;
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < var0.length - 1; ++var3) {
         for(int var4 = 0; var4 < var0.length - 1 - var3; ++var4) {
            if (var0[var4] > var0[var4 + 1]) {
               int var5 = var0[var4];
               var0[var4] = var0[var4 + 1];
               var0[var4 + 1] = var5;
            }

            ++var2;
         }
      }

      for(var3 = 0; var3 < var0.length; ++var3) {
         System.out.print(var0[var3] + " ");
      }

      System.out.println(var2);
   }

   public static void selection_sort(int[] var0) {
      int var1;
      for(var1 = 0; var1 < var0.length - 1; ++var1) {
         int var2 = var1;

         int var3;
         for(var3 = var1 + 1; var3 <= var0.length - 1; ++var3) {
            if (var0[var2] > var0[var3]) {
               var2 = var3;
            }
         }

         var3 = var0[var2];
         var0[var2] = var0[var1];
         var0[var1] = var3;
      }

      for(var1 = 0; var1 < var0.length; ++var1) {
         System.out.print(var0[var1] + " ");
      }

   }

   public static void insertion_sort(int[] var0) {
      int var1;
      for(var1 = 0; var1 < var0.length; ++var1) {
         int var2 = var0[var1];

         int var3;
         for(var3 = var1 - 1; var3 >= 0 && var0[var3] > var2; --var3) {
            var0[var3 + 1] = var0[var3];
         }

         var0[var3 + 1] = var2;
      }

      for(var1 = 0; var1 < var0.length; ++var1) {
         System.out.print(var0[var1] + " ");
      }

   }

   public static void count_sort(int[] var0) {
      int var1 = Integer.MIN_VALUE;

      for(int var2 = 0; var2 < var0.length; ++var2) {
         var1 = Math.max(var1, var0[var2]);
      }

      int[] var5 = new int[var1 + 1];

      int var3;
      for(var3 = 0; var3 < var0.length; ++var3) {
         ++var5[var0[var3]];
      }

      var3 = 0;

      for(int var4 = 0; var4 < var5.length; ++var4) {
         while(var5[var4] > 0) {
            var0[var3] = var4;
            ++var3;
            int var1 = var5[var4]--;
         }
      }

   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{1, 2, 3, 4, 5};
      bubblesort(var1);
   }
}
