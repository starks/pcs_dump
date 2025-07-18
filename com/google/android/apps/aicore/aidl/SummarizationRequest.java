package com.google.android.apps.aicore.aidl;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.Bundleable;
import com.google.android.apps.aicore.aidl.ISummarizationStreamingCallback;
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
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SummarizationRequest extends bmr implements Request {
    private static final String ADDITIONAL_TEXT_BUNDLE_KEY = "additional_text";
    public static final Parcelable.Creator CREATOR = new SummarizationRequestParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.SummarizationRequest.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public SummarizationRequest readFromBundle(Bundle bundle, String str) {
            return (SummarizationRequest) createFromBundle(bundle, str, SummarizationRequest.CREATOR);
        }
    };
    private final SummarizationArguments arguments;
    private final int bulletPointNum;
    private final cxc messages;
    private final int rgnSeed;
    private final int safetyClassificationMode;
    private ISummarizationStreamingCallback streamingCallback;
    private final int targetReplyLengthMax;
    private final int targetReplyLengthMin;
    private ITaskStateChangeCallback taskStateChangeCallback;
    private final float temperature;
    private final int topK;

    private SummarizationRequest(cxc cxcVar, float f, int i, int i2, int i3, ISummarizationStreamingCallback iSummarizationStreamingCallback, int i4, int i5, ITaskStateChangeCallback iTaskStateChangeCallback, int i6, SummarizationArguments summarizationArguments) {
        this.messages = cxcVar;
        this.temperature = f;
        this.topK = i;
        this.targetReplyLengthMin = i2;
        this.targetReplyLengthMax = i3;
        this.streamingCallback = iSummarizationStreamingCallback;
        this.safetyClassificationMode = i4;
        this.bulletPointNum = i5;
        this.taskStateChangeCallback = iTaskStateChangeCallback;
        this.rgnSeed = i6;
        this.arguments = summarizationArguments;
    }

    public static SummarizationRequest create(List list, float f, int i, int i2, int i3, ISummarizationStreamingCallback iSummarizationStreamingCallback, int i4, int i5, ITaskStateChangeCallback iTaskStateChangeCallback, int i6, SummarizationArguments summarizationArguments) {
        return new SummarizationRequest(cxc.o(list), f, i, i2, i3, iSummarizationStreamingCallback, i4, i5, iTaskStateChangeCallback, i6, summarizationArguments);
    }

    public void attachCallbacks(final Consumer consumer) {
        this.streamingCallback = new ISummarizationStreamingCallback.Stub(this) { // from class: com.google.android.apps.aicore.aidl.SummarizationRequest.2
            @Override // com.google.android.apps.aicore.aidl.ISummarizationStreamingCallback
            public void onNewText(String str) {
                if (clq.O(str)) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString(SummarizationRequest.ADDITIONAL_TEXT_BUNDLE_KEY, str);
                consumer.accept(bundle);
            }
        };
        this.taskStateChangeCallback = TaskStateChangeCallbackUtils.createTaskStateChangeCallback(consumer);
    }

    public SummarizationRequest copyReplaceStreamingCallback(ISummarizationStreamingCallback iSummarizationStreamingCallback) {
        return create(getMessages(), getTemperature(), getTopK(), getTargetReplyLengthMin(), getTargetReplyLengthMax(), iSummarizationStreamingCallback, getSafetyClassificationMode(), getBulletPointNum(), getTaskStateChangeCallback(), getRgnSeed(), getArguments());
    }

    public void forwardOnDevicePartialResults(Bundle bundle) {
        ISummarizationStreamingCallback iSummarizationStreamingCallback;
        String string = bundle.getString(ADDITIONAL_TEXT_BUNDLE_KEY);
        if (string != null && (iSummarizationStreamingCallback = this.streamingCallback) != null) {
            iSummarizationStreamingCallback.onNewText(string);
        }
        ITaskStateChangeCallback iTaskStateChangeCallback = this.taskStateChangeCallback;
        if (iTaskStateChangeCallback != null) {
            TaskStateChangeCallbackUtils.forwardOnDeviceTaskStateChangeCallbackResults(iTaskStateChangeCallback, bundle);
        }
    }

    public SummarizationArguments getArguments() {
        return this.arguments;
    }

    public int getBulletPointNum() {
        return this.bulletPointNum;
    }

    public cxc getInferenceImageRequestsForSafety(akm akmVar, eia eiaVar) {
        int i = cxc.d;
        return cyp.a;
    }

    public cxc getInferenceRequestsForSafety(akm akmVar, eia eiaVar) {
        Stream map = Collection.EL.stream(getMessages()).map(new Function() { // from class: com.google.android.apps.aicore.aidl.SummarizationRequest$$ExternalSyntheticLambda2
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((SummarizationMessage) obj).getMessage();
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = cxc.d;
        return (cxc) map.collect(cvu.a);
    }

    public cxc getMessages() {
        return this.messages;
    }

    public String getRequestContentForSafety(akm akmVar, eia eiaVar) {
        if ((eiaVar.b & 2) == 0) {
            return (String) Collection.EL.stream(getMessages()).flatMap(new Function() { // from class: com.google.android.apps.aicore.aidl.SummarizationRequest$$ExternalSyntheticLambda1
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Stream.CC.ofNullable(((SummarizationMessage) obj).getMessage());
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.joining((eiaVar.b & 1) != 0 ? eiaVar.c : "\n"));
        }
        return ako.b(eiaVar, Collection.EL.stream(getMessages()).map(new Function() { // from class: com.google.android.apps.aicore.aidl.SummarizationRequest$$ExternalSyntheticLambda0
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (SummarizationMessage) obj;
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
    }

    public int getRgnSeed() {
        return this.rgnSeed;
    }

    public int getSafetyClassificationMode() {
        return this.safetyClassificationMode;
    }

    public ISummarizationStreamingCallback getStreamingCallback() {
        return this.streamingCallback;
    }

    public IBinder getStreamingCallbackBinder() {
        ISummarizationStreamingCallback iSummarizationStreamingCallback = this.streamingCallback;
        if (iSummarizationStreamingCallback == null) {
            return null;
        }
        return iSummarizationStreamingCallback.asBinder();
    }

    public int getTargetReplyLengthMax() {
        return this.targetReplyLengthMax;
    }

    public int getTargetReplyLengthMin() {
        return this.targetReplyLengthMin;
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

    public float getTemperature() {
        return this.temperature;
    }

    public int getTopK() {
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
        ISummarizationStreamingCallback iSummarizationStreamingCallback = this.streamingCallback;
        ITaskStateChangeCallback iTaskStateChangeCallback = this.taskStateChangeCallback;
        this.streamingCallback = null;
        this.taskStateChangeCallback = null;
        Bundleable.CC.writeParcelableToBundle(this, bundle, str);
        this.streamingCallback = iSummarizationStreamingCallback;
        this.taskStateChangeCallback = iTaskStateChangeCallback;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SummarizationRequestParcelableCreator.writeToParcel(this, parcel, i);
    }

    public SummarizationRequest(List list, float f, int i, int i2, int i3, IBinder iBinder, int i4, int i5, IBinder iBinder2, int i6, SummarizationArguments summarizationArguments) {
        this.messages = cxc.o(list);
        this.temperature = f;
        this.topK = i;
        this.targetReplyLengthMin = i2;
        this.targetReplyLengthMax = i3;
        this.streamingCallback = iBinder == null ? null : ISummarizationStreamingCallback.Stub.asInterface(iBinder);
        this.safetyClassificationMode = i4;
        this.bulletPointNum = i5;
        this.taskStateChangeCallback = iBinder2 != null ? ITaskStateChangeCallback.Stub.asInterface(iBinder2) : null;
        this.rgnSeed = i6;
        this.arguments = summarizationArguments;
    }

    public static SummarizationRequest create(List list, float f, int i, int i2, int i3, ISummarizationStreamingCallback iSummarizationStreamingCallback, int i4, int i5, ITaskStateChangeCallback iTaskStateChangeCallback, SummarizationArguments summarizationArguments) {
        return new SummarizationRequest(cxc.o(list), f, i, i2, i3, iSummarizationStreamingCallback, i4, i5, iTaskStateChangeCallback, 123, summarizationArguments);
    }

    public static SummarizationRequest create(List list, float f, int i, int i2, int i3, ISummarizationStreamingCallback iSummarizationStreamingCallback, int i4, ITaskStateChangeCallback iTaskStateChangeCallback) {
        return new SummarizationRequest(cxc.o(list), f, i, i2, i3, iSummarizationStreamingCallback, i4, 3, iTaskStateChangeCallback, 123, SummarizationArguments.create(new HashMap()));
    }

    public static SummarizationRequest create(List list, ISummarizationStreamingCallback iSummarizationStreamingCallback, int i, ITaskStateChangeCallback iTaskStateChangeCallback) {
        return new SummarizationRequest(cxc.o(list), 0.0f, 3, 3, 500, iSummarizationStreamingCallback, i, 3, iTaskStateChangeCallback, 123, SummarizationArguments.create(new HashMap()));
    }

    static /* synthetic */ bmr lambda$getRequestContentForSafety$0(SummarizationMessage summarizationMessage) {
        return summarizationMessage;
    }
}
