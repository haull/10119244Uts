package com.example.a10119244uts;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;




import java.util.ArrayList;

/*
    Tanggal pengerjaan: 30 April 2021
    NIM: 10119244
    Nama: Mya Hauliyah
    Kelas: IF-6
*/

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DailyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DailyFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public DailyFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DailyFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DailyFragment newInstance(String param1, String param2) {
        DailyFragment fragment = new DailyFragment();
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
            // TODO: Rename and change types of parameters
            String mParam1 = getArguments().getString(ARG_PARAM1);
            String mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    // views dailyact
    RecyclerView recyclerViewDaily;
    ArrayList<DailyModel> dailyModel;
    // views friendlist
    RecyclerView recyclerViewFriendlist;
    ArrayList<FriendlistModel> friendlistModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_daily, container, false);

        // daliyact
        recyclerViewDaily = root.findViewById(R.id.recview_daily);
        recyclerViewDaily.setLayoutManager(new LinearLayoutManager(getContext()));

        dailyModel = new ArrayList<>();

        DailyModel daily1 = new DailyModel(R.drawable.daily_eat, "Eat", "Usually, Iam eating while wathcing movie");
        dailyModel.add(daily1);
        DailyModel daily2 = new DailyModel(R.drawable.daily_learn, "Study", "I prefer to study at night ");
        dailyModel.add(daily2);
        DailyModel daily3 = new DailyModel(R.drawable.daily_tiktok, "Singing", "I like to sing a song");
        dailyModel.add(daily3);
        DailyModel daily4 = new DailyModel(R.drawable.daily_code, "Coding", "I learn data science with python");
        dailyModel.add(daily4);
        DailyModel daily5 = new DailyModel(R.drawable.daily_game, "Gaming", "I play mobile legend, pubgm and genshin impact");
        dailyModel.add(daily5);
        DailyModel daily6 = new DailyModel(R.drawable.daily_movie, "Watching", "Usually, watch anime and western series");
        dailyModel.add(daily6);

        recyclerViewDaily.setAdapter(new DailyAdapter(dailyModel));

        // friendlist
        recyclerViewFriendlist = root.findViewById(R.id.recview_friendlist);
        recyclerViewFriendlist.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        friendlistModel = new ArrayList<>();

        FriendlistModel friendlist1 = new FriendlistModel(R.drawable.friend1, "Bayu");
        friendlistModel.add(friendlist1);
        FriendlistModel friendlist2 = new FriendlistModel(R.drawable.friend2, "Yolanda");
        friendlistModel.add(friendlist2);
        FriendlistModel friendlist3 = new FriendlistModel(R.drawable.friend3, "Badra");
        friendlistModel.add(friendlist3);
        FriendlistModel friendlist4 = new FriendlistModel(R.drawable.friend4, "Angga");
        friendlistModel.add(friendlist4);

        recyclerViewFriendlist.setAdapter(new FriendlistAdapter(friendlistModel));

        return root;
    }
}
