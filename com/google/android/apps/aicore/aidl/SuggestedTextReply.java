package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bmr;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SuggestedTextReply extends bmr {
    public static final Parcelable.Creator CREATOR = new SuggestedTextReplyParcelableCreator();
    private final int safetyClassificationResult;
    private final String text;

    public SuggestedTextReply(String str, int i) {
        this.text = str;
        this.safetyClassificationResult = i;
    }

    public static SuggestedTextReply create(String str, int i) {
        return new SuggestedTextReply(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestedTextReply)) {
            return false;
        }
        SuggestedTextReply suggestedTextReply = (SuggestedTextReply) obj;
        return this.safetyClassificationResult == suggestedTextReply.safetyClassificationResult && Objects.equals(this.text, suggestedTextReply.text);
    }

    public int getSafetyClassificationResult() {
        return this.safetyClassificationResult;
    }

    public String getText() {
        return this.text;
    }

    public int hashCode() {
        return Objects.hash(this.text, Integer.valueOf(this.safetyClassificationResult));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SuggestedTextReplyParcelableCreator.writeToParcel(this, parcel, i);
    }
}
