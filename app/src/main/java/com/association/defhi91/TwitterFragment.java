package com.association.defhi91;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class TwitterFragment extends Fragment {

    public WebView tWebView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        try {
            View t=inflater.inflate(R.layout.fragment_twitter, container, false);
            getContext().getPackageManager().getPackageInfo("com.twitter.android", 0);
            Intent twitterIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("twitter://user?screen_name=Defhi91_asso"));
            startActivity(twitterIntent);
            getActivity().finish();
            return t;


        } catch (Exception e) {

            View v=inflater.inflate(R.layout.fragment_twitter, container, false);
            tWebView = (WebView) v.findViewById(R.id.twitter_webview);
            tWebView.loadUrl("https://twitter.com/Defhi91_asso");

            // Enable Javascript
            WebSettings webSettings = tWebView.getSettings();
            webSettings.setJavaScriptEnabled(true);

            // Force links and redirects to open in the WebView instead of in a browser
            tWebView.setWebViewClient(new WebViewClient());

            return v;

        }


    }
}

