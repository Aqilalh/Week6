package user;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       String [] adddres1 = {"Home1 ","Home2"};
       String [] address2 = {"Home 3","Home 4"};
        User user1 = new User();//User()
        user1.setUserName("Mikaila");
        user1.setRewardPoints(1000);
        user1.setAccountBalance(1000);


        User user2 = new User("Andrew","passwords",address2,1000,2000);
       // user2.useRewardPoints(100);
        User user3 = new User("Jazmin", "Coding",adddres1,1000,1000000);

        user3.resetPassword("practice");
        System.out.println(user3.getPassWord());
        System.out.println("==============");
        System.out.println(user1.getUserName());
        System.out.println("================");
       user1.useRewardPoints(100);
        System.out.println("===============");
        System.out.println(user1.getAccountBalance());
        System.out.println("===============");
        System.out.println(user3.getUserName());
        System.out.println("================");
        user3.printAllAddress();
        System.out.println("=================");
        user2.printUserProfile();

    }
}
