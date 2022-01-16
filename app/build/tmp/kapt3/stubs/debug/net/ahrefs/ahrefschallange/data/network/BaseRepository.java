package net.ahrefs.ahrefschallange.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004JA\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u00072\"\u0010\b\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lnet/ahrefs/ahrefschallange/data/network/BaseRepository;", "", "api", "Lnet/ahrefs/ahrefschallange/data/network/Api;", "(Lnet/ahrefs/ahrefschallange/data/network/Api;)V", "handleErrors", "Lnet/ahrefs/ahrefschallange/data/entities/Result;", "T", "func", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lretrofit2/Response;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton()
public final class BaseRepository {
    private final net.ahrefs.ahrefschallange.data.network.Api api = null;
    
    @javax.inject.Inject()
    public BaseRepository(@org.jetbrains.annotations.NotNull()
    net.ahrefs.ahrefschallange.data.network.Api api) {
        super();
    }
    
    private final <T extends java.lang.Object>java.lang.Object handleErrors(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super retrofit2.Response<T>>, ? extends java.lang.Object> func, kotlin.coroutines.Continuation<? super net.ahrefs.ahrefschallange.data.entities.Result<? extends T>> p1) {
        return null;
    }
}