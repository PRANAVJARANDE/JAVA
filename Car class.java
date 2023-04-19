public class Car
{
    private String name;
    private char dir;
    private int px;
    private int py;

    Car(String n,char d,int x,int y)
    {
        name=n;
        dir=d;
        px=x;
        py=y;
    }

    void turn()
    {
        if(dir=='E')
        {
            dir='S';
        }
        else if(dir=='S')
        {
            dir='W';
        }
        else if(dir=='W')
        {
            dir='N';
        }
        else
        {
            dir='E';
        }
    }

    void turn(char c)
    {
        dir=c;
    }

    void move(int dist)
    {
        if(dir=='E')
        {
            px=px+dist;
        }
        else if(dir=='S')
        {
            py=py-dist;
        }
        else if(dir=='W')
        {
            px=px-dist;
        }
        else
        {
            py=py+dist;
        }

        System.out.println("CURRENT POSITION IS- "+px +" "+py);

    }

}
public class Main
{
	public static void main(String[] args)
	{

		Car c1=new Car("POLO",'E',0,0);
		c1.move(2);
		c1.turn();
		c1.move(2);
		c1.turn('N');
		c1.move(1);
	}
}
