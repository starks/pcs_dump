package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekw implements ekv {
    public static final cgr a;
    public static final cgr b;
    public static final cgr c;
    public static final cgr d;
    public static final cgr e;
    public static final cgr f;
    public static final cgr g;
    public static final cgr h;
    public static final cgr i;
    public static final cgr j;
    public static final cgr k;

    static {
        cyv cyvVar = cyv.a;
        cxo cxoVarO = cxo.o("BRELLA", "BRELLA_COUNTERS");
        a = cgv.d("DiagnosisFeature__clearcut_counters_alias_opt_out", "EXAMPLE_STORE_ERROR_COUNT,TRAINING_SYSTEM_LOW_MEM_STATE,TRAINING_PROCESS_MEM_IMPORTANCE_STATE,TRAINING_PROCESS_MEM_LRU_STATE,SCHEDULER_SKEW_SECONDS,OPSTATS_DB_SIZE_BYTES,OPSTATS_DB_NUM_ENTRIES,OPSTATS_NUM_PRUNED_ENTRIES,OPSTATS_OLDEST_PRUNED_ENTRY_TENURE_HOURS", "com.google.android.gms.learning", cxoVarO, true);
        b = cgv.c("DiagnosisFeature__clearcut_counters_default_alias", 10L, "com.google.android.gms.learning", cxoVarO, true);
        c = cgv.e("DiagnosisFeature__clearcut_counters_enabled", true, "com.google.android.gms.learning", cxoVarO, true);
        d = cgv.e("DiagnosisFeature__clearcut_log_to_file_enabled_for_test", false, "com.google.android.gms.learning", cxoVarO, true);
        e = cgv.c("DiagnosisFeature__clearcut_max_samples_per_counter", 200L, "com.google.android.gms.learning", cxoVarO, true);
        f = cgv.e("DiagnosisFeature__debug_diag_enabled", false, "com.google.android.gms.learning", cxoVarO, true);
        g = cgv.e("DiagnosisFeature__include_run_id_in_counters_dimensions", false, "com.google.android.gms.learning", cxoVarO, true);
        h = cgv.e("DiagnosisFeature__log_tensorflow_error_messages", true, "com.google.android.gms.learning", cxoVarO, true);
        i = cgv.e("DiagnosisFeature__production_diag_enabled", true, "com.google.android.gms.learning", cxoVarO, true);
        j = cgv.d("DiagnosisFeature__trainer_log_event_system_state_annotation_sampling_allowlist", "", "com.google.android.gms.learning", cxoVarO, true);
        k = cgv.b("DiagnosisFeature__trainer_log_event_system_state_annotation_sampling_rate", 0.01d, "com.google.android.gms.learning", cxoVarO, true);
    }

    @Override // defpackage.ekv
    public final double a() {
        return ((Double) k.a()).doubleValue();
    }

    @Override // defpackage.ekv
    public final long b() {
        return ((Long) b.a()).longValue();
    }

    @Override // defpackage.ekv
    public final long c() {
        return ((Long) e.a()).longValue();
    }

    @Override // defpackage.ekv
    public final String d() {
        return (String) a.a();
    }

    @Override // defpackage.ekv
    public final String e() {
        return (String) j.a();
    }

    @Override // defpackage.ekv
    public final boolean f() {
        return ((Boolean) c.a()).booleanValue();
    }

    @Override // defpackage.ekv
    public final boolean g() {
        return ((Boolean) d.a()).booleanValue();
    }

    @Override // defpackage.ekv
    public final boolean h() {
        return ((Boolean) f.a()).booleanValue();
    }

    @Override // defpackage.ekv
    public final boolean i() {
        return ((Boolean) g.a()).booleanValue();
    }

    @Override // defpackage.ekv
    public final boolean j() {
        return ((Boolean) h.a()).booleanValue();
    }

    @Override // defpackage.ekv
    public final boolean k() {
        return ((Boolean) i.a()).booleanValue();
    }
}
