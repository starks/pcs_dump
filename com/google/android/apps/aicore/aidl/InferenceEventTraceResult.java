package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.util.Log;
import defpackage.akk;
import defpackage.akl;
import defpackage.bmr;
import defpackage.cxe;
import defpackage.eek;
import defpackage.een;
import defpackage.efb;
import defpackage.efp;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InferenceEventTraceResult extends bmr {
    public static final Parcelable.Creator CREATOR = new InferenceEventTraceResultParcelableCreator();
    private static final String KEY_AUXILIARY_FILE_TYPES = "auxiliaryFileTypes";
    private static final String KEY_CALLING_USER_ID = "callingUserId";
    private static final String KEY_CANNED_RESPONSES_RATIO = "cannedResponsesRatio";
    private static final String KEY_CUSTOMER_ID = "customerId";
    private static final String KEY_FEATURE_ID = "featureId";
    private static final String KEY_FEATURE_TYPE = "featureType";
    private static final String KEY_FEATURE_VARIANT = "featureVariant";
    private static final String KEY_FEATURE_VERSION = "featureVersion";
    private static final String KEY_INFERENCE_API_CALL_HANDLING_LATENCY_MILLIS = "inferenceApiCallHandlingLatencyMillis";
    private static final String KEY_INFERENCE_INPUT_ENCODING_LATENCY_MILLIS = "inferenceInputEncodingLatencyMillis";
    private static final String KEY_INFERENCE_INPUT_SAFETY_CHECK_LATENCY_MILLIS = "inferenceInputSafetyCheckLatencyMillis";
    private static final String KEY_INFERENCE_LATENCY_TOTAL_MILLIS = "inferenceLatencyTotalMillis";
    private static final String KEY_INFERENCE_OUTPUT_SAFETY_CHECK_LATENCY_MILLIS = "inferenceOutputSafetyCheckLatencyMillis";
    private static final String KEY_INFERENCE_OVERALL_OUTPUT_LATENCY_MILLIS = "inferenceOverallOutputLatencyMillis";
    private static final String KEY_INFERENCE_SERVICE_START_LATENCY_MILLIS = "inferenceServiceStartLatencyMillis";
    private static final String KEY_INFERENCE_START_TIMESTAMP_MILLIS = "inferenceStartTimestampMillis";
    private static final String KEY_INFERENCE_STATEFUL_RESUMPTION_COUNT = "inferenceStatefulResumptionCount";
    private static final String KEY_INFERENCE_STATEFUL_SUSPENSION_COUNT = "inferenceStatefulSuspensionCount";
    private static final String KEY_INFERENCE_STATEFUL_SUSPENSION_LATENCY_MILLIS = "inferenceStatefulSuspensionLatencyMillis";
    private static final String KEY_INFERENCE_STATELESS_RESUMPTION_COUNT = "inferenceStatelessResumptionCount";
    private static final String KEY_INFERENCE_STATELESS_SUSPENSION_COUNT = "inferenceStatelessSuspensionCount";
    private static final String KEY_INFERENCE_STATELESS_SUSPENSION_LATENCY_MILLIS = "inferenceStatelessSuspensionLatencyMillis";
    private static final String KEY_INITIAL_QUEUE_POSITION = "initialQueuePosition";
    private static final String KEY_INPUT_SAFETY_CHECK_POLICY_VIOLATION_TYPE = "inputSafetyCheckPolicyViolationType";
    private static final String KEY_INPUT_SAFETY_CHECK_SUGGESTED_ACTION_TYPE = "inputSafetyCheckSuggestedActionType";
    private static final String KEY_INPUT_TOKENS_PER_SECOND = "inputTokensPerSecond";
    private static final String KEY_IS_MODEL_LOADED = "isModelLoaded";
    private static final String KEY_MODEL_INFERENCE_LATENCY_MILLIS = "modelInferenceLatencyMillis";
    private static final String KEY_NUM_DECODE_STEPS = "numDecodeSteps";
    private static final String KEY_NUM_INPUT_TOKENS = "numInputTokens";
    private static final String KEY_NUM_OUTPUT_TOKENS = "numOutputTokens";
    private static final String KEY_NUM_POST_DEDUPED = "numPostDeduped";
    private static final String KEY_NUM_SAMPLES = "numSamples";
    private static final String KEY_NUM_SUFFIX_SCORE_FILTERED = "numSuffixScoreFiltered";
    private static final String KEY_OUTPUT_SAFETY_CHECK_POLICY_VIOLATION_TYPE = "outputSafetyCheckPolicyViolationType";
    private static final String KEY_OUTPUT_SAFETY_CHECK_SUGGESTED_ACTION_TYPE = "outputSafetyCheckSuggestedActionType";
    private static final String KEY_OUTPUT_TOKENS_PER_SECOND = "outputTokensPerSecond";
    private static final String KEY_REQUEST_KIND = "requestKind";
    private static final String KEY_SPECULATIVE_DECODE_STATISTICS = "speculativeDecodeStatistics";
    private static final String KEY_STATUS = "status";
    private static final String KEY_TOP_CANNED_RESPONSE_INDEX = "topCannedResponseIndex";
    private final int[] auxiliaryFileTypes;
    private PersistableBundle cachedBundle;
    private final long callingUserId;
    private final float cannedResponsesRatio;
    private final int customerId;
    private final int featureId;
    private final int featureType;
    private final int featureVariant;
    private final int featureVersion;
    private final long inferenceApiCallHandlingLatencyMillis;
    private final long inferenceInputEncodingLatencyMillis;
    private final long inferenceInputSafetyCheckLatencyMillis;
    private final long inferenceLatencyTotalMillis;
    private final long inferenceOutputSafetyCheckLatencyMillis;
    private final long inferenceOverallOutputLatencyMillis;
    private final long inferenceServiceStartLatencyMillis;
    private final long inferenceStartTimestampMillis;
    private final int inferenceStatefulResumptionCount;
    private final int inferenceStatefulSuspensionCount;
    private final long inferenceStatefulSuspensionLatencyMillis;
    private final int inferenceStatelessResumptionCount;
    private final int inferenceStatelessSuspensionCount;
    private final long inferenceStatelessSuspensionLatencyMillis;
    private final int initialQueuePosition;
    private final int inputSafetyCheckPolicyViolationType;
    private final int inputSafetyCheckSuggestedActionType;
    private final double inputTokensPerSecond;
    private final boolean isModelLoaded;
    private final long modelInferenceLatencyMillis;
    private final int numDecodeSteps;
    private final int numInputTokens;
    private final int numOutputTokens;
    private final int numPostDeduped;
    private final int numSamples;
    private final int numSuffixScoreFiltered;
    private final int outputSafetyCheckPolicyViolationType;
    private final int outputSafetyCheckSuggestedActionType;
    private final double outputTokensPerSecond;
    private final int requestKind;
    private final byte[] speculativeDecodeStatisticsBytes;
    private final int status;
    private final int topCannedResponseIndex;

    /* compiled from: PG */
    public abstract class Builder {
        public abstract InferenceEventTraceResult build();

        public abstract Builder setAuxiliaryFileTypes(int[] iArr);

        public abstract Builder setCallingUserId(long j);

        public abstract Builder setCannedResponsesRatio(float f);

        public abstract Builder setCustomerId(int i);

        public abstract Builder setFeatureId(int i);

        public abstract Builder setFeatureType(int i);

        public abstract Builder setFeatureVariant(int i);

        public abstract Builder setFeatureVersion(int i);

        public abstract Builder setInferenceApiCallHandlingLatencyMillis(long j);

        public abstract Builder setInferenceInputEncodingLatencyMillis(long j);

        public abstract Builder setInferenceInputSafetyCheckLatencyMillis(long j);

        public abstract Builder setInferenceLatencyTotalMillis(long j);

        public abstract Builder setInferenceOutputSafetyCheckLatencyMillis(long j);

        public abstract Builder setInferenceOverallOutputLatencyMillis(long j);

        public abstract Builder setInferenceServiceStartLatencyMillis(long j);

        public abstract Builder setInferenceStartTimestampMillis(long j);

        public abstract Builder setInferenceStatefulResumptionCount(int i);

        public abstract Builder setInferenceStatefulSuspensionCount(int i);

        public abstract Builder setInferenceStatefulSuspensionLatencyMillis(long j);

        public abstract Builder setInferenceStatelessResumptionCount(int i);

        public abstract Builder setInferenceStatelessSuspensionCount(int i);

        public abstract Builder setInferenceStatelessSuspensionLatencyMillis(long j);

        public abstract Builder setInitialQueuePosition(int i);

        public abstract Builder setInputSafetyCheckPolicyViolationType(int i);

        public abstract Builder setInputSafetyCheckSuggestedActionType(int i);

        public abstract Builder setInputTokensPerSecond(double d);

        public abstract Builder setIsModelLoaded(boolean z);

        public abstract Builder setModelInferenceLatencyMillis(long j);

        public abstract Builder setNumDecodeSteps(int i);

        public abstract Builder setNumInputTokens(int i);

        public abstract Builder setNumOutputTokens(int i);

        public abstract Builder setNumPostDeduped(int i);

        public abstract Builder setNumSamples(int i);

        public abstract Builder setNumSuffixScoreFiltered(int i);

        public abstract Builder setOutputSafetyCheckPolicyViolationType(int i);

        public abstract Builder setOutputSafetyCheckSuggestedActionType(int i);

        public abstract Builder setOutputTokensPerSecond(double d);

        public abstract Builder setRequestKind(int i);

        public abstract Builder setSpeculativeDecodeStatisticsBytes(byte[] bArr);

        public abstract Builder setStatus(int i);

        public abstract Builder setTopCannedResponseIndex(int i);
    }

    public InferenceEventTraceResult(int i, int i2, int i3, int i4, long j, int i5, int i6, int i7, long j2, long j3, long j4, long j5, long j6, long j7, int i8, int i9, int i10, int i11, boolean z, int i12, long j8, double d, double d2, int i13, float f, byte[] bArr, int i14, int i15, long j9, long j10, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, long j11, long j12, int[] iArr) {
        this.customerId = i;
        this.callingUserId = j12;
        this.featureType = i2;
        this.featureVariant = i3;
        this.status = i4;
        this.inferenceLatencyTotalMillis = j;
        this.numInputTokens = i5;
        this.numOutputTokens = i6;
        this.numDecodeSteps = i7;
        this.inferenceServiceStartLatencyMillis = j2;
        this.inferenceApiCallHandlingLatencyMillis = j3;
        this.inferenceInputSafetyCheckLatencyMillis = j4;
        this.inferenceInputEncodingLatencyMillis = j5;
        this.inferenceOverallOutputLatencyMillis = j6;
        this.inferenceOutputSafetyCheckLatencyMillis = j7;
        this.inputSafetyCheckPolicyViolationType = i8;
        this.inputSafetyCheckSuggestedActionType = i9;
        this.outputSafetyCheckPolicyViolationType = i10;
        this.outputSafetyCheckSuggestedActionType = i11;
        this.isModelLoaded = z;
        this.featureId = i12;
        this.modelInferenceLatencyMillis = j8;
        this.outputTokensPerSecond = d;
        this.inputTokensPerSecond = d2;
        this.numSamples = i13;
        this.cannedResponsesRatio = f;
        this.speculativeDecodeStatisticsBytes = bArr;
        this.numSuffixScoreFiltered = i14;
        this.numPostDeduped = i15;
        this.inferenceStatefulSuspensionLatencyMillis = j9;
        this.inferenceStatelessSuspensionLatencyMillis = j10;
        this.topCannedResponseIndex = i16;
        this.inferenceStatefulSuspensionCount = i17;
        this.inferenceStatefulResumptionCount = i18;
        this.inferenceStatelessSuspensionCount = i19;
        this.inferenceStatelessResumptionCount = i20;
        this.requestKind = i21;
        this.initialQueuePosition = i22;
        this.featureVersion = i23;
        this.inferenceStartTimestampMillis = j11;
        this.auxiliaryFileTypes = iArr;
    }

    public static Builder builder() {
        return new AutoBuilder_InferenceEventTraceResult_Builder();
    }

    private String parseSerializedSpeculativeDecodeStatisticsProtoToString() {
        akl speculativeDecodeStatistics = getSpeculativeDecodeStatistics();
        StringBuilder sb = new StringBuilder("{drafter_id: ");
        sb.append(speculativeDecodeStatistics.b);
        sb.append(", drafter_time: ");
        eek eekVar = speculativeDecodeStatistics.d;
        if (eekVar == null) {
            eekVar = eek.a;
        }
        sb.append(eekVar.b);
        sb.append(", acceptance_rate: ");
        sb.append(speculativeDecodeStatistics.e);
        sb.append(", drafter_guesses_per_position: ");
        sb.append((String) Collection.EL.stream(speculativeDecodeStatistics.c).map(new Function() { // from class: com.google.android.apps.aicore.aidl.InferenceEventTraceResult$$ExternalSyntheticLambda0
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                akk akkVar = (akk) obj;
                return String.format(Locale.getDefault(), "(%d, %d)", Integer.valueOf(akkVar.b), Integer.valueOf(akkVar.c));
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
        sb.append("}");
        return sb.toString();
    }

    public int[] getAuxiliaryFileTypes() {
        return this.auxiliaryFileTypes;
    }

    public long getCallingUserId() {
        return this.callingUserId;
    }

    public float getCannedResponsesRatio() {
        return this.cannedResponsesRatio;
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public int getFeatureId() {
        return this.featureId;
    }

    public int getFeatureType() {
        return this.featureType;
    }

    public int getFeatureVariant() {
        return this.featureVariant;
    }

    public int getFeatureVersion() {
        return this.featureVersion;
    }

    public long getInferenceApiCallHandlingLatencyMillis() {
        return this.inferenceApiCallHandlingLatencyMillis;
    }

    public long getInferenceInputEncodingLatencyMillis() {
        return this.inferenceInputEncodingLatencyMillis;
    }

    public long getInferenceInputSafetyCheckLatencyMillis() {
        return this.inferenceInputSafetyCheckLatencyMillis;
    }

    public long getInferenceLatencyTotalMillis() {
        return this.inferenceLatencyTotalMillis;
    }

    public long getInferenceOutputSafetyCheckLatencyMillis() {
        return this.inferenceOutputSafetyCheckLatencyMillis;
    }

    public long getInferenceOverallOutputLatencyMillis() {
        return this.inferenceOverallOutputLatencyMillis;
    }

    public long getInferenceServiceStartLatencyMillis() {
        return this.inferenceServiceStartLatencyMillis;
    }

    public long getInferenceStartTimestampMillis() {
        return this.inferenceStartTimestampMillis;
    }

    public int getInferenceStatefulResumptionCount() {
        return this.inferenceStatefulResumptionCount;
    }

    public int getInferenceStatefulSuspensionCount() {
        return this.inferenceStatefulSuspensionCount;
    }

    public long getInferenceStatefulSuspensionLatencyMillis() {
        return this.inferenceStatefulSuspensionLatencyMillis;
    }

    public int getInferenceStatelessResumptionCount() {
        return this.inferenceStatelessResumptionCount;
    }

    public int getInferenceStatelessSuspensionCount() {
        return this.inferenceStatelessSuspensionCount;
    }

    public long getInferenceStatelessSuspensionLatencyMillis() {
        return this.inferenceStatelessSuspensionLatencyMillis;
    }

    public int getInitialQueuePosition() {
        return this.initialQueuePosition;
    }

    public int getInputSafetyCheckPolicyViolationType() {
        return this.inputSafetyCheckPolicyViolationType;
    }

    public int getInputSafetyCheckSuggestedActionType() {
        return this.inputSafetyCheckSuggestedActionType;
    }

    public double getInputTokensPerSecond() {
        return this.inputTokensPerSecond;
    }

    public long getModelInferenceLatencyMillis() {
        return this.modelInferenceLatencyMillis;
    }

    public int getNumDecodeSteps() {
        return this.numDecodeSteps;
    }

    public int getNumInputTokens() {
        return this.numInputTokens;
    }

    public int getNumOutputTokens() {
        return this.numOutputTokens;
    }

    public int getNumPostDeduped() {
        return this.numPostDeduped;
    }

    public int getNumSamples() {
        return this.numSamples;
    }

    public int getNumSuffixScoreFiltered() {
        return this.numSuffixScoreFiltered;
    }

    public int getOutputSafetyCheckPolicyViolationType() {
        return this.outputSafetyCheckPolicyViolationType;
    }

    public int getOutputSafetyCheckSuggestedActionType() {
        return this.outputSafetyCheckSuggestedActionType;
    }

    public double getOutputTokensPerSecond() {
        return this.outputTokensPerSecond;
    }

    public PersistableBundle getPersistableBundle() {
        if (this.cachedBundle == null) {
            PersistableBundle persistableBundle = new PersistableBundle();
            this.cachedBundle = persistableBundle;
            persistableBundle.putInt(KEY_CUSTOMER_ID, this.customerId);
            this.cachedBundle.putLong(KEY_CALLING_USER_ID, this.callingUserId);
            this.cachedBundle.putInt(KEY_FEATURE_TYPE, this.featureType);
            this.cachedBundle.putInt(KEY_FEATURE_VARIANT, this.featureVariant);
            this.cachedBundle.putInt(KEY_STATUS, this.status);
            this.cachedBundle.putLong(KEY_INFERENCE_LATENCY_TOTAL_MILLIS, this.inferenceLatencyTotalMillis);
            this.cachedBundle.putInt(KEY_NUM_INPUT_TOKENS, this.numInputTokens);
            this.cachedBundle.putInt(KEY_NUM_OUTPUT_TOKENS, this.numOutputTokens);
            this.cachedBundle.putInt(KEY_NUM_DECODE_STEPS, this.numDecodeSteps);
            this.cachedBundle.putLong(KEY_INFERENCE_SERVICE_START_LATENCY_MILLIS, this.inferenceServiceStartLatencyMillis);
            this.cachedBundle.putLong(KEY_INFERENCE_API_CALL_HANDLING_LATENCY_MILLIS, this.inferenceApiCallHandlingLatencyMillis);
            this.cachedBundle.putLong(KEY_INFERENCE_INPUT_SAFETY_CHECK_LATENCY_MILLIS, this.inferenceInputSafetyCheckLatencyMillis);
            this.cachedBundle.putLong(KEY_INFERENCE_INPUT_ENCODING_LATENCY_MILLIS, this.inferenceInputEncodingLatencyMillis);
            this.cachedBundle.putLong(KEY_INFERENCE_OVERALL_OUTPUT_LATENCY_MILLIS, this.inferenceOverallOutputLatencyMillis);
            this.cachedBundle.putLong(KEY_INFERENCE_OUTPUT_SAFETY_CHECK_LATENCY_MILLIS, this.inferenceOutputSafetyCheckLatencyMillis);
            this.cachedBundle.putInt(KEY_INPUT_SAFETY_CHECK_POLICY_VIOLATION_TYPE, this.inputSafetyCheckPolicyViolationType);
            this.cachedBundle.putInt(KEY_INPUT_SAFETY_CHECK_SUGGESTED_ACTION_TYPE, this.inputSafetyCheckSuggestedActionType);
            this.cachedBundle.putInt(KEY_OUTPUT_SAFETY_CHECK_POLICY_VIOLATION_TYPE, this.outputSafetyCheckPolicyViolationType);
            this.cachedBundle.putInt(KEY_OUTPUT_SAFETY_CHECK_SUGGESTED_ACTION_TYPE, this.outputSafetyCheckSuggestedActionType);
            this.cachedBundle.putBoolean(KEY_IS_MODEL_LOADED, this.isModelLoaded);
            this.cachedBundle.putInt(KEY_FEATURE_ID, this.featureId);
            this.cachedBundle.putLong(KEY_MODEL_INFERENCE_LATENCY_MILLIS, this.modelInferenceLatencyMillis);
            this.cachedBundle.putDouble(KEY_OUTPUT_TOKENS_PER_SECOND, this.outputTokensPerSecond);
            this.cachedBundle.putDouble(KEY_INPUT_TOKENS_PER_SECOND, this.inputTokensPerSecond);
            this.cachedBundle.putInt(KEY_NUM_SAMPLES, this.numSamples);
            this.cachedBundle.putDouble(KEY_CANNED_RESPONSES_RATIO, this.cannedResponsesRatio);
            this.cachedBundle.putString(KEY_SPECULATIVE_DECODE_STATISTICS, new String(this.speculativeDecodeStatisticsBytes, StandardCharsets.UTF_8));
            this.cachedBundle.putInt(KEY_NUM_SUFFIX_SCORE_FILTERED, this.numSuffixScoreFiltered);
            this.cachedBundle.putInt(KEY_NUM_POST_DEDUPED, this.numPostDeduped);
            this.cachedBundle.putLong(KEY_INFERENCE_STATEFUL_SUSPENSION_LATENCY_MILLIS, this.inferenceStatefulSuspensionLatencyMillis);
            this.cachedBundle.putLong(KEY_INFERENCE_STATELESS_SUSPENSION_LATENCY_MILLIS, this.inferenceStatelessSuspensionLatencyMillis);
            this.cachedBundle.putInt(KEY_TOP_CANNED_RESPONSE_INDEX, this.topCannedResponseIndex);
            this.cachedBundle.putInt(KEY_INFERENCE_STATEFUL_SUSPENSION_COUNT, this.inferenceStatefulSuspensionCount);
            this.cachedBundle.putInt(KEY_INFERENCE_STATEFUL_RESUMPTION_COUNT, this.inferenceStatefulResumptionCount);
            this.cachedBundle.putInt(KEY_INFERENCE_STATELESS_SUSPENSION_COUNT, this.inferenceStatelessSuspensionCount);
            this.cachedBundle.putInt(KEY_INFERENCE_STATELESS_RESUMPTION_COUNT, this.inferenceStatelessResumptionCount);
            this.cachedBundle.putInt(KEY_FEATURE_VERSION, this.featureVersion);
            this.cachedBundle.putLong(KEY_INFERENCE_START_TIMESTAMP_MILLIS, this.inferenceStartTimestampMillis);
            this.cachedBundle.putIntArray(KEY_AUXILIARY_FILE_TYPES, this.auxiliaryFileTypes);
        }
        return this.cachedBundle;
    }

    public int getRequestKind() {
        return this.requestKind;
    }

    public akl getSpeculativeDecodeStatistics() {
        try {
            return (akl) efb.parseFrom(akl.a, this.speculativeDecodeStatisticsBytes, een.a());
        } catch (efp e) {
            Log.e("InferenceEventTraceResult", "Failed to parse SpeculativeDecodeStatistics proto", e);
            return akl.a;
        }
    }

    public byte[] getSpeculativeDecodeStatisticsBytes() {
        return this.speculativeDecodeStatisticsBytes;
    }

    public int getStatus() {
        return this.status;
    }

    public int getTopCannedResponseIndex() {
        return this.topCannedResponseIndex;
    }

    public boolean isModelLoaded() {
        return this.isModelLoaded;
    }

    public String toString() {
        cxe cxeVar = new cxe();
        cxeVar.b(KEY_CUSTOMER_ID, Integer.valueOf(this.customerId));
        return "InferenceEventTraceResult\n".concat(cxeVar.b(KEY_CALLING_USER_ID, Long.valueOf(this.callingUserId)).b(KEY_FEATURE_TYPE, Integer.valueOf(this.featureType)).b(KEY_FEATURE_VARIANT, Integer.valueOf(this.featureVariant)).b(KEY_STATUS, Integer.valueOf(this.status)).b(KEY_INFERENCE_LATENCY_TOTAL_MILLIS, Long.valueOf(this.inferenceLatencyTotalMillis)).b(KEY_NUM_INPUT_TOKENS, Integer.valueOf(this.numInputTokens)).b(KEY_NUM_OUTPUT_TOKENS, Integer.valueOf(this.numOutputTokens)).b(KEY_NUM_DECODE_STEPS, Integer.valueOf(this.numDecodeSteps)).b(KEY_INFERENCE_SERVICE_START_LATENCY_MILLIS, Long.valueOf(this.inferenceServiceStartLatencyMillis)).b(KEY_INFERENCE_API_CALL_HANDLING_LATENCY_MILLIS, Long.valueOf(this.inferenceApiCallHandlingLatencyMillis)).b(KEY_INFERENCE_INPUT_SAFETY_CHECK_LATENCY_MILLIS, Long.valueOf(this.inferenceInputSafetyCheckLatencyMillis)).b(KEY_INFERENCE_INPUT_ENCODING_LATENCY_MILLIS, Long.valueOf(this.inferenceInputEncodingLatencyMillis)).b(KEY_INFERENCE_OVERALL_OUTPUT_LATENCY_MILLIS, Long.valueOf(this.inferenceOverallOutputLatencyMillis)).b(KEY_INFERENCE_OUTPUT_SAFETY_CHECK_LATENCY_MILLIS, Long.valueOf(this.inferenceOutputSafetyCheckLatencyMillis)).b(KEY_INPUT_SAFETY_CHECK_POLICY_VIOLATION_TYPE, Integer.valueOf(this.inputSafetyCheckPolicyViolationType)).b(KEY_INPUT_SAFETY_CHECK_SUGGESTED_ACTION_TYPE, Integer.valueOf(this.inputSafetyCheckSuggestedActionType)).b(KEY_OUTPUT_SAFETY_CHECK_POLICY_VIOLATION_TYPE, Integer.valueOf(this.outputSafetyCheckPolicyViolationType)).b(KEY_OUTPUT_SAFETY_CHECK_SUGGESTED_ACTION_TYPE, Integer.valueOf(this.outputSafetyCheckSuggestedActionType)).b(KEY_IS_MODEL_LOADED, Boolean.valueOf(this.isModelLoaded)).b(KEY_FEATURE_ID, Integer.valueOf(this.featureId)).b(KEY_FEATURE_VERSION, Integer.valueOf(this.featureVersion)).b(KEY_MODEL_INFERENCE_LATENCY_MILLIS, Long.valueOf(this.modelInferenceLatencyMillis)).b(KEY_OUTPUT_TOKENS_PER_SECOND, Double.valueOf(this.outputTokensPerSecond)).b(KEY_INPUT_TOKENS_PER_SECOND, Double.valueOf(this.inputTokensPerSecond)).b(KEY_NUM_SAMPLES, Integer.valueOf(this.numSamples)).b(KEY_CANNED_RESPONSES_RATIO, Float.valueOf(this.cannedResponsesRatio)).b(KEY_SPECULATIVE_DECODE_STATISTICS, parseSerializedSpeculativeDecodeStatisticsProtoToString()).b(KEY_NUM_SUFFIX_SCORE_FILTERED, Integer.valueOf(this.numSuffixScoreFiltered)).b(KEY_NUM_POST_DEDUPED, Integer.valueOf(this.numPostDeduped)).b(KEY_INFERENCE_STATEFUL_SUSPENSION_LATENCY_MILLIS, Long.valueOf(this.inferenceStatefulSuspensionLatencyMillis)).b(KEY_INFERENCE_STATELESS_SUSPENSION_LATENCY_MILLIS, Long.valueOf(this.inferenceStatelessSuspensionLatencyMillis)).b(KEY_TOP_CANNED_RESPONSE_INDEX, Integer.valueOf(this.topCannedResponseIndex)).b(KEY_INFERENCE_STATEFUL_SUSPENSION_COUNT, Integer.valueOf(this.inferenceStatefulSuspensionCount)).b(KEY_INFERENCE_STATEFUL_RESUMPTION_COUNT, Integer.valueOf(this.inferenceStatefulResumptionCount)).b(KEY_INFERENCE_STATELESS_SUSPENSION_COUNT, Integer.valueOf(this.inferenceStatelessSuspensionCount)).b(KEY_INFERENCE_STATELESS_RESUMPTION_COUNT, Integer.valueOf(this.inferenceStatelessResumptionCount)).b(KEY_REQUEST_KIND, Integer.valueOf(this.requestKind)).b(KEY_INITIAL_QUEUE_POSITION, Integer.valueOf(this.initialQueuePosition)).b(KEY_INFERENCE_START_TIMESTAMP_MILLIS, Long.valueOf(this.inferenceStartTimestampMillis)).b(KEY_AUXILIARY_FILE_TYPES, this.auxiliaryFileTypes).e().toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        InferenceEventTraceResultParcelableCreator.writeToParcel(this, parcel, i);
    }

    public InferenceEventTraceResult(PersistableBundle persistableBundle) {
        this.customerId = persistableBundle.getInt(KEY_CUSTOMER_ID);
        this.callingUserId = persistableBundle.getLong(KEY_CALLING_USER_ID);
        this.featureType = persistableBundle.getInt(KEY_FEATURE_TYPE);
        this.featureVariant = persistableBundle.getInt(KEY_FEATURE_VARIANT);
        this.status = persistableBundle.getInt(KEY_STATUS);
        this.inferenceLatencyTotalMillis = persistableBundle.getLong(KEY_INFERENCE_LATENCY_TOTAL_MILLIS);
        this.numInputTokens = persistableBundle.getInt(KEY_NUM_INPUT_TOKENS);
        this.numOutputTokens = persistableBundle.getInt(KEY_NUM_OUTPUT_TOKENS);
        this.numDecodeSteps = persistableBundle.getInt(KEY_NUM_DECODE_STEPS);
        this.inferenceServiceStartLatencyMillis = persistableBundle.getLong(KEY_INFERENCE_SERVICE_START_LATENCY_MILLIS);
        this.inferenceApiCallHandlingLatencyMillis = persistableBundle.getLong(KEY_INFERENCE_API_CALL_HANDLING_LATENCY_MILLIS);
        this.inferenceInputSafetyCheckLatencyMillis = persistableBundle.getLong(KEY_INFERENCE_INPUT_SAFETY_CHECK_LATENCY_MILLIS);
        this.inferenceInputEncodingLatencyMillis = persistableBundle.getLong(KEY_INFERENCE_INPUT_ENCODING_LATENCY_MILLIS);
        this.inferenceOverallOutputLatencyMillis = persistableBundle.getLong(KEY_INFERENCE_OVERALL_OUTPUT_LATENCY_MILLIS);
        this.inferenceOutputSafetyCheckLatencyMillis = persistableBundle.getLong(KEY_INFERENCE_OUTPUT_SAFETY_CHECK_LATENCY_MILLIS);
        this.inputSafetyCheckPolicyViolationType = persistableBundle.getInt(KEY_INPUT_SAFETY_CHECK_POLICY_VIOLATION_TYPE);
        this.inputSafetyCheckSuggestedActionType = persistableBundle.getInt(KEY_INPUT_SAFETY_CHECK_SUGGESTED_ACTION_TYPE);
        this.outputSafetyCheckPolicyViolationType = persistableBundle.getInt(KEY_OUTPUT_SAFETY_CHECK_POLICY_VIOLATION_TYPE);
        this.outputSafetyCheckSuggestedActionType = persistableBundle.getInt(KEY_OUTPUT_SAFETY_CHECK_SUGGESTED_ACTION_TYPE);
        this.isModelLoaded = persistableBundle.getBoolean(KEY_IS_MODEL_LOADED);
        this.featureId = persistableBundle.getInt(KEY_FEATURE_ID);
        this.modelInferenceLatencyMillis = persistableBundle.getLong(KEY_MODEL_INFERENCE_LATENCY_MILLIS);
        this.outputTokensPerSecond = persistableBundle.getDouble(KEY_OUTPUT_TOKENS_PER_SECOND);
        this.inputTokensPerSecond = persistableBundle.getDouble(KEY_INPUT_TOKENS_PER_SECOND);
        this.numSamples = persistableBundle.getInt(KEY_NUM_SAMPLES);
        this.cannedResponsesRatio = (float) persistableBundle.getDouble(KEY_CANNED_RESPONSES_RATIO);
        String string = persistableBundle.getString(KEY_SPECULATIVE_DECODE_STATISTICS);
        string.getClass();
        this.speculativeDecodeStatisticsBytes = string.getBytes(StandardCharsets.UTF_8);
        this.numSuffixScoreFiltered = persistableBundle.getInt(KEY_NUM_SUFFIX_SCORE_FILTERED);
        this.numPostDeduped = persistableBundle.getInt(KEY_NUM_POST_DEDUPED);
        this.inferenceStatefulSuspensionLatencyMillis = persistableBundle.getLong(KEY_INFERENCE_STATEFUL_SUSPENSION_LATENCY_MILLIS);
        this.inferenceStatelessSuspensionLatencyMillis = persistableBundle.getLong(KEY_INFERENCE_STATELESS_SUSPENSION_LATENCY_MILLIS);
        this.topCannedResponseIndex = persistableBundle.getInt(KEY_TOP_CANNED_RESPONSE_INDEX);
        this.inferenceStatefulSuspensionCount = persistableBundle.getInt(KEY_INFERENCE_STATEFUL_SUSPENSION_COUNT);
        this.inferenceStatefulResumptionCount = persistableBundle.getInt(KEY_INFERENCE_STATEFUL_RESUMPTION_COUNT);
        this.inferenceStatelessSuspensionCount = persistableBundle.getInt(KEY_INFERENCE_STATELESS_SUSPENSION_COUNT);
        this.inferenceStatelessResumptionCount = persistableBundle.getInt(KEY_INFERENCE_STATELESS_RESUMPTION_COUNT);
        this.requestKind = persistableBundle.getInt(KEY_REQUEST_KIND);
        this.initialQueuePosition = persistableBundle.getInt(KEY_INITIAL_QUEUE_POSITION);
        this.featureVersion = persistableBundle.getInt(KEY_FEATURE_VERSION);
        this.inferenceStartTimestampMillis = persistableBundle.getLong(KEY_INFERENCE_START_TIMESTAMP_MILLIS);
        int[] intArray = persistableBundle.getIntArray(KEY_AUXILIARY_FILE_TYPES);
        intArray.getClass();
        this.auxiliaryFileTypes = intArray;
    }
}
