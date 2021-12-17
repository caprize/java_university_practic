package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    Pattern pattern5 = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[^@#$%^&+=])(?=\\S+$).{8,}$");;
    Matcher matcher5;

    public Password(CharSequence input) {
        matcher5 = pattern5.matcher(input);
    }

}
