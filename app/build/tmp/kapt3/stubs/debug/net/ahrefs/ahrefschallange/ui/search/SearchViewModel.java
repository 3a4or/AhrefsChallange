package net.ahrefs.ahrefschallange.ui.search;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR(\u0010\u000b\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\b0\b0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0013"}, d2 = {"Lnet/ahrefs/ahrefschallange/ui/search/SearchViewModel;", "Lnet/ahrefs/ahrefschallange/base/BaseViewModel;", "repo", "Lnet/ahrefs/ahrefschallange/data/network/BaseRepository;", "(Lnet/ahrefs/ahrefschallange/data/network/BaseRepository;)V", "resultsList", "Landroidx/lifecycle/MutableLiveData;", "", "", "getResultsList", "()Landroidx/lifecycle/MutableLiveData;", "searchQuery", "kotlin.jvm.PlatformType", "getSearchQuery", "setSearchQuery", "(Landroidx/lifecycle/MutableLiveData;)V", "getData", "", "word", "app_debug"})
public final class SearchViewModel extends net.ahrefs.ahrefschallange.base.BaseViewModel {
    private final net.ahrefs.ahrefschallange.data.network.BaseRepository repo = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> searchQuery;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> resultsList = null;
    
    @javax.inject.Inject()
    public SearchViewModel(@org.jetbrains.annotations.NotNull()
    net.ahrefs.ahrefschallange.data.network.BaseRepository repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSearchQuery() {
        return null;
    }
    
    public final void setSearchQuery(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> getResultsList() {
        return null;
    }
    
    public final void getData(@org.jetbrains.annotations.Nullable()
    java.lang.String word) {
    }
}