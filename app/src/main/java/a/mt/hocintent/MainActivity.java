package a.mt.hocintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btnSend;
    ImageButton imbTrinhDuyet, imbSms, imbCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();



    }

    private void addEvents() {
        imbCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:0921216360"));
                startActivity(intent);
            }
        });

        imbSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_SENDTO);
                intent.putExtra("sms_body","Chào bạn...");
                intent.setData(Uri.parse("sms:0921216360"));
                startActivity(intent);
            }
        });
        imbTrinhDuyet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://hoanghamobile.com"));
                startActivity(intent);
            }
        });
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,SecondActivity.class);

                String []arrayname={"Hanoi", "HCM","Đà Lạt"};

                ArrayList<HocSinh> dsHocSinh=new ArrayList<>();
                dsHocSinh.add(new HocSinh("Nguyễn Bảo Anh", 2013));
                dsHocSinh.add(new HocSinh("Nguyễn Chí Kiên", 2016));

                Bundle bundle=new Bundle();
                bundle.putString("chuoi","Khoa Pham");
                bundle.putInt("conso",12345);
                bundle.putStringArray("mangTen",arrayname);
                bundle.putSerializable("doituong",(Serializable)dsHocSinh);
                // HocSinh hocSinh=new HocSinh("Nguyễn Bảo Anh", 2012);
                intent.putExtra("dulieu", bundle);

                startActivity(intent);

            }
        });
    }

    private void addControls() {
        btnSend=findViewById(R.id.btnSend);
        imbTrinhDuyet=findViewById(R.id.imbtrinhDuyet);
        imbSms=findViewById(R.id.imbSms);
        imbCall=findViewById(R.id.imbCall);
    }
}
