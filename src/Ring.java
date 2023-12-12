public class Ring implements Accessories{// Ring , Can only equip by Carry
    private double Atk;

    /* Ring
     * Effect: Increases character's Atk by 10.
     */
    Ring(){
        Atk = 10;
    }

    /* getStats
     * Stat that is used to increase the Atk value of the equipped character.
     */
    public double getStats(){
        return Atk;
    }

    /* typeCheck
     * It is a status value that will be sent out to check whether the character can be equipped or not.
     */
    public int typeCheck(){
        return 2;
    }
}