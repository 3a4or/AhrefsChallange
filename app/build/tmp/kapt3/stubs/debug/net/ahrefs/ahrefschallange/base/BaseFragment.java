package net.ahrefs.ahrefschallange.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0004J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lnet/ahrefs/ahrefschallange/base/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "mBaseViewModel", "Lnet/ahrefs/ahrefschallange/base/BaseViewModel;", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "navController$delegate", "Lkotlin/Lazy;", "setBaseViewModel", "", "baseViewModel", "showError", "message", "", "showLoading", "show", "", "showMessageFromActivity", "showSuccess", "app_debug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy navController$delegate = null;
    private net.ahrefs.ahrefschallange.base.BaseViewModel mBaseViewModel;
    
    public BaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    protected final void setBaseViewModel(@org.jetbrains.annotations.NotNull()
    net.ahrefs.ahrefschallange.base.BaseViewModel baseViewModel) {
    }
    
    private final void showLoading(boolean show) {
    }
    
    protected void showMessageFromActivity(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    protected void showSuccess(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    protected void showError(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
}