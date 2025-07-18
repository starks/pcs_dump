package defpackage;

import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface bvr extends IInterface {
    boolean init(bpf bpfVar, bpf bpfVar2);

    void onDestroy();

    void onRebind(Intent intent);

    int onStartCommand(Intent intent, int i, int i2);

    boolean onStartJob(JobParameters jobParameters);

    boolean onStopJob(JobParameters jobParameters);

    void onTrimMemory(int i);

    boolean onUnbind(Intent intent);
}
