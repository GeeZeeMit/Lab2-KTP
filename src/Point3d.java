public class Point3d extends Point2d
{
    private double zCoordinate;
    public Point3d( double x, double y, double z)
    {
        xCoordinate = x;
        yCoordinate = y;
        zCoordinate = z;
    }
    public Point3d()
    {

        this(0, 0, 0);
    }
    public double getZ()
    {
        return zCoordinate;
    }
    public void setZ(double val)
    {
        zCoordinate = val;
    }
    public double distanceTo(Point3d point)
    {
        int scale = 100;
        double X = point.getX() - this.xCoordinate;
        double Y = point.getY() - this.yCoordinate;
        double Z = point.getZ() - this.zCoordinate;
        double distance = Math.sqrt(X*X + Y*Y + Z*Z);
        return Math.round(distance*scale) / (double) scale;
    }
}
