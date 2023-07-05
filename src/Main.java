import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String gama1="This line that I want to cut,cause it is too long";
        String gama2=gama1;
        System.out.println(gama2.substring(0,35));
        String gama3=gama2;
        System.out.println(gama3.replace("I", "don't"));
        System.out.println(gama3.replace("long", "perfect"));
        System.out.println(gama3.replace("too", "\b"));
        System.out.println(("This line that I want to cut,cause it is too long").length());
        System.out.println(("This line that I want to cut,cause ").length());
        System.out.println(("This line that don't want to cut,cause it is too long").length());
        System.out.println(("This line that I want to cut,cause it is too perfect").length());
        System.out.println(("This line that I want to cut,cause it is long").length());




        System.out.println("part 2");
        String beta = "Testing, is my favourite job";
        String beta1 = "Testing";
        String beta2 = "is";
        String beta3 = "my";
        String beta4 = "favourite";
        String beta5 = "Job";
        System.out.println(beta1.length() > beta2.length()
                && beta1.length() > beta3.length()
                && beta1.length() > beta4.length()
                && beta1.length() > beta5.length());
        System.out.println(("Testing").length());
        System.out.println(("is").length());
        System.out.println(("my").length());
        System.out.println(("favourite").length());
        System.out.println(("job").length());






        System.out.println("part 3============");

        String text= "Completely random text in English. In it," +
                " we just need to determine how many times the character 'a' " +
                "occurs there. And we can use the split method and " +
                "the length method.";
        System.out.println(text.split("a").length);
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());





    }
}
