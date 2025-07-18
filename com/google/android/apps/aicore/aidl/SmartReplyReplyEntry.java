package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bmr;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SmartReplyReplyEntry extends bmr {
    public static final Parcelable.Creator CREATOR = new SmartReplyReplyEntryParcelableCreator();
    private final int safetyClassificationResult;
    private final float score;
    private final String text;

    public SmartReplyReplyEntry(String str, int i, float f) {
        this.text = str;
        this.safetyClassificationResult = i;
        this.score = f;
    }

    public static SmartReplyReplyEntry create(String str, int i, float f) {
        return new SmartReplyReplyEntry(str, i, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartReplyReplyEntry)) {
            return false;
        }
        SmartReplyReplyEntry smartReplyReplyEntry = (SmartReplyReplyEntry) obj;
        return this.safetyClassificationResult == smartReplyReplyEntry.safetyClassificationResult && Float.compare(smartReplyReplyEntry.score, this.score) == 0 && Objects.equals(this.text, smartReplyReplyEntry.text);
    }

    public int getSafetyClassificationResult() {
        return this.safetyClassificationResult;
    }

    public float getScore() {
        return this.score;
    }

    public String getText() {
        return this.text;
    }

    public int hashCode() {
        return Objects.hash(this.text, Integer.valueOf(this.safetyClassificationResult), Float.valueOf(this.score));
    }

    public String toString() {
        return "SmartReplyReplyEntry{text='" + this.text + "', safetyClassificationResult=" + this.safetyClassificationResult + ", score=" + this.score + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SmartReplyReplyEntryParcelableCreator.writeToParcel(this, parcel, i);
    }
}
