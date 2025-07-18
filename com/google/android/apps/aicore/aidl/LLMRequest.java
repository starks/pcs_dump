package com.google.android.apps.aicore.aidl;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.Bundleable;
import com.google.android.apps.aicore.aidl.IImageEmbeddingCallback;
import com.google.android.apps.aicore.aidl.ILLMStreamingCallback;
import com.google.android.apps.aicore.aidl.LLMRequest;
import defpackage.akm;
import defpackage.ako;
import defpackage.bmr;
import defpackage.clq;
import defpackage.cvu;
import defpackage.cwy;
import defpackage.cxc;
import defpackage.cyp;
import defpackage.eia;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LLMRequest extends bmr implements Request {
    private static final String ADDITIONAL_TEXT_BUNDLE_KEY = "additional_text";
    private static final String AUXILIARY_FILES_BUNDLE_KEY = "auxiliary_files";
    public static final String IMAGE_EMBEDDING_ID_BUNDLE_KEY = "image_embedding";
    public static final String LORA_FILE_BUNDLE_KEY = "auxiliary_lora_file";
    private static final String MESSAGE_COUNT_BUNDLE_KEY = "message_count";
    private static final String REPLY_VARIANT_ID_BUNDLE_KEY = "reply_variant_id";
    private final String appendedResult;
    private final boolean applySafetyFilter;
    private Bundle auxiliaryFilesBundle;
    private IImageEmbeddingCallback imageEmbeddingCallback;
    private cxc messages;
    private final int numSamples;
    private final int preferredImageHeight;
    private final int preferredImageWidth;
    private final boolean privateInferenceEnabled;
    private final cxc stopTokensList;
    private ILLMStreamingCallback streamingCallback;
    private final int targetReplyLengthMax;
    private final int targetReplyLengthMin;
    private final float temperature;
    private final int topK;
    public static final Parcelable.Creator CREATOR = new LLMRequestParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.LLMRequest.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public LLMRequest readFromBundle(Bundle bundle, String str) {
            Bundle bundle2;
            LLMRequest lLMRequest = (LLMRequest) createFromBundle(bundle, str, LLMRequest.CREATOR);
            int i = cxc.d;
            cwy cwyVar = new cwy();
            for (int i2 = 0; i2 < bundle.getInt(LLMRequest.MESSAGE_COUNT_BUNDLE_KEY); i2++) {
                cwyVar.h((LLMMessage) LLMMessage.READER.readFromBundle(bundle, LLMRequest.getMessageBundleKey(i2)));
            }
            lLMRequest.setMessages(cwyVar.g());
            if (bundle.containsKey(LLMRequest.AUXILIARY_FILES_BUNDLE_KEY) && (bundle2 = bundle.getBundle(LLMRequest.AUXILIARY_FILES_BUNDLE_KEY)) != null) {
                lLMRequest.setAuxiliaryFilesBundle(bundle2);
            }
            return lLMRequest;
        }
    };

    /* compiled from: PG */
    /* renamed from: com.google.android.apps.aicore.aidl.LLMRequest$3, reason: invalid class name */
    class AnonymousClass3 extends IImageEmbeddingCallback.Stub {
        final /* synthetic */ Consumer val$onPartialResultCallback;

        public AnonymousClass3(LLMRequest lLMRequest, Consumer consumer) {
            this.val$onPartialResultCallback = consumer;
        }

        static /* synthetic */ ParcelFileDescriptor[] lambda$onNewEmbeddings$0(int i) {
            return new ParcelFileDescriptor[i];
        }

        @Override // com.google.android.apps.aicore.aidl.IImageEmbeddingCallback
        public void onNewEmbeddings(List list) {
            if (list.isEmpty()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray(LLMRequest.IMAGE_EMBEDDING_ID_BUNDLE_KEY, (Parcelable[]) Collection.EL.toArray(list, new IntFunction() { // from class: com.google.android.apps.aicore.aidl.LLMRequest$3$$ExternalSyntheticLambda0
                @Override // java.util.function.IntFunction
                public final Object apply(int i) {
                    return LLMRequest.AnonymousClass3.lambda$onNewEmbeddings$0(i);
                }
            }));
            this.val$onPartialResultCallback.accept(bundle);
        }
    }

    /* compiled from: PG */
    public abstract class Builder {
        public abstract LLMRequest build();

        public abstract Builder setAppendedResult(String str);

        public abstract Builder setApplySafetyFilter(boolean z);

        public abstract Builder setAuxiliaryFilesBundle(Bundle bundle);

        public abstract Builder setImageEmbeddingCallback(IImageEmbeddingCallback iImageEmbeddingCallback);

        public abstract Builder setMessages(List list);

        public abstract Builder setNumSamples(int i);

        public abstract Builder setPreferredImageHeight(int i);

        public abstract Builder setPreferredImageWidth(int i);

        public abstract Builder setPrivateInferenceEnabled(boolean z);

        public abstract Builder setStopTokensList(List list);

        public abstract Builder setStreamingCallback(ILLMStreamingCallback iLLMStreamingCallback);

        public abstract Builder setTargetReplyLengthMax(int i);

        public abstract Builder setTargetReplyLengthMin(int i);

        public abstract Builder setTemperature(float f);

        public abstract Builder setTopK(int i);
    }

    public LLMRequest(cxc cxcVar, float f, int i, cxc cxcVar2, int i2, int i3, ILLMStreamingCallback iLLMStreamingCallback, boolean z, int i4, IImageEmbeddingCallback iImageEmbeddingCallback, int i5, int i6, String str, Bundle bundle, boolean z2) {
        this.messages = cxcVar;
        this.temperature = f;
        this.topK = i;
        this.stopTokensList = cxcVar2;
        this.targetReplyLengthMin = i2;
        this.targetReplyLengthMax = i3;
        this.streamingCallback = iLLMStreamingCallback;
        this.applySafetyFilter = z;
        this.numSamples = i4;
        this.imageEmbeddingCallback = iImageEmbeddingCallback;
        this.preferredImageWidth = i5;
        this.preferredImageHeight = i6;
        this.appendedResult = str;
        this.auxiliaryFilesBundle = bundle;
        this.privateInferenceEnabled = z2;
    }

    public static Builder builder() {
        AutoBuilder_LLMRequest_Builder autoBuilder_LLMRequest_Builder = new AutoBuilder_LLMRequest_Builder();
        autoBuilder_LLMRequest_Builder.setPreferredImageWidth(0);
        autoBuilder_LLMRequest_Builder.setPreferredImageHeight(0);
        int i = cxc.d;
        autoBuilder_LLMRequest_Builder.setStopTokensList(cyp.a);
        autoBuilder_LLMRequest_Builder.setPrivateInferenceEnabled(false);
        return autoBuilder_LLMRequest_Builder;
    }

    @Deprecated
    public static LLMRequest create(List list, float f, int i, List list2, int i2, int i3, ILLMStreamingCallback iLLMStreamingCallback, boolean z) {
        return new LLMRequest(cxc.o(list), f, i, cxc.o(list2), i2, i3, iLLMStreamingCallback, z, 1, (IImageEmbeddingCallback) null, 0, 0, (String) null, (Bundle) null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getMessageBundleKey(int i) {
        return String.format(Locale.US, "message_%d", Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuxiliaryFilesBundle(Bundle bundle) {
        this.auxiliaryFilesBundle = bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessages(cxc cxcVar) {
        this.messages = cxcVar;
    }

    public void attachCallbacks(final Consumer consumer) {
        this.streamingCallback = new ILLMStreamingCallback.Stub(this) { // from class: com.google.android.apps.aicore.aidl.LLMRequest.2
            @Override // com.google.android.apps.aicore.aidl.ILLMStreamingCallback
            public void onNewText(int i, String str) {
                if (clq.O(str)) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt(LLMRequest.REPLY_VARIANT_ID_BUNDLE_KEY, i);
                bundle.putString(LLMRequest.ADDITIONAL_TEXT_BUNDLE_KEY, str);
                consumer.accept(bundle);
            }
        };
        this.imageEmbeddingCallback = new AnonymousClass3(this, consumer);
    }

    public void closeAllFileDescriptors() throws IOException {
        cxc messages = getMessages();
        int size = messages.size();
        for (int i = 0; i < size; i++) {
            ParcelFileDescriptor imageEmbedding = ((LLMMessage) messages.get(i)).getImageEmbedding();
            if (imageEmbedding != null) {
                imageEmbedding.close();
            }
        }
    }

    public LLMRequest copyAppendResult(String str) {
        if (getAppendedResult() != null) {
            str = String.valueOf(getAppendedResult()).concat(String.valueOf(str));
        }
        return builder().setMessages(getMessages()).setTemperature(getTemperature()).setTopK(getTopK()).setStopTokensList(getStopTokensList()).setTargetReplyLengthMin(getTargetReplyLengthMin()).setTargetReplyLengthMax(getTargetReplyLengthMax()).setStreamingCallback(getStreamingCallback()).setApplySafetyFilter(shouldApplySafetyFilter()).setNumSamples(getNumSamples()).setImageEmbeddingCallback(getImageEmbeddingCallback()).setPreferredImageWidth(getPreferredImageWidth()).setPreferredImageHeight(getPreferredImageHeight()).setAppendedResult(str).setAuxiliaryFilesBundle(getAuxiliaryFilesBundle()).build();
    }

    public LLMRequest copyReplaceStreamingCallback(ILLMStreamingCallback iLLMStreamingCallback) {
        return builder().setMessages(getMessages()).setTemperature(getTemperature()).setTopK(getTopK()).setStopTokensList(getStopTokensList()).setTargetReplyLengthMin(getTargetReplyLengthMin()).setTargetReplyLengthMax(getTargetReplyLengthMax()).setStreamingCallback(iLLMStreamingCallback).setApplySafetyFilter(shouldApplySafetyFilter()).setNumSamples(getNumSamples()).setImageEmbeddingCallback(getImageEmbeddingCallback()).setPreferredImageWidth(getPreferredImageWidth()).setPreferredImageHeight(getPreferredImageHeight()).setAppendedResult(getAppendedResult()).setAuxiliaryFilesBundle(getAuxiliaryFilesBundle()).build();
    }

    public void forwardOnDevicePartialResults(Bundle bundle) {
        IImageEmbeddingCallback iImageEmbeddingCallback;
        String string = bundle.getString(ADDITIONAL_TEXT_BUNDLE_KEY);
        if (string != null && this.streamingCallback != null) {
            int i = bundle.getInt(REPLY_VARIANT_ID_BUNDLE_KEY);
            ILLMStreamingCallback iLLMStreamingCallback = this.streamingCallback;
            iLLMStreamingCallback.getClass();
            iLLMStreamingCallback.onNewText(i, string);
        }
        ParcelFileDescriptor[] parcelFileDescriptorArr = (ParcelFileDescriptor[]) bundle.getParcelableArray(IMAGE_EMBEDDING_ID_BUNDLE_KEY, ParcelFileDescriptor.class);
        if (parcelFileDescriptorArr == null || (iImageEmbeddingCallback = this.imageEmbeddingCallback) == null) {
            return;
        }
        iImageEmbeddingCallback.onNewEmbeddings(Arrays.asList(parcelFileDescriptorArr));
    }

    public String getAppendedResult() {
        return this.appendedResult;
    }

    public Bundle getAuxiliaryFilesBundle() {
        return this.auxiliaryFilesBundle;
    }

    public IImageEmbeddingCallback getImageEmbeddingCallback() {
        return this.imageEmbeddingCallback;
    }

    public IBinder getImageEmbeddingCallbackBinder() {
        IImageEmbeddingCallback iImageEmbeddingCallback = this.imageEmbeddingCallback;
        if (iImageEmbeddingCallback == null) {
            return null;
        }
        return iImageEmbeddingCallback.asBinder();
    }

    public cxc getInferenceImageRequestsForSafety(akm akmVar, eia eiaVar) {
        Stream streamFlatMap = Collection.EL.stream(getMessages()).flatMap(new Function() { // from class: com.google.android.apps.aicore.aidl.LLMRequest$$ExternalSyntheticLambda3
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Stream.CC.ofNullable(((LLMMessage) obj).getBitmap());
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = cxc.d;
        return (cxc) streamFlatMap.collect(cvu.a);
    }

    public cxc getInferenceRequestsForSafety(akm akmVar, eia eiaVar) {
        Stream streamFlatMap = Collection.EL.stream(getMessages()).flatMap(new Function() { // from class: com.google.android.apps.aicore.aidl.LLMRequest$$ExternalSyntheticLambda2
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Stream.CC.ofNullable(((LLMMessage) obj).getMessage());
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = cxc.d;
        return (cxc) streamFlatMap.collect(cvu.a);
    }

    public cxc getMessages() {
        return this.messages;
    }

    public int getNumSamples() {
        return this.numSamples;
    }

    public int getPreferredImageHeight() {
        return this.preferredImageHeight;
    }

    public int getPreferredImageWidth() {
        return this.preferredImageWidth;
    }

    public boolean getPrivateInferenceEnabled() {
        return this.privateInferenceEnabled;
    }

    public String getRequestContentForSafety(akm akmVar, eia eiaVar) {
        if ((eiaVar.b & 2) == 0) {
            return (String) Collection.EL.stream(getMessages()).flatMap(new Function() { // from class: com.google.android.apps.aicore.aidl.LLMRequest$$ExternalSyntheticLambda1
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Stream.CC.ofNullable(((LLMMessage) obj).getMessage());
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.joining((eiaVar.b & 1) != 0 ? eiaVar.c : "\n"));
        }
        return ako.b(eiaVar, Collection.EL.stream(getMessages()).map(new Function() { // from class: com.google.android.apps.aicore.aidl.LLMRequest$$ExternalSyntheticLambda0
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (LLMMessage) obj;
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
    }

    public int getSafetyClassificationMode() {
        return shouldApplySafetyFilter() ? 1 : 0;
    }

    public cxc getStopTokensList() {
        return this.stopTokensList;
    }

    public ILLMStreamingCallback getStreamingCallback() {
        return this.streamingCallback;
    }

    public IBinder getStreamingCallbackBinder() {
        ILLMStreamingCallback iLLMStreamingCallback = this.streamingCallback;
        if (iLLMStreamingCallback == null) {
            return null;
        }
        return iLLMStreamingCallback.asBinder();
    }

    public int getTargetReplyLengthMax() {
        return this.targetReplyLengthMax;
    }

    public int getTargetReplyLengthMin() {
        return this.targetReplyLengthMin;
    }

    public float getTemperature() {
        return this.temperature;
    }

    public int getTopK() {
        return this.topK;
    }

    public boolean hasBundledCallbacks() {
        return (this.streamingCallback == null && this.imageEmbeddingCallback == null) ? false : true;
    }

    public boolean hasStreamingCallback() {
        return getStreamingCallback() != null;
    }

    public boolean shouldApplySafetyFilter() {
        return this.applySafetyFilter;
    }

    @Override // com.google.android.apps.aicore.aidl.Bundleable
    public void writeToBundle(Bundle bundle, String str) {
        cxc cxcVar = this.messages;
        ILLMStreamingCallback iLLMStreamingCallback = this.streamingCallback;
        IImageEmbeddingCallback iImageEmbeddingCallback = this.imageEmbeddingCallback;
        Bundle bundle2 = this.auxiliaryFilesBundle;
        this.streamingCallback = null;
        this.imageEmbeddingCallback = null;
        int i = cxc.d;
        this.messages = cyp.a;
        this.auxiliaryFilesBundle = null;
        Bundleable.CC.writeParcelableToBundle(this, bundle, str);
        bundle.putBundle(AUXILIARY_FILES_BUNDLE_KEY, bundle2);
        bundle.putInt(MESSAGE_COUNT_BUNDLE_KEY, cxcVar.size());
        for (int i2 = 0; i2 < cxcVar.size(); i2++) {
            ((LLMMessage) cxcVar.get(i2)).writeToBundle(bundle, getMessageBundleKey(i2));
        }
        this.streamingCallback = iLLMStreamingCallback;
        this.imageEmbeddingCallback = iImageEmbeddingCallback;
        this.messages = cxcVar;
        this.auxiliaryFilesBundle = bundle2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LLMRequestParcelableCreator.writeToParcel(this, parcel, i);
    }

    public LLMRequest(List list, float f, int i, List list2, int i2, int i3, IBinder iBinder, boolean z, int i4, IBinder iBinder2, int i5, int i6, String str, Bundle bundle, boolean z2) {
        this.messages = cxc.o(list);
        this.temperature = f;
        this.topK = i;
        this.stopTokensList = cxc.o(list2);
        this.targetReplyLengthMin = i2;
        this.targetReplyLengthMax = i3;
        this.streamingCallback = iBinder == null ? null : ILLMStreamingCallback.Stub.asInterface(iBinder);
        this.applySafetyFilter = z;
        this.numSamples = i4;
        this.imageEmbeddingCallback = iBinder2 != null ? IImageEmbeddingCallback.Stub.asInterface(iBinder2) : null;
        this.preferredImageWidth = i5;
        this.preferredImageHeight = i6;
        this.appendedResult = str;
        this.auxiliaryFilesBundle = bundle;
        this.privateInferenceEnabled = z2;
    }

    @Deprecated
    public static LLMRequest create(List list, float f, int i, List list2, int i2, int i3, ILLMStreamingCallback iLLMStreamingCallback, boolean z, int i4) {
        return new LLMRequest(cxc.o(list), f, i, cxc.o(list2), i2, i3, iLLMStreamingCallback, z, i4, (IImageEmbeddingCallback) null, 0, 0, (String) null, (Bundle) null, false);
    }

    static /* synthetic */ bmr lambda$getRequestContentForSafety$0(LLMMessage lLMMessage) {
        return lLMMessage;
    }
}
