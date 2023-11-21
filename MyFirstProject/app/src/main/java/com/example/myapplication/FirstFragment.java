package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.myapplication.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);

        // Using ViewBinding, so you don't need to call findViewById
        binding.convertButton.setText("Convert to Gallons");
        binding.convertButton.setOnClickListener(v -> convertToGallons());

        return binding.getRoot();
    }

    @SuppressLint("SetTextI18n")
    private void convertToGallons() {
        String litersString = binding.inputLiters.getText().toString();
        if (!litersString.isEmpty()) {
            try {
                double liters = Double.parseDouble(litersString);
                double gallons = liters * 0.219; // Corrected conversion factor
                binding.outputGallons.setText(liters + " liters is approximately " + String.format("%.2f", gallons) + " gallons.");
            } catch (NumberFormatException e) {
                binding.outputGallons.setText("Please enter a valid number.");
            }
        } else {
            binding.outputGallons.setText("Please enter a value in liters.");
        }
    }

    @SuppressLint("SetTextI18n")
//    private void countMe() {
//        // Get the value of the text view
//        String countString = binding.textviewFirst.getText().toString();
//        // Convert value to a number and increment it
//        int count = Integer.parseInt(countString);
//        count++;
//        // Display the new value in the text view.
//        binding.textviewFirst.setText(Integer.toString(count));
//    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        binding.randomButton.setOnClickListener(view1 -> {
//            int currentCount = Integer.parseInt(binding.textviewFirst.getText().toString());
//            FirstFragmentDirections.ActionFirstFragmentToSecondFragment action =
//                    FirstFragmentDirections.actionFirstFragmentToSecondFragment(currentCount);
//            NavHostFragment.findNavController(FirstFragment.this).navigate(action);
//        });

//        binding.countButton.setOnClickListener(view12 -> countMe());

        /* Commenting out toastButton since it's not in the XML layout.
        binding.toastButton.setOnClickListener(view13 -> {
            Toast myToast = Toast.makeText(requireActivity(), "Hello, This is a short toast! you pressed the button.", Toast.LENGTH_SHORT);
            myToast.show();
            Log.i("ToastButton", "Rushideep");
        });
        */

//        binding.iam.setOnClickListener(view14 -> {
//            // Create a dialog
//            final Dialog dialog = new Dialog(requireActivity());
//            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
//            dialog.setContentView(R.layout.image_popup_layout);
//
//            // Set the dialog to not be cancelable with back press
//            dialog.setCancelable(true);
//
//            // Display the dialog
//            dialog.show();
//
//            // Optionally, add a click listener to the ImageView to dismiss the popup when the image is clicked
//            ImageView imageView = dialog.findViewById(R.id.popup_image);
//            imageView.setOnClickListener(imgView -> dialog.dismiss());
//            Log.i("Iam button is clicked", "Rushideep");
//        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null; // Clear the reference to the binding class
    }
}
