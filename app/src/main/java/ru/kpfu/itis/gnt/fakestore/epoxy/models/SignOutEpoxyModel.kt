package ru.kpfu.itis.gnt.fakestore.epoxy.models

import fakestore.R
import fakestore.databinding.ProfileSignedOutBinding

data class SignOutEpoxyModel(
    val onSignIn: (String, String) -> Unit,
    val errorMessage: String?
) : ViewBindingKotlinModel<ProfileSignedOutBinding>(R.layout.profile_signed_out) {

    override fun ProfileSignedOutBinding.bind() {
        tiPassword.error = errorMessage
        signInButton.setOnClickListener {
            val username = usernameEditText.text?.toString()
            val password = passwordEditText.text?.toString()

            if (username.isNullOrBlank() || password.isNullOrBlank()) {
                tiPassword.error = "Fields are empty"
                return@setOnClickListener
            }

            tiPassword.error = null
            onSignIn(username, password)
        }
    }

    override fun ProfileSignedOutBinding.unbind() {
        usernameEditText.text = null
        usernameEditText.clearFocus()
        passwordEditText.text = null
        passwordEditText.clearFocus()
        tiPassword.error = null
    }
}
