package com.google.android.apps.aicore.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.Bundleable;
import defpackage.akm;
import defpackage.bmr;
import defpackage.cxc;
import defpackage.cyp;
import defpackage.eia;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RosieRobotRequest extends bmr implements Request {
    private static final String AUDIO_FILE_DESCRIPTOR_BUNDLE_KEY = "audio_file_descriptor";
    public static final Parcelable.Creator CREATOR = new RosieRobotRequestParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.RosieRobotRequest.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public RosieRobotRequest readFromBundle(Bundle bundle, String str) {
            RosieRobotRequest rosieRobotRequest = (RosieRobotRequest) createFromBundle(bundle, str, RosieRobotRequest.CREATOR);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bundle.getParcelable(RosieRobotRequest.AUDIO_FILE_DESCRIPTOR_BUNDLE_KEY, ParcelFileDescriptor.class);
            if (parcelFileDescriptor != null) {
                rosieRobotRequest.setAudioFileDescriptor(parcelFileDescriptor);
            }
            return rosieRobotRequest;
        }
    };

    @Deprecated
    private final byte[] audio;
    private ParcelFileDescriptor audioFileDescriptor;
    private final String contextString;
    private final String locale;
    private final int safetyClassificationMode;

    public RosieRobotRequest(byte[] bArr, String str, int i, ParcelFileDescriptor parcelFileDescriptor, String str2) {
        this.audio = bArr;
        this.locale = str;
        this.safetyClassificationMode = i;
        this.audioFileDescriptor = parcelFileDescriptor;
        this.contextString = str2;
    }

    public static RosieRobotRequest create(ParcelFileDescriptor parcelFileDescriptor, String str, int i) {
        return create(parcelFileDescriptor, str, i, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioFileDescriptor(ParcelFileDescriptor parcelFileDescriptor) {
        this.audioFileDescriptor = parcelFileDescriptor;
    }

    @Deprecated
    public byte[] getAudio() {
        return this.audio;
    }

    public ParcelFileDescriptor getAudioFileDescriptor() {
        return this.audioFileDescriptor;
    }

    public String getContextString() {
        return this.contextString;
    }

    public cxc getInferenceImageRequestsForSafety(akm akmVar, eia eiaVar) {
        int i = cxc.d;
        return cyp.a;
    }

    public cxc getInferenceRequestsForSafety(akm akmVar, eia eiaVar) {
        int i = cxc.d;
        return cyp.a;
    }

    public String getLocale() {
        return this.locale;
    }

    public String getRequestContentForSafety(akm akmVar, eia eiaVar) {
        return "";
    }

    public int getSafetyClassificationMode() {
        return this.safetyClassificationMode;
    }

    public boolean hasStreamingCallback() {
        return false;
    }

    @Override // com.google.android.apps.aicore.aidl.Bundleable
    public void writeToBundle(Bundle bundle, String str) {
        ParcelFileDescriptor parcelFileDescriptor = this.audioFileDescriptor;
        this.audioFileDescriptor = null;
        Bundleable.CC.writeParcelableToBundle(this, bundle, str);
        bundle.putParcelable(AUDIO_FILE_DESCRIPTOR_BUNDLE_KEY, parcelFileDescriptor);
        this.audioFileDescriptor = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        RosieRobotRequestParcelableCreator.writeToParcel(this, parcel, i);
    }

    public static RosieRobotRequest create(ParcelFileDescriptor parcelFileDescriptor, String str, int i, String str2) {
        return new RosieRobotRequest(null, str, i, parcelFileDescriptor, str2);
    }
}
