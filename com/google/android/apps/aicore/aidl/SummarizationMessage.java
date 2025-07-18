package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bmr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SummarizationMessage extends bmr {
    public static final Parcelable.Creator CREATOR = new SummarizationMessageParcelableCreator();
    private final String message;

    public SummarizationMessage(String str) {
        this.message = str;
    }

    public static SummarizationMessage create(String str) {
        return new SummarizationMessage(str);
    }

    public String getMessage() {
        return this.message;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SummarizationMessageParcelableCreator.writeToParcel(this, parcel, i);
    }
}
