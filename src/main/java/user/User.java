package user;

import java.util.Arrays;

public class User {

    private String userName;
    private String passWord;
    //private char size;

    private int rewardPoints;

    private String[] address;
    private double accountBalance;


    public User() { //default constructor

    }//end of constructor


    public User(String userName, String passWord, String[] address, int rewardPoints, double accountBalance) {
        this.accountBalance = accountBalance;
        this.address = address;
        this.rewardPoints = rewardPoints;
        this.userName = userName;
        this.passWord = passWord;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        if (accountBalance < 0) {
            System.out.println("Balance cant be negative");
        } else {
            this.accountBalance = accountBalance;
        }
    }


    public void setUserName(String newUserName) {
        this.userName = newUserName;
    }

    public String getUserName() {
        return this.userName;
    }


    public String getPassWord() {
        return passWord;
    }


    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }


    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }


    //public String printUserProfile (){
    //  void ""
    // };

    public void resetPassword(String newPassword) {
        this.passWord = newPassword;
    }

    public void useRewardPoints(int pointsToUse) {
        rewardPoints = rewardPoints - pointsToUse;
        System.out.println("you just used " + pointsToUse + " points and now you have "+rewardPoints+ "points left");
    }

    public String[] getAddress() {
        return this.address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    public void printAllAddress() {
        for (int i = 0; i < address.length; i++) {
            System.out.println(address[i]);
        }
    }

    public void printUserProfile() {
        System.out.println("My Name is " + userName + '\n' + "My Reward points " + rewardPoints + '\n' + "My address are " + address[0] + " and " + address[1]);


    }
}

