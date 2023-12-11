public class Main {
    public static void main(String[] args) {
        Ring R = new Ring();
        Armor A = new Armor();
        Carry C = new Carry(1);
        C.EquipAccessories(R);

        Warrior W = new Warrior(1);
        W.EquipAccessories(A);

        C.display();
        W.display();

        W.levelUp();
        W.display();

        System.out.println("Battle!\n--------------------------");

        C.attack(W);
        W.attack(C);
        C.attack(W);

        C.display();
        W.display();
    }
}