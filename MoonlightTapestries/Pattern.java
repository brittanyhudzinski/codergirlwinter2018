package MoonlightTapestries;
import java.util.ArrayList;

public class Pattern {
    public float needleJamRate;
    ArrayList asciiPattern = new ArrayList();

    public void patternSew() {
        boolean needleJam = (Math.random() < this.needleJamRate);
        if (needleJam) {
            for (int i = 0; i < asciiPattern.size() / 2; i++) {
                ((Stitch) asciiPattern.get(i)).sew();
            }
            for (int i = 0; i < asciiPattern.size() / 2; i++) {
                System.out.print(" ");
            }
        } else {
            for (int i = 0; i < asciiPattern.size(); i++) {
                ((Stitch) asciiPattern.get(i)).sew();
            }
        }
    }

}

class CrossStitchWigglePattern extends Pattern {
    public CrossStitchWigglePattern(){
        for (int i = 0; i < 5; i++) {
            asciiPattern.add(new SmallCrossStitch());
            asciiPattern.add(new LargeCrossStitch());
        }
        needleJamRate = 0.05f;
    }
}

class ZigZagLinesPattern extends Pattern {
    public ZigZagLinesPattern() {
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 3; i++) {
                asciiPattern.add(new ZigZagStitch());
            }
            for (int i = 0; i < 3; i++) {
                asciiPattern.add(new FillStitch());
            }
        }
        needleJamRate = 0.0f;
    }
}

class BaublePattern extends Pattern {
    public BaublePattern() {
        for (int j = 0; j < 5; j++) {

            for (int i = 0; i < 2; i++) {
                asciiPattern.add(new ShortLineStitch());
            }
            for (int i = 0; i < 1; i++) {
                asciiPattern.add(new CircleStitch());
            }
        }
        needleJamRate = 0.0f;
    }
}

class BlockyBaublePattern extends Pattern {
    public BlockyBaublePattern() {
        for (int j = 0; j < 3; j++) {

            for (int i = 0; i < 1; i++) {
                asciiPattern.add(new BlockStitch());
            }
            for (int i = 0; i < 2; i++) {
                asciiPattern.add(new ShortLineStitch());
            }
            for (int i = 0; i < 1; i++) {
                asciiPattern.add(new CircleStitch());
            }
            for (int i = 0; i < 2; i++) {
                asciiPattern.add(new ShortLineStitch());
            }
        }
        needleJamRate = 0.10f;
    }
}

class BrokenWigglePattern extends Pattern {
    public BrokenWigglePattern() {
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 1; i++) {
                asciiPattern.add(new SmallCrossStitch());
            }
            for (int i = 0; i < 1; i++) {
                asciiPattern.add(new LargeCrossStitch());
            }
        }
        needleJamRate = 0.40f;
    }
}