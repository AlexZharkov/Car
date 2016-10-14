package Car;

/**
 * Created by ZHARKOOE on 14.10.2016.
 */
public class Wheel {

    String type;
    String mark;

    public Wheel(String type, String mark) {
       this.mark = mark;
        this.type = type;
    }

    public String getMark() {
        return mark;
    }

    public void setType(String type) {
        this.type = type;
    }
}
