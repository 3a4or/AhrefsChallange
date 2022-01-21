package net.ahrefs.ahrefschallange.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJA\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\r0\u0006\"\u0004\b\u0000\u0010\r2\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\r0\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lnet/ahrefs/ahrefschallange/data/network/BaseRepository;", "", "api", "Lnet/ahrefs/ahrefschallange/data/network/Api;", "(Lnet/ahrefs/ahrefschallange/data/network/Api;)V", "getSearchResults", "Lnet/ahrefs/ahrefschallange/data/entities/Result;", "", "Lnet/ahrefs/ahrefschallange/data/entities/SearchItem;", "query", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleErrors", "T", "func", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lretrofit2/Response;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton()
public final class BaseRepository {
    private final net.ahrefs.ahrefschallange.data.network.Api api = null;
    
    @javax.inject.Inject()
    public BaseRepository(@org.jetbrains.annotations.NotNull()
    net.ahrefs.ahrefschallange.data.network.Api api) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSearchResults(@org.jetbrains.annotations.Nullable()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super net.ahrefs.ahrefschallange.data.entities.Result<? extends java.util.List<net.ahrefs.ahrefschallange.data.entities.SearchItem>>> p1) {
        return null;
    }
    
    private final <T extends java.lang.Object>java.lang.Object handleErrors(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super retrofit2.Response<T>>, ? extends java.lang.Object> func, kotlin.coroutines.Continuation<? super net.ahrefs.ahrefschallange.data.entities.Result<? extends T>> p1) {
        return null;
    }
}