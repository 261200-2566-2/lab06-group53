public class Warrior implements Character{
    private int level;
    private double maxHp;
    private double Hp;
    private double maxMana;
    private double Atk=5;
    private double Def=15;
    private double Mana;

    /* Create an Object of 'Warrior' Class and set the default field.
     * @param level of character you want to create
     */
    public Warrior(int level){
        this.level = level;
        maxHp = 100+15*level;
        maxMana = 50+2*level;
        Hp = maxHp;
        Mana = maxMana;
    }

    /* heal
     * Increases current HP and reduces this character's mana.
     * Effect: If your mana is less than 10, you cannot recover HP.
     * Effect: If this character's HP recovery is greater than MaxHP, HP will be given equal to MaxHP and reduce current mana
     */
    public void heal(){
        if(Mana < 7)
            Hp += 5;
        if(Hp > maxHp) Hp = maxHp;
        Mana -= 7;
    }

    /* levelUp
     * Effect: Increase character level and update stat information.
     * Effect: Print "Warrior LevelUp!!"
     */
    public void levelUp(){
        level++;
        maxHp = 100+15*level;
        maxMana = 50+2*level;
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("Warrior LevelUp!!");
        System.out.println("++++++++++++++++++++++++++");
    }

    /* Attack Character
     * Effect: Select the character to be attacked.
     * Effect: Print "Warrior attacks Carry!!"
     * @param target The character you want to attack.
     */
    public void attack(Character target){
        target.getAttacked(Atk);
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("Warrior attacks Carry!!");
        System.out.println("++++++++++++++++++++++++++");
    }

    /* Get Attacked
     * Effect: Reduces the HP of the selected character.
     * @param atk is the attack power that will attack another character.
     */
    public void getAttacked(double atk){
        Hp -= atk-0.3*Def;
    }

    /* EquipAccessories
     * Effects: if equip wrong type of accessories print "Warrior cannot wear it."
     * Effect: If the correct type of accessory is worn. It will increase the character's stats.
     * @param a is Accessories you want to equip
     */
    public void EquipAccessories(Accessories a){
        if(a.typeCheck() == 1){
            maxHp += a.getStats();
            System.out.println("++++++++++++++++++++++++++");
            System.out.println("The Warrior has Armor!!\n +10 Defense");
            System.out.println("++++++++++++++++++++++++++");
        }else{
            System.out.println("Warriors cannot wear it.");
        }
    }

    // Displays the stats of the Character, Level, MaxHP, Hp, MaxMana, AttackDamage, and Defense.
    public void display(){
        System.out.println("--------------------------");
        System.out.println("Character Class : Warrior");
        System.out.println("Level : " + level);
        System.out.println("MaxHp : " + maxHp);
        System.out.println("Hp : " + Hp);
        System.out.println("MaxMana : " + maxMana);
        System.out.println("Mana : " + Mana);
        System.out.println("Attack : " + Atk);
        System.out.println("Defense : " + Def);
        System.out.println("--------------------------");
    }
}