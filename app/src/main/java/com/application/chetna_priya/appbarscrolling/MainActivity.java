package com.application.chetna_priya.appbarscrolling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RecipeAdapter(generateRecipeList()));
    }

    private List<Recipe> generateRecipeList() {
        List<Recipe> recipes = new ArrayList<Recipe>();
        Recipe recipe = new Recipe("Maggie" ,"Take water, Put it on gas, after the water starts boiling" +
                "add masala tastemaker, add little amount of salt, add some chillipowder, add maggie," +
                "keep on stirring in between, leave a little water and enjoy hot.");
        for(int i = 0; i<50; i++){
            recipes.add(recipe);
        }
        return recipes;
    }
}
