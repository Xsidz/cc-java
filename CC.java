import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

public class CC {
    public static int linear(int arr[], int key) {
        if (arr.length == 0)
            return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int firstOcc(int arr[], int key) {
        if (arr.length == 1 && arr[0] != key)
            return -1;
        int start = 0;
        int idx = -1;
        int end = arr.length - 1;

        while (start < end && arr.length > 1) {
            if (arr[start] == key) {
                return start;
            }
            if (arr[end] == key) {
                idx = end;
            }
            start++;
            end--;
        }
        return idx;
    }

    public static int lastOcc(int arr[], int key) {
        if (arr.length == 1 && arr[0] != key)
            return -1;
        int start = 0;
        int idx = -1;
        int end = arr.length - 1;

        while (start < end && arr.length > 1) {
            if (arr[start] == key) {
                idx = start;
            }
            if (arr[end] == key) {
                return end;
            }
            start++;
            end--;
        }
        return idx;
    }

    public static int[] firstAndLast(int arr[], int key) {
        int first = -1;
        int last = -1;
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (first == -1 && arr[i] == key) {
                first = i;
            } else {
                i++;
            }

            if (last == -1 && arr[j] == key) {
                last = j;
            } else {
                j--;
            }

            if (first != -1 && last != -1) {
                break;
            }
        }

        if (first == -1 || last == -1 || first == last) {
            first = -1;
            last = -1;
        }

        return new int[] { first, last };

    }

    public static int[] twoSum(int arr[], int target) {
        int start = 0, end = 1;

        if (arr.length < 1) {
            return new int[] { start, end };
        }
        while (end < arr.length - 1) {
            int sum = arr[start] + arr[end];
            if (sum == target) {
                return new int[] { start, end };
            } else if (sum > target) {
                start++;
            }
            end++;

        }
        return new int[] { start, end };

    }

     public static int[] twoSumpair(int[] arr, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int need = target - arr[i];

            if (seen.containsKey(need)) {
                return new int[] { seen.get(need), i };
            }

            seen.putIfAbsent(arr[i], i);
        }

        return new int[] { -1, -1 };
    }

    

    // Homework

    // 1. Max and min elements

    public static int[] MinMax(int arr[]) {

        if (arr.length < 1) {
            return new int[] { arr[0], arr[0] };
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return new int[] { max, min };
    }

    // 2. Find the Secoond Lagest Element

    public static int SecondLargest(int arr[]) {
        if (arr.length < 1) {
            return -1;
        }
        Arrays.sort(arr);

        int sLarge = -1;
        int large = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > large){
                sLarge = large;
                large = arr[i];
            }
            if(arr[i] < large && arr[i] > sLarge){
                sLarge = arr[i];
            }
        }

        return sLarge;
    }

    // 3. Remove Duplicates

    public static HashSet<Integer> RemoveDuplicate(int arr[]){
        HashSet<Integer> seen = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
                if(!seen.contains(arr[i])){
                    seen.add(arr[i]);
                }
        }
        return seen;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 0, 2, 5, 3, 0, 1, 3 };
        int arr1[] = { 1,2,6,3,4 };
        int arr2[] = { 0, 0, 1, 1, 1, 1, 1 };
        

        int arr4[] = MinMax(arr1);
        System.out.println("[" + arr4[0] + "," + arr4[1] + "]");

        int sLarge = SecondLargest(arr1);
        System.out.println(sLarge);

        HashSet<Integer> set = RemoveDuplicate(arr);
        System.out.println(set);


        int arr7[] = twoSum(arr1, 4);
        System.out.println("[" + arr7[0] + "," + arr7[1] + "]");
    }
}
