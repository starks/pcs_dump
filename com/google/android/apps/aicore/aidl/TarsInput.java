package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bmr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TarsInput extends bmr {
    public static final Parcelable.Creator CREATOR = new TarsInputParcelableCreator();
    private final String text;

    public TarsInput(String str) {
        this.text = str;
    }

    public static TarsInput create(String str) {
        return new TarsInput(str);
    }

    public String getText() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TarsInputParcelableCreator.writeToParcel(this, parcel, i);
    }
}
