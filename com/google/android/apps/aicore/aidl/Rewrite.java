package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bmr;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Rewrite extends bmr {
    public static final Parcelable.Creator CREATOR = new RewriteParcelableCreator();
    private final int safetyClassificationResult;
    private final float score;
    private final String text;
    private final int tone;

    /* compiled from: PG */
    public @interface Tone {
        public static final int CHILL = 4;
        public static final int CONCISE = 2;
        public static final int EXCITED = 7;
        public static final int FORMAL = 1;
        public static final int REPHRASE = 5;
        public static final int RHYMES = 6;
        public static final int SHAKESPEARE = 3;
        public static final int UNSPECIFIED = 0;
    }

    public Rewrite(String str, int i, int i2, float f) {
        this.text = str;
        this.tone = i;
        this.safetyClassificationResult = i2;
        this.score = f;
    }

    public static Rewrite create(String str, int i, int i2) {
        return new Rewrite(str, i, i2, 0.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rewrite)) {
            return false;
        }
        Rewrite rewrite = (Rewrite) obj;
        return this.tone == rewrite.tone && this.safetyClassificationResult == rewrite.safetyClassificationResult && Objects.equals(this.text, rewrite.text);
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

    public int getTone() {
        return this.tone;
    }

    public int hashCode() {
        return Objects.hash(this.text, Integer.valueOf(this.tone), Integer.valueOf(this.safetyClassificationResult));
    }

    public String toString() {
        return "Rewrite{text='" + this.text + "', tone=" + this.tone + ", safetyClassificationResult=" + this.safetyClassificationResult + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        RewriteParcelableCreator.writeToParcel(this, parcel, i);
    }

    public static Rewrite create(String str, int i, int i2, float f) {
        return new Rewrite(str, i, i2, f);
    }
}
