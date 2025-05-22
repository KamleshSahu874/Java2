public class ErrorHandling1 {
    public static void main(String[] args) {
        int arr[]={2,9,6,5,7,8};
        try {

            System.out.println(arr[6]);
        } catch (Exception e) {
            System.out.println("haha you fool");

        }
    }
}
