package designPattern.proxyPractice.service;

public class AuthService {
    private static String userType;

    public static String getUserType() {
        return userType;
    }

    public static void setUserType(String userType) {
        AuthService.userType = userType;
    }
}
