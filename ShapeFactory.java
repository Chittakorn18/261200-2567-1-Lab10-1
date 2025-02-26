public class ShapeFactory {
    // Shape types
    public static final String CIRCLE = "CIRCLE";
    public static final String SQUARE = "SQUARE";
    public static final String RECTANGLE = "RECTANGLE";

    // Limits
    private static final int MAX_INSTANCES_PER_SHAPE = 2;
    private static final int MAX_TOTAL_SHAPES = 5;

    // Counters
    private static int circleCount = 0;
    private static int squareCount = 0;
    private static int rectangleCount = 0;
    private static int totalCount = 0;

    public static Shape getShape(String shapeType) {
        // Check if the total shape limit has been reached
        if (totalCount >= MAX_TOTAL_SHAPES) {
            System.out.println("Shape limit reached! Cannot create more shapes.");
            return null;
        }

        shapeType = shapeType.toUpperCase();
        switch (shapeType) {
            case CIRCLE:
                return createShape(CIRCLE);
            case SQUARE:
                return createShape(SQUARE);
            case RECTANGLE:
                return createShape(RECTANGLE);
            default:
                System.out.println("Unknown shape type: " + shapeType);
                return null;
        }
    }

    private static Shape createShape(String shapeType) {
        if (totalCount >= MAX_TOTAL_SHAPES) {
            System.out.println("Shape limit reached! Cannot create more shapes.");
            return null;
        }

        switch (shapeType) {
            case CIRCLE:
                if (circleCount < MAX_INSTANCES_PER_SHAPE) {
                    circleCount++;
                    totalCount++;
                    System.out.println("Drawing a Circle");
                    return new Circle();
                } else {
                    System.out.println("Limit reached for CIRCLE instances.");
                    return null;
                }
            case SQUARE:
                if (squareCount < MAX_INSTANCES_PER_SHAPE) {
                    squareCount++;
                    totalCount++;
                    System.out.println("Drawing a Square");
                    return new Square();
                } else {
                    System.out.println("Limit reached for SQUARE instances.");
                    return null;
                }
            case RECTANGLE:
                if (rectangleCount < MAX_INSTANCES_PER_SHAPE) {
                    rectangleCount++;
                    totalCount++;
                    System.out.println("Drawing a Rectangle");
                    return new Rectangle();
                } else {
                    System.out.println("Limit reached for RECTANGLE instances.");
                    return null;
                }
        }
        return null;
    }
}
