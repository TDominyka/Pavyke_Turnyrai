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

    public void insert (MyTree<Integer>curr, int maxDepth){
        if(curr.depth==maxDepth)
            timesGoneRight++;
        else {
            if (curr.lossNumb == 0 && curr.depth < maxDepth)
                insert(new MyTree<>(0, curr, 1, curr.depth + 1), maxDepth);

            if (!((curr.Parent == null || curr.Parent.Data == 1) && curr.Data == 1) && curr.depth < maxDepth)
                insert(new MyTree<>(1, curr, curr.lossNumb, curr.depth + 1), maxDepth);

            if (curr.depth < maxDepth)
                insert(new MyTree<>(2, curr, curr.lossNumb, curr.depth + 1), maxDepth);
        }
    }
}

