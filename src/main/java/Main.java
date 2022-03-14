import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lowerStringList = List.of("Hi", "Hello",  "Bye", "last");
        LowerCaseStream lowerCaseStream = new LowerCaseStream(lowerStringList);
        List<String> outputLowerCase = lowerCaseStream.lowerCaseString();
        System.out.println(outputLowerCase);

        wrapper();

        for (String s : outputLowerCase) {
            System.out.println(s);
        }

        wrapper();

        List<String> upperStringList = List.of("one", "tWo", "tHREE");
        UpperCaseStream upperCaseStream = new UpperCaseStream(upperStringList);
        System.out.println(upperCaseStream.upperCaseCollection());

        wrapper();

        List<Integer> integerList = List.of(5, 8, -8, 9, 0);
        StreamAverage streamAverage = new StreamAverage(integerList);
        System.out.println(streamAverage.calculateAverageStream());

        wrapper();
    }

    public static void wrapper() {
        for (int i = 0; i < 75; i++) System.out.print("-");
        System.out.println();
    }
}
