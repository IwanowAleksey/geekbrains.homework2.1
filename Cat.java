package ru.geekbrains.homework1;

public class Cat implements Competitor,Treadmill, Wall{

    private  int maxRun;
    private  int maxJump ;

    public Cat(int maxRun , int maxJump){
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Cat(){
        this( 200 , 2);
    }

    @Override
    public boolean run(int distance){
        if (distance <= maxRun) {
            System.out.println("Кот смог пробежать дистанцию " + distance + " метров");
            return true;
        } else {
            System.out.println( "Кот не смог пробежать дистанцию " + distance + " метров");
            return false;
        }
    }
    @Override
    public boolean jump(int distance){
        if (distance <= maxJump) {
            System.out.println("Кот смог перепрыгнуть дистанцию " + distance + " метра");
            return true;
        } else {
            System.out.println("Кот не смог перепрыгнуть дистанцию " + distance + " метра");
            return false;
        }
    }

    @Override
    public boolean  escape(int distance){
        if (distance <= maxRun) {
            System.out.println( "Кот  смог пробежать на беговой дорожке  дистанцию " + distance + " метров");
            return true;
        } else {
            System.out.println( "Кот  не смог пробежать на беговой дорожке дистанцию " + distance + " метров");
            return false;
        }
    }
    @Override
    public boolean hop(int distance){
        if (distance <= maxJump) {
            System.out.println( "Кот смог перепрыгнуть стену длинной " + distance + " метра");
            return true;
        } else {
            System.out.println( "кот не смог перепрыгнуть стену длинной " + distance + " метра");
            return false;
        }
    }
}
