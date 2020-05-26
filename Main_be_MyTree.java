public class Main_be_MyTree {
    public static int timesGoneRight=0;
    public static void insert ( int depth, int lossNumb, int tieStreak, int maxDepth){
        if(depth==maxDepth)
            timesGoneRight++;
        else {
            if (lossNumb == 0 && depth < maxDepth) {
                insert(depth + 1, 1, 0, maxDepth);
            }

            if (tieStreak<2 && depth < maxDepth)
                insert(depth + 1, lossNumb, tieStreak+1,  maxDepth);

            if (depth < maxDepth)
                insert(depth + 1, lossNumb, 0,  maxDepth);
        }
    }
    public static void main(String[] args) {
        insert(0,0,0,30);
        System.out.println(timesGoneRight);
    }
}
