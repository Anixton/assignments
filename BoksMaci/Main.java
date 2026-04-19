class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter foe) {
        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + " " +  this.damage + " hasar vurdu.");

        if (foe.dodge()) {
            System.out.println(foe.name + " gelen hasarı savuşturdu.");
            return foe.health;
        }

        if (foe.health - this.damage < 0)
            return 0;

        return foe.health - this.damage;
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }
}

class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (checkWeight()) {
            // %50 şansla kimin başlayacağını belirliyoruz
            boolean f1Starts = Math.random() < 0.5;
            Fighter first = f1Starts ? f1 : f2;
            Fighter second = f1Starts ? f2 : f1;
            
            System.out.println("Maça başlayan boksör : " + first.name);

            while (first.health > 0 && second.health > 0) {
                System.out.println("======== YENİ ROUND ===========");
                second.health = first.hit(second);
                if (isWin(first, second)) {
                    break;
                }
                
                first.health = second.hit(first);
                if (isWin(first, second)) {
                    break;
                }
                printScore(first, second);
            }
        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }
    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && 
               (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin(Fighter first, Fighter second) {
        if (first.health == 0) {
            System.out.println("Maçı Kazanan : " + second.name);
            return true;
        } else if (second.health == 0) {
            System.out.println("Maçı Kazanan : " + first.name);
            return true;
        }
        return false;
    }

    public void printScore(Fighter first, Fighter second) {
        System.out.println("------------");
        System.out.println(first.name + " Kalan Can \t:" + first.health);
        System.out.println(second.name + " Kalan Can \t:" + second.health);
    }
}

public class Main {
    public static void main(String[] args) {
      Fighter marc = new Fighter("Marc", 15, 100, 90, 20);
      Fighter alex = new Fighter("Alex", 10, 95, 100, 30);
      Ring r = new Ring(marc, alex, 90, 100);
      r.run();
    }
}
