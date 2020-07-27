package com.soft.portfolioapp.viewFragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.soft.portfolioapp.R;

public class HomeFragment extends Fragment {

    private ImageView mBtn_Linkedin;
    private ImageView mBtn_GitHub;
    private ImageView mBtn_Whatsap;


    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        social_networks(view);

        return view;
    }

    public void social_networks(View view) {
        mBtn_Linkedin = view.findViewById(R.id.img_linkedin);
        mBtn_Linkedin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.linkedin.com/in/cleber-nascimento/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        mBtn_GitHub = view.findViewById(R.id.img_gitHub);
        mBtn_GitHub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://github.com/clebernascimento");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        mBtn_Whatsap = view.findViewById(R.id.img_whatsap);
        mBtn_Whatsap.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://api.whatsapp.com/send?phone=5592991513786&text=Ol%C3%A1!");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }
}