//public class Turnyrai {
//    public static int loses=0;
//    public static int welldone=0;
//    MyTree games;
//    MyTree gamesTail;
//
//    Turnyrai(MyTree games){
//        this.games=games;
//        MyTree curr=games;
//        while (curr.Lose !=null){
//            curr=curr.Lose;
//        }
//        gamesTail=curr;
//    }
//
//    public void newGame( Integer end){
//        if (end==0)
//            loses++;
//        games.insert(end);
//    }
//    public int kiekPavykusiu (int x,int result){
//        games.insert(result);
//        MyTree curr=games;
//        while (curr.Lose !=null){
//            curr=curr.Lose;
//        }
//        gamesTail=curr;
//        games.print();
//        if (x==0){
//            welldone++;
//            //x++;
//            gamesTail=null;
//        }
//        if(loses<3 && x>=0){
//            kiekPavykusiu(--x,0);
//            kiekPavykusiu(--x,1);
//            kiekPavykusiu(--x,2);
//        }
//        return welldone;
//    }
//
//}
