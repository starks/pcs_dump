package com.google.android.apps.aicore.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.Bundleable;
import defpackage.akm;
import defpackage.bmt;
import defpackage.cxc;
import defpackage.cyp;
import defpackage.eia;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BaymaxResult implements DecoratableResult, bmt {
    public static final Parcelable.Creator CREATOR = new BaymaxResultParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.BaymaxResult.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public BaymaxResult readFromBundle(Bundle bundle, String str) {
            return (BaymaxResult) createFromBundle(bundle, str, BaymaxResult.CREATOR);
        }
    };
    private final InferenceEventTraceResult inferenceEventTraceResult;
    private final String title;

    public BaymaxResult(String str, InferenceEventTraceResult inferenceEventTraceResult) {
        this.title = str;
        this.inferenceEventTraceResult = inferenceEventTraceResult;
    }

    public static BaymaxResult create(String str) {
        return new BaymaxResult(str, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaymaxResult)) {
            return false;
        }
        BaymaxResult baymaxResult = (BaymaxResult) obj;
        return Objects.equals(this.title, baymaxResult.title) && Objects.equals(this.inferenceEventTraceResult, baymaxResult.inferenceEventTraceResult);
    }

    @Override // com.google.android.apps.aicore.aidl.DecoratableResult
    public InferenceEventTraceResult getInferenceEventTraceResult() {
        return this.inferenceEventTraceResult;
    }

    public cxc getInferenceImageResultsForSafety(akm akmVar, eia eiaVar) {
        int i = cxc.d;
        return cyp.a;
    }

    public cxc getInferenceResultsForSafety(akm akmVar, eia eiaVar) {
        return cxc.q(getTitle());
    }

    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Objects.hash(this.title, this.inferenceEventTraceResult);
    }

    @Override // com.google.android.apps.aicore.aidl.DecoratableResult
    public BaymaxResult withInferenceEventTraceResult(InferenceEventTraceResult inferenceEventTraceResult) {
        return new BaymaxResult(this.title, inferenceEventTraceResult);
    }

    @Override // com.google.android.apps.aicore.aidl.Bundleable
    public /* synthetic */ void writeToBundle(Bundle bundle, String str) {
        Bundleable.CC.writeParcelableToBundle(this, bundle, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        BaymaxResultParcelableCreator.writeToParcel(this, parcel, i);
    }
}
