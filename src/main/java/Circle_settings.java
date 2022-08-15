public class Circle_settings
{
    private int DIAMETER,x,y;

    public  Circle_settings(int x,int y)
    {
        DIAMETER=10;
        this.x=x;
        this.y=y;
    }

    public int getDIAMETER()
    {
        return DIAMETER;
    }
    public int getx()
    {
        return x;
    }
    public int gety()
    {
        return y;
    }
    public void increment_x(int inc)
    {
        x=x+inc;
    }
}
