package a.mt.hocintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    TextView txtKetQua,txtKetQua2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtKetQua=findViewById(R.id.txtKetQua1);
        txtKetQua2=findViewById(R.id.txtKetQua2);

        ArrayList<HocSinh> hs=new ArrayList<>();

        Intent intent=getIntent();
        Bundle bundle=intent.getBundleExtra("dulieu");

        String name=bundle.getString("chuoi");



        hs= (ArrayList<HocSinh>) intent.getSerializableExtra("dulieu");
        hs= (ArrayList<HocSinh>) bundle.getSerializable("doituong");


       // txtKetQua.setText(name);


        txtKetQua.setText(hs.get(0).getHoTen()+", NS:  "+ hs.get(0).getNamsinh());
        txtKetQua2.setText(hs.get(1).getHoTen()+", NS:  "+ hs.get(1).getNamsinh());


    }
}
