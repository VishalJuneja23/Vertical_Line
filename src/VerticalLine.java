/**
 * Created by jvishal on 12/25/16.
 */
public class VerticalLine {

    private int length;

    public VerticalLine(int size) {
        length = size;
    }

    public String displayVerticalLine() {
        StringBuilder line = new StringBuilder();

        for(int i=0; i<length; i++) {

            if (i<length-1)
                line.append("*" + "\n");
            else
                line.append("*");

        }

        return line.toString();
    }

    public static void main(String[] args) {
        System.out.println(new VerticalLine(10).displayVerticalLine());
    }
}
