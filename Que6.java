public class Que6 {
    public static void main(String[] args) {
        int arr[]={1,2,2,1,4,4,5,5,6};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                    count++;
            }
            if(count==1)
                System.out.println("once in an array="+arr[i]);
            count=0;
        }
    }
}