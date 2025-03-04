public class Main {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape(ShapeFactory.TYPE_CIRCLE);
        Shape shape2 = ShapeFactory.getShape(ShapeFactory.TYPE_RECTANGLE);
        Shape shape3 = ShapeFactory.getShape(ShapeFactory.TYPE_SQUARE);
        Shape shape4 = ShapeFactory.getShape(ShapeFactory.TYPE_CIRCLE);
        Shape shape5 = ShapeFactory.getShape(ShapeFactory.TYPE_RECTANGLE);
        Shape shape6 = ShapeFactory.getShape(ShapeFactory.TYPE_SQUARE);
        shape1.draw();
        shape2.draw();
        shape3.draw();
        shape4.draw();
        shape5.draw();
        shape6.draw();
    }
}
