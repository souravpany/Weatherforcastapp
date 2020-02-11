package com.own.weatherforcastapp.utils.common;

import java.lang.System;

/**
 * Used as a wrapper for data that is exposed via a LiveData that represents an event.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0000H\u00c2\u0003\u00a2\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0000H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\r\u0010\u000f\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u000b\u0010\u0012\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0010\u0010\u0003\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/own/weatherforcastapp/utils/common/Event;", "T", "", "content", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "hasBeenHandled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/own/weatherforcastapp/utils/common/Event;", "equals", "", "other", "getIfNotHandled", "hashCode", "", "peek", "toString", "", "app_debug"})
public final class Event<T extends java.lang.Object> {
    private java.util.concurrent.atomic.AtomicBoolean hasBeenHandled;
    private final T content = null;
    
    /**
     * Returns the content and prevents its use again.
     */
    @org.jetbrains.annotations.Nullable()
    public final T getIfNotHandled() {
        return null;
    }
    
    /**
     * Returns the content, even if it's already been handled.
     */
    public final T peek() {
        return null;
    }
    
    public Event(T content) {
        super();
    }
    
    private final T component1() {
        return null;
    }
    
    /**
     * Used as a wrapper for data that is exposed via a LiveData that represents an event.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.own.weatherforcastapp.utils.common.Event<T> copy(T content) {
        return null;
    }
    
    /**
     * Used as a wrapper for data that is exposed via a LiveData that represents an event.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Used as a wrapper for data that is exposed via a LiveData that represents an event.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Used as a wrapper for data that is exposed via a LiveData that represents an event.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}