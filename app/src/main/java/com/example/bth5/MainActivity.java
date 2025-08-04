package com.example.bth5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editNamDuongLich;
    TextView textNamAmLich;
    Button btnChuyenDoi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editNamDuongLich = findViewById(R.id.editNamDuongLich);
        textNamAmLich = findViewById(R.id.textNamAmLich);
        btnChuyenDoi = findViewById(R.id.btnChuyenDoi);

        btnChuyenDoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int namDuongLich = Integer.parseInt(editNamDuongLich.getText().toString());
                String can = "", chi = "";
                switch (namDuongLich % 10) {
                    case 0:
                        can = "Canh";
                        break;

                    case 1:
                        can = "Tân";
                        break;

                    case 2:
                        can = "Nhâm";
                        break;

                    case 3:
                        can = "Quý";
                        break;

                    case 4:
                        can = "Giáp";
                        break;

                    case 5:
                        can = "Ất";
                        break;

                    case 6:
                        can = "Bính";
                        break;

                    case 7:
                        can = "Đinh";
                        break;

                    case 8:
                        can = "Mậu";
                        break;

                    case 9:
                        can = "Kỳ";
                        break;
                }

                switch (namDuongLich % 12) {
                    case 0:
                        chi = "Thân";
                        break;

                    case 1:
                        chi = "Dậu";
                        break;

                    case 2:
                        chi = "Tuất";
                        break;

                    case 3:
                        chi = "Hợi";
                        break;

                    case 4:
                        chi = "Tý";
                        break;

                    case 5:
                        chi = "Sửu";
                        break;

                    case 6:
                        chi = "Dần";
                        break;

                    case 7:
                        chi = "Mẹo";
                        break;

                    case 8:
                        chi = "Thìn";
                        break;

                    case 9:
                        chi = "Tỵ";
                        break;

                    case 10:
                        chi = "Ngọ";
                        break;

                    case 11:
                        chi = "Bùi";
                        break;
                }

                textNamAmLich.setText(can + " " + chi);
            }
        });

    }
}