public class TestTelevision {
    public static void main(String[] args) {
        Television tv = new Television();
        tv.setScreenSize(52);
        tv.adjustScreen(10,0);
    }
}


class Television{
    int screenSize;

    void setScreenSize(int screenSize){
        this.screenSize = screenSize;
    }
    void adjustScreen(int up, int down){
        this.screenSize+=up;
        this.screenSize-=down;
        System.out.println("tv has been adjusted!");
    }
}

