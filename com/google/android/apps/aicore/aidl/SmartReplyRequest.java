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
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SmartReplyRequest extends bmr implements Request {
    public static final Parcelable.Creator CREATOR = new SmartReplyRequestParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.SmartReplyRequest.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public SmartReplyRequest readFromBundle(Bundle bundle, String str) {
            return (SmartReplyRequest) createFromBundle(bundle, str, SmartReplyRequest.CREATOR);
        }
    };
    private final cxc messages;
    private final int safetyClassificationMode;

    public SmartReplyRequest(List list, int i) {
        this.messages = cxc.o(list);
        this.safetyClassificationMode = i;
    }

    public static SmartReplyRequest create(List list, int i) {
        return new SmartReplyRequest(list, i);
    }

    public cxc getInferenceImageRequestsForSafety(akm akmVar, eia eiaVar) {
        int i = cxc.d;
        return cyp.a;
    }

    public cxc getInferenceRequestsForSafety(akm akmVar, eia eiaVar) {
        return getMessages();
    }

    public cxc getMessages() {
        return this.messages;
    }

    public String getRequestContentForSafety(akm akmVar, eia eiaVar) {
        return SmartReplyRequest$$ExternalSyntheticBackport0.m((eiaVar.b & 1) != 0 ? eiaVar.c : "\n", getMessages());
    }

    public int getSafetyClassificationMode() {
        return this.safetyClassificationMode;
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
        SmartReplyRequestParcelableCreator.writeToParcel(this, parcel, i);
    }
}
