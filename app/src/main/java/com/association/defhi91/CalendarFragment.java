package com.association.defhi91;

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

public class CalendarFragment extends Fragment {

    public WebView cWebView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View c = inflater.inflate(R.layout.fragment_calendar, container, false);
        cWebView = (WebView) c.findViewById(R.id.calendar_webview);
        cWebView.loadUrl("https://www.defhi91.fr/activités/");

        WebSettings webSettings = cWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);

        cWebView.setWebViewClient(new WebViewClient());

        return c;
    }

}
