public class JumpArray {

    public boolean isJumpable(int[] arr){
        int i = arr[0];
        int index = 0;
        while(index < arr.length  && arr[index] != 0){
            index = index + i;
            if(index > arr.length - 1) return false;
            i = arr[index];
            if(index == arr.length -1) return true;
        }
        return false;
    }
}
