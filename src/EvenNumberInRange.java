public class EvenNumberInRange {
    public int[] solve(int[] A, int[][] B) {
         int Csum []  =  new int[A.length];
        if(A[0] % 2 == 0){
            Csum[0] = 1;
        }
        else{
            Csum[0] = 0;
        }
        for(int i = 1; i < A.length; i++){
            if(A[i] % 2 == 0){
                Csum[i] = Csum[i-1] + 1;
            }
            else{
                Csum[i] = Csum[i-1];
            }
        }
        int [] Result = new int[B.length];
        for (int i = 0; i < B.length; i++) {
           int left = B[i][0];
           int right = B[i][1];
           if(left == 0){
               Result[i] = Csum[right];
           }
           else{
               Result[i] = Csum[right] - Csum[left-1];
           }
        }
        return Result;
    }
}
