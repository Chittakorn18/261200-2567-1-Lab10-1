public class ShapeFactory {
    public static final int TYPE_CIRCLE = 0;
    public static final int TYPE_RECTANGLE = 1;
    public static final int TYPE_SQUARE = 2;
    private static int countCircle = 0;
    private static int countCircleLimit = 2;
    private static int countRectangle = 0;
    private static int countRectangleLimit = 2;
    private static int countSquare = 0;
    private static int countSquareLimit = 2;
    private static int allcount = 5 ;
    private static int countall = 0;

    public static Shape getShape(int type){
        switch (type){
            case TYPE_CIRCLE :
                if (countCircle < countCircleLimit && countall < allcount) {
                    countall++;
                    countCircle++;
                    return new Circle();
                }
            case TYPE_RECTANGLE :
                if (countRectangle < countRectangleLimit && countall < allcount) {
                    countall++;
                    countRectangle++;
                    return new Rectangle();
                }
            case TYPE_SQUARE:
                if (countSquare < countSquareLimit && countall < allcount) {
                    countall++;
                    countSquare++;
                    return new Square();
                }
            default :
                return null;
        }
    }
}
