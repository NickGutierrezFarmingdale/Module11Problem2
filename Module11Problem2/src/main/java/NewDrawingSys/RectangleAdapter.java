package NewDrawingSys;

import com.mycompany.oldDrawingSys.Rectangle;

public class RectangleAdapter implements Shape{
    private Rectangle rectangle;

    public RectangleAdapter(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        rectangle.draw(x1, y1, Math.abs(x2 - x1), Math.abs(y2 - y1));
        //instead of providing width and height, this function calculates the width and height.
    }
}
