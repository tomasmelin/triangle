public class Triangle {
    private final String equiliteralTriangle = "You have created an Equilateral Triangle!";
    private final String isosceleTriangle = "You have created an Isoscele Triangle!";
    private final String scaleneTriangle = "You have created a Scalene Triangle!";
    private final String notATriangle = "You have created a NotATriangle!";
    private final String rightAngledTriangle = "You have created a Right-Angled Triangle";
    private int lowerLimit = 1;
    private int upperLimit = 200;
    private int a;
    private int b;
    private int c;

    public boolean isWithinLimits(int i) {
        return this.getLowerLimit() <= i && i <= this.getUpperLimit();
    }

    public void checkTriangleType(Triangle triangle) {
        if (triangle.isWithinBasicConditions()) {
            if (triangle.isEquilateral()) {
                System.out.println(equiliteralTriangle);
            } else if (triangle.isIsoscele()) {
                System.out.println(isosceleTriangle);
            } else {
                System.out.println(scaleneTriangle);
                checkRightAngledTriangle(this.getA(), this.getB(), this.getC());
            }
        } else {
            System.out.println(notATriangle);
        }
    }

    /**
     * Checks whether the Triangle is a Right-Angled Triangle or not.
     */
    public void checkRightAngledTriangle(int a, int b, int c) {
        if (a >= b && a >= c & (a * a == (b * b + c * c)))
            System.out.println(rightAngledTriangle);
        else if (b >= a && b >= c && (b * b == (a * a + c * c)))
            System.out.println(rightAngledTriangle);
        else if (c >= a && c >= b && (c * c == (b * b + a * a)))
            System.out.println(rightAngledTriangle);

        /*
        if (a >= b && a >= c) {
            if (a * a == (b * b + c * c)) {
                System.out.println(rightAngledTriangle);
            }
        } else if (b >= a && b >= c) {
            if (b * b == (a * a + c * c)) {
                System.out.println(rightAngledTriangle);
            }
        } else if (c >= a && c >= b) {
            if (c * c == (b * b + a * a)) {
                System.out.println(rightAngledTriangle);
            }

        }
         */
    }

    /**
     * Returns true if the Triangle is Isoscele.
     */
    public boolean isIsoscele() {
        return (this.getA() == this.getB() && this.getB() != this.getC())
                || (this.getA() != this.getB() && this.getB() == this.getC())
                || (this.getA() == this.getC() && this.getA() != this.getB());
    }

    /**
     * Returns true if the Triangle is Equilateral.
     */
    public boolean isEquilateral() {
        return this.getA() == this.getB() && this.getB() == this.getC();
    }

    public boolean isWithinBasicConditions() {
        return (this.getA() < (this.getB() + this.getC()))
                && (this.getB() < this.getA() + this.getC())
                && (this.getC() < this.getA() + this.getB());
    }

    /* Getters and Setters */
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getLowerLimit() {
        return lowerLimit;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

}
