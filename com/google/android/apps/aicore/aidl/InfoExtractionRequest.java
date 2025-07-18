package com.google.android.apps.aicore.aidl;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.Bundleable;
import com.google.android.apps.aicore.aidl.IInfoExtractionStreamingCallback;
import com.google.android.apps.aicore.aidl.ITaskStateChangeCallback;
import defpackage.akm;
import defpackage.ako;
import defpackage.bmr;
import defpackage.clq;
import defpackage.cvu;
import defpackage.cxc;
import defpackage.cyp;
import defpackage.eia;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InfoExtractionRequest extends bmr implements Request {
    private static final String ADDITIONAL_TEXT_BUNDLE_KEY = "additional_text";
    private static final String INPUT_COUNT_BUNDLE_KEY = "input_count";
    private final String appendedResult;
    private cxc inputs;
    private final int preferredImageHeight;
    private final int preferredImageWidth;
    private final int safetyClassificationMode;
    private IInfoExtractionStreamingCallback streamingCallback;
    private ITaskStateChangeCallback taskStateChangeCallback;
    private final Float temperature;
    private final Integer topK;
    public static final Parcelable.Creator CREATOR = new InfoExtractionRequestParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.InfoExtractionRequest.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public InfoExtractionRequest readFromBundle(Bundle bundle, String str) {
            InfoExtractionRequest infoExtractionRequest = (InfoExtractionRequest) createFromBundle(bundle, str, InfoExtractionRequest.CREATOR);
            int i = bundle.getInt(InfoExtractionRequest.INPUT_COUNT_BUNDLE_KEY);
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add((InfoExtractionInput) InfoExtractionInput.READER.readFromBundle(bundle, InfoExtractionRequest.getInputBundleKey(i2)));
            }
            infoExtractionRequest.setInputs(cxc.o(arrayList));
            return infoExtractionRequest;
        }
    };

    /* compiled from: PG */
    public abstract class Builder {
        public abstract InfoExtractionRequest build();

        public abstract Builder setAppendedResult(String str);

        public abstract Builder setInputs(List list);

        public abstract Builder setPreferredImageHeight(int i);

        public abstract Builder setPreferredImageWidth(int i);

        public abstract Builder setSafetyClassificationMode(int i);

        public abstract Builder setStreamingCallback(IInfoExtractionStreamingCallback iInfoExtractionStreamingCallback);

        public abstract Builder setTaskStateChangeCallback(ITaskStateChangeCallback iTaskStateChangeCallback);

        public abstract Builder setTemperature(Float f);

        public abstract Builder setTopK(Integer num);
    }

    public InfoExtractionRequest(cxc cxcVar, int i, IInfoExtractionStreamingCallback iInfoExtractionStreamingCallback, int i2, int i3, ITaskStateChangeCallback iTaskStateChangeCallback, String str, Float f, Integer num) {
        this.inputs = cxcVar;
        this.safetyClassificationMode = i;
        this.streamingCallback = iInfoExtractionStreamingCallback;
        this.preferredImageWidth = i2;
        this.preferredImageHeight = i3;
        this.taskStateChangeCallback = iTaskStateChangeCallback;
        this.appendedResult = str;
        this.temperature = f;
        this.topK = num;
    }

    public static Builder builder() {
        return new AutoBuilder_InfoExtractionRequest_Builder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getInputBundleKey(int i) {
        return String.format(Locale.US, "input_%d", Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInputs(cxc cxcVar) {
        this.inputs = cxcVar;
    }

    public void attachCallbacks(final Consumer consumer) {
        this.streamingCallback = new IInfoExtractionStreamingCallback.Stub(this) { // from class: com.google.android.apps.aicore.aidl.InfoExtractionRequest.2
            @Override // com.google.android.apps.aicore.aidl.IInfoExtractionStreamingCallback
            public void onNewText(String str) {
                if (clq.O(str)) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString(InfoExtractionRequest.ADDITIONAL_TEXT_BUNDLE_KEY, str);
                consumer.accept(bundle);
            }
        };
        this.taskStateChangeCallback = TaskStateChangeCallbackUtils.createTaskStateChangeCallback(consumer);
    }

    public InfoExtractionRequest copyAppendResult(String str) {
        if (getAppendedResult() != null) {
            str = String.valueOf(getAppendedResult()).concat(String.valueOf(str));
        }
        Builder builder = builder();
        builder.setInputs(getInputs());
        builder.setSafetyClassificationMode(getSafetyClassificationMode());
        builder.setStreamingCallback(getStreamingCallback());
        builder.setPreferredImageWidth(getPreferredImageWidth());
        builder.setPreferredImageHeight(getPreferredImageHeight());
        builder.setTaskStateChangeCallback(getTaskStateChangeCallback());
        builder.setAppendedResult(str);
        builder.setTemperature(getTemperature());
        builder.setTopK(getTopK());
        return builder.build();
    }

    public void forwardOnDevicePartialResults(Bundle bundle) {
        IInfoExtractionStreamingCallback iInfoExtractionStreamingCallback;
        String string = bundle.getString(ADDITIONAL_TEXT_BUNDLE_KEY);
        if (string != null && (iInfoExtractionStreamingCallback = this.streamingCallback) != null) {
            iInfoExtractionStreamingCallback.onNewText(string);
        }
        ITaskStateChangeCallback iTaskStateChangeCallback = this.taskStateChangeCallback;
        if (iTaskStateChangeCallback != null) {
            TaskStateChangeCallbackUtils.forwardOnDeviceTaskStateChangeCallbackResults(iTaskStateChangeCallback, bundle);
        }
    }

    public String getAppendedResult() {
        return this.appendedResult;
    }

    public cxc getInferenceImageRequestsForSafety(akm akmVar, eia eiaVar) {
        cxc cxcVar = this.inputs;
        if (cxcVar != null) {
            return (cxc) Collection.EL.stream(cxcVar).flatMap(new Function() { // from class: com.google.android.apps.aicore.aidl.InfoExtractionRequest$$ExternalSyntheticLambda1
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Stream.CC.ofNullable(((InfoExtractionInput) obj).getBitmap());
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(cvu.a);
        }
        int i = cxc.d;
        return cyp.a;
    }

    public cxc getInferenceRequestsForSafety(akm akmVar, eia eiaVar) {
        cxc cxcVar = this.inputs;
        if (cxcVar != null) {
            return (cxc) Collection.EL.stream(cxcVar).flatMap(new Function() { // from class: com.google.android.apps.aicore.aidl.InfoExtractionRequest$$ExternalSyntheticLambda0
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Stream.CC.ofNullable(((InfoExtractionInput) obj).getMessage());
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(cvu.a);
        }
        int i = cxc.d;
        return cyp.a;
    }

    public cxc getInputs() {
        return this.inputs;
    }

    public int getPreferredImageHeight() {
        return this.preferredImageHeight;
    }

    public int getPreferredImageWidth() {
        return this.preferredImageWidth;
    }

    public String getRequestContentForSafety(akm akmVar, eia eiaVar) {
        cxc cxcVar = this.inputs;
        if (cxcVar == null) {
            return "";
        }
        if ((eiaVar.b & 2) == 0) {
            return (String) Collection.EL.stream(cxcVar).flatMap(new Function() { // from class: com.google.android.apps.aicore.aidl.InfoExtractionRequest$$ExternalSyntheticLambda3
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Stream.CC.ofNullable(((InfoExtractionInput) obj).getMessage());
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.joining((eiaVar.b & 1) != 0 ? eiaVar.c : "\n"));
        }
        return ako.b(eiaVar, Collection.EL.stream(cxcVar).map(new Function() { // from class: com.google.android.apps.aicore.aidl.InfoExtractionRequest$$ExternalSyntheticLambda2
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (InfoExtractionInput) obj;
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
    }

    public int getSafetyClassificationMode() {
        return this.safetyClassificationMode;
    }

    public IInfoExtractionStreamingCallback getStreamingCallback() {
        return this.streamingCallback;
    }

    public IBinder getStreamingCallbackBinder() {
        IInfoExtractionStreamingCallback iInfoExtractionStreamingCallback = this.streamingCallback;
        if (iInfoExtractionStreamingCallback == null) {
            return null;
        }
        return iInfoExtractionStreamingCallback.asBinder();
    }

    public ITaskStateChangeCallback getTaskStateChangeCallback() {
        return this.taskStateChangeCallback;
    }

    public IBinder getTaskStateChangeCallbackBinder() {
        ITaskStateChangeCallback iTaskStateChangeCallback = this.taskStateChangeCallback;
        if (iTaskStateChangeCallback == null) {
            return null;
        }
        return iTaskStateChangeCallback.asBinder();
    }

    public Float getTemperature() {
        return this.temperature;
    }

    public Integer getTopK() {
        return this.topK;
    }

    public boolean hasBundledCallbacks() {
        return (this.streamingCallback == null && this.taskStateChangeCallback == null) ? false : true;
    }

    public boolean hasStreamingCallback() {
        return getStreamingCallback() != null;
    }

    @Override // com.google.android.apps.aicore.aidl.Bundleable
    public void writeToBundle(Bundle bundle, String str) {
        IInfoExtractionStreamingCallback iInfoExtractionStreamingCallback = this.streamingCallback;
        ITaskStateChangeCallback iTaskStateChangeCallback = this.taskStateChangeCallback;
        cxc cxcVar = this.inputs;
        cxcVar.getClass();
        this.streamingCallback = null;
        this.taskStateChangeCallback = null;
        this.inputs = null;
        Bundleable.CC.writeParcelableToBundle(this, bundle, str);
        bundle.putInt(INPUT_COUNT_BUNDLE_KEY, cxcVar.size());
        for (int i = 0; i < cxcVar.size(); i++) {
            ((InfoExtractionInput) cxcVar.get(i)).writeToBundle(bundle, getInputBundleKey(i));
        }
        this.streamingCallback = iInfoExtractionStreamingCallback;
        this.taskStateChangeCallback = iTaskStateChangeCallback;
        this.inputs = cxcVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        InfoExtractionRequestParcelableCreator.writeToParcel(this, parcel, i);
    }

    public InfoExtractionRequest(List list, int i, IBinder iBinder, int i2, int i3, IBinder iBinder2, String str, Float f, Integer num) {
        this.inputs = list == null ? null : cxc.o(list);
        this.safetyClassificationMode = i;
        this.streamingCallback = iBinder == null ? null : IInfoExtractionStreamingCallback.Stub.asInterface(iBinder);
        this.taskStateChangeCallback = iBinder2 != null ? ITaskStateChangeCallback.Stub.asInterface(iBinder2) : null;
        this.preferredImageWidth = i2;
        this.preferredImageHeight = i3;
        this.appendedResult = str;
        this.temperature = f;
        this.topK = num;
    }

    static /* synthetic */ bmr lambda$getRequestContentForSafety$0(InfoExtractionInput infoExtractionInput) {
        return infoExtractionInput;
    }
}
