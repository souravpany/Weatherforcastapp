package com.own.weatherforcastapp.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\f\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u001c\b\u0001\u0010\u0003*\u0016\u0012\u0004\u0012\u0002H\u0001\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00050\u00042\b\u0012\u0004\u0012\u0002H\u00030\u0006B%\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00028\u00000\nj\b\u0012\u0004\u0012\u00028\u0000`\u000b\u00a2\u0006\u0002\u0010\fJ\u0014\u0010\u000f\u001a\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001d\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00020\u0013H\u0016\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0015\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00028\u0001H\u0016\u00a2\u0006\u0002\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00028\u0001H\u0016\u00a2\u0006\u0002\u0010\u001bJ\u0014\u0010\u001d\u001a\u00020\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00028\u00000\nj\b\u0012\u0004\u0012\u00028\u0000`\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/own/weatherforcastapp/ui/base/BaseAdapter;", "T", "", "VH", "Lcom/own/weatherforcastapp/ui/base/BaseItemViewHolder;", "Lcom/own/weatherforcastapp/ui/base/BaseItemViewModel;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "parentLifecycle", "Landroidx/lifecycle/Lifecycle;", "dataList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Landroidx/lifecycle/Lifecycle;Ljava/util/ArrayList;)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "appendData", "", "", "getItemCount", "", "onAttachedToRecyclerView", "onBindViewHolder", "holder", "position", "(Lcom/own/weatherforcastapp/ui/base/BaseItemViewHolder;I)V", "onDetachedFromRecyclerView", "onViewAttachedToWindow", "(Lcom/own/weatherforcastapp/ui/base/BaseItemViewHolder;)V", "onViewDetachedFromWindow", "updateList", "list", "app_debug"})
public abstract class BaseAdapter<T extends java.lang.Object, VH extends com.own.weatherforcastapp.ui.base.BaseItemViewHolder<T, ? extends com.own.weatherforcastapp.ui.base.BaseItemViewModel<T>>> extends androidx.recyclerview.widget.RecyclerView.Adapter<VH> {
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private final java.util.ArrayList<T> dataList = null;
    
    @java.lang.Override()
    public void onViewAttachedToWindow(@org.jetbrains.annotations.NotNull()
    VH holder) {
    }
    
    @java.lang.Override()
    public void onViewDetachedFromWindow(@org.jetbrains.annotations.NotNull()
    VH holder) {
    }
    
    @java.lang.Override()
    public void onAttachedToRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @java.lang.Override()
    public void onDetachedFromRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    VH holder, int position) {
    }
    
    public final void appendData(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> dataList) {
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> list) {
    }
    
    public BaseAdapter(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Lifecycle parentLifecycle, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<T> dataList) {
        super();
    }
}