package com.example.hardy.presentation.general;

import androidx.databinding.ViewDataBinding;

public interface RecyclerCallback<VM extends ViewDataBinding, T> {
    public void bindData(VM binder,T model);
}