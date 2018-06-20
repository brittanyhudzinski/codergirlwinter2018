package MoonlightTapestries;

public class Stitch {
    public String asciiChar;

    public void sew()
    {
        System.out.print(asciiChar);
    }
}

class ShortLineStitch extends Stitch {
   public ShortLineStitch(){
       asciiChar = "-";
   }
}

class SmallCrossStitch extends Stitch {
    public SmallCrossStitch(){
        asciiChar = "x";
    }
}

class LargeCrossStitch extends Stitch {
    public LargeCrossStitch(){
        asciiChar = "X";
    }
}

class CircleStitch extends Stitch {
    public CircleStitch(){
        asciiChar = "o";
    }
}

class FillStitch extends Stitch {
    public FillStitch(){
        asciiChar = "=";
    }
}

class BlockStitch extends Stitch  {
    public BlockStitch(){
        asciiChar = "[]";
    }
}

class ZigZagStitch extends Stitch {
    public ZigZagStitch(){
        asciiChar = "Z";
    }

}



