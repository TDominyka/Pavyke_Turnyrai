public class MyTree<Integer> {
    public int Data;
    public MyTree<Integer> Lose;
    public MyTree<Integer> Equal;
    public MyTree<Integer> Win;
    public MyTree<Integer> Parent;
    public int lossNumb=0;
    public int depth;
    public static int timesGoneRight=0;


    public MyTree()
    {
        this.Data=4; this.Lose =null; this.Equal =null; this.Win=null; this.Parent=null; this.depth =0;
    }

    public MyTree(int data, MyTree<Integer> parent, int lossNumb,int depth)
    {
        this.Data = data;
        this.Lose = null;
        this.Equal =null;
        this.Win=null;
        this.Parent = parent;
        this.depth =depth;
        this.lossNumb=lossNumb;
    }

    public void insert ( int depth, int lossNumb, int tieStreak, int maxDepth){
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
}