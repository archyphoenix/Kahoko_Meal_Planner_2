package com.example.mealplanner2.ui.recipe;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.mealplanner2.R;

public class RecipeFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.fragment_recipe, container, false);
        TextView tv_recipe = root.findViewById(R.id.act_recipe_title);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}