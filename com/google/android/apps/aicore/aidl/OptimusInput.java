package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bmr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class OptimusInput extends bmr {
    public static final Parcelable.Creator CREATOR = new OptimusInputParcelableCreator();
    private final String text;

    public OptimusInput(String str) {
        this.text = str;
    }

    public static OptimusInput create(String str) {
        return new OptimusInput(str);
    }

    public String getText() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        OptimusInputParcelableCreator.writeToParcel(this, parcel, i);
    }
}
