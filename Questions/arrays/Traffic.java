package arrays;

//  The Road Department is planning to make some new traffic regulations.
//  But to make the regulations they need to analyze the current situation of the traffic.
//  The traffic can be analyzed from an array 'VEHICLE' of length 'N',
//  which consists of 'O' if there is no vehicle at that point and '1' if there is a vehicle at the point.
//  Unfortunately the array 'VEHICLE' got corrupted as at most 'M''1' got flipped to '0'.
//  Traffic jam is defined as the length of consecutive vehicles on the road.
//  The Road Department wants to know the worst possible scenario for the traffic jam. Return the maximum possible length of the consecutive vehicles.


public class Traffic {
//    public static int traffic(int n, int m, int []vehicle) {
//            int index = -1;
//            int tempCount = 0;
//            boolean flag = true;
//            for (int i = 0; i < n; i++) {
//                int temp = m;
//                int count = 0;
//                int x = index+1;
//                while(temp >= 0 && x < n){
//                    if(vehicle[x]==1){
//                        count++;
//                        x++;
//                    }
//                    else{
//                        if(temp == m){
//                            index = x;
//                        }
//                        if(temp > 0){
//                            count++;
//                        }
//                        temp--;
//                        x++;
//                    }
//                    if(x == n-1){
//                        flag = false;
//                    }
//                }
//                tempCount = Math.max(count, tempCount);
//                if(flag == false){
//                    break;
//                }
//            }
//
//            return tempCount;
//          }


    public static int traffic(int n, int m, int []vehicle) {
        int zeroCount=0;
        int start = 0;
        int count=0;
        int max=0;
        while(count<n){
            if(vehicle[count]==0){
                zeroCount++;
            }

            while(zeroCount>m){
                if(vehicle[start]==0){
                    zeroCount--;
                }
                start++;
            }

            count++;
            max = Math.max(max,count-start);

        }
        return max;
    }
    }
