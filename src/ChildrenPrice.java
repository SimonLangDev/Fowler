/**
 * Created by SL-Th on 30.04.2016.
 */
public class ChildrenPrice extends Price {

    public int getPriceCode(){
        return Movie.CHILDRENS;
    }
    public double getCharge(int daysRented){
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }
}
