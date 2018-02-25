package misao.edu.toastcustom;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        context = getApplicationContext();

        Button button = findViewById( R.id.button );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    toastMake(context);
                }
        } );

    }


    //cunstom toast maker
    public void toastMake(Context cont) {
        Toast toast = new Toast( cont );

        LayoutInflater inflater = getLayoutInflater();

        //relative_layout:custom_toast.smlのRelativeLayoutにつけたID
        ViewGroup viewGroup = findViewById( R.id.relative_layout );

        //inflateする
        View view = inflater.inflate( R.layout.custom_toast, viewGroup );

        toast.setView( view );

        //表示時間
        toast.setDuration( Toast.LENGTH_SHORT );
        //位置調整
        toast.setGravity( Gravity.CENTER, 0, -100 );

        toast.show();
    }
}
