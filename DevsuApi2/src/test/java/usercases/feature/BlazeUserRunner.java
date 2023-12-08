package usercases.feature;

import com.intuit.karate.junit5.Karate;

public class BlazeUserRunner {
    @Karate.Test
    Karate testUsers() {
        return Karate.run("user.feature").relativeTo(getClass());
    }


}
