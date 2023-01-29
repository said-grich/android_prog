package com.example.athkar;

import android.graphics.Typeface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AthkaraSabahe#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AthkaraSabahe extends Fragment {
    private LinearLayout linearLayout ;
    private List<String> athkarAsbah = new ArrayList<String>(){
        {
            add("قال رسول الله - صلى الله عليه وسلم-: (من قالَ حينَ يصبحُ اللَّهمَّ ما أصبحَ بي من نعمةٍ أو بأحدٍ من خلقِكَ فمنكَ وحدَكَ لا شريكَ لكَ فلكَ الحمدُ ولكَ الشُّكرُ فقد أدَّى شكرَ يومِهِ ومن قالَ مثلَ ذلكَ حينَ يمسي فقد أدَّى شكرَ ليلتِهِ).");
            add("اللَّهُمَّ إنِّي أصبَحتُ أُشهِدُك، وأُشهِدُ حَمَلةَ عَرشِكَ، ومَلائِكَتَك، وجميعَ خَلقِكَ: أنَّكَ أنتَ اللهُ لا إلهَ إلَّا أنتَ، وأنَّ مُحمَّدًا عبدُكَ ورسولُكَ");
            add("قال رسول الله - صلى الله عليه وسلم-: (مَن قال: بسمِ اللهِ الذي لا يَضرُ مع اسمِه شيءٌ في الأرضِ ولا في السماءِ وهو السميعُ العليمِ، ثلاثُ مراتٍ، لم تصبْه فجأةُ بلاءٍ حتى يُصبحَ، ومَن قالها حينَ يُصبحُ ثلاثَ مراتٍ لم تُصبْه فجأةُ بلاءٍ حتى يُمسي).");
            add("قال رسول الله - صلى الله عليه وسلم-: (مَن قالَ حينَ يصبحُ وحينَ يُمسي: سبحانَ اللَّهِ وبحمدِهِ مائةَ مرَّةٍ، لم يأتِ أحدٌ يومَ القيامةِ بأفضلَ ممَّا جاءَ بِهِ، إلَّا أحدٌ قالَ مثلَ ما قالَ، أو زادَ علَيهِ).");
            add(" (اللهمَّ إنِّي أعوذُ بك من الهمِّ والحزنِ، والعجزِ والكسلِ، والبُخلِ والجُبنِ، وضَلَعِ الدَّينِ، وغَلَبَةِ الرجالِ).");
            add("رُوي عن عبد الله بن عمر -رضي الله عنه- أنه قال: (لم يكن رسولُ اللهِ - صلَّى اللهُ عليهِ وسلَّم- يدعُ هؤلاءِ الدعواتِ حين يُمسي وحين يُصبحُ، اللهمَّ إني أسألُك العفوَ والعافيةَ، في الدنيا والآخرةِ، اللهمَّ إني أسألُك العفوَ والعافيةَ، في دِيني ودنيايَ وأهلي ومالي، اللهمَّ استُرْ عوراتي، وآمِنْ روعاتي، واحفظني من بين يدي، ومن خلفي، وعن يميني، وعن شمالي، ومن فوقي، وأعوذُ بك أن أُغْتَالَ من تحتي).");
            add("سيّد الاستغفار، قال رسول الله - صلى الله عليه وسلم- : (سَيِّدُ الِاسْتِغْفارِ أنْ تَقُولَ: اللَّهُمَّ أنْتَ رَبِّي لا إلَهَ إلَّا أنْتَ، خَلَقْتَنِي وأنا عَبْدُكَ، وأنا علَى عَهْدِكَ ووَعْدِكَ ما اسْتَطَعْتُ، أعُوذُ بكَ مِن شَرِّ ما صَنَعْتُ، أبُوءُ لكَ بنِعْمَتِكَ عَلَيَّ، وأَبُوءُ لكَ بذَنْبِي فاغْفِرْ لِي، فإنَّه لا يَغْفِرُ الذُّنُوبَ إلَّا أنْتَ، قالَ: ومَن قالَها مِنَ النَّهارِ مُوقِنًا بها، فَماتَ مِن يَومِهِ قَبْلَ أنْ يُمْسِيَ، فَهو مِن أهْلِ الجَنَّةِ، ومَن قالَها مِنَ اللَّيْلِ وهو مُوقِنٌ بها، فَماتَ قَبْلَ أنْ يُصْبِحَ، فَهو مِن أهْلِ الجَنَّةِ).");
        }
    };

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AthkaraSabahe() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AthkaraSabahe.
     */
    // TODO: Rename and change types and number of parameters
    public static AthkaraSabahe newInstance(String param1, String param2) {
        AthkaraSabahe fragment = new AthkaraSabahe();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_athkara_sabahe, container, false);

        linearLayout = view.findViewById(R.id.linearLayout);
        for(String thikr : athkarAsbah){
            TextView tv = new TextView(this.getContext());
            tv.setText(thikr);
            tv.setTypeface(tv.getTypeface(), Typeface.BOLD);
            tv.setTextSize(18);
            LinearLayout.LayoutParams params= new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(10,10,10,30);
            tv.setLayoutParams(params);
            linearLayout.addView(tv);
        }



        return view;
    }
}