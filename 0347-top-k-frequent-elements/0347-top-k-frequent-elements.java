import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    //     Map<Integer,Integer> map = new HashMap<>();
    //     for(int i=0 ; i<nums.length ; i++){

    //         map.put(nums[i], map.getOrDefault(nums[i],0)+1);

    //     }

    //     List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

    //     list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
    //     int [] arr = new int[k];
        
    //     int index=0;
    //     while(index<k){
    //         arr[index] = list.get(index).getKey();

    //         index++;
    //     }
        
    //     return arr;

    //  }

    HashMap<Integer, Integer> map = new HashMap<>();

    for(int i=0; i<nums.length; i++){
        map.put(nums[i], map.getOrDefault(nums[i],0)+1);
    }

    List<Map.Entry<Integer, Integer>> list= new ArrayList<>(map.entrySet());
    list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

    int [] arr = new int[k];
    int index=0;

    while(index<k){

        arr[index]= list.get(index).getKey();
        index++;
    }

    return arr;
    }
}