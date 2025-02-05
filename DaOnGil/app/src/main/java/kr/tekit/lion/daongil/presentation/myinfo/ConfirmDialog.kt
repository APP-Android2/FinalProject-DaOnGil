package kr.tekit.lion.daongil.presentation.myinfo

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.fragment.app.DialogFragment
import kr.tekit.lion.daongil.R
import kr.tekit.lion.daongil.databinding.DialogConfirmBinding

class ConfirmDialog(
    private val title: String,
    private val subtitle: String,
    private val posBtnTitle: String,
    private val onClick: () -> Unit,
) : DialogFragment(R.layout.dialog_confirm) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.isCancelable = false
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = DialogConfirmBinding.bind(view)

        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        binding.textViewDialogTitle.text = title
        binding.textViewDialogSubtitle.text = subtitle
        binding.buttonPositive.text = posBtnTitle
        binding.buttonPositive.backgroundTintList = ContextCompat.getColorStateList(
            requireContext(), R.color.button_tertiary
        )
        binding.buttonPositive.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))


        binding.buttonNegative.setOnClickListener {
            dismiss()
        }

        binding.buttonPositive.setOnClickListener {
            onClick.invoke()
            dismiss()
        }
    }
}