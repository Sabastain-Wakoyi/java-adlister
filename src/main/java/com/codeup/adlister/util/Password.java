package com.codeup.adlister.util;

import org.mindrot.jbcrypt.BCrypt;

public class Password {
    private static final int ROUNDS = 12;

    //below turns the password into a hash using Bcrypt
    public static String hash(String password) {

        return BCrypt.hashpw(password, BCrypt.gensalt(ROUNDS));
    }

    //this allows me to check if a password return the same hash
    public static boolean check(String password, String hash) {
        return BCrypt.checkpw(password, hash);
    }
}
