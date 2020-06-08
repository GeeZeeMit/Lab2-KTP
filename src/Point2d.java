public class Point2d
{
    protected double xCoordinate;
    protected double yCoordinate;
    public Point2d(double x, double y)
    {
        xCoordinate = x;
        yCoordinate = y;
    }
    public Point2d()
    {

        this(0, 0);
    }
    public double getX()
    {
        return xCoordinate;
    }
    public double getY()
    {
        return yCoordinate;
    }
    public void setX(double val)
    {
        xCoordinate = val;
    }
    public void setY(double val)
    {
        yCoordinate = val;
    }
}
