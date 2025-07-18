package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bmr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AstroboyInput extends bmr {
    public static final Parcelable.Creator CREATOR = new AstroboyInputParcelableCreator();
    private final String text;

    public AstroboyInput(String str) {
        this.text = str;
    }

    public static AstroboyInput create(String str) {
        return new AstroboyInput(str);
    }

    public String getText() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AstroboyInputParcelableCreator.writeToParcel(this, parcel, i);
    }
}
