package com.example.quotify

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.activityScenarioRule
import org.junit.Rule
import org.junit.Test

class QuotifyMainActivityTest {

    @get:Rule
    val activityScenarioRule = activityScenarioRule<QuotifyMainActivity>()

    @Test
    fun testNextButton_expectedCorrectQuote() {
        onView(withId(R.id.nextButton)).perform(click())
        onView(withId(R.id.nextButton)).perform(click())
        onView(withId(R.id.nextButton)).perform(click())



    }

}