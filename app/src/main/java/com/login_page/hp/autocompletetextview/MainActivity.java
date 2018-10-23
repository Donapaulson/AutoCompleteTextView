package com.login_page.hp.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    private AdView mAdView;
    AutoCompleteTextView at;

//    public static final String[] country= new String[]{"Afganisthan","Alaska","Alabama","Algeria","Belgium","Bhutan",
//            "Canada","China","Cuba","Chile","Denmark","France","FInland","India","Ireland","Italy","Iceland","UAE","UK","USA"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        MobileAds.initialize(this, "ca-app-pub-7560444930814418~9844676293");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        //AUTOCOMPLETE TEXT VIEW
        String[] countries = getResources().getStringArray(R.array.countries);

        at = findViewById(R.id.autotextview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,countries);
        at.setAdapter(adapter);

    }
}

//Admob
//ca-app-pub-7560444930814418~9844676293