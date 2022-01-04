package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> membersBandA = new ArrayList<>();
        membersBandA.add("Джон Леннон");
        membersBandA.add("Пол Маккартни");
        membersBandA.add("Джордж Харрисон");
        membersBandA.add("Ринго Старр");

        List<String> membersBandB = new ArrayList<>();
        membersBandB.add("Курт Кобейн");
        membersBandB.add("Крист Новоселич");
        membersBandB.add("Дэйв Грол");

        MusicBand bandA = new MusicBand("The Beatles", 1960, membersBandA);
        MusicBand bandB = new MusicBand("Nirvana", 1987, membersBandB);

        bandA.printMembers();
        MusicBand.transferMembers(bandA, bandB);
        bandA.printMembers();
        bandB.printMembers();
    }

}
