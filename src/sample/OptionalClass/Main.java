package sample.OptionalClass;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        UserService userService=new UserService();
        Optional<User> optionalUser=userService.getUserById(1);
// not always add null pointer check if we forget then it wil though the errror
//        if(user!=null){
//            System.out.println(user.getId()+"  " +user.getName());
//
//        }
        String name = "Shahaji";

        Optional<String> optional = Optional.of(name);

        System.out.println(optional);

//        if(optionalUser.isPresent()){
//           User user= optionalUser.get();
//            System.out.println(user.getId()+"   "+user.getName());
//        }

        optionalUser.ifPresent(user-> System.out.println(user.getId()+"  "+user.getName()));

    }
}
