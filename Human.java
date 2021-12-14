package ru.geekbrains.homework1;

public class Human implements Competitor,Treadmill,Wall{

    private  int maxRun;
    private  int maxJump;

    public Human(int maxRun , int maxJump){
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Human(){
        this(1000 , 2);
    }

    @Override
    public boolean run(int distance){
        if (distance <= maxRun) {
            System.out.println( "Человек смог пробежать дистанцию " + distance + " метров");
            return true;
        } else {
            System.out.println( "Человек не смог пробежать дистанцию " + distance + " метров");
            return false;
        }
    }
    @Override
    public boolean jump(int distance){
        if (distance <= maxJump) {
            System.out.println( "Человек смог перепрыгнуть дистанцию " + distance + " метра");
            return true;
        } else {
            System.out.println( "Человек не смог перепрыгнуть дистанцию " + distance + " метра");
            return false;
        }
    }

    @Override
    public boolean  escape(int distance){
        if (distance <= maxRun) {
            System.out.println( "Человек успешно пробежал  на беговой дорожке  дистанцию " + distance + " метров");
            return true;
        } else {
            System.out.println( "Человек не смог пробежать  на беговой дорожке дистанцию " + distance + " метров");
            return false;
        }
    }
    @Override
    public boolean hop(int distance){
        if (distance <= maxJump) {
            System.out.println( "Человек смог перепрыгнуть стену длинной " + distance + " метра");
            return true;
        } else {
            System.out.println( "Человек не смог перепрыгнуть стену длинной  " + distance + " метра");
            return false;
        }
    }
}
