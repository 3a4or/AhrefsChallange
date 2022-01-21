package net.ahrefs.ahrefschallange.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001d"}, d2 = {"Lnet/ahrefs/ahrefschallange/ui/search/SearchFragment;", "Lnet/ahrefs/ahrefschallange/base/BaseFragment;", "()V", "autoCompleteAdapter", "Lnet/ahrefs/ahrefschallange/utils/NoFilterAdapter;", "", "mBinding", "Lnet/ahrefs/ahrefschallange/databinding/FragmentSearchBinding;", "searchJob", "Lkotlinx/coroutines/Job;", "viewModel", "Lnet/ahrefs/ahrefschallange/ui/search/SearchViewModel;", "getViewModel", "()Lnet/ahrefs/ahrefschallange/ui/search/SearchViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "init", "", "initClicks", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "returnWithSearchText", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SearchFragment extends net.ahrefs.ahrefschallange.base.BaseFragment {
    @org.jetbrains.annotations.NotNull()
    public static final net.ahrefs.ahrefschallange.ui.search.SearchFragment.Companion Companion = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private net.ahrefs.ahrefschallange.databinding.FragmentSearchBinding mBinding;
    private net.ahrefs.ahrefschallange.utils.NoFilterAdapter<java.lang.String> autoCompleteAdapter;
    private kotlinx.coroutines.Job searchJob;
    
    public SearchFragment() {
        super();
    }
    
    private final net.ahrefs.ahrefschallange.ui.search.SearchViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void init() {
    }
    
    private final void initClicks() {
    }
    
    private final void returnWithSearchText() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lnet/ahrefs/ahrefschallange/ui/search/SearchFragment$Companion;", "", "()V", "newInstance", "Lnet/ahrefs/ahrefschallange/ui/search/SearchFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final net.ahrefs.ahrefschallange.ui.search.SearchFragment newInstance() {
            return null;
        }
    }
}