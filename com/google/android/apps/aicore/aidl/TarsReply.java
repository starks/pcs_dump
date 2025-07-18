package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bmr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TarsReply extends bmr {
    public static final Parcelable.Creator CREATOR = new TarsReplyParcelableCreator();
    private final float score;
    private final String text;

    public TarsReply(String str, float f) {
        this.text = str;
        this.score = f;
    }

    public static TarsReply create(String str, float f) {
        return new TarsReply(str, f);
    }

    public float getScore() {
        return this.score;
    }

    public String getText() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TarsReplyParcelableCreator.writeToParcel(this, parcel, i);
    }
}
