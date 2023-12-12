public class Carry implements Character{
    private int level;
    private double maxHp;
    private double Hp;
    private double maxMana;
    private double Atk = 15;
    private double Def = 5;
    private double Mana;

    /* Create an Object of 'Carry' Class and set the default field.
     * @param level of character you want to create
     */
    public Carry(int level){
        this.level = level;
        maxHp = 50 + 10 * level;
        maxMana = 50 + 4 * level;
        Hp = maxHp;     //Setup HP
        Mana = maxMana;     //Setup Mana
    }

    /* heal
     * Increases current HP and reduces this character's mana.
     * Effect: If your mana is less than 10, you cannot recover HP.
     * Effect: If this character's HP recovery is greater than MaxHP, HP will be given equal to MaxHP and reduce current mana
     */
    public void heal(){
        if(Mana < 10)
            Hp += 10;
        if(Hp > maxHp) Hp = maxHp;
        Mana -= 10;
    }

    /* levelUp
     * Effect: Increase character level and update stat information.
     * Effect: Print "Carry LevelUp!!"
     */
    public void levelUp(){
        level++;
        maxHp = 50+10*level;
        maxMana = 50+4*level;
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("Carry LevelUp!!");
        System.out.println("++++++++++++++++++++++++++");
    }

    /* Attack Character
     * Effect: Select the character to be attacked.
     * Effect: Print "Carry attacks Warrior!!"
     * @param target The character you want to attack.
     */
    public void attack(Character target){
        target.getAttacked(Atk);
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("Carry attacks Warrior!!");
        System.out.println("++++++++++++++++++++++++++");

    }

    /* Get Attacked
     * Effect: Reduces the HP of the selected character.
     * @param atk is the attack power that will attack another character.
     */
    public void getAttacked(double atk){
        Hp -= atk-0.7 * Def;
        if(Hp < 0) Hp = 0;
    }

    /* EquipAccessories
     * Effects: if equip wrong type of accessories print "Carry cannot wear it."
     * Effect: If the correct type of accessory is worn. It will increase the character's stats.
     * @param a is Accessories you want to equip
     */
    public void EquipAccessories(Accessories a){
        if(a.typeCheck() == 2){
            Atk += a.getStats();
            System.out.println("++++++++++++++++++++++++++");
            System.out.println("The Carry has Ring!!\n +10 Attack");
            System.out.println("++++++++++++++++++++++++++");
        }else{
            System.out.println("Carry cannot wear it.");
        }
    }

    // Displays the stats of the Character, Level, MaxHP, Hp, MaxMana, AttackDamage, and Defense.
    public void display(){
        System.out.println("--------------------------");
        System.out.println("Character Class : Carry");
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
