package bestaveiro.innovationnow2017;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class MainActivity extends AppCompatActivity {

//    public Button speakersButton;
//
//    public void initButton(){
//        speakersButton = (Button)findViewById(R.id.speakersButton);
//        speakersButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent showSpeakers = new Intent(MainActivity.this, Schedule.class);
//
//                startActivity(showSpeakers);
//            }
//        });
//    }

    String optionsArray[] = {"Schedule", "Speakers", "Partners"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Circle Menu//
        final CircleMenu circleMenu = (CircleMenu)findViewById(R.id.circle_menu);
        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"), R.drawable.bestlogo1_round, R.drawable.bestlogo2_round_transparent)
                .addSubMenu(Color.parseColor("#258CFF"),R.drawable.schedule1_transparent)
                .addSubMenu(Color.parseColor("#ff0000"),R.drawable.speakers1_round_semitransparent)
                .addSubMenu(Color.parseColor("#7FFF00"),R.drawable.partners2_transparent)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index){
                        Toast.makeText(MainActivity.this, "Opening " + optionsArray[index], Toast.LENGTH_SHORT);
                    }
                });

        //Inicializar handler para ter acesso a "delays"
        final Handler mHandler = new Handler();



        //
         /*Runnable openMenuActvs = new Runnable() {
             @Override
             public void run() {

                 //Fazer delay em cada "SelectedListener"->(submenu/botão)
                 mHandler.postDelayed(this, 1000);

                 //Addin Listeners to the submenus
                 circleMenu.setOnMenuSelectedListener(new OnMenuSelectedListener() {
                     @Override
                     public void onMenuSelected(int index) {
                         switch (index){
                             case 0:
                                 Intent showSpeakers = new Intent(MainActivity.this, Schedule.class);
                                 startActivity(showSpeakers);
                                 break;

                             case 1:
                                 Intent showSpeakers2 = new Intent(MainActivity.this, Schedule.class);
                                 startActivity(showSpeakers2);
                                 break;

                             case 2:
                                 Intent showSpeakers3 = new Intent(MainActivity.this, Schedule.class);
                                 startActivity(showSpeakers3);
                                 break;


                         }
                     }
                 });
                              }
         };*/
        circleMenu.setOnMenuSelectedListener(new OnMenuSelectedListener() {
            //Criar handler para ter acesso ao "delay"

            @Override
            public void onMenuSelected(int index) {
                switch (index){
                case 0:
                   // mHandler.postDelayed(showSpeakers, 100);
                    Intent showSchedule = new Intent(MainActivity.this, Schedule.class);
                    startActivity(showSchedule);
                    break;
                //Diego: restantes activities da App
                case 1:
                    Intent showSpeakers = new Intent();
                    startActivity(showSpeakers);
                    break;

                case 2:
                     Intent showPartners = new Intent();
                    startActivity(showPartners);
                     break;


                }
            }
        });


        //initButton();
    }
}


























