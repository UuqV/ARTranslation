package com.artranslation.uuqv.artranslation;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.artranslation.uuqv.artranslation.FullscreenActivity;
import com.unity.sampleassets.UnityPlayerActivity;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)

public class UnityTest {

    //Attempts to load the unity player from the unity library
    @Test
    public void loadLibraryIntent() throws Exception {
        FullscreenActivity screen = new FullscreenActivity();
        Intent intent = new Intent(screen.getApplicationContext(), UnityPlayerActivity.class);
        assertNotNull(intent);
    }
}