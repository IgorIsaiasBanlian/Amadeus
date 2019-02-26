package com.example.yink.amadeus;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import androidx.annotation.RequiresApi;

/**
 * Created by Yink on 05.03.2017.
 */

@RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
public class SettingsFragment extends PreferenceFragment {
    SharedPreferences sharedPreferences;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}
