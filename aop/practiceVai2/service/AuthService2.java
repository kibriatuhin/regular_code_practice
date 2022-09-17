package aop.practiceVai2.service;

public class AuthService2 {
    private static String authType;

    public static String getAuthType() {
        return authType;
    }

    public static void setAuthType(String authType) {
        AuthService2.authType = authType;
    }
}
