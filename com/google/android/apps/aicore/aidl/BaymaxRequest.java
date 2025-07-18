package com.google.android.apps.aicore.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.Bundleable;
import defpackage.akm;
import defpackage.bmr;
import defpackage.cxc;
import defpackage.cyp;
import defpackage.eia;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BaymaxRequest extends bmr implements Request {
    public static final Parcelable.Creator CREATOR = new BaymaxRequestParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.BaymaxRequest.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public BaymaxRequest readFromBundle(Bundle bundle, String str) {
            return (BaymaxRequest) createFromBundle(bundle, str, BaymaxRequest.CREATOR);
        }
    };
    private final String input;

    public BaymaxRequest(String str) {
        this.input = str;
    }

    public static BaymaxRequest create(String str) {
        return new BaymaxRequest(str);
    }

    public cxc getInferenceImageRequestsForSafety(akm akmVar, eia eiaVar) {
        int i = cxc.d;
        return cyp.a;
    }

    public cxc getInferenceRequestsForSafety(akm akmVar, eia eiaVar) {
        return cxc.q(getInput());
    }

    public String getInput() {
        return this.input;
    }

    public String getRequestContentForSafety(akm akmVar, eia eiaVar) {
        return getInput();
    }

    public int getSafetyClassificationMode() {
        return 1;
    }

    public boolean hasStreamingCallback() {
        return false;
    }

    @Override // com.google.android.apps.aicore.aidl.Bundleable
    public /* synthetic */ void writeToBundle(Bundle bundle, String str) {
        Bundleable.CC.writeParcelableToBundle(this, bundle, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        BaymaxRequestParcelableCreator.writeToParcel(this, parcel, i);
    }
}
