    class Solution {
      public:
          int minCostClimbingStairs(vector<int>& cost) {
        
          for(int i = cost.size() - 3; i >= 0; i--){
             cost[i] += min(cost[i+1], cost[i+2]);
          }
        
           //bcoz we can start from index 0, or index 1
           return min(cost[0], cost[1]);
               
         }
    };
