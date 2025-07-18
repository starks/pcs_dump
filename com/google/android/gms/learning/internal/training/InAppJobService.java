package com.google.android.gms.learning.internal.training;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.RemoteException;
import android.util.Log;
import defpackage.bkd;
import defpackage.bks;
import defpackage.bpe;
import defpackage.buv;
import defpackage.bux;
import defpackage.bvg;
import defpackage.bvr;
import defpackage.bwe;
import defpackage.bwf;
import defpackage.n;
import defpackage.sp;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InAppJobService extends JobService {
    static final String TAG = "brella.InAppJobSvc";
    bvr dynamiteImpl;

    private boolean isIdleConstraintMet(JobParameters jobParameters) {
        return !((PowerManager) getSystemService("power")).isInteractive() || jobParameters.getExtras().getInt("waive_idle_requirement", 0) == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDestroy$0() {
        bvr bvrVar = this.dynamiteImpl;
        if (bvrVar != null) {
            try {
                bvrVar.onDestroy();
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onDestroy", e);
                }
            }
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartJob$0(Context context, JobParameters jobParameters) {
        if (!tryLoadDynamiteImpl()) {
            bvg.a(context, jobParameters);
            jobFinished(jobParameters, false);
            return;
        }
        try {
            if (this.dynamiteImpl.onStartJob(jobParameters)) {
                return;
            }
            jobFinished(jobParameters, false);
        } catch (RemoteException e) {
            if (Log.isLoggable(TAG, 5)) {
                Log.w(TAG, "RemoteException in IInAppJobService.onStartJob", e);
            }
            bvg.a(context, jobParameters);
            jobFinished(jobParameters, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStopJob$0(JobParameters jobParameters) {
        bvr bvrVar = this.dynamiteImpl;
        if (bvrVar != null) {
            try {
                bvrVar.onStopJob(jobParameters);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onStopJob", e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onTrimMemory$0(int i) {
        bvr bvrVar = this.dynamiteImpl;
        if (bvrVar != null) {
            try {
                bvrVar.onTrimMemory(i);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onTrimMemory", e);
                }
            }
        }
    }

    private boolean tryLoadDynamiteImpl() {
        if (this.dynamiteImpl != null) {
            return true;
        }
        try {
            bvr bvrVar = (bvr) bux.a(this, "com.google.android.gms.learning.dynamite.training.InAppJobServiceImpl", new bwe(0));
            try {
                if (bvrVar.init(new bpe(this), new bpe(getDynamiteBgExecutor()))) {
                    this.dynamiteImpl = bvrVar;
                    return true;
                }
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "IInAppJobService.init failed");
                }
                return false;
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.init", e);
                }
                return false;
            }
        } catch (buv e2) {
            if (Log.isLoggable(TAG, 5)) {
                Log.w(TAG, "LoadingException during tryLoadDynamiteImpl", e2);
            }
            return false;
        }
    }

    public ExecutorService getDynamiteBgExecutor() {
        return bwf.a;
    }

    public ExecutorService getLifecycleCallbacksBgExecutor() {
        return bwf.b;
    }

    @Override // android.app.Service
    public void onDestroy() {
        getLifecycleCallbacksBgExecutor().execute(new bks(this, 10, null));
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        bvr bvrVar = this.dynamiteImpl;
        if (bvrVar != null) {
            try {
                bvrVar.onRebind(intent);
                return;
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onRebind", e);
                }
            }
        }
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        bvr bvrVar = this.dynamiteImpl;
        if (bvrVar != null) {
            try {
                return bvrVar.onStartCommand(intent, i, i2);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onStartCommand", e);
                }
            }
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.job.JobService
    public synchronized boolean onStartJob(JobParameters jobParameters) throws Throwable {
        Throwable th;
        InAppJobService inAppJobService;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (isIdleConstraintMet(jobParameters)) {
                Context applicationContext = getApplicationContext();
                getLifecycleCallbacksBgExecutor().execute(new n(this, applicationContext, jobParameters, 5, (byte[]) null));
                return true;
            }
            try {
                bvg.a(this, jobParameters);
                return false;
            } catch (Throwable th3) {
                th = th3;
                inAppJobService = this;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            inAppJobService = this;
            th = th;
            throw th;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        getLifecycleCallbacksBgExecutor().execute(new bkd(this, jobParameters, 11, (char[]) null));
        return false;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        getLifecycleCallbacksBgExecutor().execute(new sp(this, i, 3));
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        bvr bvrVar = this.dynamiteImpl;
        if (bvrVar != null) {
            try {
                return bvrVar.onUnbind(intent);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onUnbind", e);
                }
            }
        }
        return super.onUnbind(intent);
    }
}
