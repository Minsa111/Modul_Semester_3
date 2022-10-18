import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;

public class emailvalidation {
    public static void main(String[] args) {
        String emailAddress = "username@webmail.umm.ac.id";
        String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(regexPattern);
        System.out.println(pattern.matcher(emailAddress).matches());
    }
}
/*
xl          0817 0818 0819 0859 0877 0878
axis        0838 0831 0832 0833
three       0895 0896 0897 0898 0899
Smartfren   0881 0882 0883 0884 0885 0886 0887 0888 0889
Indosat     0814 0815 0816 0855 0856 0857 0858

*/