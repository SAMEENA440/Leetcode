// class Solution {
//     public int smallestEvenMultiple(int n) {
//         int div=1;
//         for(int i=1;i<=n;i++)
//         {
//             div=div*i;
//             if(div%2==0)
//             {
//                 return div;
//             }
//         }
//         return -1;
//     }


// }

class Solution {
    public int smallestEvenMultiple(int n) {
        return n+(n%2)*n;
    }
}