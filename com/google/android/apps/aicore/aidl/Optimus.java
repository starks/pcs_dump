package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bmr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Optimus extends bmr {
    public static final Parcelable.Creator CREATOR = new OptimusParcelableCreator();
    private final String result;

    public Optimus(String str) {
        this.result = str;
    }

    public static Optimus create(String str) {
        return new Optimus(str);
    }

    public String getResult() {
        return this.result;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        OptimusParcelableCreator.writeToParcel(this, parcel, i);
    }
}
