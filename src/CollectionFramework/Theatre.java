package CollectionFramework;

import java.util.Collection;
import java.util.HashSet;

public class Theatre
{
    private final String theatreName;
    //private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows -1);
        System.out.println("lastRow is "+lastRow);
        for (char row = 'A'; row <= lastRow; row++) {
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                //Seat seat = new Seat(row + String.format("%02d", seatNum));
                //seats.add(seat);
            }
        }
    }

    public void checkChars()
    {
        for (char row = 'A'; row <= 93; row++) {
            for(int seatNum = 1; seatNum <= 20; seatNum++) {
                //Seat seat = new Seat(row + String.format("%02d", seatNum));
                //seats.add(seat);
                System.out.println("Row is "+row);
            }
        }
    }

    public void upCastingExample()
    {
        Collection<Integer> list = new HashSet<>();

    }
}
