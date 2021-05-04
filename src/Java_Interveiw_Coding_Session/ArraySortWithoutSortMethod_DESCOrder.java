package Java_Interveiw_Coding_Session;

public class ArraySortWithoutSortMethod_DESCOrder{

    // Sort without sort method Desc order

    public static void main(String[] args) {
        int temp;
        int[] arrNumbers = {14, 8, 5, 54, 41, 10, 1, 500};
        System.out.println("Before sort: ");
        for(int num : arrNumbers)
        {
            System.out.println(num);
        }
        for(int a = 0; a <= arrNumbers.length - 1; a++)
        {
            for(int b = 0; b <= arrNumbers.length - 2; b++)
            {
                if(arrNumbers[b] < arrNumbers[b + 1])
                {
                    temp = arrNumbers[b];
                    arrNumbers[b] = arrNumbers[b + 1];
                    arrNumbers[b + 1] = temp;

                }
            }
        }
        System.out.println("After sort: ");
        for(int num : arrNumbers)
        {
            System.out.println(num);
        }


 //=============================================================
 //    Solution 2:

        int temp1;
        int[] arrNumbers1 = {14, 8, 5, 54, 41, 10, 1, 500};
        System.out.println("Before sort: ");
        for(int num : arrNumbers1)
        {
            System.out.println(num);
        }
        for(int i = 0; i < arrNumbers1.length ; i++)
        {
            for(int j = i+1; j < arrNumbers1.length ; j++)
            {
                if(arrNumbers1[i] < arrNumbers1[j])
                {
                    temp1 = arrNumbers1[i];
                    arrNumbers1[i] = arrNumbers1[j];
                    arrNumbers1[j] = temp1;
                }
            }
        }
        System.out.println("After sort: ");
        for(int num : arrNumbers1)
        {
            System.out.println(num);
        }
    }
}

