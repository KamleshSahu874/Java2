public class ErrorHandling2 {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        try{
            System.out.println(arr[8]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(ArithmeticException e){
            System.out.println("");
        }finally{

        }
    }
}
