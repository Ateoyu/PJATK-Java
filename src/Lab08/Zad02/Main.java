package Lab08.Zad02;

class Main {
    public static void main(String[] args) {
        Cube cube = new Cube(5);
        System.out.println(cube.area());
        System.out.println(cube.volume());
        System.out.println(cube.perimeter());

        Cuboid cuboid = new Cuboid(5, 5);
        System.out.println(cuboid.area());
        System.out.println(cuboid.volume());
        System.out.println(cuboid.perimeter());

        Rectangle rectangle = new Rectangle(5, 5);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());

        Square square = new Square(5);
        System.out.println(square.area());
        System.out.println(square.perimeter());
    }
}
