package aop.practiceVai.service;

public class AuthService {
    public static String authType;

    public static String getAuthType() {
        return authType;
    }

    public static void setAuthType(String authType) {
        AuthService.authType = authType;
    }
}
