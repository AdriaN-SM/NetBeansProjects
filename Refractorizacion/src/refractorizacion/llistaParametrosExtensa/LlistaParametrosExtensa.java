package refractorizacion.llistaParametrosExtensa;

import java.time.LocalDateTime;

/**
 * https://www.arhohuttunen.com/long-parameter-list/
 * https://konfhub.medium.com/refactoring-long-parameter-list-in-constructors-java-e9c9f2cb1fb
 */
public class LlistaParametrosExtensa {

    class PollutantEntry {

        String country;
        String state;
        String city;
        String place;
        LocalDateTime localDateTime;
        Float average;
        Float max;
        Float min;
        String pollutant;

        public PollutantEntry(String country, String state, String city, String place, LocalDateTime localDateTime, Float average, Float max, Float min, String pollutant) {
            this.country = country;
            this.state = state;
            this.city = city;
            this.place = place;
            this.localDateTime = localDateTime;
            this.average = average;
            this.max = max;
            this.min = min;
            this.pollutant = pollutant;
        }
    }

}
