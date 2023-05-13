package Data.Enum;

import lombok.Getter;

@Getter
public enum Color {
    GREEN(0,255,0),
    RED(255,0,0),
    BLUE(0,0,255),
    Yellow(255,255,0),
    WHITE(255,255,255),
    BLACK(0,0,0),
    PURPLE(255,0,255),
    CYAN(0,255,255);

    private Color(int r,int g,int b){
        this.r=r;
        this.g=g;
        this.b=b;
    }
    private int r;
    private int g;
    private int b;
}
