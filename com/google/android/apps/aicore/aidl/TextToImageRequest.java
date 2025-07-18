package com.google.android.apps.aicore.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.Bundleable;
import defpackage.bmr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TextToImageRequest extends bmr implements Request {
    public static final Parcelable.Creator CREATOR = new TextToImageRequestParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.TextToImageRequest.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public TextToImageRequest readFromBundle(Bundle bundle, String str) {
            return (TextToImageRequest) createFromBundle(bundle, str, TextToImageRequest.CREATOR);
        }
    };
    private final int featureType;
    private final int iteration;
    private final String prompt;
    private final int safetyClassificationMode;
    private final int seed;

    /* compiled from: PG */
    public @interface FeatureType {
        public static final int GENERATIVE_FILL = 3;
        public static final int GENERATIVE_SELFIE = 1;
        public static final int IMAGE_GENERATION = 0;
        public static final int INPAINTING = 2;
        public static final int WALLPAPER = 4;
    }

    public TextToImageRequest(String str, int i, int i2, int i3, int i4) {
        str.getClass();
        this.prompt = str;
        this.iteration = i;
        this.seed = i2;
        this.featureType = i3;
        this.safetyClassificationMode = i4;
    }

    public static TextToImageRequest create(String str, int i, int i2, int i3) {
        return new TextToImageRequest(str, i, i2, 0, i3);
    }

    public int getFeatureType() {
        return this.featureType;
    }

    public int getIteration() {
        return this.iteration;
    }

    public String getPrompt() {
        return this.prompt;
    }

    public int getSafetyClassificationMode() {
        return this.safetyClassificationMode;
    }

    public int getSeed() {
        return this.seed;
    }

    @Override // com.google.android.apps.aicore.aidl.Bundleable
    public /* synthetic */ void writeToBundle(Bundle bundle, String str) {
        Bundleable.CC.writeParcelableToBundle(this, bundle, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TextToImageRequestParcelableCreator.writeToParcel(this, parcel, i);
    }

    public static TextToImageRequest create(String str, int i, int i2, int i3, int i4) {
        return new TextToImageRequest(str, i, i2, i3, i4);
    }
}
