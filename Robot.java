package ru.geekbrains.homework1;

public class Robot implements Competitor,Treadmill,  Wall{
    private  int maxRun ;
    private  int maxJump ;

    public Robot(int maxRun , int maxJump){
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Robot(){
        this(150 , 1);
    }

    @Override
    public boolean run(int distance){
        if (distance <= maxRun) {
            System.out.println( "Робот смог пробежать дистанцию " + distance + " метров");
            return true;
        } else {
            System.out.println( "Робот не смог пробежать дистанцию " + distance + " метров");
            return false;
        }
    }
    @Override
    public boolean jump(int distance){
        if (distance <= maxJump) {
            System.out.println("Робот смог перепрыгнуть дистанцию " + distance + " метр");
            return true;
        } else {
            System.out.println("Робот не смог перепрыгнуть дистанцию " + distance + " метр");
            return false;
        }
    }

    @Override
    public boolean  escape(int distance){
        if (distance <= maxRun) {
            System.out.println( "Робот  смог пробежать на беговой дорожке  дистанцию " + distance + " метров");
            return true;
        } else {
            System.out.println( "Робот  не смог пробежать на беговой дорожке  дистанцию " + distance + " метров");
            return false;
        }
    }
    @Override
    public boolean hop(int distance){
        if (distance <= maxJump) {
            System.out.println( "Робот смог перепрыгнуть стену длинной " + distance + " метра");
            return true;
        } else {
            System.out.println( "Робот  не смог перепрыгнуть стену длинной " + distance + " метра");
            return false;
        }
    }
}
