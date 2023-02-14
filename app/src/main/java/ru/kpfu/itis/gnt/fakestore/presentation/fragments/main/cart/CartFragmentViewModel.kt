package ru.kpfu.itis.gnt.fakestore.presentation.fragments.main.cart

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import ru.kpfu.itis.gnt.fakestore.presentation.models.states.ApplicationState
import ru.kpfu.itis.gnt.fakestore.presentation.redux.Store
import ru.kpfu.itis.gnt.fakestore.presentation.redux.reducer.UiProductListReducer
import ru.kpfu.itis.gnt.fakestore.presentation.redux.updater.UiProductFavoriteUpdater
import ru.kpfu.itis.gnt.fakestore.presentation.redux.updater.UiProductInCartUpdater
import javax.inject.Inject

@HiltViewModel
class CartFragmentViewModel @Inject constructor(
    val store: Store<ApplicationState>,
    val uiProductListReducer: UiProductListReducer,
    val uiProductFavoriteUpdater: UiProductFavoriteUpdater,
    val uiProductInCartUpdater: UiProductInCartUpdater
): ViewModel() {
}
