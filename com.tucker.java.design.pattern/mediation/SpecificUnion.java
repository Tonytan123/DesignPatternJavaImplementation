package mediation;

/**
 * @author tonyc
 */
public class SpecificUnion implements Union{
    AbstractCountry countryOne;
    AbstractCountry countryTwo;

    public void setSpecificUnion(AbstractCountry countryOne, AbstractCountry countryTwo) {
        this.countryOne = countryOne;
        this.countryTwo = countryTwo;
    }

    @Override
    public void sendMessage(AbstractCountry country, String message) {
        if (country == countryOne) {
            countryTwo.getMessage(message);
        } else {
            countryOne.getMessage(message);
        }
    }
}
