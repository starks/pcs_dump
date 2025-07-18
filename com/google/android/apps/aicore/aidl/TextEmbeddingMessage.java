package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bmr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TextEmbeddingMessage extends bmr {
    public static final Parcelable.Creator CREATOR = new TextEmbeddingMessageParcelableCreator();
    private final String message;

    public TextEmbeddingMessage(String str) {
        this.message = str;
    }

    public static TextEmbeddingMessage create(String str) {
        return new TextEmbeddingMessage(str);
    }

    public String getMessage() {
        return this.message;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TextEmbeddingMessageParcelableCreator.writeToParcel(this, parcel, i);
    }
}
