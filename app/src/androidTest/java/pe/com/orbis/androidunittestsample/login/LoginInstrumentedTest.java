package pe.com.orbis.androidunittestsample.login;

import android.support.test.espresso.Espresso;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import pe.com.orbis.androidunittestsample.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


/**
 * Created by carlosvargas on 2/01/17.
 *
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class LoginInstrumentedTest {



    @Rule
    public ActivityTestRule<LoginActivity> loginActivityTestRule =
            new ActivityTestRule<>(LoginActivity.class);

    @Test
    public void clickLoginButton(){
        String email = "carlos@gmail.com";
        String password = "password";

        //type in email
        onView(withId(R.id.txtEmail)).perform(typeText(email), closeSoftKeyboard());

        //type in password
        onView(withId(R.id.txtPassword)).perform(typeText(password), closeSoftKeyboard());

        //click on login button
        onView(withId(R.id.btnRegister)).perform(click());

        //verify that succes screen shows
        String successString = "A matcher message";
        onView(withText(successString)).check(matches(isDisplayed()));
    }



}
