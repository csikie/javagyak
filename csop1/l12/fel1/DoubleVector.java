import java.util.Objects;

class DoubleVector
{
    double[] coords;

    public DoubleVector(double x1, double x2)
    {
        this.coords = new double[2];
        this.coords[0] = x1;
        this.coords[1] = x2;
    }

    @Override
    public String toString()
    {
        return "(" + this.coords[0] + "," + this.coords[1] + ")";
    }

    @Override
    public boolean equals(Object that)
    {
        if (that == this) return true;
        if (that == null) return false;

        if (that instanceof DoubleVector)
        {
            DoubleVector thatDoubleVector = (DoubleVector)that;
            return coords[0] == thatDoubleVector.coords[0] && coords[1] == thatDoubleVector.coords[1];
        }
        else return false;
    }

    @Override
    public int hashCode()
    {
        //return (int)(11*coords[0] + 19*coords[1]);
        return Objects.hash(coords[0], coords[1]);
    }
}

