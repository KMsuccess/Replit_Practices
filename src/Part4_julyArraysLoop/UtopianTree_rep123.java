package Part4_julyArraysLoop;
/*
The Utopian Tree grows exactly 1 cm for the first three years, and after that it grows by 2 cm every year,
 this is a simple implementation of the algorithm. You will need to use loops to create it.
Show 10 years of growth of the Utopian Tree.

Output:
year 1 - growth 1 cm
tree size: 1cm
year 2 - growth 1 cm
tree size: 2cm
year 3  - growth 1 cm
tree size:3cm
year 4 - growth 2 cm
tree size: 5cm
year 5 - growth 2 cm
tree size: 7cm
year 6 - growth 2 cm
tree size: 9cm
... until you reach year 10

 */
public class UtopianTree_rep123 {
    public static void main(String[] args) {
        // your code
        // ----------------------------

        int treeSize = 0;
        for(  int years = 1; years <= 10; years++){
            if(years<=3){
                treeSize++;
                System.out.println("year "+years+ " - growth 1 cm");
            }else{
                treeSize +=2;

                System.out.println("year "+years+ " - growth 2 cm");
            }
                System.out.println("tree size: " + treeSize + " cm");
        }





    }
}
