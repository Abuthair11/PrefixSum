public class Range_Sum_Query {
    public long[] rangeSum(int[] A, int[][] B) {
     long  CumunaliveSum[]   =  new long[A.length];
     CumunaliveSum[0]= A[0];
     for(int i=1;i<A.length;i++)
     {
     CumunaliveSum[i]=CumunaliveSum[i-1]+A[i];
     }
     long[] Result  = new long[B.length];
     for(int i=0;i<B.length;i++)
     {
     int Left = B[i][0];
     int Right = B[i][1];
     if(Left == 0){
         Result[i] = CumunaliveSum[Right];
     }
     else {
         Result[i] = CumunaliveSum[Right]-CumunaliveSum[Left-1];
     }
     }
     return Result;
    }
}