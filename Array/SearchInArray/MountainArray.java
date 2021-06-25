//https://leetcode.com/problems/valid-mountain-array/
package SearchInArray;

public class MountainArray {

    public boolean validMountainArray(int[] arr) {
        int i = 0;
        while (i + 1 < arr.length && arr[i + 1] > arr[i])
            i++;

        if (i == 0 || i == arr.length - 1)
            return false;

        while (i + 1 < arr.length && arr[i + 1] < arr[i])
            i++;

        System.out.print(i);
        return i == arr.length - 1;

    }

    /*
     * N00b code public boolean validMountainArray(int[] arr) {
     * 
     * if(arr.length <3) return false;
     * 
     * boolean up = false; boolean down = false;
     * 
     * for(int i = 1; i<arr.length; i++) { if(arr[i] == arr[i-1]) return false;
     * 
     * if(arr[i] < arr[i-1]) { if(!up) return false; else if(!down) down = true; }
     * 
     * if(arr[i] > arr[i-1]) { if(down) return false; else if(!up) up = true; } }
     * 
     * if(up && down) return true; else return false; }
     */
}
