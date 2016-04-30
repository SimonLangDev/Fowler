/**
 * Created by SL-Th on 30.04.2016.
 */
public class NewReleasePrice extends Price {
    public int getPriceCode(){
        return Movie.NEW_RELEASE;
    }
    public double getCharge(int daysRented){
        return daysRented * 3;
    }
    public int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2: 1;
    }
}
