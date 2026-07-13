
 class pattern {
  public static void patter(){
    int k=1;
    for(int i=1; i<=5;i++){
      for(int j=1; j<=5; j++){
        System.out.print(k);
      }
      k++;
      System.out.println();
    }
    }


public static void diamond (int n) {
   int sp= n-1;
   int st=1;
      int no_of_lines = 1;
      while(no_of_lines <= 2*n-1) {       // 2n-1
        for (int i = 0; i < sp; i++) {
            System.out.print("  ");
        }

        for (int i = 0; i < st; i++) {
            System.out.print("* ");
        }

      if(no_of_lines< n) {
        st = st + 2;
        sp--;
      }
      else{
        st = st-2;
        sp++;
      } 
    no_of_lines++;
    System.out.println();
    }
} 

 

  // INVERTED & ROTATED HALF PYRAMID

public static void IRHPyramid(int n) {
      int st = 1;
      int sp = n-1;
      int nol = 1;
      while (nol<=n) {
        for (int i = 0; i < sp; i++) {
          System.out.print("  ");
        }
        sp--;
        for (int j = 1; j <=st; j++) {
          System.out.print(j+"   ");
        }
        
        st++;
        nol++;
        System.out.println();
      }
    }
  


       
        // INVERTED HALF PYRAMID

    public static void IHPyramid(int n) {
      for (int i = n; i > 1; i--) {
        for (int j = 1; j < i; j++) {
          System.out.print(j);
        }
    
        System.out.println();
      }
    }
  
   

      // 0 - 1 TRIANGLE

    public static void triangle(int n) {
      for (int i = 0; i <= n; i++) {
        for (int j = 0; j < i; j++) {
           if ((i+j)%2==0) {
            System.out.print("0 ");
          }
          else {
            System.out.print("1 ");
          }
          
        }
        System.out.println();
      }

    }
       
        // HOLLOW SQUARE

    public static void holl_square(int n) {
      int sp = n-2;
      int st = n;
      for (int nol = 1; nol <= n-1; nol++) {
        if (nol == 1 || nol == n-1) {
          for (int i = 0; i <st; i++) {
          System.out.print("* ");
        }
      }
      else {
        System.out.print("* ");
      for (int i = 0; i <sp; i++) {
        System.out.print("  ");
      }
      System.out.print("* ");
    }
        System.out.println();
    }
      }

         
      //   BUTTERFLY 

    public static void butterfly(int n) {
      int sp = 2*n-2;
      int st = 1;
      for (int nol = 1; nol <= 2*n; nol++) {
        for (int i = 0; i < st; i++) {
          System.out.print("* ");
        }
        
        for (int i = 0; i < sp; i++) {
          System.out.print("  ");
        }
         
        for (int i = 0; i < st; i++) {
        System.out.print("* ");
        }
        if (nol<n) {
          st++;
          sp= sp-2;
        }
        else {
           st--;
          sp= sp+2;
        }
        System.out.println();
      }
    }


    //- HOLLOW RHOMBUS

    public static void holl_rhombus(int n) {
      int osp = n-1;
      int isp = n-2;
      int st = n;
      for (int nol = 1; nol <= n; nol++) {
        for (int i = 0; i < osp; i++) {
          System.out.print("  ");
        }
        if (nol == 1 || nol == n) {
          for (int i = 0; i < st; i++) {
            System.out.print("* ");
          }}
          else {
          System.out.print("* ");
          for (int i = 0; i < isp; i++) {
            System.out.print("  ");
          }
          System.out.print("* ");}
          System.out.println();
          osp--;
      }
    }
  

    //  HOLLOW DIAMOND

    public static void holl_diamond(int n) {
      int osp = n-1;
      int isp =1;
      for (int nol = 1; nol <= 2*n-1; nol++) {
        for (int i = 0; i < osp; i++) {
          System.out.print("  ");
        }
       if (nol == 1 ||nol== 2*n-1 ) {
          System.out.print("  * ");
        }
        
        else {
          System.out.print(" * ");
          
        for (int i = 1 ; i <isp; i++) {
          System.out.print("  ");
        }
        System.out.print("* ");
      }
        if (nol<n) {
          isp=isp+2;
          osp--;
        }
        
      else {
         isp= isp-2;
         osp++;
        }
        System.out.println();
      }
    
    }

    public static void rhombus(int n) {
      int sp = n-1;
      int st = n;
      for (int nol = 1; nol <= n; nol++) {
        for (int i = 0; i < sp; i++) {
          System.out.print("  ");
        }
        sp--;
          for (int i = 0; i < st; i++) {
            System.out.print("* ");
          }
          System.out.println();
      }
    }
  

    public static void main(String[] args) {
      // rhombus(5);
      diamond(5);
    }
    }