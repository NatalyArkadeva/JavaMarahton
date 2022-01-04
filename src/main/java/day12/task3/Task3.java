package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
        bands.add(new MusicBand("Nirvana", 1987));
        bands.add(new MusicBand("The Beatles", 1960));
        bands.add(new MusicBand("Led Zeppelin", 1968));
        bands.add(new MusicBand("Pink Floyd", 1963));
        bands.add(new MusicBand("Queen", 1970));
        bands.add(new MusicBand("Red Hot Chilli Pipers", 2004));
        bands.add(new MusicBand("Бумбокс", 2004));
        bands.add(new MusicBand("Little Big", 2013));
        bands.add(new MusicBand("IOWA", 2007));
        bands.add(new MusicBand("Arkan", 2005));

        System.out.println(bands);
        Collections.shuffle(bands);
        System.out.println(bands);

        System.out.println(groupsAfter2000(bands));

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> bandsAfter2000 = new ArrayList<>();

        for (MusicBand band : bands) {
            if (band.getYear() >= 2000) {
                bandsAfter2000.add(band);
            }

        }
        return bandsAfter2000;
    }
}
