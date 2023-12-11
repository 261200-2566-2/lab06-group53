public interface Character {
    void attack(Character c);
    void getAttacked(double d);
    void display();
    void levelUp();
    void EquipAccessories(Accessories a);
    void heal(); //Restores HP to characters.
}