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

public class FacebookFragment extends Fragment {

    public WebView fWebView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        try {
            View t=inflater.inflate(R.layout.fragment_facebook, container, false);

            getContext().getPackageManager().getPackageInfo("com.facebook.katana", 0);
            Intent facebookIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://facewebmodal/f?href=" + "https://www.facebook.com/DEFHI91/"));
            startActivity(facebookIntent);
            getActivity().finish();
            return t;

        } catch (Exception e) {

            View v=inflater.inflate(R.layout.fragment_facebook, container, false);
            fWebView = (WebView) v.findViewById(R.id.facebook_webview);
            fWebView.loadUrl("https://www.facebook.com/DEFHI91/");

            WebSettings webSettings = fWebView.getSettings();
            webSettings.setJavaScriptEnabled(true);

            fWebView.setWebViewClient(new WebViewClient());

            return v;

        }
    }
}
