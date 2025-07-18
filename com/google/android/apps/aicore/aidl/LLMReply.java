package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bmr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LLMReply extends bmr {
    public static final Parcelable.Creator CREATOR = new LLMReplyParcelableCreator();

    @Deprecated
    private final float perplexity;
    private final float score;
    public int stopReason;
    private final String text;

    /* compiled from: PG */
    public @interface StopReason {
        public static final int CUSTOM_STOP_TOKENS = 2;
        public static final int FINISH = 0;
        public static final int TOKEN_LIMIT = 1;
    }

    public LLMReply(String str, float f, int i, float f2) {
        this.text = str;
        this.perplexity = f;
        this.stopReason = i;
        this.score = f2;
    }

    public static LLMReply create(String str, int i, float f) {
        return new LLMReply(str, 0.0f, i, f);
    }

    @Deprecated
    public float getPerplexity() {
        return this.perplexity;
    }

    public float getScore() {
        return this.score;
    }

    public int getStopReason() {
        return this.stopReason;
    }

    public String getText() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LLMReplyParcelableCreator.writeToParcel(this, parcel, i);
    }
}
