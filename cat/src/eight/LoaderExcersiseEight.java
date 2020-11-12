package eight;


import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;

import java.util.List;

// — подключить библиотеку airport.jar
// — получить список самолетов
// — распечатать количество (число) самолётов в аэропорту.

public class LoaderExcersiseEight {

    public static void main(String[] args) {
        Airport airport = Airport.getInstance();
        List<Aircraft> aircraftList = airport.getAllAircrafts();
        System.out.println("Число самолетов в аэропорту: " + aircraftList.size());
    }

}
