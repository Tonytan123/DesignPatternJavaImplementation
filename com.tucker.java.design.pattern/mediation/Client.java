package mediation;

/**
 * @author tonyc
 */
public class Client {
    public static void main(String[] args) {
        SpecificUnion union = new SpecificUnion();
        AbstractCountry countryOne = new Usa(union);
        AbstractCountry countryTwo = new Iraq(union);
        union.setSpecificUnion(countryOne, countryTwo);
        countryOne.sendMessage("we need to keep the world peace!");
        countryTwo.sendMessage("yes!");
    }
}
