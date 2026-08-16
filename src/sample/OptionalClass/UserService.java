package sample.OptionalClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserService
{

    List<User> list=new ArrayList<>(Arrays.asList(new User(1,"shahaji"),
            new User(2,"ram"),
            new User(3,"sham")
    )
    );

    // if we don't want to write seperate class another and we want to write data here it selft h

    public Optional<User> getUserById(int id){
        // iterate loop oky use enhance for loop - internally it used iterator oky
        for(User user:list){
            if(user.getId()==id){
                System.out.println("called");
                return Optional.of(user);
            }
        };
        return Optional.empty();
    }
}
