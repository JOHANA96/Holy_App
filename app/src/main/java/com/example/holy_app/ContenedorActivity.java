package com.example.holy_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.holy_app.R;
import com.example.holy_app.PageAdapter;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class ContenedorActivity extends AppCompatActivity {
    TabItem eucaristia, perfil, mapa;
    TabLayout menu;
    ViewPager contenedor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor);
        eucaristia = findViewById(R.id.tienda);
        perfil = findViewById(R.id.perfil);
        mapa = findViewById(R.id.mapa);
        menu = findViewById(R.id.menu);
        contenedor = findViewById(R.id.contenedor);

        PageAdapter pagerAdapter = new PageAdapter(getSupportFragmentManager(), menu.getTabCount());
        contenedor.setAdapter(pagerAdapter);
        contenedor.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(menu));
    }
}
