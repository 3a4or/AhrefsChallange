package net.ahrefs.ahrefschallange.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001f\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lnet/ahrefs/ahrefschallange/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "dataLoading", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "getDataLoading", "()Landroidx/lifecycle/MutableLiveData;", "error", "Lnet/ahrefs/ahrefschallange/data/entities/Result$BaseError;", "getError", "setError", "(Landroidx/lifecycle/MutableLiveData;)V", "app_debug"})
public class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataLoading = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<net.ahrefs.ahrefschallange.data.entities.Result.BaseError> error;
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getDataLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<net.ahrefs.ahrefschallange.data.entities.Result.BaseError> getError() {
        return null;
    }
    
    public final void setError(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<net.ahrefs.ahrefschallange.data.entities.Result.BaseError> p0) {
    }
}