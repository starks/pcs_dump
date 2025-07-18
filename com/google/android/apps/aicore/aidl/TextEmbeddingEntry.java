package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bmr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TextEmbeddingEntry extends bmr {
    public static final Parcelable.Creator CREATOR = new TextEmbeddingEntryParcelableCreator();
    private final float[] embedding;

    public TextEmbeddingEntry(float[] fArr) {
        int length = fArr.length;
        float[] fArr2 = new float[length];
        this.embedding = fArr2;
        System.arraycopy(fArr, 0, fArr2, 0, length);
    }

    public static TextEmbeddingEntry create(float[] fArr) {
        return new TextEmbeddingEntry(fArr);
    }

    public float[] getEmbedding() {
        return this.embedding;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TextEmbeddingEntryParcelableCreator.writeToParcel(this, parcel, i);
    }
}
