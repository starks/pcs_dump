package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bmr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SuggestedTextMessage extends bmr {
    public static final Parcelable.Creator CREATOR = new SuggestedTextMessageParcelableCreator();
    private final String message;
    private final String userId;

    public SuggestedTextMessage(String str, String str2) {
        this.userId = str;
        this.message = str2;
    }

    public static SuggestedTextMessage create(String str, String str2) {
        return new SuggestedTextMessage(str, str2);
    }

    public String getMessage() {
        return this.message;
    }

    public String getUserId() {
        return this.userId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SuggestedTextMessageParcelableCreator.writeToParcel(this, parcel, i);
    }
}
