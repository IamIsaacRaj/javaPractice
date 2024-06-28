package com.javapractice.exceptions;

public class CustomException {

    private static boolean isValid(String username, String password) throws NullPointerException, InvalidUserException {
        boolean isValid = false;
        if (username.equalsIgnoreCase("isaacraj890") && password.equals("Isaacraj@123"))
            isValid = true;
        else
            throw new InvalidUserException("wrong username or password");
        return isValid;
    }

    public static void main(String[] args) {
        String username = null;
        String password = "Isaacraj@123";
        boolean isValid = false;
        try {
            if(isValid(username, password))
                System.out.println("Valid user");
        } catch(NullPointerException e){
            System.out.println("username or password is null");
        } catch(InvalidUserException e){
            System.out.println(e.getMessage());
        }
    }
}
