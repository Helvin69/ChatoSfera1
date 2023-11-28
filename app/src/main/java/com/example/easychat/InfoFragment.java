package com.example.easychat;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoFragment extends Fragment {

    public InfoFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_info, container, false);

        // Получение ссылок на элементы разметки
        ImageView logoImageView = view.findViewById(R.id.logoImageView);
        TextView appNameTextView = view.findViewById(R.id.appNameTextView);
        TextView appSummaryTextView = view.findViewById(R.id.appSummaryTextView);

        // Установка логотипа, названия и сводки информации
        logoImageView.setImageResource(R.drawable.chat_icon);
        appNameTextView.setText("ChatoSfera");
// В InfoFragment.java
        appSummaryTextView.setText("ChatoSfera - это удобное приложение для обмена сообщениями. Современный дизайн, быстрая доставка сообщений и возможность общения с друзьями делают наше приложение идеальным выбором для вашего онлайн-общения. Создайте чаты, отправляйте мгновенные сообщения и оставайтесь на связи в любое время!");

        return view;
    }
}