package OOP_Pillars_8;
//polymorphism
class Sum 
{
    public int sum(int x, int y) 
    { 
        return (x + y); 
    } 
    public int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
    public double sum(double x, double y) 
    { 
        return (x + y); 
    } 
    public static void main(String args[]) 
    { 
        Sum s = new Sum(); 
        System.out.println(s.sum(10, 320)); 
        System.out.println(s.sum(100, 520, 90)); 
        System.out.println(s.sum(16.5, 74.5)); 
    } 
}
