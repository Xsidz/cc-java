import java.util.ArrayList;

public class BinarySearch {
    public static int BinarySearch(int arr[], int target){
        int start = 0, end = arr.length-1;
        int mid  = -1;
        while(start <= end){
            mid = start + (end-start/2);
            if(arr[mid] == target){
                return mid;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
          
        }
          return mid;
    }

    public static int MountainPeak(int arr[]){
        int start = 0, end = arr.length-1;
      
        while(start <= end){
            int mid = start + (end-start/2);
            
            if(arr[mid] < arr[mid+1]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return arr[start];
    } 

    public static int FirstOcc(int arr[],int target){
        int start = 0, end = arr.length;
        int res = -1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                if(arr[mid] == arr[mid-1]){
                    end = mid-1;
                    res = mid;
                }
            }else if(arr[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
            
        }
        return res;
    }

    public static int LastOcc(int arr[], int target){
        int start = 0, end = arr.length-1;
        int res = -1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                if(arr[mid] == arr[mid]+1){
                    start = mid+1;
                    res = mid;
                }
            }else if(arr[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return res;
    }

    public static int Count(int[]arr, int target, boolean isLeft){
        int start = 0, end = arr.length-1;
        int count = 0;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                if(isLeft){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
                count++;
            }else if(arr[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return count;
        }

    public static int FindTarget(ArrayList<Integer> arr, int target){
        int i = 0, j = arr.size()-1;

        while(i <= j){
            if(arr.get(i) == target){
                return i;
            }if(arr.get(i) > target){

            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println(BinarySearch(arr, 6));

        

        int arr2[] = {1,1,2,3,3,3,3,4,5,6,6,6};
        System.out.println(Count(arr2, 3,true) + Count(arr2, 3,false));

        
    }
}
