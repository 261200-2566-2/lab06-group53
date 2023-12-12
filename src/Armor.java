public class Armor implements Accessories {// Arrmor , Can only equip by Warrior
    private final double Def;

    /* Armor
     * Effect: Increases character's Def by 10.
     */
    Armor() {
        Def = 10;
    }

    /* getStats
     * Stat that is used to increase the Atk value of the equipped character.
     */
    public double getStats() {
        return Def;
    }

    /* typeCheck
     * It is a status value that will be sent out to check whether the character can be equipped or not.
     */
    public int typeCheck() {
        return 1;
    }
}