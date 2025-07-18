package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aua implements Function {
    public aua() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        atl atlVar = (atl) obj;
        switch (atlVar.ordinal()) {
            case 0:
                return eif.HISTOGRAM_COUNTER_UNDEFINED;
            case 1:
                return eif.TRAINING_RUN_PHASE_LATENCY;
            case 2:
                return eif.TRAINING_RUN_PHASE_END_TIME;
            case 3:
                return eif.TRAINING_RESTORE_STATE_LATENCY;
            case 4:
                return eif.TRAINING_RUN_CLIENT_EXECUTION_LATENCY;
            case 5:
                return eif.TRAINING_INIT_OP_LATENCY;
            case 6:
                return eif.TRAINING_BEFORE_OP_LATENCY;
            case 7:
                return eif.TRAINING_AFTER_OP_LATENCY;
            case 8:
                return eif.TRAINING_RUN_EPOCH_LATENCY;
            case 9:
                return eif.TRAINING_GATHER_MINI_BATCH_LATENCY;
            case 10:
                return eif.TRAINING_RUN_MINI_BATCH_LATENCY;
            case 11:
                return eif.TRAINING_INTERRUPT_TERMINATION_LATENCY;
            case 12:
                return eif.TRAINING_OPSTATS_COMMIT_LATENCY;
            case 13:
                return eif.EXAMPLE_STORE_ITERATOR_NEXT_LATENCY;
            case 14:
                return eif.EXAMPLE_STORE_ITERATOR_OVERALL_EXAMPLE_COUNT;
            case 15:
                return eif.EXAMPLE_STORE_ITERATOR_OVERALL_EXAMPLE_SIZE;
            case 16:
                return eif.EXAMPLE_STORE_ITERATOR_OVERALL_LATENCY;
            case 17:
                return eif.EXAMPLE_STORE_ITERATOR_OVERALL_IPC_LATENCY;
            case 18:
                return eif.EXAMPLE_STORE_ITERATOR_OVERALL_PROXY_LATENCY;
            case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                return eif.EXAMPLE_STORE_ITERATOR_OVERALL_CLIENT_LATENCY;
            case 20:
                return eif.EXAMPLE_STORE_ERROR_COUNT;
            case 21:
                return eif.TRAINING_SYSTEM_TOTAL_MEM;
            case 22:
                return eif.TRAINING_SYSTEM_AVAILABLE_MEM;
            case 23:
                return eif.TRAINING_SYSTEM_LOW_MEM_THRESHOLD;
            case 24:
                return eif.TRAINING_SYSTEM_AVAILABLE_MEM_BEFORE_THRESHOLD;
            case 25:
                return eif.TRAINING_SYSTEM_LOW_MEM_STATE;
            case 26:
                return eif.TRAINING_PROCESS_MEM_IMPORTANCE_STATE;
            case 27:
                return eif.TRAINING_PROCESS_MEM_LRU_STATE;
            case 28:
                return eif.TRAINING_PROCESS_MEM_USAGE_JAVA_HEAP;
            case 29:
                return eif.TRAINING_PROCESS_MEM_USAGE_NATIVE_PSS;
            case 30:
                return eif.TRAINING_PROCESS_STOP_REASON;
            case 31:
                return eif.TRAINING_OVERALL_LATENCY;
            case 32:
                return eif.TRAINING_SAVE_CHECKPOINT_LATENCY;
            case 33:
                return eif.EXAMPLE_STORE_START_QUERY_LATENCY;
            case 34:
                return eif.EXAMPLE_STORE_ITERATOR_CLOSE_LATENCY;
            case 35:
                return eif.HTTP_CLIENT_INITIALIZATION_LATENCY;
            case 36:
                return eif.TRAINING_OVERALL_EXAMPLE_COUNT;
            case 37:
                return eif.TRAINING_OVERALL_EXAMPLE_SIZE;
            case 38:
                return eif.TRAINING_CLIENT_EXECUTION_EXAMPLE_COUNT;
            case 39:
                return eif.TRAINING_CLIENT_EXECUTION_EXAMPLE_SIZE;
            case 40:
                return eif.TRAINING_EPOCH_EXAMPLE_COUNT;
            case 41:
                return eif.TRAINING_EPOCH_EXAMPLE_SIZE;
            case 42:
                return eif.TRAINING_MINI_BATCH_EXAMPLE_COUNT;
            case 43:
                return eif.TRAINING_MINI_BATCH_EXAMPLE_SIZE;
            case 44:
                return eif.OPSTATS_DB_SIZE_BYTES;
            case 45:
                return eif.OPSTATS_DB_NUM_ENTRIES;
            case 46:
                return eif.OPSTATS_NUM_PRUNED_ENTRIES;
            case 47:
                return eif.OPSTATS_OLDEST_PRUNED_ENTRY_TENURE_HOURS;
            case 48:
                return eif.TRAINING_FL_CHECKIN_LATENCY;
            case 49:
                return eif.TRAINING_FL_REPORT_RESULTS_END_TIME;
            case 50:
                return eif.TRAINING_FL_REPORT_RESULTS_LATENCY;
            case 51:
                return eif.TRAINING_FL_CHECKIN_END_TIME;
            case 52:
                return eif.TRAINING_FL_ELIGIBILITY_EVAL_CHECKIN_LATENCY;
            case 53:
                return eif.TRAINING_FL_MULTIPLE_TASK_ASSIGNMENTS_END_TIME;
            case 54:
                return eif.TRAINING_FL_MULTIPLE_TASK_ASSIGNMENTS_LATENCY;
            case 55:
                return eif.TRAINING_FL_ROUND_SEPARATION;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(atlVar))));
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public aua(byte[] bArr) {
        this();
    }
}
