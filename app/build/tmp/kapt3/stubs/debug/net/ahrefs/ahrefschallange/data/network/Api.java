package net.ahrefs.ahrefschallange.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lnet/ahrefs/ahrefschallange/data/network/Api;", "", "getSearchResults", "Lretrofit2/Response;", "", "Lnet/ahrefs/ahrefschallange/data/entities/SearchItem;", "q", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface Api {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "ac/?c=list")
    public abstract java.lang.Object getSearchResults(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "q")
    java.lang.String q, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<net.ahrefs.ahrefschallange.data.entities.SearchItem>>> p1);
}