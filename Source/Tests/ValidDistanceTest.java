package Source.Tests;
import Source.Classes.IRoadTrip;
import org.junit.*;

public class ValidDistanceTest {
    private final IRoadTrip roadTrip = new IRoadTrip();
    @Test
    public void validDistanceOne() {
        int distance = roadTrip.getDistance("USA", "Mexico");
        int expectedDistance = 3024;
        Assert.assertEquals(expectedDistance, distance);
    }
    @Test
    public void validDistanceTwo() {
        int distance = roadTrip.getDistance("United States of America", "Canada");
        int expectedDistance = 731;
        Assert.assertEquals(expectedDistance, distance);
    }
    @Test
    public void validDistanceThree() {
        int distance = roadTrip.getDistance("United States", "Mexico");
        int expectedDistance = 3024;
        Assert.assertEquals(expectedDistance, distance);
    }
    @Test
    public void validDistanceFour() {
        int distance = roadTrip.getDistance("Dominican Republic", "Haiti");
        int expectedDistance = 246;
        Assert.assertEquals(expectedDistance, distance);
    }
    @Test
    public void validDistanceFive() {
        int distance = roadTrip.getDistance("Colombia", "Panama");
        int expectedDistance = 760;
        Assert.assertEquals(expectedDistance, distance);
    }
    @Test
    public void validDistanceSix() {
        int distance = roadTrip.getDistance("Ethiopia", "Sudan");
        int expectedDistance = 936;
        Assert.assertEquals(expectedDistance, distance);
    }
    @Test
    public void validDistanceNine() {
        int distance = roadTrip.getDistance("Ukraine", "Soviet Union");
        int expectedDistance = 739;
        Assert.assertEquals(expectedDistance, distance);
    }
    @Test
    public void validDistanceTen() {
        int distance = roadTrip.getDistance("Bhutan", "China");
        int expectedDistance = 2806;
        Assert.assertEquals(expectedDistance, distance);
    }
    @Test
    public void validDistanceEleven() {
        int distance = roadTrip.getDistance("Yemen", "Saudi Arabia");
        int expectedDistance = 1040;
        Assert.assertEquals(expectedDistance, distance);
    }
    @Test
    public void validDistanceTwelve() {
        int distance = roadTrip.getDistance("Saudi Arabia", "Jordan");
        int expectedDistance = 1323;
        Assert.assertEquals(expectedDistance, distance);
    }
    @Test
    public void validDistanceThirteen() {
        int distance = roadTrip.getDistance("Paraguay", "Bolivia");
        int expectedDistance = 1480;
        Assert.assertEquals(expectedDistance, distance);
    }
    @Test
    public void validDistanceFourteen() {
        int distance = roadTrip.getDistance("Bolivia", "Peru");
        int expectedDistance = 1069;
        Assert.assertEquals(expectedDistance, distance);
    }
    @Test
    public void validDistanceFifteen() {
        int distance = roadTrip.getDistance("Peru", "Colombia");
        int expectedDistance = 1880;
        Assert.assertEquals(expectedDistance, distance);
    }
    @Test
    public void validDistanceSixteen() {
        int distance = roadTrip.getDistance("Gabon", "Cameroon");
        int expectedDistance = 405;
        Assert.assertEquals(expectedDistance, distance);
    }
    @Test
    public void validDistanceSeventeen() {
        int distance = roadTrip.getDistance("Cameroon", "Nigeria");
        int expectedDistance = 963;
        Assert.assertEquals(expectedDistance, distance);
    }
    @Test
    public void validDistanceEighteen() {
        int distance = roadTrip.getDistance("Nigeria", "Niger");
        int expectedDistance = 788;
        Assert.assertEquals(expectedDistance, distance);
    }
    @Test
    public void validDistanceNineteen() {
        int distance = roadTrip.getDistance("Niger", "Algeria");
        int expectedDistance = 2561;
        Assert.assertEquals(expectedDistance, distance);
    }
    @Test
    public void validDistanceTwenty() {
        int distance = roadTrip.getDistance("Algeria", "Morocco");
        int expectedDistance = 958;
        Assert.assertEquals(expectedDistance, distance);
    }
    @Test
    public void validDistanceTwentyOne() {
        int distance = roadTrip.getDistance("Morocco", "Spain");
        int expectedDistance = 822;
        Assert.assertEquals(expectedDistance, distance);
    }
    @Test
    public void validDistanceTwentyTwo() {
        int distance = roadTrip.getDistance("Spain", "France");
        int expectedDistance = 1012;
        Assert.assertEquals(expectedDistance, distance);
    }

    @Test
    public void validDistanceTwentyThree() {
        int distance = roadTrip.getDistance("Canada", "Canada");
        int expectedDistance = 0;
        Assert.assertEquals(expectedDistance, distance);
    }
}
