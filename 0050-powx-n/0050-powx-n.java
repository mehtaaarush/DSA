// class Solution {
//     public double myPow(double x, int n) {
//         long N = n;
//         if(N==0) return 1;
//         if(N==1) return x;
//         if(N < 0){
//             x = 1/x;
//             N = -N;
//         }

//         if(N%2==0){
//             return myPow(x,(int)N/2) * myPow(x,(int)N/2);
//         }
//         else{
//             return myPow(x,(int)N/2) * myPow(x,(int)N/2) * x;
//         }
//     }
// }
class Solution {
    public double myPow(double x, int n) {
        long N = n;
        
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        
        double result = 1;
        
        while (N > 0) {
            if (N % 2 == 1) {
                result *= x;
            }
            x *= x;
            N /= 2;
        }
        
        return result;
    }
}