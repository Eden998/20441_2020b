public class CountTester
{
    public static void main(String[] args)
    {
        System.out.println(Ex14.count("eee", "e") == 3 ? "Test 1 passed" : "problem with input \"eee\", \"e\".");
        System.out.println(Ex14.count("eeee", "ee") == 6 ? "Test 2 passed " : "problem with input \"eeee\", \"ee\".");
        System.out.println(Ex14.count("ebeb", "e") == 2 ? "Test 3 passed " : "problem with input \"ebeb\", \"e\".");
        System.out.println(Ex14.count("hellohello", "hello") == 9 ? "Test 4 passed " : "problem with input \"hellohello\", \"hello\".");
        System.out.println(Ex14.count("nbnbnbnbnb", "nb") == 15 ? "Test 5 passed" : "problem with input \"nbnbnbnbnb\", \"nb\".");
        System.out.println(Ex14.count("Hola", "d") == 0 ? "Test 6 passed " : "problem with input \"Hola\", \"d\".");
        System.out.println(Ex14.count("jdk52522522sgg", "52") == 11 ? "Test 7 passed " : "problem with input \"jdk52522522sgg\", \"52\".");
        System.out.println(Ex14.count("this count method works fine", "te") == 5 ? "Test 8 passed" : "problem with input"+ 
                                    "\"this count method works fine\", \"te\".");
        System.out.println(Ex14.count("ababab", "c") == 0 ? "Test 9 passed" : "problem with input \"ababab\", \"c\".");
        System.out.println(Ex14.count("abcabcabc", "ab") == 6 ? "Test 10 passed" : "problem with input \"abcabcabc\", \"ab\".");
        System.out.println(Ex14.count("432342342", "432") == 7 ? "Test 11 passed" : "problem with input \"abcabcabc\", \"ab\".");
        System.out.println(Ex14.count("aaaaaabaaaaab", "ab") == 17 ? "Test 12 passed" : "problem with input \"aaaaaabaaaaab\", \"ab\".");
        System.out.println(Ex14.count("bbabbbabbba", "ba") == 15 ? "Test 13 passed" : "problem with input \"bbabbbabbba\", \"ba\".");
        System.out.println(Ex14.count("aaaaaab", "ab") == 6 ? "Test 14 passed" : "problem with input \"aaaaaab\", \"ab\".");
        System.out.println(Ex14.count("aaaaaa", "ab") == 0 ? "Test 15 passed" : "problem with input \"aaaaaa\", \"ab\".");
        System.out.println(Ex14.count("", "ab") == 0 ? "Test 16 passed" : "problem with input \"\", \"ab\".");
        System.out.println(Ex14.count("ab", "ab") == 1 ? "Test 17 passed" : "problem with input \"ab\", \"ab\".");
        System.out.println(Ex14.count("abbcbacbac", "abc") == 10 ? "Test 18 passed" : "problem with input \"abbcbacbac\", \"abc\".");
    }
}
