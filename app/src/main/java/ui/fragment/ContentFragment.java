package ui.fragment;


import android.annotation.TargetApi;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import example.user.mddemo.R;
import ui.activity.ShareActivity;

public class ContentFragment extends Fragment {

    public ContentFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_content, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final ImageView shareImage = (ImageView) view.findViewById(R.id.image_share);
        TextView tvShare = (TextView) view.findViewById(R.id.tv_go_share);
        tvShare.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                //跳转页面 共享imageview
                Intent intent = new Intent(getActivity(), ShareActivity.class);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(getActivity(),shareImage,"share_image").toBundle());
            }
        });
    }


}
