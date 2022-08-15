import processing.core.PApplet;

public class oops_4Balls extends PApplet
{
    public static void main(String[] args)
    {
        PApplet.main("oops_4Balls",args);
    }
    popup_window_settings window=new popup_window_settings();
    Circle_settings circle1=new Circle_settings(0,window.getHEIGHT()/5);
    Circle_settings circle2=new Circle_settings(0,window.getHEIGHT()*2/5);
    Circle_settings circle3=new Circle_settings(0,window.getHEIGHT()*3/5);
    Circle_settings circle4=new Circle_settings(0,window.getHEIGHT()*4/5);
    @Override
    public  void settings()
    {
        super.settings();
        size(window.getWIDTH(),window.getHEIGHT());
    }

   /* @Override
    public void setup()
    {

    }*/

    @Override
    public void draw()
    {
         ellipse(circle1.getx(),circle1.gety(),circle1.getDIAMETER(),circle1.getDIAMETER());
         circle1.increment_x(1);
        ellipse(circle2.getx(),circle2.gety(),circle2.getDIAMETER(),circle2.getDIAMETER());
        circle2.increment_x(2);
        ellipse(circle3.getx(),circle3.gety(),circle3.getDIAMETER(),circle3.getDIAMETER());
        circle3.increment_x(3);
        ellipse(circle4.getx(),circle4.gety(),circle4.getDIAMETER(),circle4.getDIAMETER());
        circle4.increment_x(4);
    }
}
