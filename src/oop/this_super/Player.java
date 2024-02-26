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
        this();
        System.out.println("Player의 2번 생성자 호출!");
//        level = 1;
//        atk = 3;
//        hp= 50;
        this.name = name;
    }

    Player(String name, int hp) {
        this(name); // 다른 생성자의 호출은 생성자 내에서 최상단에 위치해야 합니다.
        System.out.println("Player의 3번 생성자 호출!");
        this.hp = hp;
    }

    void attack(Player target) {
//        System.out.println("때리는 애 = " + this);
//        System.out.println("맞는 애 = " + target);

        if(this == target) {
            System.out.println("스스로는 때릴 수 없습니다.");
            return;
        }

        // 출력 메세지: x가 y를 공격합니다.
        System.out.printf("%s(이)가 %s(을)를 공격합니다.\n", this.name, target.name);

        // 맞는 사람의 hp를 10 낮추고, 나의 체력을 5 회복하고 싶다.
        // 결과를 출력하자. (나의 체력: XX, 상대의 체력: XX)
        target.hp -= 10;
        this.hp += 5;
        System.out.printf("나의 체럭: %d, 상대의 체력: %d\n", this.hp, target.hp);



    }


    void characterInfo() {
        System.out.println("*** 캐릭터의 정보 ***");
        System.out.println("# 아이디: " + name);
        System.out.println("# 레벨: " + level);
        System.out.println("# 공격력: " + atk);
        System.out.println("# 체력: " + hp);

    }





}
