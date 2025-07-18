package com.google.android.apps.aicore.aidl;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.Bundleable;
import com.google.android.apps.aicore.aidl.IMagicRewriteStreamingCallback;
import defpackage.akm;
import defpackage.bmr;
import defpackage.clq;
import defpackage.cxc;
import defpackage.cyp;
import defpackage.eia;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MagicRewriteRequest extends bmr implements Request {
    private static final String ADDITIONAL_TEXT_BUNDLE_KEY = "additional_text";
    public static final Parcelable.Creator CREATOR = new MagicRewriteRequestParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.MagicRewriteRequest.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public MagicRewriteRequest readFromBundle(Bundle bundle, String str) {
            return (MagicRewriteRequest) createFromBundle(bundle, str, MagicRewriteRequest.CREATOR);
        }
    };
    private final String message;
    private final int safetyClassificationMode;
    private IMagicRewriteStreamingCallback streamingCallback;
    private final int tone;

    private MagicRewriteRequest(String str, int i, int i2, IMagicRewriteStreamingCallback iMagicRewriteStreamingCallback) {
        this.message = str;
        this.safetyClassificationMode = i;
        this.tone = i2;
        this.streamingCallback = iMagicRewriteStreamingCallback;
    }

    public static MagicRewriteRequest create(String str, int i, int i2) {
        return create(str, i, i2, null);
    }

    public void attachCallbacks(final Consumer consumer) {
        this.streamingCallback = new IMagicRewriteStreamingCallback.Stub(this) { // from class: com.google.android.apps.aicore.aidl.MagicRewriteRequest.2
            @Override // com.google.android.apps.aicore.aidl.IMagicRewriteStreamingCallback
            public void onNewText(String str) {
                if (clq.O(str)) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString(MagicRewriteRequest.ADDITIONAL_TEXT_BUNDLE_KEY, str);
                consumer.accept(bundle);
            }
        };
    }

    public void forwardOnDevicePartialResults(Bundle bundle) {
        IMagicRewriteStreamingCallback iMagicRewriteStreamingCallback;
        String string = bundle.getString(ADDITIONAL_TEXT_BUNDLE_KEY);
        if (string == null || (iMagicRewriteStreamingCallback = this.streamingCallback) == null) {
            return;
        }
        iMagicRewriteStreamingCallback.onNewText(string);
    }

    public cxc getInferenceImageRequestsForSafety(akm akmVar, eia eiaVar) {
        int i = cxc.d;
        return cyp.a;
    }

    public cxc getInferenceRequestsForSafety(akm akmVar, eia eiaVar) {
        return cxc.q(getMessage());
    }

    public String getMessage() {
        return this.message;
    }

    public String getRequestContentForSafety(akm akmVar, eia eiaVar) {
        return MagicRewriteRequest$$ExternalSyntheticBackport0.m((eiaVar.b & 1) != 0 ? eiaVar.c : "\n", getInferenceRequestsForSafety(akmVar, eiaVar));
    }

    public int getSafetyClassificationMode() {
        return this.safetyClassificationMode;
    }

    public IMagicRewriteStreamingCallback getStreamingCallback() {
        return this.streamingCallback;
    }

    public IBinder getStreamingCallbackBinder() {
        IMagicRewriteStreamingCallback iMagicRewriteStreamingCallback = this.streamingCallback;
        if (iMagicRewriteStreamingCallback == null) {
            return null;
        }
        return iMagicRewriteStreamingCallback.asBinder();
    }

    public int getTone() {
        return this.tone;
    }

    public boolean hasBundledCallbacks() {
        return this.streamingCallback != null;
    }

    public boolean hasStreamingCallback() {
        return getStreamingCallback() != null;
    }

    @Override // com.google.android.apps.aicore.aidl.Bundleable
    public void writeToBundle(Bundle bundle, String str) {
        IMagicRewriteStreamingCallback iMagicRewriteStreamingCallback = this.streamingCallback;
        this.streamingCallback = null;
        Bundleable.CC.writeParcelableToBundle(this, bundle, str);
        this.streamingCallback = iMagicRewriteStreamingCallback;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MagicRewriteRequestParcelableCreator.writeToParcel(this, parcel, i);
    }

    public MagicRewriteRequest(String str, int i, int i2, IBinder iBinder) {
        this.message = str;
        this.safetyClassificationMode = i;
        this.tone = i2;
        this.streamingCallback = iBinder == null ? null : IMagicRewriteStreamingCallback.Stub.asInterface(iBinder);
    }

    public static MagicRewriteRequest create(String str, int i, int i2, IMagicRewriteStreamingCallback iMagicRewriteStreamingCallback) {
        return new MagicRewriteRequest(str, i, i2, iMagicRewriteStreamingCallback);
    }
}
