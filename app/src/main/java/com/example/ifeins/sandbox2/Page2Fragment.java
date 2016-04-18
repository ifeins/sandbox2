package com.example.ifeins.sandbox2;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Page2Fragment extends Fragment {


    public Page2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page2, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Toolbar toolbar = (Toolbar) getView().findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);

        List<String> items = new ArrayList<>();
        items.add("Material is the metaphor");
        items.add("A material metaphor is the unifying theory of a rationalized space and a system of motion.\"\n" +
                "        \"The material is grounded in tactile reality, inspired by the study of paper and ink, yet \"\n" +
                "        \"technologically advanced and open to imagination and magic.\\n\"\n" +
                "        \"Surfaces and edges of the material provide visual cues that are grounded in reality. The \"\n" +
                "        \"use of familiar tactile attributes helps users quickly understand affordances. Yet the \"\n" +
                "        \"flexibility of the material creates new affordances that supercede those in the physical \"\n" +
                "        \"world, without breaking the rules of physics.\\n\"\n" +
                "        \"The fundamentals of light, surface, and movement are key to conveying how objects move, \"\n" +
                "        \"interact, and exist in space and in relation to each other. Realistic lighting shows \"\n" +
                "        \"seams, divides space, and indicates moving parts.");
        items.add("Bold, graphic, intentional");
        items.add("The foundational elements of print based design typography, grids, space, scale, color, \"\n" +
                "        \"and use of imagery guide visual treatments. These elements do far more than please the \"\n" +
                "        \"eye. They create hierarchy, meaning, and focus. Deliberate color choices, edge to edge \"\n" +
                "        \"imagery, large scale typography, and intentional white space create a bold and graphic \"\n" +
                "        \"interface that immerse the user in the experience.\\n\"\n" +
                "        \"An emphasis on user actions makes core functionality immediately apparent and provides \"\n" +
                "        \"waypoints for the user");
        items.add("Motion provides meaning");
        items.add("Motion respects and reinforces the user as the prime mover. Primary user actions are \"\n" +
                "        \"inflection points that initiate motion, transforming the whole design.\\n\"\n" +
                "        \"All action takes place in a single environment. Objects are presented to the user without \"\n" +
                "        \"breaking the continuity of experience even as they transform and reorganize.\\n\"\n" +
                "        \"Motion is meaningful and appropriate, serving to focus attention and maintain continuity. \"\n" +
                "        \"Feedback is subtle yet clear. Transitions are efﬁcient yet coherent. THE END!");

        
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new MyAdapter(items));
    }
}
