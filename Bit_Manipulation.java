// import java.util.*;
/**
 * Bit_Manipulation
 */
public class Bit_Manipulation {

    public static void EvenOrOdd(int n){
        if ((n & 1) == 0) {
            System.out.println("Even number");
        }    
        else {
            System.out.println("Odd number");
        }
    }

    public static int GetIthBit(int n , int i){
        int BitMask = 1 >>i;
        if((n & BitMask) == 0){
            return 0;
        }
        return 1;
    }

    public static int SetIthBit(int n, int i){
        int BitMask = 1<<i;
        return n|BitMask;
    }

    public static int ClearIthBit(int n, int i){
        int BitMask = ~(1<<i);
        return n&BitMask;
    }

    public static int updateIthBit(int n, int i, int newBit){
        // if(newBit == 0){
        //     return ClearIthBit(n, i);
        // }
        // else{
        //     return SetIthBit(n, i);
        // }
        n = ClearIthBit(n, i);
        int BitMask = newBit<<i;
        return n|BitMask;
    }

    public static int clearLastIthBit(int n, int i){
        int BitMask = (~0)<<i;
        return n&BitMask;
    }

    public static int clearBitsInRange(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int BitMask = a|b;
        return n&BitMask;
    }

    public static boolean powerOf2(int n){
        if((n&(n-1))==0){
            return true;
        }
        return false;
    }

    public static int countSetBits(int n){
        int count = 0;
        while(n>0){
            if ((n&1)!=0) {
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSetBits(15));
    }
}