package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum eif implements eff {
    HISTOGRAM_COUNTER_UNDEFINED(0),
    TRAINING_RUN_PHASE_LATENCY(1),
    TRAINING_RUN_PHASE_END_TIME(2),
    TRAINING_RESTORE_STATE_LATENCY(3),
    TRAINING_RUN_CLIENT_EXECUTION_LATENCY(4),
    TRAINING_INIT_OP_LATENCY(5),
    TRAINING_BEFORE_OP_LATENCY(6),
    TRAINING_AFTER_OP_LATENCY(7),
    TRAINING_RUN_EPOCH_LATENCY(8),
    TRAINING_GATHER_MINI_BATCH_LATENCY(9),
    TRAINING_RUN_MINI_BATCH_LATENCY(10),
    TRAINING_INTERRUPT_TERMINATION_LATENCY(11),
    TRAINING_OPSTATS_COMMIT_LATENCY(12),
    EXAMPLE_STORE_ITERATOR_NEXT_LATENCY(20),
    EXAMPLE_STORE_ITERATOR_OVERALL_EXAMPLE_COUNT(21),
    EXAMPLE_STORE_ITERATOR_OVERALL_EXAMPLE_SIZE(22),
    EXAMPLE_STORE_ITERATOR_OVERALL_LATENCY(23),
    EXAMPLE_STORE_ITERATOR_OVERALL_IPC_LATENCY(24),
    EXAMPLE_STORE_ITERATOR_OVERALL_PROXY_LATENCY(25),
    EXAMPLE_STORE_ITERATOR_OVERALL_CLIENT_LATENCY(26),
    EXAMPLE_STORE_ERROR_COUNT(27),
    TRAINING_SYSTEM_TOTAL_MEM(28),
    TRAINING_SYSTEM_AVAILABLE_MEM(29),
    TRAINING_SYSTEM_LOW_MEM_THRESHOLD(30),
    TRAINING_SYSTEM_AVAILABLE_MEM_BEFORE_THRESHOLD(31),
    TRAINING_SYSTEM_LOW_MEM_STATE(32),
    TRAINING_PROCESS_MEM_IMPORTANCE_STATE(33),
    TRAINING_PROCESS_MEM_LRU_STATE(34),
    TRAINING_PROCESS_MEM_USAGE_JAVA_HEAP(35),
    TRAINING_PROCESS_MEM_USAGE_NATIVE_PSS(36),
    TRAINING_PROCESS_STOP_REASON(37),
    TRAINING_OVERALL_LATENCY(40),
    TRAINING_SAVE_CHECKPOINT_LATENCY(41),
    EXAMPLE_STORE_START_QUERY_LATENCY(42),
    EXAMPLE_STORE_ITERATOR_CLOSE_LATENCY(43),
    HTTP_CLIENT_INITIALIZATION_LATENCY(44),
    TRAINING_OVERALL_EXAMPLE_COUNT(100001),
    TRAINING_OVERALL_EXAMPLE_SIZE(100002),
    TRAINING_CLIENT_EXECUTION_EXAMPLE_COUNT(100003),
    TRAINING_CLIENT_EXECUTION_EXAMPLE_SIZE(100004),
    TRAINING_EPOCH_EXAMPLE_COUNT(100005),
    TRAINING_EPOCH_EXAMPLE_SIZE(100006),
    TRAINING_MINI_BATCH_EXAMPLE_COUNT(100007),
    TRAINING_MINI_BATCH_EXAMPLE_SIZE(100008),
    OPSTATS_DB_SIZE_BYTES(100009),
    OPSTATS_DB_NUM_ENTRIES(100010),
    OPSTATS_NUM_PRUNED_ENTRIES(100011),
    OPSTATS_OLDEST_PRUNED_ENTRY_TENURE_HOURS(100012),
    TRAINING_FL_CHECKIN_LATENCY(200001),
    TRAINING_FL_REPORT_RESULTS_END_TIME(200002),
    TRAINING_FL_REPORT_RESULTS_LATENCY(200003),
    TRAINING_FL_CHECKIN_END_TIME(200004),
    TRAINING_FL_ELIGIBILITY_EVAL_CHECKIN_LATENCY(200005),
    TRAINING_FL_MULTIPLE_TASK_ASSIGNMENTS_END_TIME(200006),
    TRAINING_FL_MULTIPLE_TASK_ASSIGNMENTS_LATENCY(200007),
    TRAINING_FL_ROUND_SEPARATION(200008);

    public final int ae;

    eif(int i) {
        this.ae = i;
    }

    public static eif b(int i) {
        switch (i) {
            case 0:
                return HISTOGRAM_COUNTER_UNDEFINED;
            case 1:
                return TRAINING_RUN_PHASE_LATENCY;
            case 2:
                return TRAINING_RUN_PHASE_END_TIME;
            case 3:
                return TRAINING_RESTORE_STATE_LATENCY;
            case 4:
                return TRAINING_RUN_CLIENT_EXECUTION_LATENCY;
            case 5:
                return TRAINING_INIT_OP_LATENCY;
            case 6:
                return TRAINING_BEFORE_OP_LATENCY;
            case 7:
                return TRAINING_AFTER_OP_LATENCY;
            case 8:
                return TRAINING_RUN_EPOCH_LATENCY;
            case 9:
                return TRAINING_GATHER_MINI_BATCH_LATENCY;
            case 10:
                return TRAINING_RUN_MINI_BATCH_LATENCY;
            case 11:
                return TRAINING_INTERRUPT_TERMINATION_LATENCY;
            case 12:
                return TRAINING_OPSTATS_COMMIT_LATENCY;
            default:
                switch (i) {
                    case 20:
                        return EXAMPLE_STORE_ITERATOR_NEXT_LATENCY;
                    case 21:
                        return EXAMPLE_STORE_ITERATOR_OVERALL_EXAMPLE_COUNT;
                    case 22:
                        return EXAMPLE_STORE_ITERATOR_OVERALL_EXAMPLE_SIZE;
                    case 23:
                        return EXAMPLE_STORE_ITERATOR_OVERALL_LATENCY;
                    case 24:
                        return EXAMPLE_STORE_ITERATOR_OVERALL_IPC_LATENCY;
                    case 25:
                        return EXAMPLE_STORE_ITERATOR_OVERALL_PROXY_LATENCY;
                    case 26:
                        return EXAMPLE_STORE_ITERATOR_OVERALL_CLIENT_LATENCY;
                    case 27:
                        return EXAMPLE_STORE_ERROR_COUNT;
                    case 28:
                        return TRAINING_SYSTEM_TOTAL_MEM;
                    case 29:
                        return TRAINING_SYSTEM_AVAILABLE_MEM;
                    case 30:
                        return TRAINING_SYSTEM_LOW_MEM_THRESHOLD;
                    case 31:
                        return TRAINING_SYSTEM_AVAILABLE_MEM_BEFORE_THRESHOLD;
                    case 32:
                        return TRAINING_SYSTEM_LOW_MEM_STATE;
                    case 33:
                        return TRAINING_PROCESS_MEM_IMPORTANCE_STATE;
                    case 34:
                        return TRAINING_PROCESS_MEM_LRU_STATE;
                    case 35:
                        return TRAINING_PROCESS_MEM_USAGE_JAVA_HEAP;
                    case 36:
                        return TRAINING_PROCESS_MEM_USAGE_NATIVE_PSS;
                    case 37:
                        return TRAINING_PROCESS_STOP_REASON;
                    default:
                        switch (i) {
                            case 40:
                                return TRAINING_OVERALL_LATENCY;
                            case 41:
                                return TRAINING_SAVE_CHECKPOINT_LATENCY;
                            case 42:
                                return EXAMPLE_STORE_START_QUERY_LATENCY;
                            case 43:
                                return EXAMPLE_STORE_ITERATOR_CLOSE_LATENCY;
                            case 44:
                                return HTTP_CLIENT_INITIALIZATION_LATENCY;
                            default:
                                switch (i) {
                                    case 100001:
                                        return TRAINING_OVERALL_EXAMPLE_COUNT;
                                    case 100002:
                                        return TRAINING_OVERALL_EXAMPLE_SIZE;
                                    case 100003:
                                        return TRAINING_CLIENT_EXECUTION_EXAMPLE_COUNT;
                                    case 100004:
                                        return TRAINING_CLIENT_EXECUTION_EXAMPLE_SIZE;
                                    case 100005:
                                        return TRAINING_EPOCH_EXAMPLE_COUNT;
                                    case 100006:
                                        return TRAINING_EPOCH_EXAMPLE_SIZE;
                                    case 100007:
                                        return TRAINING_MINI_BATCH_EXAMPLE_COUNT;
                                    case 100008:
                                        return TRAINING_MINI_BATCH_EXAMPLE_SIZE;
                                    case 100009:
                                        return OPSTATS_DB_SIZE_BYTES;
                                    case 100010:
                                        return OPSTATS_DB_NUM_ENTRIES;
                                    case 100011:
                                        return OPSTATS_NUM_PRUNED_ENTRIES;
                                    case 100012:
                                        return OPSTATS_OLDEST_PRUNED_ENTRY_TENURE_HOURS;
                                    default:
                                        switch (i) {
                                            case 200001:
                                                return TRAINING_FL_CHECKIN_LATENCY;
                                            case 200002:
                                                return TRAINING_FL_REPORT_RESULTS_END_TIME;
                                            case 200003:
                                                return TRAINING_FL_REPORT_RESULTS_LATENCY;
                                            case 200004:
                                                return TRAINING_FL_CHECKIN_END_TIME;
                                            case 200005:
                                                return TRAINING_FL_ELIGIBILITY_EVAL_CHECKIN_LATENCY;
                                            case 200006:
                                                return TRAINING_FL_MULTIPLE_TASK_ASSIGNMENTS_END_TIME;
                                            case 200007:
                                                return TRAINING_FL_MULTIPLE_TASK_ASSIGNMENTS_LATENCY;
                                            case 200008:
                                                return TRAINING_FL_ROUND_SEPARATION;
                                            default:
                                                return null;
                                        }
                                }
                        }
                }
        }
    }

    @Override // defpackage.eff
    public final int a() {
        return this.ae;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.ae);
    }
}
