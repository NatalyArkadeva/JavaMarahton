package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> membersBandA = new ArrayList<>();
        membersBandA.add(new MusicArtist("Джон Леннон", 20));
        membersBandA.add(new MusicArtist("Пол Маккартни", 22));
        membersBandA.add(new MusicArtist("Джордж Харрисон", 21));
        membersBandA.add(new MusicArtist("Ринго Старр", 20));

        List<MusicArtist> membersBandB = new ArrayList<>();
        membersBandB.add(new MusicArtist("Курт Кобейн", 21));
        membersBandB.add(new MusicArtist("Крист Новоселич", 22));
        membersBandB.add(new MusicArtist("Дэйв Грол", 23));

        MusicBand bandA = new MusicBand("The Beatles", 1960, membersBandA);
        MusicBand bandB = new MusicBand("Nirvana", 1987, membersBandB);

        bandA.printMembers();
        MusicBand.transferMembers(bandA, bandB);
        bandA.printMembers();
        bandB.printMembers();

    }
}
