package Arrays;

public class Sort0s1s2s {
    public static void main(String[] args) {
        int[] arr={0, 2, 1, 2, 0, 1};
        sort012(arr);
        System.out.println(arr);

    }
    public static void sort012(int[] arr)
    {
        int cnt0=0,cnt1=0,cnt2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)cnt0+=1;
            else if(arr[i]==1)cnt1+=1;
            else cnt2+=1;
        }
        for (int i = 0; i < cnt0; i++) arr[i]= 0; // replacing 0's

        for (int i = cnt0; i < cnt0 + cnt1; i++) arr[i]= 1; // replacing 1's

        for (int i = cnt0 + cnt1; i < arr.length; i++) arr[i]= 2;
    }
}
