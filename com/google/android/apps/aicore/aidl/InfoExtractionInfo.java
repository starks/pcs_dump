package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bmr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InfoExtractionInfo extends bmr {
    public static final Parcelable.Creator CREATOR = new InfoExtractionInfoResultParcelableCreator();
    private final String text;

    public InfoExtractionInfo(String str) {
        this.text = str;
    }

    public static InfoExtractionInfo create(String str) {
        return new InfoExtractionInfo(str);
    }

    public String getText() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        InfoExtractionInfoResultParcelableCreator.writeToParcel(this, parcel, i);
    }
}
