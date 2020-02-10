package com.ksasanka.coronaautomation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
        this.context = context;
    }

    public int[] slide_images = {
            R.drawable.smartphone,
            R.drawable.technology,
            R.drawable.monitor_1
    };

    public String[] slide_headings = {
            "IoT ASSISTED CORONA TREATMENT",
            "MONITORING",
            "CONTROLLING"
    };

    public  String[] slide_description = {
            "IoT based application for better and efficient monitoring and controlling of Corona Treatment System",
            "Monitor all the parameters with effective visual representations like graphs, gauge charts etc.",
            "Control any parameter of the device from anywhere in your industry from any device."
    };

    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout) o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        ImageView slideImageView = view.findViewById(R.id.slide_image);
        TextView headingTextView = view.findViewById(R.id.slide_heading);
        TextView descriptionTextView = view.findViewById(R.id.slide_description);

        slideImageView.setImageResource(slide_images[position]);
        headingTextView.setText(slide_headings[position]);
        descriptionTextView.setText(slide_description[position]);

        container.addView(view);


        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout) object);
    }
}
