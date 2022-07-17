public class Main {
//@oguzhanbb

    public static void main(String[] args) {

        Fighter f1 = new Fighter("Muhammed_Ali",16,141,107, 80);
        Fighter f2 = new Fighter("Mike_Tyson",15,140,100,63);

        Match bigmatch = new Match(f1,f2,90,120);
        bigmatch.run();


    }
}
