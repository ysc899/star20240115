package kr.co.seesoft.nemo.starnemoapp.ui.menu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;

import kr.co.seesoft.nemo.starnemoapp.R;

public class MenuFragment extends Fragment {

    private MenuViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(MenuViewModel.class);
        View root = inflater.inflate(R.layout.fragment_main, container, false);
//        final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

        initUI(root);
        return root;
    }

    private void initUI(View view){

        Bundle dataBundle = new Bundle();
        dataBundle.putString("fromMenu", "true");

        view.findViewById(R.id.btnVisitPlan).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_navigation_menu_to_visitPlanFragment,dataBundle));
        view.findViewById(R.id.btnTransaction).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_navigation_menu_to_transactionFragment,dataBundle));

        view.findViewById(R.id.btnBagSend).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_navigation_menu_to_bagsendFragment,dataBundle));
        view.findViewById(R.id.btnCustomer).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_navigation_menu_to_customerFragment,dataBundle));

        view.findViewById(R.id.btnMemo).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_navigation_menu_to_memoFragment,dataBundle));
        view.findViewById(R.id.btnContact).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_navigation_menu_to_departmentContactFragment,dataBundle));

        view.findViewById(R.id.btnConfig).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_navigation_menu_to_setting));


    }
}