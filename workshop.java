public class workshop
{
    int age=15; //instance variable
    static int age_1=51; //static variable
    
    public static void main(String[] args)
    {
        int age=123; //local variable 
        workshop a = new workshop();
        System.out.println(a.age);
        System.out.println(workshop.age_1);
        System.out.println("hello world");
        System.out.println("github");
    }
}