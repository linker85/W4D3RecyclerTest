package com.example.com.w4d3homeworkrecyclerexpreso;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.example.com.w4d3homeworkrecyclerexpreso.TestUtils.withRecyclerView;

/**
 * Created by dannyroa on 5/8/15.
 */
@RunWith(AndroidJUnit4.class)
public class RecyclerViewTest extends ActivityInstrumentationTestCase2<MainActivity> {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    public RecyclerViewTest() {
        super(MainActivity.class);
    }

    @Override protected void setUp() throws Exception {

        getActivity();
    }

    @Test
    public void testItemClick() {

        onView(withRecyclerView(R.id.a_notifications_recycler).atPosition(1)).perform(click());

        onView(withText("title09")).check(matches(isDisplayed()));

    }
}