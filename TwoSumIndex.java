package PRACTICE;

import java.util.LinkedHashMap;
import java.util.Map;

class TwoSumIndex{

    public static int[] getSumEffectiveSolution(int[] arr,int target){
        Map<Integer, Integer>map=new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int delta=target-arr[i];
            if(map.containsKey(delta)){
                return new int[]{map.get(delta),i};
            }
            map.put(arr[i], i);  
        }
        return new int[]{-1,-1};

    }
    public static int[] getSumStandardApproach(int[] arr,int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
        
    }
    public static void main(String[] args) {
        int[] array =new int[]{1,2,3,4};
        int target=7;
        int[] result=getSumEffectiveSolution(array,target);
        // int[] result=standardApproach(array,target);
        System.out.println(result[0]+" "+result[1]);
        // standardApproach(array, target);
    }
}