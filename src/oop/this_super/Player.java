package oop.this_super;

/*
    # 부모 클래스, 상위 클래스 (Parent, super class)

    - 데이터를 다른 클래스에게 상속하는 클래스를 부모 클래스라고 부릅니다.
    - 상속을 사용하면 데이터를 물려받는 클래스에게 부모 클래스의
     멤버변수(필드)와 메서드가 상속됩니다. 단, 생성자는 상속되지 않습니다.
*/

public class Player {

    String name;
    int level;
    int atk;
    int hp;

    Player() {
        System.out.println("Player의 기본 생성자 호출!");
        this.level = 1;
        this.atk = 3;
        this.hp = 50;
    }
    Player(String name) {
        System.out.println("Player의 2번 생성자 호출!");
        System.out.println("생성자에서 this의 주소값: " + this);
        level = 1;
        atk = 3;
        hp= 50;
        this.name = name;
    }


    void characterInfo() {
        System.out.println("*** 캐릭터의 정보 ***");
        System.out.println("# 아이디: " + name);
        System.out.println("# 레벨: " + level);
        System.out.println("# 공격력: " + atk);
        System.out.println("# 체력: " + hp);
        System.out.println("지금 이 메서드를 부른 객체 아이디: " + this.name);
    }





}
