public class CountTester
{
    public static void main(String[] args)
    {
        System.out.print(Ex14.count("eee", "e") == 3 ? "Your " : "NOT ");
        System.out.print(Ex14.count("eeee", "ee") == 6 ? "Count " : "NOT ");
        System.out.print(Ex14.count("ebeb", "e") == 2 ? "Method " : "NOT ");
        System.out.print(Ex14.count("hellohello", "hello") == 6 ? "Works " : "NOT ");
        System.out.print(Ex14.count("nbnbnbnbnb", "nb") == 15 ? "Great.\n" : "NOT ");
        System.out.print(Ex14.count("Hola", "d") == 0 ? "Very " : "NOT ");
        System.out.print(Ex14.count("jdk52522522sgg", "52") == 11 ? "Good " : "NOT ");
        System.out.print(Ex14.count("this count method works fine", "te") == 5 ? "Job." : "NOT");
    }
}
