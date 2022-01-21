package net.ahrefs.ahrefschallange.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0016B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lnet/ahrefs/ahrefschallange/utils/NoFilterAdapter;", "T", "Landroid/widget/ArrayAdapter;", "context", "Landroid/content/Context;", "resource", "", "(Landroid/content/Context;I)V", "isFullSearch", "", "()Z", "setFullSearch", "(Z)V", "mFilter", "Landroid/widget/Filter;", "getFilter", "getView", "Landroid/view/View;", "position", "convertView", "parent", "Landroid/view/ViewGroup;", "NoFilter", "app_debug"})
public final class NoFilterAdapter<T extends java.lang.Object> extends android.widget.ArrayAdapter<T> {
    private boolean isFullSearch = false;
    private android.widget.Filter mFilter;
    
    public NoFilterAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int resource) {
        super(null, 0);
    }
    
    public final boolean isFullSearch() {
        return false;
    }
    
    public final void setFullSearch(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getView(int position, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.Filter getFilter() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0014J\u001a\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\rH\u0014R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lnet/ahrefs/ahrefschallange/utils/NoFilterAdapter$NoFilter;", "T", "Landroid/widget/Filter;", "noFilterAdapter", "Lnet/ahrefs/ahrefschallange/utils/NoFilterAdapter;", "(Lnet/ahrefs/ahrefschallange/utils/NoFilterAdapter;)V", "getNoFilterAdapter", "()Lnet/ahrefs/ahrefschallange/utils/NoFilterAdapter;", "convertResultToString", "", "resultValue", "", "performFiltering", "Landroid/widget/Filter$FilterResults;", "prefix", "publishResults", "", "constraint", "results", "app_debug"})
    static final class NoFilter<T extends java.lang.Object> extends android.widget.Filter {
        @org.jetbrains.annotations.NotNull()
        private final net.ahrefs.ahrefschallange.utils.NoFilterAdapter<T> noFilterAdapter = null;
        
        public NoFilter(@org.jetbrains.annotations.NotNull()
        net.ahrefs.ahrefschallange.utils.NoFilterAdapter<T> noFilterAdapter) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final net.ahrefs.ahrefschallange.utils.NoFilterAdapter<T> getNoFilterAdapter() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected android.widget.Filter.FilterResults performFiltering(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence prefix) {
            return null;
        }
        
        @java.lang.Override()
        protected void publishResults(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence constraint, @org.jetbrains.annotations.NotNull()
        android.widget.Filter.FilterResults results) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.CharSequence convertResultToString(@org.jetbrains.annotations.NotNull()
        java.lang.Object resultValue) {
            return null;
        }
    }
}