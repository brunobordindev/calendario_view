package com.example.calendarioview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;

import com.example.calendarioview.databinding.ActivityMainBinding;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.OnDateSelectedListener;
import com.prolificinteractive.materialcalendarview.OnMonthChangedListener;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        //CALENDARIO 1, DO PROPRIO ANDROID STUDIO
//        binding.calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
//            @Override
//            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int dayOfMonth) {
//
//                Log.i("Data: ", "ano = " + year);
//                Log.i("Data: ", "mes = " + month);
//                Log.i("Data: ", "dia = " + dayOfMonth);
//                Log.i("Data: ", dayOfMonth + "/" + (month + 1) + "/" + year); // Mês sempre tem q somar + 1, pra dar o mês certo
//            }
//        });

//        ------------------------------------------------------------------------------------------------------------------------

        //CALENDARIO 2, IMPORT GITHUB

        //CONSEGUE DEFINIR A QUANTIDADE MAXIMA E MINIMA PARA APARECER O CALENDARIO
//        binding.calendarView2.state().edit()
//                .setMinimumDate(CalendarDay.from(2022,3, 1 ))
//                .setMaximumDate(CalendarDay.from(2022,6, 1 ))
//                .commit();


        CharSequence meses [] = {"Janiero", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        binding.calendarView2.setTitleMonths(meses);

        CharSequence semanas[] = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado" };
        binding.calendarView2.setWeekDayLabels(semanas);

//        binding.calendarView2.setOnDateChangedListener(new OnDateSelectedListener() {
//            @Override
//            public void onDateSelected(@NonNull MaterialCalendarView widget, @NonNull CalendarDay date, boolean selected) {
//
//                Log.i("Data: ", "Somente dos dias = " + date);
//            }
//        });

        binding.calendarView2.setOnMonthChangedListener(new OnMonthChangedListener() {
            @Override
            public void onMonthChanged(MaterialCalendarView widget, CalendarDay date) {
               // Log.i("Data: ", "Somente no mes = " + date );
                Log.i("Data: ", "mes = " + (date.getMonth() + 1));
            }
        });

    }
}