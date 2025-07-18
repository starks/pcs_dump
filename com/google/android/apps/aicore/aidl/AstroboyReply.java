package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bmr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AstroboyReply extends bmr {
    public static final Parcelable.Creator CREATOR = new AstroboyReplyParcelableCreator();
    private final String text;

    public AstroboyReply(String str) {
        this.text = str;
    }

    public static AstroboyReply create(String str) {
        return new AstroboyReply(str);
    }

    public String getText() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AstroboyReplyParcelableCreator.writeToParcel(this, parcel, i);
    }
}
