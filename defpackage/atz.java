package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atz implements Function {
    private final /* synthetic */ int a;

    public atz(int i) {
        this.a = i;
    }

    public static aji a(atd atdVar) {
        asr asrVar = (asr) aji.a.createBuilder();
        if ((atdVar.b & 1) != 0) {
            long j = atdVar.c;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            aji ajiVar = (aji) asrVar.a;
            ajiVar.b |= 1;
            ajiVar.c = j;
        }
        if ((atdVar.b & 2) != 0) {
            long j2 = atdVar.d;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            aji ajiVar2 = (aji) asrVar.a;
            ajiVar2.b |= 2;
            ajiVar2.d = j2;
        }
        if ((atdVar.b & 4) != 0) {
            long j3 = atdVar.e;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            aji ajiVar3 = (aji) asrVar.a;
            ajiVar3.b |= 4;
            ajiVar3.e = j3;
        }
        return (aji) asrVar.z();
    }

    public static atl b(dyw dywVar) {
        switch (dywVar.ordinal()) {
            case 0:
                return atl.HISTOGRAM_COUNTER_UNDEFINED;
            case 1:
                return atl.TRAINING_RUN_PHASE_LATENCY;
            case 2:
                return atl.TRAINING_RUN_PHASE_END_TIME;
            case 3:
                return atl.TRAINING_RESTORE_STATE_LATENCY;
            case 4:
                return atl.TRAINING_RUN_CLIENT_EXECUTION_LATENCY;
            case 5:
                return atl.TRAINING_INIT_OP_LATENCY;
            case 6:
                return atl.TRAINING_BEFORE_OP_LATENCY;
            case 7:
                return atl.TRAINING_AFTER_OP_LATENCY;
            case 8:
                return atl.TRAINING_RUN_EPOCH_LATENCY;
            case 9:
                return atl.TRAINING_GATHER_MINI_BATCH_LATENCY;
            case 10:
                return atl.TRAINING_RUN_MINI_BATCH_LATENCY;
            case 11:
                return atl.TRAINING_INTERRUPT_TERMINATION_LATENCY;
            case 12:
                return atl.TRAINING_OPSTATS_COMMIT_LATENCY;
            case 13:
                return atl.TRAINING_OVERALL_EXAMPLE_COUNT;
            case 14:
                return atl.TRAINING_OVERALL_EXAMPLE_SIZE;
            case 15:
                return atl.TRAINING_CLIENT_EXECUTION_EXAMPLE_COUNT;
            case 16:
                return atl.TRAINING_CLIENT_EXECUTION_EXAMPLE_SIZE;
            case 17:
                return atl.TRAINING_EPOCH_EXAMPLE_COUNT;
            case 18:
                return atl.TRAINING_EPOCH_EXAMPLE_SIZE;
            case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                return atl.TRAINING_MINI_BATCH_EXAMPLE_COUNT;
            case 20:
                return atl.TRAINING_MINI_BATCH_EXAMPLE_SIZE;
            case 21:
                return atl.OPSTATS_DB_SIZE_BYTES;
            case 22:
                return atl.OPSTATS_DB_NUM_ENTRIES;
            case 23:
                return atl.OPSTATS_NUM_PRUNED_ENTRIES;
            case 24:
                return atl.OPSTATS_OLDEST_PRUNED_ENTRY_TENURE_HOURS;
            case 25:
                return atl.TRAINING_FL_CHECKIN_LATENCY;
            case 26:
                return atl.TRAINING_FL_REPORT_RESULTS_END_TIME;
            case 27:
                return atl.TRAINING_FL_REPORT_RESULTS_LATENCY;
            case 28:
                return atl.TRAINING_FL_CHECKIN_END_TIME;
            case 29:
                return atl.TRAINING_FL_ELIGIBILITY_EVAL_CHECKIN_LATENCY;
            case 30:
                return atl.TRAINING_FL_MULTIPLE_TASK_ASSIGNMENTS_END_TIME;
            case 31:
                return atl.TRAINING_FL_MULTIPLE_TASK_ASSIGNMENTS_LATENCY;
            case 32:
                return atl.TRAINING_FL_ROUND_SEPARATION;
            case 33:
                return atl.HISTOGRAM_COUNTER_UNDEFINED;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(dywVar))));
        }
    }

    public static atl c(bqk bqkVar) {
        switch (bqkVar) {
            case EXAMPLE_STORE_ITERATOR_NEXT_LATENCY:
                return atl.EXAMPLE_STORE_ITERATOR_NEXT_LATENCY;
            case EXAMPLE_STORE_ITERATOR_OVERALL_EXAMPLE_COUNT:
                return atl.EXAMPLE_STORE_ITERATOR_OVERALL_EXAMPLE_COUNT;
            case EXAMPLE_STORE_ITERATOR_OVERALL_EXAMPLE_SIZE:
                return atl.EXAMPLE_STORE_ITERATOR_OVERALL_EXAMPLE_SIZE;
            case EXAMPLE_STORE_ITERATOR_OVERALL_LATENCY:
                return atl.EXAMPLE_STORE_ITERATOR_OVERALL_LATENCY;
            case EXAMPLE_STORE_ITERATOR_OVERALL_IPC_LATENCY:
                return atl.EXAMPLE_STORE_ITERATOR_OVERALL_IPC_LATENCY;
            case EXAMPLE_STORE_ITERATOR_OVERALL_PROXY_LATENCY:
                return atl.EXAMPLE_STORE_ITERATOR_OVERALL_PROXY_LATENCY;
            case EXAMPLE_STORE_ITERATOR_OVERALL_CLIENT_LATENCY:
                return atl.EXAMPLE_STORE_ITERATOR_OVERALL_CLIENT_LATENCY;
            case EXAMPLE_STORE_ERROR_COUNT:
                return atl.EXAMPLE_STORE_ERROR_COUNT;
            case TRAINING_SYSTEM_TOTAL_MEM:
                return atl.TRAINING_SYSTEM_TOTAL_MEM;
            case TRAINING_SYSTEM_AVAILABLE_MEM:
                return atl.TRAINING_SYSTEM_AVAILABLE_MEM;
            case TRAINING_SYSTEM_LOW_MEM_THRESHOLD:
                return atl.TRAINING_SYSTEM_LOW_MEM_THRESHOLD;
            case TRAINING_SYSTEM_AVAILABLE_MEM_BEFORE_THRESHOLD:
                return atl.TRAINING_SYSTEM_AVAILABLE_MEM_BEFORE_THRESHOLD;
            case TRAINING_SYSTEM_LOW_MEM_STATE:
                return atl.TRAINING_SYSTEM_LOW_MEM_STATE;
            case TRAINING_PROCESS_MEM_IMPORTANCE_STATE:
                return atl.TRAINING_PROCESS_MEM_IMPORTANCE_STATE;
            case TRAINING_PROCESS_MEM_LRU_STATE:
                return atl.TRAINING_PROCESS_MEM_LRU_STATE;
            case TRAINING_PROCESS_MEM_USAGE_JAVA_HEAP:
                return atl.TRAINING_PROCESS_MEM_USAGE_JAVA_HEAP;
            case TRAINING_PROCESS_MEM_USAGE_NATIVE_PSS:
                return atl.TRAINING_PROCESS_MEM_USAGE_NATIVE_PSS;
            case TRAINING_PROCESS_STOP_REASON:
                return atl.TRAINING_PROCESS_STOP_REASON;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(bqkVar))));
        }
    }

    public static atl d(bql bqlVar) {
        int iOrdinal = bqlVar.ordinal();
        if (iOrdinal == 0) {
            return atl.TRAINING_OVERALL_LATENCY;
        }
        if (iOrdinal == 1) {
            return atl.TRAINING_SAVE_CHECKPOINT_LATENCY;
        }
        if (iOrdinal == 2) {
            return atl.EXAMPLE_STORE_START_QUERY_LATENCY;
        }
        if (iOrdinal == 3) {
            return atl.EXAMPLE_STORE_ITERATOR_CLOSE_LATENCY;
        }
        if (iOrdinal == 4) {
            return atl.HTTP_CLIENT_INITIALIZATION_LATENCY;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(bqlVar))));
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.a) {
            case 0:
                atj atjVar = (atj) obj;
                int iOrdinal = atjVar.ordinal();
                if (iOrdinal == 0) {
                    return eie.COLLECTION_NAME_UNDEFINED;
                }
                if (iOrdinal == 1) {
                    return eie.COLLECTION_NAME_SIMPLESTORAGE;
                }
                if (iOrdinal == 2) {
                    return eie.COLLECTION_NAME_ODAD;
                }
                if (iOrdinal == 3) {
                    return eie.COLLECTION_NAME_STATSD;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(atjVar))));
            case 1:
                return a((atd) obj);
            case 2:
                atg atgVar = (atg) obj;
                int iOrdinal2 = atgVar.ordinal();
                if (iOrdinal2 == 0) {
                    return ajl.UNKNOWN_TYPE;
                }
                if (iOrdinal2 == 1) {
                    return ajl.FC_CHECK_IN;
                }
                if (iOrdinal2 == 2) {
                    return ajl.FC_TRAINING_START_QUERY;
                }
                if (iOrdinal2 == 3) {
                    return ajl.FC_TRAINING_RESULT_UPLOAD;
                }
                if (iOrdinal2 == 4) {
                    return ajl.HTTP;
                }
                if (iOrdinal2 == 5) {
                    return ajl.PIR;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(atgVar))));
            case 3:
                atk atkVar = (atk) obj;
                switch (atkVar.ordinal()) {
                    case 0:
                        return eio.UNKNOWN_COUNT;
                    case 1:
                        return eio.PCS_HTTP_DOWNLOAD_SUCCESS;
                    case 2:
                        return eio.PCS_HTTP_DOWNLOAD_FAILURE;
                    case 3:
                        return eio.PCS_INPROCESS_HTTP_DOWNLOAD_SUCCESS;
                    case 4:
                        return eio.PCS_INPROCESS_HTTP_DOWNLOAD_FAILURE;
                    case 5:
                        return eio.PCS_PIR_DOWNLOAD_SUCCESS;
                    case 6:
                        return eio.PCS_PIR_DOWNLOAD_FAILURE;
                    case 7:
                        return eio.PCS_INPROCESS_PIR_DOWNLOAD_SUCCESS;
                    case 8:
                        return eio.PCS_INPROCESS_PIR_DOWNLOAD_FAILURE;
                    case 9:
                        return eio.PCC_SETTINGS_OPENED;
                    case 10:
                        return eio.PCS_NETWORK_USAGE_LOG_ACTIVITY_ENABLED;
                    case 11:
                        return eio.PCS_NETWORK_USAGE_LOG_OPTED_OUT;
                    case 12:
                        return eio.PCS_NETWORK_USAGE_LOG_OPTED_IN;
                    case 13:
                        return eio.PCS_NETWORK_USAGE_LOG_OPENED;
                    case 14:
                        return eio.PCS_NETWORK_USAGE_LOG_ITEM_INSPECTED;
                    case 15:
                        return eio.PCS_NETWORK_USAGE_LOG_NO_ITEM_INSPECTED;
                    case 16:
                        return eio.PCS_NETWORK_USAGE_LOG_POLICY_INSPECTED;
                    case 17:
                        return eio.PCS_NETWORK_USAGE_LOG_UNRECOGNISED_REQUEST;
                    case 18:
                        return eio.PCC_ATTESTATION_MEASUREMENT_REQUEST;
                    case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                        return eio.PCC_ATTESTATION_RECORD_GENERATED;
                    case 20:
                        return eio.PCS_TRAINING_STATS_UNAVAILABLE_EXCEPTION;
                    case 21:
                        return eio.PCS_TRAINING_STATS_QUERY_EXCEPTION;
                    case 22:
                        return eio.PCS_TRAINING_STATS_QUERY_SUCCESS;
                    case 23:
                        return eio.PCS_TRAINING_STATS_ATTEMPTED;
                    case 24:
                        return eio.PCS_TRAINING_STATS_EXCEPTION_NO_CONFIGS_FOUND;
                    case 25:
                        return eio.PCS_TRAINING_STATS_EXCEPTION_NO_MATCHING_RESTRICTED_CONFIGS;
                    case 26:
                        return eio.PCS_TRAINING_STATS_EXCEPTION_AMBIGUOUS_CONFIG_KEY;
                    case 27:
                        return eio.PCS_TRAINING_STATS_EXCEPTION_INCONSISTENT_ROW_SIZES;
                    case 28:
                        return eio.PCS_TRAINING_STATS_EXCEPTION_UNKNOWN;
                    case 29:
                        return eio.PCS_TRAINING_BINDER_DIED;
                    case 30:
                        return eio.PCS_TRAINING_BINDER_NULL;
                    case 31:
                        return eio.PCS_TRAINING_BINDER_SERVICE_DISCONNECTED;
                    case 32:
                        return eio.PCS_TRAINING_BINDER_SERVICE_CONNECTED;
                    default:
                        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(atkVar))));
                }
            case 4:
                return b((dyw) obj);
            case 5:
                return c((bqk) obj);
            case 6:
                atm atmVar = (atm) obj;
                int iOrdinal3 = atmVar.ordinal();
                if (iOrdinal3 == 0) {
                    return eig.UNDEFINED_CRYPTO_OPERATION;
                }
                if (iOrdinal3 == 1) {
                    return eig.SHAMIR_SHARING;
                }
                if (iOrdinal3 == 2) {
                    return eig.KEY_AGREEMENT;
                }
                if (iOrdinal3 == 3) {
                    return eig.AES_ENCRYPTION;
                }
                if (iOrdinal3 == 4) {
                    return eig.AES_DECRYPTION;
                }
                if (iOrdinal3 == 5) {
                    return eig.PRG_EXPANSION;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(atmVar))));
            case 7:
                atn atnVar = (atn) obj;
                switch (atnVar) {
                    case CLIENT_UNDEFINED_ERROR:
                        return eih.CLIENT_UNDEFINED_ERROR;
                    case CLIENT_ERROR_SERVER_INITIATED_ABORT:
                        return eih.CLIENT_ERROR_SERVER_INITIATED_ABORT;
                    case CLIENT_ERROR_ENVIRONMENT_INITIATED_ABORT:
                        return eih.CLIENT_ERROR_ENVIRONMENT_INITIATED_ABORT;
                    case CLIENT_INVALID_MESSAGE_RECEIVED:
                        return eih.CLIENT_INVALID_MESSAGE_RECEIVED;
                    case CLIENT_INVALID_INPUT_VECTOR:
                        return eih.CLIENT_INVALID_INPUT_VECTOR;
                    case CLIENT_SECURITY_ERROR:
                        return eih.CLIENT_SECURITY_ERROR;
                    case CLIENT_INTERNAL_ERROR:
                        return eih.CLIENT_INTERNAL_ERROR;
                    case CLIENT_INTERNAL_ERROR_RUNTIME_EXC:
                        return eih.CLIENT_INTERNAL_ERROR_RUNTIME_EXC;
                    default:
                        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(atnVar))));
                }
            case 8:
                ato atoVar = (ato) obj;
                switch (atoVar) {
                    case CLIENT_UNDEFINED_EVENT:
                        return eii.CLIENT_UNDEFINED_EVENT;
                    case CLIENT_STARTED:
                        return eii.CLIENT_STARTED;
                    case CLIENT_COMPLETED:
                        return eii.CLIENT_COMPLETED;
                    case CLIENT_ROUND_STARTED:
                        return eii.CLIENT_ROUND_STARTED;
                    case CLIENT_ROUND_COMPLETED:
                        return eii.CLIENT_ROUND_COMPLETED;
                    case CLIENT_CRYPTO_STARTED:
                        return eii.CLIENT_CRYPTO_STARTED;
                    case CLIENT_CRYPTO_COMPLETED:
                        return eii.CLIENT_CRYPTO_COMPLETED;
                    case CLIENT_INPUT_SET:
                        return eii.CLIENT_INPUT_SET;
                    case CLIENT_ERROR:
                        return eii.CLIENT_ERROR;
                    case CLIENT_CRYPTO_ERROR:
                        return eii.CLIENT_CRYPTO_ERROR;
                    default:
                        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(atoVar))));
                }
            case 9:
                atp atpVar = (atp) obj;
                switch (atpVar) {
                    case CLIENT_UNDEFINED_ROUND:
                        return eij.CLIENT_UNDEFINED_ROUND;
                    case CLIENT_ADVERTISE_KEYS:
                        return eij.CLIENT_ADVERTISE_KEYS;
                    case CLIENT_SHARE_KEYS:
                        return eij.CLIENT_SHARE_KEYS;
                    case CLIENT_MASKED_INPUT_COLLECTION:
                        return eij.CLIENT_MASKED_INPUT_COLLECTION;
                    case CLIENT_UNMASKING:
                        return eij.CLIENT_UNMASKING;
                    case CLIENT_PROTOCOL_COMPLETED:
                        return eij.CLIENT_PROTOCOL_COMPLETED;
                    case CLIENT_ABORTED:
                        return eij.CLIENT_ABORTED;
                    default:
                        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(atpVar))));
                }
            case 10:
                return d((bql) obj);
            case 11:
                atq atqVar = (atq) obj;
                int iOrdinal4 = atqVar.ordinal();
                if (iOrdinal4 == 0) {
                    return eik.TRAINING_DATA_SOURCE_UNDEFINED;
                }
                if (iOrdinal4 == 1) {
                    return eik.FEED;
                }
                if (iOrdinal4 == 2) {
                    return eik.DATASET;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(atqVar))));
            case 12:
                atr atrVar = (atr) obj;
                int iOrdinal5 = atrVar.ordinal();
                if (iOrdinal5 == 0) {
                    return eil.TRAIN_ERROR_DEFAULT;
                }
                if (iOrdinal5 == 1) {
                    return eil.TRAIN_ERROR_TENSORFLOW;
                }
                if (iOrdinal5 == 2) {
                    return eil.TRAIN_ERROR_LOCAL_IO;
                }
                if (iOrdinal5 == 3) {
                    return eil.TRAIN_ERROR_EXAMPLE_SELECTOR;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(atrVar))));
            default:
                att attVar = (att) obj;
                switch (attVar.ordinal()) {
                    case 0:
                        return eip.UNKNOWN_VALUE;
                    case 1:
                        return eip.PCS_STATSMANAGER_QUERY_SUCCESS_LATENCY_MS;
                    case 2:
                        return eip.PCS_STATSMANAGER_QUERY_FAILURE_LATENCY_MS;
                    case 3:
                        return eip.PCS_NUM_JOBS_SCHEDULED_COUNT;
                    case 4:
                        return eip.NOW_PLAYING_POPULATION_SCHEDULED_COUNT;
                    case 5:
                        return eip.NEXT_CONVERSATION_POPULATION_SCHEDULED_COUNT;
                    case 6:
                        return eip.SAFE_COMMS_POPULATION_SCHEDULED_COUNT;
                    case 7:
                        return eip.AUTOFILL_POPULATION_SCHEDULED_COUNT;
                    case 8:
                        return eip.CONTENT_CAPTURE_POPULATION_SCHEDULED_COUNT;
                    case 9:
                        return eip.ECHO_POPULATION_SCHEDULED_COUNT;
                    case 10:
                        return eip.OVERVIEW_POPULATION_SCHEDULED_COUNT;
                    case 11:
                        return eip.LIVE_TRANSLATE_POPULATION_SCHEDULED_COUNT;
                    case 12:
                        return eip.TOAST_SEARCH_POPULATION_SCHEDULED_COUNT;
                    case 13:
                        return eip.TOAST_QUERY_POPULATION_SCHEDULED_COUNT;
                    case 14:
                        return eip.AMBIENT_CONTEXT_POPULATION_SCHEDULED_COUNT;
                    case 15:
                        return eip.PECAN_POPULATION_SCHEDULED_COUNT;
                    case 16:
                        return eip.PLAY_PROTECTION_POPULATION_SCHEDULED_COUNT;
                    case 17:
                        return eip.PLATFORM_LOGGING_POPULATION_SCHEDULED_COUNT;
                    case 18:
                        return eip.SMARTSELECT_POPULATION_SCHEDULED_COUNT;
                    case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                        return eip.UNKNOWN_POPULATION_SCHEDULED_COUNT;
                    default:
                        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(attVar))));
                }
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public atz(byte[] bArr, int i) {
        this(0);
        this.a = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public atz(byte[] bArr, int i, byte[] bArr2) {
        this(1);
        this.a = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public atz(byte[] bArr, int i, char[] cArr) {
        this(2);
        this.a = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public atz(byte[] bArr, int i, float[] fArr) {
        this(6);
        this.a = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public atz(byte[] bArr, int i, short[] sArr) {
        this(3);
        this.a = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public atz(byte[] bArr, int i, byte[][] bArr2) {
        this(7);
        this.a = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public atz(byte[] bArr, int i, char[][] cArr) {
        this(8);
        this.a = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public atz(byte[] bArr, int i, float[][] fArr) {
        this(12);
        this.a = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public atz(byte[] bArr, int i, short[][] sArr) {
        this(9);
        this.a = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public atz(byte[] bArr, int i, boolean[][] zArr) {
        this(11);
        this.a = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public atz(byte[] bArr, int i, byte[][][] bArr2) {
        this(13);
        this.a = i;
    }
}
