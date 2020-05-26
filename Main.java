public class Main {
    public static void main(String[] args) {
        MyTree<Integer> games= new MyTree<>();
        games.insert(0,0,0,30);
        System.out.println(games.timesGoneRight);
    }
}
