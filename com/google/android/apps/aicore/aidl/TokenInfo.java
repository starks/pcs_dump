package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bmr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TokenInfo extends bmr {
    public static final Parcelable.Creator CREATOR = new TokenInfoCreator();
    private final int tokenCount;

    public TokenInfo(int i) {
        this.tokenCount = i;
    }

    public static TokenInfo create(int i) {
        return new TokenInfo(i);
    }

    public int getTokenCount() {
        return this.tokenCount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TokenInfoCreator.writeToParcel(this, parcel, i);
    }
}
