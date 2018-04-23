package sg.edu.rp.c346.project03_v1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;

import java.util.ArrayList;

public class Answers extends AppCompatActivity {

    ListView list;

    String[] names = {
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

    int[] champs = {
            //A
            R.drawable.aatrox, R.drawable.ahri, R.drawable.akali, R.drawable.alistar, R.drawable.amumu, R.drawable.anivia, R.drawable.annie, R.drawable.ashe, R.drawable.aurelionsol, R.drawable.azir,
            //B
            R.drawable.bard, R.drawable.blitzcrank, R.drawable.brand, R.drawable.braum,
            //C
            R.drawable.caitlyn, R.drawable.camille, R.drawable.cassiopeia, R.drawable.chogath, R.drawable.corki,
            //D
            R.drawable.darius, R.drawable.diana, R.drawable.drmundo, R.drawable.draven,
            //E
            R.drawable.ekko, R.drawable.elise, R.drawable.evelynn, R.drawable.ezreal,
            //F
            R.drawable.fiddlesticks, R.drawable.fiora, R.drawable.fizz,
            //G
            R.drawable.galio, R.drawable.gangplank, R.drawable.garen, R.drawable.gnar, R.drawable.gragas, R.drawable.graves,
            //H
            R.drawable.hecarim, R.drawable.heimerdinger,
            //I
            R.drawable.illaoi, R.drawable.irelia, R.drawable.ivern,
            //J
            R.drawable.janna, R.drawable.jarvaniv, R.drawable.jax, R.drawable.jayce, R.drawable.jhin, R.drawable.jinx,
            //K
            R.drawable.kalista, R.drawable.karma, R.drawable.karthus, R.drawable.kassadin, R.drawable.katarina, R.drawable.kayle, R.drawable.kayn, R.drawable.kennen, R.drawable.khazix, R.drawable.kindred, R.drawable.kled, R.drawable.kogmaw,
            //L
            R.drawable.leblanc, R.drawable.leesin, R.drawable.leona, R.drawable.lissandra, R.drawable.lucian, R.drawable.lulu, R.drawable.lux,
            //M
            R.drawable.malphite, R.drawable.malzahar, R.drawable.maokai, R.drawable.masteryi, R.drawable.missfortune, R.drawable.mordekaiser, R.drawable.morgana,
            //N
            R.drawable.nami, R.drawable.nasus, R.drawable.nautilus, R.drawable.nidalee, R.drawable.nocturne, R.drawable.nunu,
            //O
            R.drawable.olaf, R.drawable.orianna, R.drawable.ornn,
            //P
            R.drawable.pantheon, R.drawable.poppy,
            //Q
            R.drawable.quinn,
            //R
            R.drawable.rakan, R.drawable.rammus, R.drawable.reksai, R.drawable.renekton, R.drawable.rengar, R.drawable.riven, R.drawable.rumble, R.drawable.ryze,
            //S
            R.drawable.sejuani, R.drawable.shaco, R.drawable.shen, R.drawable.shyvana, R.drawable.singed, R.drawable.sion, R.drawable.sivir, R.drawable.skarner, R.drawable.sona, R.drawable.soraka, R.drawable.swain, R.drawable.syndra,
            //T
            R.drawable.tahmkench, R.drawable.taliyah, R.drawable.talon, R.drawable.taric, R.drawable.teemo, R.drawable.thresh, R.drawable.tristana, R.drawable.trundle, R.drawable.tryndamere, R.drawable.twistedfate, R.drawable.twitch,
            //U
            R.drawable.udyr, R.drawable.urgot,
            //V
            R.drawable.varus, R.drawable.vayne, R.drawable.veigar, R.drawable.velkoz, R.drawable.vi, R.drawable.viktor, R.drawable.vladimir, R.drawable.volibear,
            //W
            R.drawable.warwick, R.drawable.wukong,
            //X
            R.drawable.xayah, R.drawable.xerath, R.drawable.xinzhao,
            //Y
            R.drawable.yasuo, R.drawable.yorick,
            //Z
            R.drawable.zac, R.drawable.zed, R.drawable.ziggs, R.drawable.zilean, R.drawable.zoe, R.drawable.zyra

    };

    int[] ults = {
            //A
            R.drawable.aatroxr, R.drawable.ahrir, R.drawable.akalir, R.drawable.alistarr, R.drawable.amumur, R.drawable.aniviar, R.drawable.annier, R.drawable.asher, R.drawable.aurelionsolr, R.drawable.azirr,
            //B
            R.drawable.bardr, R.drawable.blitzcrankr, R.drawable.brandr, R.drawable.braumr,
            //C
            R.drawable.caitlynr, R.drawable.camiller, R.drawable.cassiopeiar, R.drawable.chogathr, R.drawable.corkir,
            //D
            R.drawable.dariusr, R.drawable.dianar, R.drawable.drmundor, R.drawable.dravenr,
            //E
            R.drawable.ekkor, R.drawable.eliser, R.drawable.evelynnr, R.drawable.ezrealr,
            //F
            R.drawable.fiddlesticksr, R.drawable.fiorar, R.drawable.fizzr,
            //G
            R.drawable.galior, R.drawable.gangplankr, R.drawable.garenr, R.drawable.gnarr, R.drawable.gragasr, R.drawable.gravesr,
            //H
            R.drawable.hecarimr, R.drawable.heimerdingerr,
            //I
            R.drawable.illaoir, R.drawable.ireliar, R.drawable.ivernr,
            //J
            R.drawable.jannar, R.drawable.jarvanivr, R.drawable.jaxr, R.drawable.jaycer, R.drawable.jhinr, R.drawable.jinxr,
            //K
            R.drawable.kalistar, R.drawable.karmar, R.drawable.karthusr, R.drawable.kassadinr, R.drawable.katarinar, R.drawable.kayler, R.drawable.kaynr, R.drawable.kennenr, R.drawable.khazixr, R.drawable.kindredr, R.drawable.kledr, R.drawable.kogmawr,
            //L
            R.drawable.leblancr, R.drawable.leesinr, R.drawable.leonar, R.drawable.lissandrar, R.drawable.lucianr, R.drawable.lulur, R.drawable.luxr,
            //M
            R.drawable.malphiter, R.drawable.malzaharr, R.drawable.maokair, R.drawable.masteryir, R.drawable.missfortuner, R.drawable.mordekaiserr, R.drawable.morganar,
            //N
            R.drawable.namir, R.drawable.nasusr, R.drawable.nautilusr, R.drawable.nidaleer, R.drawable.nocturner, R.drawable.nunur,
            //O
            R.drawable.olafr, R.drawable.oriannar, R.drawable.ornnr,
            //P
            R.drawable.pantheonr, R.drawable.poppyr,
            //Q
            R.drawable.quinnr,
            //R
            R.drawable.rakanr, R.drawable.rammusr, R.drawable.reksair, R.drawable.renektonr, R.drawable.rengarr, R.drawable.rivenr, R.drawable.rumbler, R.drawable.ryzer,
            //S
            R.drawable.sejuanir, R.drawable.shacor, R.drawable.shenr, R.drawable.shyvanar, R.drawable.singedr, R.drawable.sionr, R.drawable.sivirr, R.drawable.skarnerr, R.drawable.sonar, R.drawable.sorakar, R.drawable.swainr, R.drawable.syndrar,
            //T
            R.drawable.tahmkenchr, R.drawable.taliyahr, R.drawable.talonr, R.drawable.taricr, R.drawable.teemor, R.drawable.threshr, R.drawable.tristanar, R.drawable.trundler, R.drawable.tryndamerer, R.drawable.twistedfater, R.drawable.twitchr,
            //U
            R.drawable.udyrr, R.drawable.urgotr,
            //V
            R.drawable.varusr, R.drawable.vayner, R.drawable.veigarr, R.drawable.velkozr, R.drawable.vir, R.drawable.viktorr, R.drawable.vladimirr, R.drawable.volibearr,
            //W
            R.drawable.warwickr, R.drawable.wukongr,
            //X
            R.drawable.xayahr, R.drawable.xerathr, R.drawable.xinzhaor,
            //Y
            R.drawable.yasuor, R.drawable.yorickr,
            //Z
            R.drawable.zacr, R.drawable.zedr, R.drawable.ziggsr, R.drawable.zileanr, R.drawable.zoer, R.drawable.zyrar

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answers);

        list = (ListView)findViewById(R.id.ansList);

        ArrayList<Answer> ansList;
        CustomAdapterAnswer caAnswerList;
        ansList = new ArrayList<Answer>();
        caAnswerList = new CustomAdapterAnswer(this, R.layout.custom_answer, ansList);
        list.setAdapter(caAnswerList);

        for (int i = 0; i < champs.length; i ++){
            String name = names[i];
            int ult = ults[i];
            int champ = champs[i];
            Answer item = new Answer(champ, ult, name);

            caAnswerList.add(item);
        }

        caAnswerList.notifyDataSetChanged();

    }

}
