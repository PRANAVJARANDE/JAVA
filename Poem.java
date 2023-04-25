
public class Poem
{
    protected String name;
    protected int nline;
    Poem()
    {
        
    }
    
    Poem(String n,int k)
    {
        name=n;
        nline=k;
    }
    
    public String getname()
    {
        return name;
    }
    
    public int getlines()
    {
        return nline;
    }
}