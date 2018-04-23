package sg.edu.rp.c346.project03_v1;

import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Play extends AppCompatActivity{
    //Utilities
    TextView tvTimer;
    Button btnStart;

    //Player One Buttons
    ImageView ivPlayerOne;
    ImageView p1Chosen;
    ImageButton playerOneAns1;
    ImageButton playerOneAns2;
    ImageButton playerOneAns3;
    ImageButton playerOneAns4;
    ImageButton playerOneLock;
    TextView p1Points;
    int P1points;
    //Player Two Buttons
    ImageView ivPlayerTwo;
    ImageView p2Chosen;
    ImageButton playerTwoAns1;
    ImageButton playerTwoAns2;
    ImageButton playerTwoAns3;
    ImageButton playerTwoAns4;
    ImageButton playerTwoLock;
    TextView p2Points;
    int P2points;

    String P1Chosen = "";
    String P2Chosen = "";

    //Image used
    String str = "";
    String str2 = "";
    String str3 = "";
    String str4 = "";

    //Answers
    String p1str1 = "";
    String p1str2 = "";
    String p1str3 = "";
    String p1str4 = "";
    String p2str1 = "";
    String p2str2 = "";
    String p2str3 = "";
    String p2str4 = "";

    String[] champs = {
            //A
            "Aatrox", "Ahri", "Akali", "Alistar", "Amumu", "Anivia", "Annie", "Ashe", "Aurelion Sol", "Azir",
            //B
            "Bard", "Blitzcrank", "Brand", "Braum",
            //C
            "Caitlyn", "Camille", "Cassiopeia", "Cho'Gath", "Corki",
            //D
            "Darius", "Diana", "Dr.Mundo", "Draven",
            //E
            "Ekko", "Elise", "Evelynn", "Ezreal",
            //F
            "Fiddlesticks", "Fiora", "Fizz",
            //G
            "Galio", "Gangplank", "Garen", "Gnar", "Gragas", "Graves",
            //H
            "Hecarim", "Heimerdinger",
            //I
            "Illaoi", "Irelia", "Ivern",
            //J
            "Janna", "Jarvan IV", "Jax", "Jayce", "Jhin", "Jinx",
            //K
            "Kalista", "Karma", "Karthus", "Kassadin", "Katarina", "Kayle", "Kayn", "Kennen", "Kha'Zix", "Kindred", "Kled", "Kog'Maw",
            //L
            "LeBlanc", "Lee Sin", "Leona", "Lissandra", "Lucian", "Lulu", "Lux",
            //M
            "Malphite", "Malzahar", "Maokai", "Master Yi", "Miss Fortune", "Mordekaiser", "Morgana",
            //N
            "Nami", "Nasus", "Nautilus", "Nidalee", "Nocturne", "Nunu",
            //O
            "Olaf", "Orianna", "Ornn",
            //P
            "Pantheon", "Poppy",
            //Q
            "Quinn",
            //R
            "Rakan", "Rammus", "Rek'Sai", "Renekton", "Rengar", "Riven", "Rumble", "Ryze",
            //S
            "Sejuani", "Shaco", "Shen", "Shyvana", "Singed", "Sion", "Sivir", "Skarner", "Sona", "Soraka", "Swain", "Syndra",
            //T
            "Tahm Kench", "Taliyah", "Talon", "Taric", "Teemo", "Thresh", "Tristana", "Trundle", "Tryndamere", "Twisted Fate", "Twitch",
            //U
            "Udyr", "Urgot",
            //V
            "Varus", "Vayne", "Veigar", "Vel'Koz", "Vi", "Viktor", "Vladimir", "Volibear",
            //W
            "Warwick", "Wukong",
            //X
            "Xayah", "Xerath", "Xin Zhao",
            //Y
            "Yasuo", "Yorick",
            //Z
            "Zac", "Zed", "Ziggs", "Zilean", "Zoe", "Zyra"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();

        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.setContentView(R.layout.activity_play);

        tvTimer =  findViewById(R.id.textViewTimer);
        btnStart = findViewById(R.id.buttonStart);

        ivPlayerOne =  findViewById(R.id.playerOneQn);
        p1Chosen =  findViewById(R.id.chosenAnsP1);
        playerOneAns1 =  findViewById(R.id.playerOneAns1);
        playerOneAns2 =  findViewById(R.id.playerOneAns2);
        playerOneAns3 =  findViewById(R.id.playerOneAns3);
        playerOneAns4 =  findViewById(R.id.playerOneAns4);
        playerOneLock = findViewById(R.id.playerOneLock);
        p1Points =  findViewById(R.id.player1Points);

        ivPlayerTwo =  findViewById(R.id.playerTwoQn);
        p2Chosen =  findViewById(R.id.chosenAnsP2);
        playerTwoAns1 =  findViewById(R.id.playerTwoAns1);
        playerTwoAns2 =  findViewById(R.id.playerTwoAns2);
        playerTwoAns3 =  findViewById(R.id.playerTwoAns3);
        playerTwoAns4 =  findViewById(R.id.playerTwoAns4);
        playerTwoLock =  findViewById(R.id.playerTwoLock);
        p2Points =  findViewById(R.id.player2Points);
        disableButtons();

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p1Chosen.setImageResource(R.drawable.random);
                p2Chosen.setImageResource(R.drawable.random);
                int number = new Random().nextInt(champs.length);
                str = removeExtras(champs[number]);
                P1Chosen = "";
                P2Chosen = "";

                //Answers
                p1str1 = "";
                p1str2 = "";
                p1str3 = "";
                p1str4 = "";
                p2str1 = "";
                p2str2 = "";
                p2str3 = "";
                p2str4 = "";
                enableButtons();
                int id = getResources().getIdentifier(str, "drawable", getPackageName());
                Drawable drawable = getResources().getDrawable(id, null);
                ivPlayerOne.setImageDrawable(drawable);
                ivPlayerTwo.setImageDrawable(drawable);
                buttonRandomer();
                timer.start();
            }
        });
    }

    protected static String removeExtras(String name) {
        name = name.replace(" ", "").replace(".", "").replace("'", "").toLowerCase();
        return name;
    }

    protected void enableButtons() {
        playerTwoAns1.setEnabled(true);
        playerTwoAns2.setEnabled(true);
        playerTwoAns3.setEnabled(true);
        playerTwoAns4.setEnabled(true);
        playerOneAns1.setEnabled(true);
        playerOneAns2.setEnabled(true);
        playerOneAns3.setEnabled(true);
        playerOneAns4.setEnabled(true);

    }

    protected void disableButtons() {
        playerOneAns1.setEnabled(false);
        playerOneAns2.setEnabled(false);
        playerOneAns3.setEnabled(false);
        playerOneAns4.setEnabled(false);
        playerOneLock.setEnabled(false);
        playerTwoAns1.setEnabled(false);
        playerTwoAns2.setEnabled(false);
        playerTwoAns3.setEnabled(false);
        playerTwoAns4.setEnabled(false);
        playerTwoLock.setEnabled(false);

    }

    protected void disableP1Buttons() {
        playerOneAns1.setEnabled(false);
        playerOneAns2.setEnabled(false);
        playerOneAns3.setEnabled(false);
        playerOneAns4.setEnabled(false);
        playerOneLock.setEnabled(false);

    }

    protected void disableP2Buttons() {
        playerTwoAns1.setEnabled(false);
        playerTwoAns2.setEnabled(false);
        playerTwoAns3.setEnabled(false);
        playerTwoAns4.setEnabled(false);
        playerTwoLock.setEnabled(false);

    }

    protected void buttonRandomer() {
        int n1 = new Random().nextInt(champs.length);
        int n2 = new Random().nextInt(champs.length);
        int n3 = new Random().nextInt(champs.length);
        String ans1 = str = str + "r";
        String ans2 = str2 = removeExtras(champs[n1]) + "r";
        String ans3 = str3 = removeExtras(champs[n2]) + "r";
        String ans4 = str4 = removeExtras(champs[n3]) + "r";

        List<String> p1btn = new ArrayList<>();
        p1btn.add(ans1);
        p1btn.add(ans2);
        p1btn.add(ans3);
        p1btn.add(ans4);
        Collections.shuffle(p1btn,new Random(System.nanoTime()));

        p1str1 = p1btn.get(0);
        p1str2 = p1btn.get(1);
        p1str3 = p1btn.get(2);
        p1str4 = p1btn.get(3);

        List<String> p2btn = new ArrayList<>();
        p2btn.add(ans1);
        p2btn.add(ans2);
        p2btn.add(ans3);
        p2btn.add(ans4);
        Collections.shuffle(p2btn,new Random(System.nanoTime()));

        p2str1 = p2btn.get(0);
        p2str2 = p2btn.get(1);
        p2str3 = p2btn.get(2);
        p2str4 = p2btn.get(3);

        int p1id1 = getResources().getIdentifier(p1btn.get(0), "drawable", getPackageName());
        Drawable p1D1 = getResources().getDrawable(p1id1, null);
        playerOneAns1.setImageDrawable(p1D1);
        int p1id2 = getResources().getIdentifier(p1btn.get(1), "drawable", getPackageName());
        Drawable p1D2 = getResources().getDrawable(p1id2, null);
        playerOneAns2.setImageDrawable(p1D2);
        int p1id3 = getResources().getIdentifier(p1btn.get(2), "drawable", getPackageName());
        Drawable p1D3 = getResources().getDrawable(p1id3, null);
        playerOneAns3.setImageDrawable(p1D3);
        int p1id4 = getResources().getIdentifier(p1btn.get(3), "drawable", getPackageName());
        Drawable p1D4 = getResources().getDrawable(p1id4, null);
        playerOneAns4.setImageDrawable(p1D4);

        int p2id1 = getResources().getIdentifier(p2btn.get(0), "drawable", getPackageName());
        Drawable p2D1 = getResources().getDrawable(p2id1, null);
        playerTwoAns1.setImageDrawable(p2D1);
        int p2id2 = getResources().getIdentifier(p2btn.get(1), "drawable", getPackageName());
        Drawable p2D2 = getResources().getDrawable(p2id2, null);
        playerTwoAns2.setImageDrawable(p2D2);
        int p2id3 = getResources().getIdentifier(p2btn.get(2), "drawable", getPackageName());
        Drawable p2D3 = getResources().getDrawable(p2id3, null);
        playerTwoAns3.setImageDrawable(p2D3);
        int p2id4 = getResources().getIdentifier(p2btn.get(3), "drawable", getPackageName());
        Drawable p2D4 = getResources().getDrawable(p2id4, null);
        playerTwoAns4.setImageDrawable(p2D4);

    }

    CountDownTimer timer = new CountDownTimer(5000, 1000) { //set to 2 second for testing purposes change back to 5 seconds after this
        public void onTick(long millisUntilFinished) {
            String timeLeft = "" + millisUntilFinished / 1000;
            tvTimer.setText(timeLeft);
            playerOneAns1.setOnClickListener(buttonListener);
            playerOneAns2.setOnClickListener(buttonListener);
            playerOneAns3.setOnClickListener(buttonListener);
            playerOneAns4.setOnClickListener(buttonListener);
            playerTwoAns1.setOnClickListener(buttonListener);
            playerTwoAns2.setOnClickListener(buttonListener);
            playerTwoAns3.setOnClickListener(buttonListener);
            playerTwoAns4.setOnClickListener(buttonListener);
            playerOneLock.setOnClickListener(buttonListener);
            playerTwoLock.setOnClickListener(buttonListener);
        }

        public void onFinish() {
            disableButtons();
            if (P1Chosen.equals(str) && P2Chosen.equals(str)) {
                tvTimer.setText(R.string.draw);
            } else if (P1Chosen.equals(str) && !P2Chosen.equals(str)) {
                tvTimer.setText(R.string.p1win);
                P1points = addP1Points(P1points);
                String displayP1Points = P1points + " Points";
                p1Points.setText(displayP1Points);
            } else if (!P1Chosen.equals(str) && P2Chosen.equals(str)) {
                tvTimer.setText(R.string.p2win);
                P2points =  P2points + 1;
                String displayP2Points = P2points + " Points";
                p2Points.setText(displayP2Points);
            } else{
                tvTimer.setText(R.string.timesUp);
                Log.d("tag",P1Chosen);
                Log.d("tag",str + "r");
            }
        }
    };

    public static int addP1Points(int points){
        points = points + 1;
        return points;
    }

    View.OnClickListener buttonListener = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.playerOneAns1) {
                playerOneLock.setEnabled(true);
                P1Chosen = p1str1;
                int id = getResources().getIdentifier(p1str1, "drawable", getPackageName());
                Drawable drawable = getResources().getDrawable(id, null);
                p1Chosen.setImageDrawable(drawable);
            } else if (view.getId() == R.id.playerOneAns2) {
                playerOneLock.setEnabled(true);
                P1Chosen = p1str2;
                int id = getResources().getIdentifier(p1str2, "drawable", getPackageName());
                Drawable drawable = getResources().getDrawable(id, null);
                p1Chosen.setImageDrawable(drawable);
            } else if (view.getId() == R.id.playerOneAns3) {
                playerOneLock.setEnabled(true);
                P1Chosen = p1str3;
                int id = getResources().getIdentifier(p1str3, "drawable", getPackageName());
                Drawable drawable = getResources().getDrawable(id, null);
                p1Chosen.setImageDrawable(drawable);
            } else if (view.getId() == R.id.playerOneAns4) {
                playerOneLock.setEnabled(true);
                P1Chosen = p1str4;
                int id = getResources().getIdentifier(p1str4, "drawable", getPackageName());
                Drawable drawable = getResources().getDrawable(id, null);
                p1Chosen.setImageDrawable(drawable);
            } else if (view.getId() == R.id.playerTwoAns1) {
                playerTwoLock.setEnabled(true);
                P2Chosen = p2str1;
                int id = getResources().getIdentifier(p2str1, "drawable", getPackageName());
                Drawable drawable = getResources().getDrawable(id, null);
                p2Chosen.setImageDrawable(drawable);
            } else if (view.getId() == R.id.playerTwoAns2) {
                playerTwoLock.setEnabled(true);
                P2Chosen = p2str2;
                int id = getResources().getIdentifier(p2str2, "drawable", getPackageName());
                Drawable drawable = getResources().getDrawable(id, null);
                p2Chosen.setImageDrawable(drawable);
            } else if (view.getId() == R.id.playerTwoAns3) {
                playerTwoLock.setEnabled(true);
                P2Chosen = p2str3;
                int id = getResources().getIdentifier(p2str3, "drawable", getPackageName());
                Drawable drawable = getResources().getDrawable(id, null);
                p2Chosen.setImageDrawable(drawable);
            } else if (view.getId() == R.id.playerTwoAns4) {
                playerTwoLock.setEnabled(true);
                P2Chosen = p2str4;
                int id = getResources().getIdentifier(p2str4, "drawable", getPackageName());
                Drawable drawable = getResources().getDrawable(id, null);
                p2Chosen.setImageDrawable(drawable);
            } else if (view.getId() == R.id.playerOneLock) {
                disableP1Buttons();
                timer.cancel();
                timer.onFinish();

            } else if (view.getId() == R.id.playerTwoLock) {
                disableP2Buttons();
                timer.cancel();
                timer.onFinish();

            }
        }
    };

}

