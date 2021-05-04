package Java_Interveiw_Coding_Session;

public class ArraySortWithoutSortMethod_ASCOrder {
    public static void main(String[] args) {
        int temp;
        int[] arrNumbers = {14, 8, 5, 54, 41, 10, 1, 500};
        System.out.println("Before sort: ");
        for(int num : arrNumbers)
        {
            System.out.println(num);
        }
        for(int a = 0; a < arrNumbers.length; a++)
        {
            for(int b = a + 1; b < arrNumbers.length; b++)
            {
                if(arrNumbers[a] > arrNumbers[b])
                {                                        //  0  1  2  3   4    5  6   7
                    temp = arrNumbers[a];               // {14, 8, 5, 54, 41, 10, 1, 500}
                    arrNumbers[a] = arrNumbers[b];      // {14, 8, 5, 54, 41, 10, 1, 500}
                    arrNumbers[b] = temp;
                }
            }
        }
        System.out.println("After sort: ");
        for(int num : arrNumbers)
        {
            System.out.println(num);
        }
    }
}
