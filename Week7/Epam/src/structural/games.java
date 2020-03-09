package structural;

abstract class game{
    abstract void initial();
    abstract void start();
    abstract void finish();
    public final void play(){
        initial();
        start();
        finish();
    }
}
class Hockey extends game{
    @Override
    void initial(){
        System.out.println("Initialized : Hockey");
    }
    @Override
    void start(){
        System.out.println("Started : Hockey");
    }
    @Override
    void finish(){
        System.out.println("Finished : Hockey");
    }
}
class Cricket extends game{
    @Override
    void initial(){
        System.out.println("Initialized : Cricket");
    }
    @Override
    void start(){
        System.out.println("Started : Cricket");
    }
    @Override
    void finish(){
        System.out.println("Finished : Cricket");
    }
}

class Tennis extends game{
    @Override
    void initial(){
        System.out.println("Initialized : Tennis");
    }
    @Override
    void start(){
        System.out.println("Started : Tennis");
    }
    @Override
    void finish(){
        System.out.println("Finished : Tennis");
    }
}

public class games{
    public static void main(String[] args) throws InstantiationException,IllegalAccessException,ClassNotFoundException {
        Class c = Class.forName("structural.Tennis");
        game game = (game)c.newInstance();
        game.play();



    }

}
