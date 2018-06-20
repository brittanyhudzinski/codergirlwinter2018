package MoonlightTapestries;

import java.util.ArrayList;

public class TapestryController {
    public static void main(String[] args) {

        ArrayList patternsList = new ArrayList();
        patternsList.add(new CrossStitchWigglePattern());
        patternsList.add(new ZigZagLinesPattern());
        patternsList.add(new BaublePattern());
        patternsList.add(new BlockyBaublePattern());
        patternsList.add(new BrokenWigglePattern());

        for (int k = 0; k < patternsList.size(); k++) {
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 8; i++) {
                    ((Pattern) patternsList.get(k)).patternSew();
                }
                System.out.println();
            }
        }

        System.out.println();
        System.out.println();
        System.out.println();

        for (int k = 0; k < patternsList.size(); k++) {
            for (int j = 0; j < 8; j++) {
                for (int i = 0; i < 6; i++) {
                    ((Pattern) patternsList.get(k)).patternSew();
                }
                System.out.println();
            }
        }
    }
}
