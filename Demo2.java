
class Computer {
    public void playMusic() {
        System.out.println("Music Playing...");

    }

    public String getMePen(int cost) {
        if (cost >= 10)
            return "Pen";
        else
            return "Nothing";
    }
}

public class Demo2 {
    public static void main(String args[]) {
        Computer c = new Computer();
        c.playMusic();
        String str = c.getMePen(100);
        System.out.println(str);
    }

}
