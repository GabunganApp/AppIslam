package com.example.user.belajarapi;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;

        import butterknife.ButterKnife;
        import butterknife.OnClick;

public class Doa6Activity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doa6harian);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.lanjut)
    public void lanjut() {
        Intent intent = new Intent(Doa6Activity.this, Doa7Activity.class);
        startActivity(intent);
    }
}