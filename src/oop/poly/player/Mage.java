package oop.poly.player;

public class Mage extends Player {

    int mana;

    Mage(String name){
        super(name);
        this.mana = 100;
    }

    public void blizzard(Player[] targets) {
        System.out.printf("%s님이 눈보라 시전!!\n", this.name);
        this.mana -= 30;
        System.out.printf("30의 마나가 소모됩니다. 남은 정신력: %d\n", this.mana);
        System.out.println("==================================");
        for (Player p : targets) {
            if(p == this) continue;
            int damage = (int) (Math.random()*6 + 10);
            p.hp -= damage;
            System.out.printf("%s님이 %d의 피해를 입었습니다. (남은 체력: %d)\n"
                    , p.name, damage, p.hp);

        }
    }

    @Override
    void characterInfo() {
        super.characterInfo();
        System.out.println("# 마나: " + mana);
    }
}
