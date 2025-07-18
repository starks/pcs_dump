package com.google.android.apps.aicore.aidl;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.Bundleable;
import com.google.android.apps.aicore.aidl.IQuestionToAnswerStreamingCallback;
import com.google.android.apps.aicore.aidl.ITaskStateChangeCallback;
import defpackage.akm;
import defpackage.bmr;
import defpackage.clq;
import defpackage.cvu;
import defpackage.cxc;
import defpackage.cyp;
import defpackage.eia;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public class QuestionToAnswerRequest extends bmr implements Request {
    private static final String ADDITIONAL_TEXT_BUNDLE_KEY = "additional_text";
    public static final Parcelable.Creator CREATOR = new QuestionToAnswerRequestParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.QuestionToAnswerRequest.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public QuestionToAnswerRequest readFromBundle(Bundle bundle, String str) {
            return (QuestionToAnswerRequest) createFromBundle(bundle, str, QuestionToAnswerRequest.CREATOR);
        }
    };
    private final String appendedResult;
    private final String memories;
    private final cxc promptValues;
    private final String question;
    private final int safetyClassificationMode;
    private IQuestionToAnswerStreamingCallback streamingCallback;
    private ITaskStateChangeCallback taskStateChangeCallback;

    public QuestionToAnswerRequest(String str, String str2, int i, IBinder iBinder, IBinder iBinder2, List list, String str3) {
        this.question = str;
        this.memories = str2;
        this.safetyClassificationMode = i;
        this.taskStateChangeCallback = iBinder == null ? null : ITaskStateChangeCallback.Stub.asInterface(iBinder);
        this.streamingCallback = iBinder2 == null ? null : IQuestionToAnswerStreamingCallback.Stub.asInterface(iBinder2);
        this.promptValues = list != null ? cxc.o(list) : null;
        this.appendedResult = str3;
    }

    public static QuestionToAnswerRequest create(String str, String str2, int i, ITaskStateChangeCallback iTaskStateChangeCallback, IQuestionToAnswerStreamingCallback iQuestionToAnswerStreamingCallback, List list, String str3) {
        return new QuestionToAnswerRequest(str, str2, i, iTaskStateChangeCallback, iQuestionToAnswerStreamingCallback, list, str3);
    }

    static /* synthetic */ boolean lambda$getInferenceRequestsForSafety$0(String str) {
        return !clq.O(str);
    }

    public void attachCallbacks(final Consumer consumer) {
        this.streamingCallback = new IQuestionToAnswerStreamingCallback.Stub(this) { // from class: com.google.android.apps.aicore.aidl.QuestionToAnswerRequest.2
            @Override // com.google.android.apps.aicore.aidl.IQuestionToAnswerStreamingCallback
            public void onNewText(String str) {
                if (clq.O(str)) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString(QuestionToAnswerRequest.ADDITIONAL_TEXT_BUNDLE_KEY, str);
                consumer.accept(bundle);
            }
        };
        this.taskStateChangeCallback = TaskStateChangeCallbackUtils.createTaskStateChangeCallback(consumer);
    }

    public QuestionToAnswerRequest copyAppendResult(String str) {
        if (getAppendedResult() != null) {
            str = String.valueOf(getAppendedResult()).concat(String.valueOf(str));
        }
        return create(getQuestion(), getMemories(), getSafetyClassificationMode(), getTaskStateChangeCallback(), getStreamingCallback(), getPromptValues(), str);
    }

    public void forwardOnDevicePartialResults(Bundle bundle) {
        IQuestionToAnswerStreamingCallback iQuestionToAnswerStreamingCallback;
        String string = bundle.getString(ADDITIONAL_TEXT_BUNDLE_KEY);
        if (string != null && (iQuestionToAnswerStreamingCallback = this.streamingCallback) != null) {
            iQuestionToAnswerStreamingCallback.onNewText(string);
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
        int i = cxc.d;
        return cyp.a;
    }

    public cxc getInferenceRequestsForSafety(akm akmVar, eia eiaVar) {
        if (akmVar.a()) {
            String str = this.question;
            if (str != null) {
                return cxc.q(str);
            }
            int i = cxc.d;
            return cyp.a;
        }
        Stream streamConcat = Stream.CC.concat(Stream.CC.ofNullable(getQuestion()), Stream.CC.ofNullable(getMemories()));
        cxc cxcVar = this.promptValues;
        if (cxcVar != null) {
            return (cxc) Stream.CC.concat(streamConcat, Collection.EL.stream(cxcVar).filter(new Predicate() { // from class: com.google.android.apps.aicore.aidl.QuestionToAnswerRequest$$ExternalSyntheticLambda1
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                public /* synthetic */ Predicate negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return QuestionToAnswerRequest.lambda$getInferenceRequestsForSafety$0((String) obj);
                }
            })).collect(cvu.a);
        }
        int i2 = cxc.d;
        return (cxc) streamConcat.collect(cvu.a);
    }

    public String getMemories() {
        return this.memories;
    }

    public cxc getPromptValues() {
        return this.promptValues;
    }

    public String getQuestion() {
        return this.question;
    }

    public String getRequestContentForSafety(akm akmVar, eia eiaVar) {
        return QuestionToAnswerRequest$$ExternalSyntheticBackport0.m((eiaVar.b & 1) != 0 ? eiaVar.c : "\n", getInferenceRequestsForSafety(akmVar, eiaVar));
    }

    public int getSafetyClassificationMode() {
        return this.safetyClassificationMode;
    }

    public IQuestionToAnswerStreamingCallback getStreamingCallback() {
        return this.streamingCallback;
    }

    public IBinder getStreamingCallbackBinder() {
        IQuestionToAnswerStreamingCallback iQuestionToAnswerStreamingCallback = this.streamingCallback;
        if (iQuestionToAnswerStreamingCallback == null) {
            return null;
        }
        return iQuestionToAnswerStreamingCallback.asBinder();
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

    public boolean hasBundledCallbacks() {
        return (this.streamingCallback == null && this.taskStateChangeCallback == null) ? false : true;
    }

    public boolean hasStreamingCallback() {
        return getStreamingCallback() != null;
    }

    @Override // com.google.android.apps.aicore.aidl.Bundleable
    public void writeToBundle(Bundle bundle, String str) {
        IQuestionToAnswerStreamingCallback iQuestionToAnswerStreamingCallback = this.streamingCallback;
        ITaskStateChangeCallback iTaskStateChangeCallback = this.taskStateChangeCallback;
        this.streamingCallback = null;
        this.taskStateChangeCallback = null;
        Bundleable.CC.writeParcelableToBundle(this, bundle, str);
        this.streamingCallback = iQuestionToAnswerStreamingCallback;
        this.taskStateChangeCallback = iTaskStateChangeCallback;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        QuestionToAnswerRequestParcelableCreator.writeToParcel(this, parcel, i);
    }

    public QuestionToAnswerRequest(String str, String str2, int i, ITaskStateChangeCallback iTaskStateChangeCallback, IQuestionToAnswerStreamingCallback iQuestionToAnswerStreamingCallback, List list, String str3) {
        this.question = str;
        this.memories = str2;
        this.safetyClassificationMode = i;
        this.taskStateChangeCallback = iTaskStateChangeCallback;
        this.streamingCallback = iQuestionToAnswerStreamingCallback;
        this.promptValues = list == null ? null : cxc.o(list);
        this.appendedResult = str3;
    }
}
